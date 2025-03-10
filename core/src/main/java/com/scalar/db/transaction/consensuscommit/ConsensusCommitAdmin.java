package com.scalar.db.transaction.consensuscommit;

import static com.scalar.db.transaction.consensuscommit.ConsensusCommitUtils.buildTransactionTableMetadata;
import static com.scalar.db.transaction.consensuscommit.ConsensusCommitUtils.getBeforeImageColumnName;
import static com.scalar.db.transaction.consensuscommit.ConsensusCommitUtils.removeTransactionMetaColumns;

import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Inject;
import com.scalar.db.api.DistributedStorageAdmin;
import com.scalar.db.api.DistributedTransactionAdmin;
import com.scalar.db.api.TableMetadata;
import com.scalar.db.config.DatabaseConfig;
import com.scalar.db.exception.storage.ExecutionException;
import com.scalar.db.io.DataType;
import com.scalar.db.service.StorageFactory;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class ConsensusCommitAdmin implements DistributedTransactionAdmin {

  private final DistributedStorageAdmin admin;
  private final String coordinatorNamespace;
  private final boolean isIncludeMetadataEnabled;

  @Inject
  public ConsensusCommitAdmin(DistributedStorageAdmin admin, DatabaseConfig databaseConfig) {
    this.admin = admin;
    ConsensusCommitConfig config = new ConsensusCommitConfig(databaseConfig);
    coordinatorNamespace = config.getCoordinatorNamespace().orElse(Coordinator.NAMESPACE);
    isIncludeMetadataEnabled = config.isIncludeMetadataEnabled();
  }

  public ConsensusCommitAdmin(DatabaseConfig databaseConfig) {
    StorageFactory storageFactory = StorageFactory.create(databaseConfig.getProperties());
    admin = storageFactory.getStorageAdmin();

    ConsensusCommitConfig config = new ConsensusCommitConfig(databaseConfig);
    coordinatorNamespace = config.getCoordinatorNamespace().orElse(Coordinator.NAMESPACE);
    isIncludeMetadataEnabled = config.isIncludeMetadataEnabled();
  }

  @VisibleForTesting
  ConsensusCommitAdmin(
      DistributedStorageAdmin admin,
      ConsensusCommitConfig config,
      boolean isIncludeMetadataEnabled) {
    this.admin = admin;
    coordinatorNamespace = config.getCoordinatorNamespace().orElse(Coordinator.NAMESPACE);
    this.isIncludeMetadataEnabled = isIncludeMetadataEnabled;
  }

  @Override
  public void createCoordinatorTables(Map<String, String> options) throws ExecutionException {
    admin.createNamespace(coordinatorNamespace, options);
    admin.createTable(coordinatorNamespace, Coordinator.TABLE, Coordinator.TABLE_METADATA, options);
  }

  @Override
  public void dropCoordinatorTables() throws ExecutionException {
    admin.dropTable(coordinatorNamespace, Coordinator.TABLE);
    admin.dropNamespace(coordinatorNamespace);
  }

  @Override
  public void truncateCoordinatorTables() throws ExecutionException {
    admin.truncateTable(coordinatorNamespace, Coordinator.TABLE);
  }

  @Override
  public boolean coordinatorTablesExist() throws ExecutionException {
    return admin.tableExists(coordinatorNamespace, Coordinator.TABLE);
  }

  @Override
  public void createNamespace(String namespace, Map<String, String> options)
      throws ExecutionException {
    admin.createNamespace(namespace, options);
  }

  @Override
  public void createTable(
      String namespace, String table, TableMetadata metadata, Map<String, String> options)
      throws ExecutionException {
    admin.createTable(namespace, table, buildTransactionTableMetadata(metadata), options);
  }

  @Override
  public void dropTable(String namespace, String table) throws ExecutionException {
    admin.dropTable(namespace, table);
  }

  @Override
  public void dropNamespace(String namespace) throws ExecutionException {
    admin.dropNamespace(namespace);
  }

  @Override
  public void truncateTable(String namespace, String table) throws ExecutionException {
    admin.truncateTable(namespace, table);
  }

  @Override
  public void createIndex(
      String namespace, String table, String columnName, Map<String, String> options)
      throws ExecutionException {
    admin.createIndex(namespace, table, columnName, options);
  }

  @Override
  public void dropIndex(String namespace, String table, String columnName)
      throws ExecutionException {
    admin.dropIndex(namespace, table, columnName);
  }

  @Override
  public TableMetadata getTableMetadata(String namespace, String table) throws ExecutionException {
    TableMetadata metadata = admin.getTableMetadata(namespace, table);
    if (metadata == null) {
      return null;
    }
    if (!ConsensusCommitUtils.isTransactionTableMetadata(metadata)) {
      return null;
    }
    if (isIncludeMetadataEnabled) {
      return metadata;
    }
    return removeTransactionMetaColumns(metadata);
  }

  @Override
  public Set<String> getNamespaceTableNames(String namespace) throws ExecutionException {
    Set<String> tables = new HashSet<>();
    for (String table : admin.getNamespaceTableNames(namespace)) {
      // Remove non transaction table
      if (getTableMetadata(namespace, table) != null) {
        tables.add(table);
      }
    }

    return tables;
  }

  @Override
  public boolean namespaceExists(String namespace) throws ExecutionException {
    return admin.namespaceExists(namespace);
  }

  @Override
  public void repairTable(
      String namespace, String table, TableMetadata metadata, Map<String, String> options)
      throws ExecutionException {
    admin.repairTable(namespace, table, buildTransactionTableMetadata(metadata), options);
  }

  @Override
  public void repairCoordinatorTables(Map<String, String> options) throws ExecutionException {
    admin.repairTable(coordinatorNamespace, Coordinator.TABLE, Coordinator.TABLE_METADATA, options);
  }

  @Override
  public void addNewColumnToTable(
      String namespace, String table, String columnName, DataType columnType)
      throws ExecutionException {
    TableMetadata tableMetadata = getTableMetadata(namespace, table);
    String beforeColumnName = getBeforeImageColumnName(columnName, tableMetadata);

    admin.addNewColumnToTable(namespace, table, columnName, columnType);
    admin.addNewColumnToTable(namespace, table, beforeColumnName, columnType);
  }

  @Override
  public void close() {
    admin.close();
  }
}
