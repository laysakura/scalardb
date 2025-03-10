// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalardb.proto

package com.scalar.db.rpc;

/**
 * Protobuf type {@code rpc.ConditionalExpression}
 */
public final class ConditionalExpression extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.ConditionalExpression)
    ConditionalExpressionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConditionalExpression.newBuilder() to construct.
  private ConditionalExpression(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConditionalExpression() {
    name_ = "";
    operator_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConditionalExpression();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_ConditionalExpression_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_ConditionalExpression_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalar.db.rpc.ConditionalExpression.class, com.scalar.db.rpc.ConditionalExpression.Builder.class);
  }

  /**
   * Protobuf enum {@code rpc.ConditionalExpression.Operator}
   */
  public enum Operator
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EQ = 0;</code>
     */
    EQ(0),
    /**
     * <code>NE = 1;</code>
     */
    NE(1),
    /**
     * <code>GT = 2;</code>
     */
    GT(2),
    /**
     * <code>GTE = 3;</code>
     */
    GTE(3),
    /**
     * <code>LT = 4;</code>
     */
    LT(4),
    /**
     * <code>LTE = 5;</code>
     */
    LTE(5),
    /**
     * <code>IS_NULL = 6;</code>
     */
    IS_NULL(6),
    /**
     * <code>IS_NOT_NULL = 7;</code>
     */
    IS_NOT_NULL(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>EQ = 0;</code>
     */
    public static final int EQ_VALUE = 0;
    /**
     * <code>NE = 1;</code>
     */
    public static final int NE_VALUE = 1;
    /**
     * <code>GT = 2;</code>
     */
    public static final int GT_VALUE = 2;
    /**
     * <code>GTE = 3;</code>
     */
    public static final int GTE_VALUE = 3;
    /**
     * <code>LT = 4;</code>
     */
    public static final int LT_VALUE = 4;
    /**
     * <code>LTE = 5;</code>
     */
    public static final int LTE_VALUE = 5;
    /**
     * <code>IS_NULL = 6;</code>
     */
    public static final int IS_NULL_VALUE = 6;
    /**
     * <code>IS_NOT_NULL = 7;</code>
     */
    public static final int IS_NOT_NULL_VALUE = 7;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Operator valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Operator forNumber(int value) {
      switch (value) {
        case 0: return EQ;
        case 1: return NE;
        case 2: return GT;
        case 3: return GTE;
        case 4: return LT;
        case 5: return LTE;
        case 6: return IS_NULL;
        case 7: return IS_NOT_NULL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operator>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operator> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operator>() {
            public Operator findValueByNumber(int number) {
              return Operator.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.scalar.db.rpc.ConditionalExpression.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operator[] VALUES = values();

    public static Operator valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Operator(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:rpc.ConditionalExpression.Operator)
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1 [deprecated = true];</code>
   * @deprecated rpc.ConditionalExpression.name is deprecated.
   *     See scalardb.proto;l=91
   * @return The name.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1 [deprecated = true];</code>
   * @deprecated rpc.ConditionalExpression.name is deprecated.
   *     See scalardb.proto;l=91
   * @return The bytes for name.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.scalar.db.rpc.Value value_;
  /**
   * <code>.rpc.Value value = 2 [deprecated = true];</code>
   * @deprecated rpc.ConditionalExpression.value is deprecated.
   *     See scalardb.proto;l=92
   * @return Whether the value field is set.
   */
  @java.lang.Override
  @java.lang.Deprecated public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <code>.rpc.Value value = 2 [deprecated = true];</code>
   * @deprecated rpc.ConditionalExpression.value is deprecated.
   *     See scalardb.proto;l=92
   * @return The value.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.scalar.db.rpc.Value getValue() {
    return value_ == null ? com.scalar.db.rpc.Value.getDefaultInstance() : value_;
  }
  /**
   * <code>.rpc.Value value = 2 [deprecated = true];</code>
   */
  @java.lang.Override
  @java.lang.Deprecated public com.scalar.db.rpc.ValueOrBuilder getValueOrBuilder() {
    return getValue();
  }

  public static final int OPERATOR_FIELD_NUMBER = 3;
  private int operator_;
  /**
   * <code>.rpc.ConditionalExpression.Operator operator = 3;</code>
   * @return The enum numeric value on the wire for operator.
   */
  @java.lang.Override public int getOperatorValue() {
    return operator_;
  }
  /**
   * <code>.rpc.ConditionalExpression.Operator operator = 3;</code>
   * @return The operator.
   */
  @java.lang.Override public com.scalar.db.rpc.ConditionalExpression.Operator getOperator() {
    @SuppressWarnings("deprecation")
    com.scalar.db.rpc.ConditionalExpression.Operator result = com.scalar.db.rpc.ConditionalExpression.Operator.valueOf(operator_);
    return result == null ? com.scalar.db.rpc.ConditionalExpression.Operator.UNRECOGNIZED : result;
  }

  public static final int COLUMN_FIELD_NUMBER = 4;
  private com.scalar.db.rpc.Column column_;
  /**
   * <code>.rpc.Column column = 4;</code>
   * @return Whether the column field is set.
   */
  @java.lang.Override
  public boolean hasColumn() {
    return column_ != null;
  }
  /**
   * <code>.rpc.Column column = 4;</code>
   * @return The column.
   */
  @java.lang.Override
  public com.scalar.db.rpc.Column getColumn() {
    return column_ == null ? com.scalar.db.rpc.Column.getDefaultInstance() : column_;
  }
  /**
   * <code>.rpc.Column column = 4;</code>
   */
  @java.lang.Override
  public com.scalar.db.rpc.ColumnOrBuilder getColumnOrBuilder() {
    return getColumn();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (value_ != null) {
      output.writeMessage(2, getValue());
    }
    if (operator_ != com.scalar.db.rpc.ConditionalExpression.Operator.EQ.getNumber()) {
      output.writeEnum(3, operator_);
    }
    if (column_ != null) {
      output.writeMessage(4, getColumn());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValue());
    }
    if (operator_ != com.scalar.db.rpc.ConditionalExpression.Operator.EQ.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, operator_);
    }
    if (column_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getColumn());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.scalar.db.rpc.ConditionalExpression)) {
      return super.equals(obj);
    }
    com.scalar.db.rpc.ConditionalExpression other = (com.scalar.db.rpc.ConditionalExpression) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
    if (operator_ != other.operator_) return false;
    if (hasColumn() != other.hasColumn()) return false;
    if (hasColumn()) {
      if (!getColumn()
          .equals(other.getColumn())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (37 * hash) + OPERATOR_FIELD_NUMBER;
    hash = (53 * hash) + operator_;
    if (hasColumn()) {
      hash = (37 * hash) + COLUMN_FIELD_NUMBER;
      hash = (53 * hash) + getColumn().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalar.db.rpc.ConditionalExpression parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.ConditionalExpression parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.ConditionalExpression parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.ConditionalExpression parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.ConditionalExpression parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.ConditionalExpression parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.ConditionalExpression parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.ConditionalExpression parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalar.db.rpc.ConditionalExpression parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.ConditionalExpression parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalar.db.rpc.ConditionalExpression parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.ConditionalExpression parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.scalar.db.rpc.ConditionalExpression prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rpc.ConditionalExpression}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.ConditionalExpression)
      com.scalar.db.rpc.ConditionalExpressionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_ConditionalExpression_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_ConditionalExpression_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalar.db.rpc.ConditionalExpression.class, com.scalar.db.rpc.ConditionalExpression.Builder.class);
    }

    // Construct using com.scalar.db.rpc.ConditionalExpression.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        value_ = null;
        valueBuilder_ = null;
      }
      operator_ = 0;

      if (columnBuilder_ == null) {
        column_ = null;
      } else {
        column_ = null;
        columnBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_ConditionalExpression_descriptor;
    }

    @java.lang.Override
    public com.scalar.db.rpc.ConditionalExpression getDefaultInstanceForType() {
      return com.scalar.db.rpc.ConditionalExpression.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalar.db.rpc.ConditionalExpression build() {
      com.scalar.db.rpc.ConditionalExpression result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalar.db.rpc.ConditionalExpression buildPartial() {
      com.scalar.db.rpc.ConditionalExpression result = new com.scalar.db.rpc.ConditionalExpression(this);
      result.name_ = name_;
      if (valueBuilder_ == null) {
        result.value_ = value_;
      } else {
        result.value_ = valueBuilder_.build();
      }
      result.operator_ = operator_;
      if (columnBuilder_ == null) {
        result.column_ = column_;
      } else {
        result.column_ = columnBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.scalar.db.rpc.ConditionalExpression) {
        return mergeFrom((com.scalar.db.rpc.ConditionalExpression)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalar.db.rpc.ConditionalExpression other) {
      if (other == com.scalar.db.rpc.ConditionalExpression.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
      }
      if (other.operator_ != 0) {
        setOperatorValue(other.getOperatorValue());
      }
      if (other.hasColumn()) {
        mergeColumn(other.getColumn());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              name_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getValueFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 24: {
              operator_ = input.readEnum();

              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getColumnFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1 [deprecated = true];</code>
     * @deprecated rpc.ConditionalExpression.name is deprecated.
     *     See scalardb.proto;l=91
     * @return The name.
     */
    @java.lang.Deprecated public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1 [deprecated = true];</code>
     * @deprecated rpc.ConditionalExpression.name is deprecated.
     *     See scalardb.proto;l=91
     * @return The bytes for name.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1 [deprecated = true];</code>
     * @deprecated rpc.ConditionalExpression.name is deprecated.
     *     See scalardb.proto;l=91
     * @param value The name to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [deprecated = true];</code>
     * @deprecated rpc.ConditionalExpression.name is deprecated.
     *     See scalardb.proto;l=91
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [deprecated = true];</code>
     * @deprecated rpc.ConditionalExpression.name is deprecated.
     *     See scalardb.proto;l=91
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.scalar.db.rpc.Value value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalar.db.rpc.Value, com.scalar.db.rpc.Value.Builder, com.scalar.db.rpc.ValueOrBuilder> valueBuilder_;
    /**
     * <code>.rpc.Value value = 2 [deprecated = true];</code>
     * @deprecated rpc.ConditionalExpression.value is deprecated.
     *     See scalardb.proto;l=92
     * @return Whether the value field is set.
     */
    @java.lang.Deprecated public boolean hasValue() {
      return valueBuilder_ != null || value_ != null;
    }
    /**
     * <code>.rpc.Value value = 2 [deprecated = true];</code>
     * @deprecated rpc.ConditionalExpression.value is deprecated.
     *     See scalardb.proto;l=92
     * @return The value.
     */
    @java.lang.Deprecated public com.scalar.db.rpc.Value getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.scalar.db.rpc.Value.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <code>.rpc.Value value = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setValue(com.scalar.db.rpc.Value value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rpc.Value value = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setValue(
        com.scalar.db.rpc.Value.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rpc.Value value = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder mergeValue(com.scalar.db.rpc.Value value) {
      if (valueBuilder_ == null) {
        if (value_ != null) {
          value_ =
            com.scalar.db.rpc.Value.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rpc.Value value = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        value_ = null;
        valueBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rpc.Value value = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public com.scalar.db.rpc.Value.Builder getValueBuilder() {
      
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.rpc.Value value = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public com.scalar.db.rpc.ValueOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.scalar.db.rpc.Value.getDefaultInstance() : value_;
      }
    }
    /**
     * <code>.rpc.Value value = 2 [deprecated = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalar.db.rpc.Value, com.scalar.db.rpc.Value.Builder, com.scalar.db.rpc.ValueOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalar.db.rpc.Value, com.scalar.db.rpc.Value.Builder, com.scalar.db.rpc.ValueOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
    }

    private int operator_ = 0;
    /**
     * <code>.rpc.ConditionalExpression.Operator operator = 3;</code>
     * @return The enum numeric value on the wire for operator.
     */
    @java.lang.Override public int getOperatorValue() {
      return operator_;
    }
    /**
     * <code>.rpc.ConditionalExpression.Operator operator = 3;</code>
     * @param value The enum numeric value on the wire for operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorValue(int value) {
      
      operator_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.rpc.ConditionalExpression.Operator operator = 3;</code>
     * @return The operator.
     */
    @java.lang.Override
    public com.scalar.db.rpc.ConditionalExpression.Operator getOperator() {
      @SuppressWarnings("deprecation")
      com.scalar.db.rpc.ConditionalExpression.Operator result = com.scalar.db.rpc.ConditionalExpression.Operator.valueOf(operator_);
      return result == null ? com.scalar.db.rpc.ConditionalExpression.Operator.UNRECOGNIZED : result;
    }
    /**
     * <code>.rpc.ConditionalExpression.Operator operator = 3;</code>
     * @param value The operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperator(com.scalar.db.rpc.ConditionalExpression.Operator value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      operator_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.rpc.ConditionalExpression.Operator operator = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperator() {
      
      operator_ = 0;
      onChanged();
      return this;
    }

    private com.scalar.db.rpc.Column column_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalar.db.rpc.Column, com.scalar.db.rpc.Column.Builder, com.scalar.db.rpc.ColumnOrBuilder> columnBuilder_;
    /**
     * <code>.rpc.Column column = 4;</code>
     * @return Whether the column field is set.
     */
    public boolean hasColumn() {
      return columnBuilder_ != null || column_ != null;
    }
    /**
     * <code>.rpc.Column column = 4;</code>
     * @return The column.
     */
    public com.scalar.db.rpc.Column getColumn() {
      if (columnBuilder_ == null) {
        return column_ == null ? com.scalar.db.rpc.Column.getDefaultInstance() : column_;
      } else {
        return columnBuilder_.getMessage();
      }
    }
    /**
     * <code>.rpc.Column column = 4;</code>
     */
    public Builder setColumn(com.scalar.db.rpc.Column value) {
      if (columnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        column_ = value;
        onChanged();
      } else {
        columnBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rpc.Column column = 4;</code>
     */
    public Builder setColumn(
        com.scalar.db.rpc.Column.Builder builderForValue) {
      if (columnBuilder_ == null) {
        column_ = builderForValue.build();
        onChanged();
      } else {
        columnBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rpc.Column column = 4;</code>
     */
    public Builder mergeColumn(com.scalar.db.rpc.Column value) {
      if (columnBuilder_ == null) {
        if (column_ != null) {
          column_ =
            com.scalar.db.rpc.Column.newBuilder(column_).mergeFrom(value).buildPartial();
        } else {
          column_ = value;
        }
        onChanged();
      } else {
        columnBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rpc.Column column = 4;</code>
     */
    public Builder clearColumn() {
      if (columnBuilder_ == null) {
        column_ = null;
        onChanged();
      } else {
        column_ = null;
        columnBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rpc.Column column = 4;</code>
     */
    public com.scalar.db.rpc.Column.Builder getColumnBuilder() {
      
      onChanged();
      return getColumnFieldBuilder().getBuilder();
    }
    /**
     * <code>.rpc.Column column = 4;</code>
     */
    public com.scalar.db.rpc.ColumnOrBuilder getColumnOrBuilder() {
      if (columnBuilder_ != null) {
        return columnBuilder_.getMessageOrBuilder();
      } else {
        return column_ == null ?
            com.scalar.db.rpc.Column.getDefaultInstance() : column_;
      }
    }
    /**
     * <code>.rpc.Column column = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalar.db.rpc.Column, com.scalar.db.rpc.Column.Builder, com.scalar.db.rpc.ColumnOrBuilder> 
        getColumnFieldBuilder() {
      if (columnBuilder_ == null) {
        columnBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalar.db.rpc.Column, com.scalar.db.rpc.Column.Builder, com.scalar.db.rpc.ColumnOrBuilder>(
                getColumn(),
                getParentForChildren(),
                isClean());
        column_ = null;
      }
      return columnBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rpc.ConditionalExpression)
  }

  // @@protoc_insertion_point(class_scope:rpc.ConditionalExpression)
  private static final com.scalar.db.rpc.ConditionalExpression DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalar.db.rpc.ConditionalExpression();
  }

  public static com.scalar.db.rpc.ConditionalExpression getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConditionalExpression>
      PARSER = new com.google.protobuf.AbstractParser<ConditionalExpression>() {
    @java.lang.Override
    public ConditionalExpression parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ConditionalExpression> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConditionalExpression> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalar.db.rpc.ConditionalExpression getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

