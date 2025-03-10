// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalardb.proto

package com.scalar.db.rpc;

/**
 * Protobuf type {@code rpc.Column}
 */
public final class Column extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.Column)
    ColumnOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Column.newBuilder() to construct.
  private Column(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Column() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Column();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_Column_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_Column_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalar.db.rpc.Column.class, com.scalar.db.rpc.Column.Builder.class);
  }

  private int valueCase_ = 0;
  private java.lang.Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    BOOLEAN_VALUE(2),
    INT_VALUE(3),
    BIGINT_VALUE(4),
    FLOAT_VALUE(5),
    DOUBLE_VALUE(6),
    TEXT_VALUE(7),
    BLOB_VALUE(8),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 2: return BOOLEAN_VALUE;
        case 3: return INT_VALUE;
        case 4: return BIGINT_VALUE;
        case 5: return FLOAT_VALUE;
        case 6: return DOUBLE_VALUE;
        case 7: return TEXT_VALUE;
        case 8: return BLOB_VALUE;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
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
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
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

  public static final int BOOLEAN_VALUE_FIELD_NUMBER = 2;
  /**
   * <code>bool boolean_value = 2;</code>
   * @return Whether the booleanValue field is set.
   */
  @java.lang.Override
  public boolean hasBooleanValue() {
    return valueCase_ == 2;
  }
  /**
   * <code>bool boolean_value = 2;</code>
   * @return The booleanValue.
   */
  @java.lang.Override
  public boolean getBooleanValue() {
    if (valueCase_ == 2) {
      return (java.lang.Boolean) value_;
    }
    return false;
  }

  public static final int INT_VALUE_FIELD_NUMBER = 3;
  /**
   * <code>int32 int_value = 3;</code>
   * @return Whether the intValue field is set.
   */
  @java.lang.Override
  public boolean hasIntValue() {
    return valueCase_ == 3;
  }
  /**
   * <code>int32 int_value = 3;</code>
   * @return The intValue.
   */
  @java.lang.Override
  public int getIntValue() {
    if (valueCase_ == 3) {
      return (java.lang.Integer) value_;
    }
    return 0;
  }

  public static final int BIGINT_VALUE_FIELD_NUMBER = 4;
  /**
   * <code>int64 bigint_value = 4;</code>
   * @return Whether the bigintValue field is set.
   */
  @java.lang.Override
  public boolean hasBigintValue() {
    return valueCase_ == 4;
  }
  /**
   * <code>int64 bigint_value = 4;</code>
   * @return The bigintValue.
   */
  @java.lang.Override
  public long getBigintValue() {
    if (valueCase_ == 4) {
      return (java.lang.Long) value_;
    }
    return 0L;
  }

  public static final int FLOAT_VALUE_FIELD_NUMBER = 5;
  /**
   * <code>float float_value = 5;</code>
   * @return Whether the floatValue field is set.
   */
  @java.lang.Override
  public boolean hasFloatValue() {
    return valueCase_ == 5;
  }
  /**
   * <code>float float_value = 5;</code>
   * @return The floatValue.
   */
  @java.lang.Override
  public float getFloatValue() {
    if (valueCase_ == 5) {
      return (java.lang.Float) value_;
    }
    return 0F;
  }

  public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
  /**
   * <code>double double_value = 6;</code>
   * @return Whether the doubleValue field is set.
   */
  @java.lang.Override
  public boolean hasDoubleValue() {
    return valueCase_ == 6;
  }
  /**
   * <code>double double_value = 6;</code>
   * @return The doubleValue.
   */
  @java.lang.Override
  public double getDoubleValue() {
    if (valueCase_ == 6) {
      return (java.lang.Double) value_;
    }
    return 0D;
  }

  public static final int TEXT_VALUE_FIELD_NUMBER = 7;
  /**
   * <code>string text_value = 7;</code>
   * @return Whether the textValue field is set.
   */
  public boolean hasTextValue() {
    return valueCase_ == 7;
  }
  /**
   * <code>string text_value = 7;</code>
   * @return The textValue.
   */
  public java.lang.String getTextValue() {
    java.lang.Object ref = "";
    if (valueCase_ == 7) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valueCase_ == 7) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string text_value = 7;</code>
   * @return The bytes for textValue.
   */
  public com.google.protobuf.ByteString
      getTextValueBytes() {
    java.lang.Object ref = "";
    if (valueCase_ == 7) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valueCase_ == 7) {
        value_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BLOB_VALUE_FIELD_NUMBER = 8;
  /**
   * <code>bytes blob_value = 8;</code>
   * @return Whether the blobValue field is set.
   */
  @java.lang.Override
  public boolean hasBlobValue() {
    return valueCase_ == 8;
  }
  /**
   * <code>bytes blob_value = 8;</code>
   * @return The blobValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBlobValue() {
    if (valueCase_ == 8) {
      return (com.google.protobuf.ByteString) value_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (valueCase_ == 2) {
      output.writeBool(
          2, (boolean)((java.lang.Boolean) value_));
    }
    if (valueCase_ == 3) {
      output.writeInt32(
          3, (int)((java.lang.Integer) value_));
    }
    if (valueCase_ == 4) {
      output.writeInt64(
          4, (long)((java.lang.Long) value_));
    }
    if (valueCase_ == 5) {
      output.writeFloat(
          5, (float)((java.lang.Float) value_));
    }
    if (valueCase_ == 6) {
      output.writeDouble(
          6, (double)((java.lang.Double) value_));
    }
    if (valueCase_ == 7) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, value_);
    }
    if (valueCase_ == 8) {
      output.writeBytes(
          8, (com.google.protobuf.ByteString) value_);
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
    if (valueCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            2, (boolean)((java.lang.Boolean) value_));
    }
    if (valueCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            3, (int)((java.lang.Integer) value_));
    }
    if (valueCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            4, (long)((java.lang.Long) value_));
    }
    if (valueCase_ == 5) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(
            5, (float)((java.lang.Float) value_));
    }
    if (valueCase_ == 6) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            6, (double)((java.lang.Double) value_));
    }
    if (valueCase_ == 7) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, value_);
    }
    if (valueCase_ == 8) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            8, (com.google.protobuf.ByteString) value_);
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
    if (!(obj instanceof com.scalar.db.rpc.Column)) {
      return super.equals(obj);
    }
    com.scalar.db.rpc.Column other = (com.scalar.db.rpc.Column) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 2:
        if (getBooleanValue()
            != other.getBooleanValue()) return false;
        break;
      case 3:
        if (getIntValue()
            != other.getIntValue()) return false;
        break;
      case 4:
        if (getBigintValue()
            != other.getBigintValue()) return false;
        break;
      case 5:
        if (java.lang.Float.floatToIntBits(getFloatValue())
            != java.lang.Float.floatToIntBits(
                other.getFloatValue())) return false;
        break;
      case 6:
        if (java.lang.Double.doubleToLongBits(getDoubleValue())
            != java.lang.Double.doubleToLongBits(
                other.getDoubleValue())) return false;
        break;
      case 7:
        if (!getTextValue()
            .equals(other.getTextValue())) return false;
        break;
      case 8:
        if (!getBlobValue()
            .equals(other.getBlobValue())) return false;
        break;
      case 0:
      default:
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
    switch (valueCase_) {
      case 2:
        hash = (37 * hash) + BOOLEAN_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getBooleanValue());
        break;
      case 3:
        hash = (37 * hash) + INT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getIntValue();
        break;
      case 4:
        hash = (37 * hash) + BIGINT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getBigintValue());
        break;
      case 5:
        hash = (37 * hash) + FLOAT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(
            getFloatValue());
        break;
      case 6:
        hash = (37 * hash) + DOUBLE_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getDoubleValue()));
        break;
      case 7:
        hash = (37 * hash) + TEXT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getTextValue().hashCode();
        break;
      case 8:
        hash = (37 * hash) + BLOB_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getBlobValue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalar.db.rpc.Column parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.Column parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.Column parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.Column parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.Column parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.Column parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.Column parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.Column parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalar.db.rpc.Column parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.Column parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalar.db.rpc.Column parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.Column parseFrom(
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
  public static Builder newBuilder(com.scalar.db.rpc.Column prototype) {
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
   * Protobuf type {@code rpc.Column}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.Column)
      com.scalar.db.rpc.ColumnOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_Column_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_Column_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalar.db.rpc.Column.class, com.scalar.db.rpc.Column.Builder.class);
    }

    // Construct using com.scalar.db.rpc.Column.newBuilder()
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

      valueCase_ = 0;
      value_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_Column_descriptor;
    }

    @java.lang.Override
    public com.scalar.db.rpc.Column getDefaultInstanceForType() {
      return com.scalar.db.rpc.Column.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalar.db.rpc.Column build() {
      com.scalar.db.rpc.Column result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalar.db.rpc.Column buildPartial() {
      com.scalar.db.rpc.Column result = new com.scalar.db.rpc.Column(this);
      result.name_ = name_;
      if (valueCase_ == 2) {
        result.value_ = value_;
      }
      if (valueCase_ == 3) {
        result.value_ = value_;
      }
      if (valueCase_ == 4) {
        result.value_ = value_;
      }
      if (valueCase_ == 5) {
        result.value_ = value_;
      }
      if (valueCase_ == 6) {
        result.value_ = value_;
      }
      if (valueCase_ == 7) {
        result.value_ = value_;
      }
      if (valueCase_ == 8) {
        result.value_ = value_;
      }
      result.valueCase_ = valueCase_;
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
      if (other instanceof com.scalar.db.rpc.Column) {
        return mergeFrom((com.scalar.db.rpc.Column)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalar.db.rpc.Column other) {
      if (other == com.scalar.db.rpc.Column.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      switch (other.getValueCase()) {
        case BOOLEAN_VALUE: {
          setBooleanValue(other.getBooleanValue());
          break;
        }
        case INT_VALUE: {
          setIntValue(other.getIntValue());
          break;
        }
        case BIGINT_VALUE: {
          setBigintValue(other.getBigintValue());
          break;
        }
        case FLOAT_VALUE: {
          setFloatValue(other.getFloatValue());
          break;
        }
        case DOUBLE_VALUE: {
          setDoubleValue(other.getDoubleValue());
          break;
        }
        case TEXT_VALUE: {
          valueCase_ = 7;
          value_ = other.value_;
          onChanged();
          break;
        }
        case BLOB_VALUE: {
          setBlobValue(other.getBlobValue());
          break;
        }
        case VALUE_NOT_SET: {
          break;
        }
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
            case 16: {
              value_ = input.readBool();
              valueCase_ = 2;
              break;
            } // case 16
            case 24: {
              value_ = input.readInt32();
              valueCase_ = 3;
              break;
            } // case 24
            case 32: {
              value_ = input.readInt64();
              valueCase_ = 4;
              break;
            } // case 32
            case 45: {
              value_ = input.readFloat();
              valueCase_ = 5;
              break;
            } // case 45
            case 49: {
              value_ = input.readDouble();
              valueCase_ = 6;
              break;
            } // case 49
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();
              valueCase_ = 7;
              value_ = s;
              break;
            } // case 58
            case 66: {
              value_ = input.readBytes();
              valueCase_ = 8;
              break;
            } // case 66
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
    private int valueCase_ = 0;
    private java.lang.Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
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
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
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
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>bool boolean_value = 2;</code>
     * @return Whether the booleanValue field is set.
     */
    public boolean hasBooleanValue() {
      return valueCase_ == 2;
    }
    /**
     * <code>bool boolean_value = 2;</code>
     * @return The booleanValue.
     */
    public boolean getBooleanValue() {
      if (valueCase_ == 2) {
        return (java.lang.Boolean) value_;
      }
      return false;
    }
    /**
     * <code>bool boolean_value = 2;</code>
     * @param value The booleanValue to set.
     * @return This builder for chaining.
     */
    public Builder setBooleanValue(boolean value) {
      valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool boolean_value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBooleanValue() {
      if (valueCase_ == 2) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>int32 int_value = 3;</code>
     * @return Whether the intValue field is set.
     */
    public boolean hasIntValue() {
      return valueCase_ == 3;
    }
    /**
     * <code>int32 int_value = 3;</code>
     * @return The intValue.
     */
    public int getIntValue() {
      if (valueCase_ == 3) {
        return (java.lang.Integer) value_;
      }
      return 0;
    }
    /**
     * <code>int32 int_value = 3;</code>
     * @param value The intValue to set.
     * @return This builder for chaining.
     */
    public Builder setIntValue(int value) {
      valueCase_ = 3;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 int_value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntValue() {
      if (valueCase_ == 3) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>int64 bigint_value = 4;</code>
     * @return Whether the bigintValue field is set.
     */
    public boolean hasBigintValue() {
      return valueCase_ == 4;
    }
    /**
     * <code>int64 bigint_value = 4;</code>
     * @return The bigintValue.
     */
    public long getBigintValue() {
      if (valueCase_ == 4) {
        return (java.lang.Long) value_;
      }
      return 0L;
    }
    /**
     * <code>int64 bigint_value = 4;</code>
     * @param value The bigintValue to set.
     * @return This builder for chaining.
     */
    public Builder setBigintValue(long value) {
      valueCase_ = 4;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 bigint_value = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBigintValue() {
      if (valueCase_ == 4) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>float float_value = 5;</code>
     * @return Whether the floatValue field is set.
     */
    public boolean hasFloatValue() {
      return valueCase_ == 5;
    }
    /**
     * <code>float float_value = 5;</code>
     * @return The floatValue.
     */
    public float getFloatValue() {
      if (valueCase_ == 5) {
        return (java.lang.Float) value_;
      }
      return 0F;
    }
    /**
     * <code>float float_value = 5;</code>
     * @param value The floatValue to set.
     * @return This builder for chaining.
     */
    public Builder setFloatValue(float value) {
      valueCase_ = 5;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float float_value = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFloatValue() {
      if (valueCase_ == 5) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>double double_value = 6;</code>
     * @return Whether the doubleValue field is set.
     */
    public boolean hasDoubleValue() {
      return valueCase_ == 6;
    }
    /**
     * <code>double double_value = 6;</code>
     * @return The doubleValue.
     */
    public double getDoubleValue() {
      if (valueCase_ == 6) {
        return (java.lang.Double) value_;
      }
      return 0D;
    }
    /**
     * <code>double double_value = 6;</code>
     * @param value The doubleValue to set.
     * @return This builder for chaining.
     */
    public Builder setDoubleValue(double value) {
      valueCase_ = 6;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double double_value = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoubleValue() {
      if (valueCase_ == 6) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>string text_value = 7;</code>
     * @return Whether the textValue field is set.
     */
    @java.lang.Override
    public boolean hasTextValue() {
      return valueCase_ == 7;
    }
    /**
     * <code>string text_value = 7;</code>
     * @return The textValue.
     */
    @java.lang.Override
    public java.lang.String getTextValue() {
      java.lang.Object ref = "";
      if (valueCase_ == 7) {
        ref = value_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 7) {
          value_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string text_value = 7;</code>
     * @return The bytes for textValue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTextValueBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 7) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valueCase_ == 7) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string text_value = 7;</code>
     * @param value The textValue to set.
     * @return This builder for chaining.
     */
    public Builder setTextValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  valueCase_ = 7;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string text_value = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearTextValue() {
      if (valueCase_ == 7) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string text_value = 7;</code>
     * @param value The bytes for textValue to set.
     * @return This builder for chaining.
     */
    public Builder setTextValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      valueCase_ = 7;
      value_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>bytes blob_value = 8;</code>
     * @return Whether the blobValue field is set.
     */
    public boolean hasBlobValue() {
      return valueCase_ == 8;
    }
    /**
     * <code>bytes blob_value = 8;</code>
     * @return The blobValue.
     */
    public com.google.protobuf.ByteString getBlobValue() {
      if (valueCase_ == 8) {
        return (com.google.protobuf.ByteString) value_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>bytes blob_value = 8;</code>
     * @param value The blobValue to set.
     * @return This builder for chaining.
     */
    public Builder setBlobValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  valueCase_ = 8;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes blob_value = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlobValue() {
      if (valueCase_ == 8) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
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


    // @@protoc_insertion_point(builder_scope:rpc.Column)
  }

  // @@protoc_insertion_point(class_scope:rpc.Column)
  private static final com.scalar.db.rpc.Column DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalar.db.rpc.Column();
  }

  public static com.scalar.db.rpc.Column getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Column>
      PARSER = new com.google.protobuf.AbstractParser<Column>() {
    @java.lang.Override
    public Column parsePartialFrom(
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

  public static com.google.protobuf.Parser<Column> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Column> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalar.db.rpc.Column getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

