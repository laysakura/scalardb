package com.scalar.db.transaction.consensuscommit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.scalar.db.api.TableMetadata;
import com.scalar.db.io.DataType;
import org.junit.jupiter.api.Test;

public class ConsensusCommitUtilsTest {

  @Test
  public void
      buildTransactionalTableMetadata_tableMetadataGiven_shouldCreateTransactionalTableProperly() {
    // Arrange
    final String ACCOUNT_ID = "account_id";
    final String ACCOUNT_TYPE = "account_type";
    final String BALANCE = "balance";

    TableMetadata tableMetadata =
        TableMetadata.newBuilder()
            .addColumn(ACCOUNT_ID, DataType.INT)
            .addColumn(ACCOUNT_TYPE, DataType.INT)
            .addColumn(BALANCE, DataType.INT)
            .addPartitionKey(ACCOUNT_ID)
            .addClusteringKey(ACCOUNT_TYPE)
            .build();

    TableMetadata expected =
        TableMetadata.newBuilder()
            .addColumn(ACCOUNT_ID, DataType.INT)
            .addColumn(ACCOUNT_TYPE, DataType.INT)
            .addColumn(BALANCE, DataType.INT)
            .addColumn(Attribute.ID, DataType.TEXT)
            .addColumn(Attribute.STATE, DataType.INT)
            .addColumn(Attribute.VERSION, DataType.INT)
            .addColumn(Attribute.PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.COMMITTED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_PREFIX + BALANCE, DataType.INT)
            .addColumn(Attribute.BEFORE_ID, DataType.TEXT)
            .addColumn(Attribute.BEFORE_STATE, DataType.INT)
            .addColumn(Attribute.BEFORE_VERSION, DataType.INT)
            .addColumn(Attribute.BEFORE_PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_COMMITTED_AT, DataType.BIGINT)
            .addPartitionKey(ACCOUNT_ID)
            .addClusteringKey(ACCOUNT_TYPE)
            .build();

    // Act
    TableMetadata actual = ConsensusCommitUtils.buildTransactionalTableMetadata(tableMetadata);

    // Assert
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void
      buildTransactionalTableMetadata_tableMetadataThatHasTransactionMetaColumnGiven_shouldThrowIllegalArgumentException() {
    // Arrange

    // Act Assert
    assertThatThrownBy(
            () ->
                ConsensusCommitUtils.buildTransactionalTableMetadata(
                    TableMetadata.newBuilder()
                        .addColumn("col1", DataType.INT)
                        .addColumn("col2", DataType.INT)
                        .addColumn(Attribute.ID, DataType.TEXT) // transaction meta column
                        .addPartitionKey("col1")
                        .build()))
        .isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  public void
      buildTransactionalTableMetadata_tableMetadataThatHasNonPrimaryKeyColumnWithBeforePrefixGiven_shouldThrowIllegalArgumentException() {
    // Arrange

    // Act Assert
    assertThatThrownBy(
            () ->
                ConsensusCommitUtils.buildTransactionalTableMetadata(
                    TableMetadata.newBuilder()
                        .addColumn("col1", DataType.INT)
                        .addColumn("col2", DataType.INT)
                        .addColumn(
                            Attribute.BEFORE_PREFIX + "col2",
                            DataType.INT) // non-primary key column with the "before_" prefix
                        .addPartitionKey("col1")
                        .build()))
        .isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  public void
      isTransactionalTableMetadata_properTransactionalTableMetadataGiven_shouldReturnTrue() {
    // Arrange
    final String ACCOUNT_ID = "account_id";
    final String ACCOUNT_TYPE = "account_type";
    final String BALANCE = "balance";

    TableMetadata metadata =
        TableMetadata.newBuilder()
            .addColumn(ACCOUNT_ID, DataType.INT)
            .addColumn(ACCOUNT_TYPE, DataType.INT)
            .addColumn(BALANCE, DataType.INT)
            .addColumn(Attribute.ID, DataType.TEXT)
            .addColumn(Attribute.STATE, DataType.INT)
            .addColumn(Attribute.VERSION, DataType.INT)
            .addColumn(Attribute.PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.COMMITTED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_PREFIX + BALANCE, DataType.INT)
            .addColumn(Attribute.BEFORE_ID, DataType.TEXT)
            .addColumn(Attribute.BEFORE_STATE, DataType.INT)
            .addColumn(Attribute.BEFORE_VERSION, DataType.INT)
            .addColumn(Attribute.BEFORE_PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_COMMITTED_AT, DataType.BIGINT)
            .addPartitionKey(ACCOUNT_ID)
            .addClusteringKey(ACCOUNT_TYPE)
            .build();

    // Act
    boolean actual = ConsensusCommitUtils.isTransactionalTableMetadata(metadata);

    // Assert
    assertThat(actual).isTrue();
  }

  @Test
  public void
      isTransactionalTableMetadata_transactionalTableMetadataWithoutMetaColumnGiven_shouldReturnFalse() {
    // Arrange
    final String ACCOUNT_ID = "account_id";
    final String ACCOUNT_TYPE = "account_type";
    final String BALANCE = "balance";

    TableMetadata metadata =
        TableMetadata.newBuilder()
            .addColumn(ACCOUNT_ID, DataType.INT)
            .addColumn(ACCOUNT_TYPE, DataType.INT)
            .addColumn(BALANCE, DataType.INT)
            .addColumn(Attribute.STATE, DataType.INT)
            .addColumn(Attribute.VERSION, DataType.INT)
            .addColumn(Attribute.PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.COMMITTED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_PREFIX + BALANCE, DataType.INT)
            .addColumn(Attribute.BEFORE_ID, DataType.TEXT)
            .addColumn(Attribute.BEFORE_STATE, DataType.INT)
            .addColumn(Attribute.BEFORE_VERSION, DataType.INT)
            .addColumn(Attribute.BEFORE_PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_COMMITTED_AT, DataType.BIGINT)
            .addPartitionKey(ACCOUNT_ID)
            .addClusteringKey(ACCOUNT_TYPE)
            .build();

    // Act
    boolean actual = ConsensusCommitUtils.isTransactionalTableMetadata(metadata);

    // Assert
    assertThat(actual).isFalse();
  }

  @Test
  public void
      isTransactionalTableMetadata_transactionalTableMetadataWithoutProperBeforeColumnGiven_shouldReturnFalse() {
    // Arrange
    final String ACCOUNT_ID = "account_id";
    final String ACCOUNT_TYPE = "account_type";
    final String BALANCE = "balance";

    TableMetadata metadata =
        TableMetadata.newBuilder()
            .addColumn(ACCOUNT_ID, DataType.INT)
            .addColumn(ACCOUNT_TYPE, DataType.INT)
            .addColumn(BALANCE, DataType.INT)
            .addColumn(Attribute.ID, DataType.TEXT)
            .addColumn(Attribute.STATE, DataType.INT)
            .addColumn(Attribute.VERSION, DataType.INT)
            .addColumn(Attribute.PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.COMMITTED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_ID, DataType.TEXT)
            .addColumn(Attribute.BEFORE_STATE, DataType.INT)
            .addColumn(Attribute.BEFORE_VERSION, DataType.INT)
            .addColumn(Attribute.BEFORE_PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_COMMITTED_AT, DataType.BIGINT)
            .addPartitionKey(ACCOUNT_ID)
            .addClusteringKey(ACCOUNT_TYPE)
            .build();

    // Act
    boolean actual = ConsensusCommitUtils.isTransactionalTableMetadata(metadata);

    // Assert
    assertThat(actual).isFalse();
  }

  @Test
  public void
      removeTransactionalMetaColumns_transactionalTableMetadataWithoutProperBeforeColumnGiven_shouldReturnFalse() {
    // Arrange
    final String ACCOUNT_ID = "account_id";
    final String ACCOUNT_TYPE = "account_type";
    final String BALANCE = "balance";

    TableMetadata metadata =
        TableMetadata.newBuilder()
            .addColumn(ACCOUNT_ID, DataType.INT)
            .addColumn(ACCOUNT_TYPE, DataType.INT)
            .addColumn(BALANCE, DataType.INT)
            .addColumn(Attribute.ID, DataType.TEXT)
            .addColumn(Attribute.STATE, DataType.INT)
            .addColumn(Attribute.VERSION, DataType.INT)
            .addColumn(Attribute.PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.COMMITTED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_PREFIX + BALANCE, DataType.INT)
            .addColumn(Attribute.BEFORE_ID, DataType.TEXT)
            .addColumn(Attribute.BEFORE_STATE, DataType.INT)
            .addColumn(Attribute.BEFORE_VERSION, DataType.INT)
            .addColumn(Attribute.BEFORE_PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_COMMITTED_AT, DataType.BIGINT)
            .addPartitionKey(ACCOUNT_ID)
            .addClusteringKey(ACCOUNT_TYPE)
            .build();

    // Act
    TableMetadata actual = ConsensusCommitUtils.removeTransactionalMetaColumns(metadata);

    // Assert
    assertThat(actual)
        .isEqualTo(
            TableMetadata.newBuilder()
                .addColumn(ACCOUNT_ID, DataType.INT)
                .addColumn(ACCOUNT_TYPE, DataType.INT)
                .addColumn(BALANCE, DataType.INT)
                .addPartitionKey(ACCOUNT_ID)
                .addClusteringKey(ACCOUNT_TYPE)
                .build());
  }

  @Test
  public void isTransactionalMetaColumn_TableMetadataGiven_shouldReturnProperResult() {
    // Arrange
    final String ACCOUNT_ID = "account_id";
    final String ACCOUNT_TYPE = "account_type";
    final String BALANCE = "balance";

    TableMetadata metadata =
        TableMetadata.newBuilder()
            .addColumn(ACCOUNT_ID, DataType.INT)
            .addColumn(ACCOUNT_TYPE, DataType.INT)
            .addColumn(BALANCE, DataType.INT)
            .addColumn(Attribute.ID, DataType.TEXT)
            .addColumn(Attribute.STATE, DataType.INT)
            .addColumn(Attribute.VERSION, DataType.INT)
            .addColumn(Attribute.PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.COMMITTED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_PREFIX + BALANCE, DataType.INT)
            .addColumn(Attribute.BEFORE_ID, DataType.TEXT)
            .addColumn(Attribute.BEFORE_STATE, DataType.INT)
            .addColumn(Attribute.BEFORE_VERSION, DataType.INT)
            .addColumn(Attribute.BEFORE_PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_COMMITTED_AT, DataType.BIGINT)
            .addPartitionKey(ACCOUNT_ID)
            .addClusteringKey(ACCOUNT_TYPE)
            .build();

    // Act Assert
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(ACCOUNT_ID, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(ACCOUNT_TYPE, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(BALANCE, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.ID, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.STATE, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.VERSION, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.PREPARED_AT, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.COMMITTED_AT, metadata))
        .isTrue();
    assertThat(
            ConsensusCommitUtils.isTransactionalMetaColumn(
                Attribute.BEFORE_PREFIX + BALANCE, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.BEFORE_ID, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.BEFORE_STATE, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.BEFORE_VERSION, metadata))
        .isTrue();
    assertThat(
            ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.BEFORE_PREPARED_AT, metadata))
        .isTrue();
    assertThat(
            ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.BEFORE_COMMITTED_AT, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn("aaa", metadata)).isFalse();
  }

  @Test
  public void isTransactionalMetaColumn_ResultGiven_shouldReturnProperResult() {
    // Arrange
    final String ACCOUNT_ID = "account_id";
    final String ACCOUNT_TYPE = "account_type";
    final String BALANCE = "balance";

    TableMetadata metadata =
        TableMetadata.newBuilder()
            .addColumn(ACCOUNT_ID, DataType.INT)
            .addColumn(ACCOUNT_TYPE, DataType.INT)
            .addColumn(BALANCE, DataType.INT)
            .addColumn(Attribute.ID, DataType.TEXT)
            .addColumn(Attribute.STATE, DataType.INT)
            .addColumn(Attribute.VERSION, DataType.INT)
            .addColumn(Attribute.PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.COMMITTED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_PREFIX + BALANCE, DataType.INT)
            .addColumn(Attribute.BEFORE_ID, DataType.TEXT)
            .addColumn(Attribute.BEFORE_STATE, DataType.INT)
            .addColumn(Attribute.BEFORE_VERSION, DataType.INT)
            .addColumn(Attribute.BEFORE_PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_COMMITTED_AT, DataType.BIGINT)
            .addPartitionKey(ACCOUNT_ID)
            .addClusteringKey(ACCOUNT_TYPE)
            .build();

    // Act Assert
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(ACCOUNT_ID, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(ACCOUNT_TYPE, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(BALANCE, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.ID, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.STATE, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.VERSION, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.PREPARED_AT, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.COMMITTED_AT, metadata))
        .isTrue();
    assertThat(
            ConsensusCommitUtils.isTransactionalMetaColumn(
                Attribute.BEFORE_PREFIX + BALANCE, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.BEFORE_ID, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.BEFORE_STATE, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.BEFORE_VERSION, metadata))
        .isTrue();
    assertThat(
            ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.BEFORE_PREPARED_AT, metadata))
        .isTrue();
    assertThat(
            ConsensusCommitUtils.isTransactionalMetaColumn(Attribute.BEFORE_COMMITTED_AT, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isTransactionalMetaColumn("aaa", metadata)).isFalse();
  }

  @Test
  public void isBeforeImageColumn_ResultGiven_shouldReturnProperResult() {
    // Arrange
    final String ACCOUNT_ID = "account_id";
    final String ACCOUNT_TYPE = "account_type";
    final String BALANCE = "balance";

    TableMetadata metadata =
        TableMetadata.newBuilder()
            .addColumn(ACCOUNT_ID, DataType.INT)
            .addColumn(ACCOUNT_TYPE, DataType.INT)
            .addColumn(BALANCE, DataType.INT)
            .addColumn(Attribute.ID, DataType.TEXT)
            .addColumn(Attribute.STATE, DataType.INT)
            .addColumn(Attribute.VERSION, DataType.INT)
            .addColumn(Attribute.PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.COMMITTED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_PREFIX + BALANCE, DataType.INT)
            .addColumn(Attribute.BEFORE_ID, DataType.TEXT)
            .addColumn(Attribute.BEFORE_STATE, DataType.INT)
            .addColumn(Attribute.BEFORE_VERSION, DataType.INT)
            .addColumn(Attribute.BEFORE_PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_COMMITTED_AT, DataType.BIGINT)
            .addPartitionKey(ACCOUNT_ID)
            .addClusteringKey(ACCOUNT_TYPE)
            .build();

    // Act Assert
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(ACCOUNT_ID, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(ACCOUNT_TYPE, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(BALANCE, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.ID, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.STATE, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.VERSION, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.PREPARED_AT, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.COMMITTED_AT, metadata))
        .isFalse();
    assertThat(
            ConsensusCommitUtils.isBeforeImageColumn(Attribute.BEFORE_PREFIX + BALANCE, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.BEFORE_ID, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.BEFORE_STATE, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.BEFORE_VERSION, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.BEFORE_PREPARED_AT, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.BEFORE_COMMITTED_AT, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn("aaa", metadata)).isFalse();
  }

  @Test
  public void
      isBeforeImageColumn_PartitionKeyAndClusteringKeyWithBeforePrefixGiven_shouldReturnProperResult() {
    // Arrange
    TableMetadata metadata =
        TableMetadata.newBuilder()
            .addColumn("partitionKey", DataType.INT)
            .addColumn("before_partitionKey", DataType.INT)
            .addColumn("clusteringKey", DataType.INT)
            .addColumn("before_clusteringKey", DataType.INT)
            .addColumn("col", DataType.INT)
            .addColumn(Attribute.ID, DataType.TEXT)
            .addColumn(Attribute.STATE, DataType.INT)
            .addColumn(Attribute.VERSION, DataType.INT)
            .addColumn(Attribute.PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.COMMITTED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_PREFIX + "col", DataType.INT)
            .addColumn(Attribute.BEFORE_ID, DataType.TEXT)
            .addColumn(Attribute.BEFORE_STATE, DataType.INT)
            .addColumn(Attribute.BEFORE_VERSION, DataType.INT)
            .addColumn(Attribute.BEFORE_PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_COMMITTED_AT, DataType.BIGINT)
            .addPartitionKey("partitionKey")
            .addPartitionKey("before_partitionKey")
            .addClusteringKey("clusteringKey")
            .addClusteringKey("before_clusteringKey")
            .build();

    // Act Assert
    assertThat(ConsensusCommitUtils.isBeforeImageColumn("partitionKey", metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn("before_partitionKey", metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn("clusteringKey", metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn("before_clusteringKey", metadata))
        .isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn("col", metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.ID, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.STATE, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.VERSION, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.PREPARED_AT, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.COMMITTED_AT, metadata))
        .isFalse();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.BEFORE_PREFIX + "col", metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.BEFORE_ID, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.BEFORE_STATE, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.BEFORE_VERSION, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.BEFORE_PREPARED_AT, metadata))
        .isTrue();
    assertThat(ConsensusCommitUtils.isBeforeImageColumn(Attribute.BEFORE_COMMITTED_AT, metadata))
        .isTrue();
  }

  @Test
  public void isAfterImageColumn_ResultGiven_shouldReturnProperResult() {
    // Arrange
    final String ACCOUNT_ID = "account_id";
    final String ACCOUNT_TYPE = "account_type";
    final String BALANCE = "balance";

    TableMetadata metadata =
        TableMetadata.newBuilder()
            .addColumn(ACCOUNT_ID, DataType.INT)
            .addColumn(ACCOUNT_TYPE, DataType.INT)
            .addColumn(BALANCE, DataType.INT)
            .addColumn(Attribute.ID, DataType.TEXT)
            .addColumn(Attribute.STATE, DataType.INT)
            .addColumn(Attribute.VERSION, DataType.INT)
            .addColumn(Attribute.PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.COMMITTED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_PREFIX + BALANCE, DataType.INT)
            .addColumn(Attribute.BEFORE_ID, DataType.TEXT)
            .addColumn(Attribute.BEFORE_STATE, DataType.INT)
            .addColumn(Attribute.BEFORE_VERSION, DataType.INT)
            .addColumn(Attribute.BEFORE_PREPARED_AT, DataType.BIGINT)
            .addColumn(Attribute.BEFORE_COMMITTED_AT, DataType.BIGINT)
            .addPartitionKey(ACCOUNT_ID)
            .addClusteringKey(ACCOUNT_TYPE)
            .build();

    // Act Assert
    assertThat(ConsensusCommitUtils.isAfterImageColumn(ACCOUNT_ID, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isAfterImageColumn(ACCOUNT_TYPE, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isAfterImageColumn(BALANCE, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isAfterImageColumn(Attribute.ID, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isAfterImageColumn(Attribute.STATE, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isAfterImageColumn(Attribute.VERSION, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isAfterImageColumn(Attribute.PREPARED_AT, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isAfterImageColumn(Attribute.COMMITTED_AT, metadata)).isTrue();
    assertThat(ConsensusCommitUtils.isAfterImageColumn(Attribute.BEFORE_PREFIX + BALANCE, metadata))
        .isFalse();
    assertThat(ConsensusCommitUtils.isAfterImageColumn(Attribute.BEFORE_ID, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isAfterImageColumn(Attribute.BEFORE_STATE, metadata)).isFalse();
    assertThat(ConsensusCommitUtils.isAfterImageColumn(Attribute.BEFORE_VERSION, metadata))
        .isFalse();
    assertThat(ConsensusCommitUtils.isAfterImageColumn(Attribute.BEFORE_PREPARED_AT, metadata))
        .isFalse();
    assertThat(ConsensusCommitUtils.isAfterImageColumn(Attribute.BEFORE_COMMITTED_AT, metadata))
        .isFalse();
    assertThat(ConsensusCommitUtils.isAfterImageColumn("aaa", metadata)).isFalse();
  }
}
