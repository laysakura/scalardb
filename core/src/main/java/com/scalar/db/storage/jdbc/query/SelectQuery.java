package com.scalar.db.storage.jdbc.query;

import com.scalar.db.api.Scan;
import com.scalar.db.api.TableMetadata;
import com.scalar.db.io.Column;
import com.scalar.db.io.Key;
import com.scalar.db.storage.jdbc.RdbEngine;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface SelectQuery extends Query {

  class Builder {
    final RdbEngine rdbEngine;
    final List<String> projections;
    String schema;
    String table;
    TableMetadata tableMetadata;
    Optional<Key> partitionKey = Optional.empty();
    Optional<Key> clusteringKey = Optional.empty();
    Optional<Key> commonClusteringKey = Optional.empty();
    Optional<Column<?>> startColumn = Optional.empty();
    boolean startInclusive;
    Optional<Column<?>> endColumn = Optional.empty();
    boolean endInclusive;
    List<Scan.Ordering> orderings = Collections.emptyList();
    private int limit;
    boolean isRangeQuery;
    Optional<String> indexedColumn = Optional.empty();
    boolean isConditionalQuery;

    Builder(RdbEngine rdbEngine, List<String> projections) {
      this.rdbEngine = rdbEngine;
      this.projections = projections;
    }

    public Builder from(String schema, String table, TableMetadata tableMetadata) {
      this.schema = schema;
      this.table = table;
      this.tableMetadata = tableMetadata;
      return this;
    }

    /*
     * Assumes this is called by get operations
     */
    public Builder where(Key partitionKey, Optional<Key> clusteringKey) {
      isConditionalQuery = true;
      this.partitionKey = Optional.of(partitionKey);
      this.clusteringKey = clusteringKey;
      setIndexInfoIfUsed(partitionKey);
      return this;
    }

    /*
     * Assumes this is called by scan operations
     */
    public Builder where(
        Key partitionKey,
        Optional<Key> startClusteringKey,
        boolean startInclusive,
        Optional<Key> endClusteringKey,
        boolean endInclusive) {
      isConditionalQuery = true;

      this.partitionKey = Optional.of(partitionKey);

      if (startClusteringKey.isPresent()) {
        commonClusteringKey =
            Optional.of(
                new Key(
                    startClusteringKey
                        .get()
                        .get()
                        .subList(0, startClusteringKey.get().size() - 1)));
      } else {
        endClusteringKey.ifPresent(
            values ->
                commonClusteringKey =
                    Optional.of(new Key(values.get().subList(0, values.size() - 1))));
      }

      if (startClusteringKey.isPresent()) {
        startColumn =
            Optional.of(
                startClusteringKey.get().getColumns().get(startClusteringKey.get().size() - 1));
        this.startInclusive = startInclusive;
      }

      if (endClusteringKey.isPresent()) {
        endColumn =
            Optional.of(endClusteringKey.get().getColumns().get(endClusteringKey.get().size() - 1));
        this.endInclusive = endInclusive;
      }

      isRangeQuery = true;
      setIndexInfoIfUsed(partitionKey);

      return this;
    }

    private void setIndexInfoIfUsed(Key partitionKey) {
      if (tableMetadata == null) {
        throw new IllegalStateException("tableMetadata is null");
      }

      if (partitionKey.size() > 1) {
        return;
      }

      String column = partitionKey.get().get(0).getName();
      if (!tableMetadata.getSecondaryIndexNames().contains(column)) {
        return;
      }

      indexedColumn = Optional.of(column);
    }

    @SuppressFBWarnings("EI_EXPOSE_REP2")
    public Builder orderBy(List<Scan.Ordering> orderings) {
      this.orderings = orderings;
      return this;
    }

    public Builder limit(int limit) {
      this.limit = limit;
      return this;
    }

    public SelectQuery build() {
      if (limit > 0) {
        switch (rdbEngine) {
          case MYSQL:
          case POSTGRESQL:
            return new SelectWithLimitQuery(this, limit);
          case ORACLE:
            return new SelectWithFetchFirstNRowsOnly(this, limit);
          case SQL_SERVER:
            return new SelectWithTop(this, limit);
          default:
            throw new AssertionError("invalid rdb engine: " + rdbEngine);
        }
      }
      return new SimpleSelectQuery(this);
    }
  }
}
