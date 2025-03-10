// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalardb.proto

package com.scalar.db.rpc;

/**
 * Protobuf type {@code rpc.GetRequest}
 */
public final class GetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.GetRequest)
    GetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetRequest.newBuilder() to construct.
  private GetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_GetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_GetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalar.db.rpc.GetRequest.class, com.scalar.db.rpc.GetRequest.Builder.class);
  }

  public static final int GET_FIELD_NUMBER = 1;
  private com.scalar.db.rpc.Get get_;
  /**
   * <code>.rpc.Get get = 1;</code>
   * @return Whether the get field is set.
   */
  @java.lang.Override
  public boolean hasGet() {
    return get_ != null;
  }
  /**
   * <code>.rpc.Get get = 1;</code>
   * @return The get.
   */
  @java.lang.Override
  public com.scalar.db.rpc.Get getGet() {
    return get_ == null ? com.scalar.db.rpc.Get.getDefaultInstance() : get_;
  }
  /**
   * <code>.rpc.Get get = 1;</code>
   */
  @java.lang.Override
  public com.scalar.db.rpc.GetOrBuilder getGetOrBuilder() {
    return getGet();
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
    if (get_ != null) {
      output.writeMessage(1, getGet());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (get_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGet());
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
    if (!(obj instanceof com.scalar.db.rpc.GetRequest)) {
      return super.equals(obj);
    }
    com.scalar.db.rpc.GetRequest other = (com.scalar.db.rpc.GetRequest) obj;

    if (hasGet() != other.hasGet()) return false;
    if (hasGet()) {
      if (!getGet()
          .equals(other.getGet())) return false;
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
    if (hasGet()) {
      hash = (37 * hash) + GET_FIELD_NUMBER;
      hash = (53 * hash) + getGet().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalar.db.rpc.GetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.GetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.GetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.GetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.GetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.GetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.GetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.GetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalar.db.rpc.GetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.GetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalar.db.rpc.GetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.GetRequest parseFrom(
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
  public static Builder newBuilder(com.scalar.db.rpc.GetRequest prototype) {
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
   * Protobuf type {@code rpc.GetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.GetRequest)
      com.scalar.db.rpc.GetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_GetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_GetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalar.db.rpc.GetRequest.class, com.scalar.db.rpc.GetRequest.Builder.class);
    }

    // Construct using com.scalar.db.rpc.GetRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (getBuilder_ == null) {
        get_ = null;
      } else {
        get_ = null;
        getBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_GetRequest_descriptor;
    }

    @java.lang.Override
    public com.scalar.db.rpc.GetRequest getDefaultInstanceForType() {
      return com.scalar.db.rpc.GetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalar.db.rpc.GetRequest build() {
      com.scalar.db.rpc.GetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalar.db.rpc.GetRequest buildPartial() {
      com.scalar.db.rpc.GetRequest result = new com.scalar.db.rpc.GetRequest(this);
      if (getBuilder_ == null) {
        result.get_ = get_;
      } else {
        result.get_ = getBuilder_.build();
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
      if (other instanceof com.scalar.db.rpc.GetRequest) {
        return mergeFrom((com.scalar.db.rpc.GetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalar.db.rpc.GetRequest other) {
      if (other == com.scalar.db.rpc.GetRequest.getDefaultInstance()) return this;
      if (other.hasGet()) {
        mergeGet(other.getGet());
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
              input.readMessage(
                  getGetFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
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

    private com.scalar.db.rpc.Get get_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalar.db.rpc.Get, com.scalar.db.rpc.Get.Builder, com.scalar.db.rpc.GetOrBuilder> getBuilder_;
    /**
     * <code>.rpc.Get get = 1;</code>
     * @return Whether the get field is set.
     */
    public boolean hasGet() {
      return getBuilder_ != null || get_ != null;
    }
    /**
     * <code>.rpc.Get get = 1;</code>
     * @return The get.
     */
    public com.scalar.db.rpc.Get getGet() {
      if (getBuilder_ == null) {
        return get_ == null ? com.scalar.db.rpc.Get.getDefaultInstance() : get_;
      } else {
        return getBuilder_.getMessage();
      }
    }
    /**
     * <code>.rpc.Get get = 1;</code>
     */
    public Builder setGet(com.scalar.db.rpc.Get value) {
      if (getBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        get_ = value;
        onChanged();
      } else {
        getBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rpc.Get get = 1;</code>
     */
    public Builder setGet(
        com.scalar.db.rpc.Get.Builder builderForValue) {
      if (getBuilder_ == null) {
        get_ = builderForValue.build();
        onChanged();
      } else {
        getBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rpc.Get get = 1;</code>
     */
    public Builder mergeGet(com.scalar.db.rpc.Get value) {
      if (getBuilder_ == null) {
        if (get_ != null) {
          get_ =
            com.scalar.db.rpc.Get.newBuilder(get_).mergeFrom(value).buildPartial();
        } else {
          get_ = value;
        }
        onChanged();
      } else {
        getBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rpc.Get get = 1;</code>
     */
    public Builder clearGet() {
      if (getBuilder_ == null) {
        get_ = null;
        onChanged();
      } else {
        get_ = null;
        getBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rpc.Get get = 1;</code>
     */
    public com.scalar.db.rpc.Get.Builder getGetBuilder() {
      
      onChanged();
      return getGetFieldBuilder().getBuilder();
    }
    /**
     * <code>.rpc.Get get = 1;</code>
     */
    public com.scalar.db.rpc.GetOrBuilder getGetOrBuilder() {
      if (getBuilder_ != null) {
        return getBuilder_.getMessageOrBuilder();
      } else {
        return get_ == null ?
            com.scalar.db.rpc.Get.getDefaultInstance() : get_;
      }
    }
    /**
     * <code>.rpc.Get get = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalar.db.rpc.Get, com.scalar.db.rpc.Get.Builder, com.scalar.db.rpc.GetOrBuilder> 
        getGetFieldBuilder() {
      if (getBuilder_ == null) {
        getBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalar.db.rpc.Get, com.scalar.db.rpc.Get.Builder, com.scalar.db.rpc.GetOrBuilder>(
                getGet(),
                getParentForChildren(),
                isClean());
        get_ = null;
      }
      return getBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rpc.GetRequest)
  }

  // @@protoc_insertion_point(class_scope:rpc.GetRequest)
  private static final com.scalar.db.rpc.GetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalar.db.rpc.GetRequest();
  }

  public static com.scalar.db.rpc.GetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetRequest>() {
    @java.lang.Override
    public GetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalar.db.rpc.GetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

