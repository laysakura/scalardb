package com.scalar.db.transaction.consensuscommit;

import static com.google.common.base.Preconditions.checkNotNull;

import com.scalar.db.api.Result;
import com.scalar.db.api.TransactionState;
import com.scalar.db.common.AbstractResult;
import com.scalar.db.io.Column;
import com.scalar.db.io.Key;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
public class TransactionResult extends AbstractResult {
  private final Result result;

  public TransactionResult(Result result) {
    // assume that all the columns are projected to the result
    this.result = checkNotNull(result);
  }

  /** @deprecated As of release 3.8.0. Will be removed in release 5.0.0 */
  @Deprecated
  @Override
  public Optional<Key> getPartitionKey() {
    return result.getPartitionKey();
  }

  /** @deprecated As of release 3.8.0. Will be removed in release 5.0.0 */
  @Deprecated
  @Override
  public Optional<Key> getClusteringKey() {
    return result.getClusteringKey();
  }

  @Override
  public boolean isNull(String columnName) {
    return result.isNull(columnName);
  }

  @Override
  public boolean getBoolean(String columnName) {
    return result.getBoolean(columnName);
  }

  @Override
  public int getInt(String columnName) {
    return result.getInt(columnName);
  }

  @Override
  public long getBigInt(String columnName) {
    return result.getBigInt(columnName);
  }

  @Override
  public float getFloat(String columnName) {
    return result.getFloat(columnName);
  }

  @Override
  public double getDouble(String columnName) {
    return result.getDouble(columnName);
  }

  @Nullable
  @Override
  public String getText(String columnName) {
    return result.getText(columnName);
  }

  @Nullable
  @Override
  public ByteBuffer getBlobAsByteBuffer(String columnName) {
    return result.getBlobAsByteBuffer(columnName);
  }

  @Nullable
  @Override
  public byte[] getBlobAsBytes(String columnName) {
    return result.getBlobAsBytes(columnName);
  }

  @Nullable
  @Override
  public Object getAsObject(String columnName) {
    return result.getAsObject(columnName);
  }

  @Override
  public boolean contains(String columnName) {
    return result.contains(columnName);
  }

  @Override
  public Set<String> getContainedColumnNames() {
    return result.getContainedColumnNames();
  }

  @Override
  public Map<String, Column<?>> getColumns() {
    return result.getColumns();
  }

  public String getId() {
    return getText(Attribute.ID);
  }

  public TransactionState getState() {
    return TransactionState.getInstance(getInt(Attribute.STATE));
  }

  public int getVersion() {
    return getInt(Attribute.VERSION);
  }

  public long getPreparedAt() {
    return getBigInt(Attribute.PREPARED_AT);
  }

  public long getCommittedAt() {
    return getBigInt(Attribute.COMMITTED_AT);
  }

  public boolean isCommitted() {
    return getState().equals(TransactionState.COMMITTED);
  }
}
