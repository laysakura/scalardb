// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalardb.proto

package com.scalar.db.rpc;

/**
 * Protobuf type {@code rpc.MutateRequest}
 */
public final class MutateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.MutateRequest)
    MutateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateRequest.newBuilder() to construct.
  private MutateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateRequest() {
    mutations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_MutateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_MutateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalar.db.rpc.MutateRequest.class, com.scalar.db.rpc.MutateRequest.Builder.class);
  }

  public static final int MUTATIONS_FIELD_NUMBER = 1;
  private java.util.List<com.scalar.db.rpc.Mutation> mutations_;
  /**
   * <code>repeated .rpc.Mutation mutations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.scalar.db.rpc.Mutation> getMutationsList() {
    return mutations_;
  }
  /**
   * <code>repeated .rpc.Mutation mutations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.scalar.db.rpc.MutationOrBuilder> 
      getMutationsOrBuilderList() {
    return mutations_;
  }
  /**
   * <code>repeated .rpc.Mutation mutations = 1;</code>
   */
  @java.lang.Override
  public int getMutationsCount() {
    return mutations_.size();
  }
  /**
   * <code>repeated .rpc.Mutation mutations = 1;</code>
   */
  @java.lang.Override
  public com.scalar.db.rpc.Mutation getMutations(int index) {
    return mutations_.get(index);
  }
  /**
   * <code>repeated .rpc.Mutation mutations = 1;</code>
   */
  @java.lang.Override
  public com.scalar.db.rpc.MutationOrBuilder getMutationsOrBuilder(
      int index) {
    return mutations_.get(index);
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
    for (int i = 0; i < mutations_.size(); i++) {
      output.writeMessage(1, mutations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mutations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, mutations_.get(i));
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
    if (!(obj instanceof com.scalar.db.rpc.MutateRequest)) {
      return super.equals(obj);
    }
    com.scalar.db.rpc.MutateRequest other = (com.scalar.db.rpc.MutateRequest) obj;

    if (!getMutationsList()
        .equals(other.getMutationsList())) return false;
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
    if (getMutationsCount() > 0) {
      hash = (37 * hash) + MUTATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getMutationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalar.db.rpc.MutateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalar.db.rpc.MutateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.MutateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(
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
  public static Builder newBuilder(com.scalar.db.rpc.MutateRequest prototype) {
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
   * Protobuf type {@code rpc.MutateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.MutateRequest)
      com.scalar.db.rpc.MutateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_MutateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_MutateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalar.db.rpc.MutateRequest.class, com.scalar.db.rpc.MutateRequest.Builder.class);
    }

    // Construct using com.scalar.db.rpc.MutateRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (mutationsBuilder_ == null) {
        mutations_ = java.util.Collections.emptyList();
      } else {
        mutations_ = null;
        mutationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_MutateRequest_descriptor;
    }

    @java.lang.Override
    public com.scalar.db.rpc.MutateRequest getDefaultInstanceForType() {
      return com.scalar.db.rpc.MutateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalar.db.rpc.MutateRequest build() {
      com.scalar.db.rpc.MutateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalar.db.rpc.MutateRequest buildPartial() {
      com.scalar.db.rpc.MutateRequest result = new com.scalar.db.rpc.MutateRequest(this);
      int from_bitField0_ = bitField0_;
      if (mutationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mutations_ = java.util.Collections.unmodifiableList(mutations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mutations_ = mutations_;
      } else {
        result.mutations_ = mutationsBuilder_.build();
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
      if (other instanceof com.scalar.db.rpc.MutateRequest) {
        return mergeFrom((com.scalar.db.rpc.MutateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalar.db.rpc.MutateRequest other) {
      if (other == com.scalar.db.rpc.MutateRequest.getDefaultInstance()) return this;
      if (mutationsBuilder_ == null) {
        if (!other.mutations_.isEmpty()) {
          if (mutations_.isEmpty()) {
            mutations_ = other.mutations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMutationsIsMutable();
            mutations_.addAll(other.mutations_);
          }
          onChanged();
        }
      } else {
        if (!other.mutations_.isEmpty()) {
          if (mutationsBuilder_.isEmpty()) {
            mutationsBuilder_.dispose();
            mutationsBuilder_ = null;
            mutations_ = other.mutations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mutationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMutationsFieldBuilder() : null;
          } else {
            mutationsBuilder_.addAllMessages(other.mutations_);
          }
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
              com.scalar.db.rpc.Mutation m =
                  input.readMessage(
                      com.scalar.db.rpc.Mutation.parser(),
                      extensionRegistry);
              if (mutationsBuilder_ == null) {
                ensureMutationsIsMutable();
                mutations_.add(m);
              } else {
                mutationsBuilder_.addMessage(m);
              }
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
    private int bitField0_;

    private java.util.List<com.scalar.db.rpc.Mutation> mutations_ =
      java.util.Collections.emptyList();
    private void ensureMutationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mutations_ = new java.util.ArrayList<com.scalar.db.rpc.Mutation>(mutations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalar.db.rpc.Mutation, com.scalar.db.rpc.Mutation.Builder, com.scalar.db.rpc.MutationOrBuilder> mutationsBuilder_;

    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public java.util.List<com.scalar.db.rpc.Mutation> getMutationsList() {
      if (mutationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mutations_);
      } else {
        return mutationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public int getMutationsCount() {
      if (mutationsBuilder_ == null) {
        return mutations_.size();
      } else {
        return mutationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public com.scalar.db.rpc.Mutation getMutations(int index) {
      if (mutationsBuilder_ == null) {
        return mutations_.get(index);
      } else {
        return mutationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public Builder setMutations(
        int index, com.scalar.db.rpc.Mutation value) {
      if (mutationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutationsIsMutable();
        mutations_.set(index, value);
        onChanged();
      } else {
        mutationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public Builder setMutations(
        int index, com.scalar.db.rpc.Mutation.Builder builderForValue) {
      if (mutationsBuilder_ == null) {
        ensureMutationsIsMutable();
        mutations_.set(index, builderForValue.build());
        onChanged();
      } else {
        mutationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public Builder addMutations(com.scalar.db.rpc.Mutation value) {
      if (mutationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutationsIsMutable();
        mutations_.add(value);
        onChanged();
      } else {
        mutationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public Builder addMutations(
        int index, com.scalar.db.rpc.Mutation value) {
      if (mutationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutationsIsMutable();
        mutations_.add(index, value);
        onChanged();
      } else {
        mutationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public Builder addMutations(
        com.scalar.db.rpc.Mutation.Builder builderForValue) {
      if (mutationsBuilder_ == null) {
        ensureMutationsIsMutable();
        mutations_.add(builderForValue.build());
        onChanged();
      } else {
        mutationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public Builder addMutations(
        int index, com.scalar.db.rpc.Mutation.Builder builderForValue) {
      if (mutationsBuilder_ == null) {
        ensureMutationsIsMutable();
        mutations_.add(index, builderForValue.build());
        onChanged();
      } else {
        mutationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public Builder addAllMutations(
        java.lang.Iterable<? extends com.scalar.db.rpc.Mutation> values) {
      if (mutationsBuilder_ == null) {
        ensureMutationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mutations_);
        onChanged();
      } else {
        mutationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public Builder clearMutations() {
      if (mutationsBuilder_ == null) {
        mutations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mutationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public Builder removeMutations(int index) {
      if (mutationsBuilder_ == null) {
        ensureMutationsIsMutable();
        mutations_.remove(index);
        onChanged();
      } else {
        mutationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public com.scalar.db.rpc.Mutation.Builder getMutationsBuilder(
        int index) {
      return getMutationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public com.scalar.db.rpc.MutationOrBuilder getMutationsOrBuilder(
        int index) {
      if (mutationsBuilder_ == null) {
        return mutations_.get(index);  } else {
        return mutationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public java.util.List<? extends com.scalar.db.rpc.MutationOrBuilder> 
         getMutationsOrBuilderList() {
      if (mutationsBuilder_ != null) {
        return mutationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mutations_);
      }
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public com.scalar.db.rpc.Mutation.Builder addMutationsBuilder() {
      return getMutationsFieldBuilder().addBuilder(
          com.scalar.db.rpc.Mutation.getDefaultInstance());
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public com.scalar.db.rpc.Mutation.Builder addMutationsBuilder(
        int index) {
      return getMutationsFieldBuilder().addBuilder(
          index, com.scalar.db.rpc.Mutation.getDefaultInstance());
    }
    /**
     * <code>repeated .rpc.Mutation mutations = 1;</code>
     */
    public java.util.List<com.scalar.db.rpc.Mutation.Builder> 
         getMutationsBuilderList() {
      return getMutationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalar.db.rpc.Mutation, com.scalar.db.rpc.Mutation.Builder, com.scalar.db.rpc.MutationOrBuilder> 
        getMutationsFieldBuilder() {
      if (mutationsBuilder_ == null) {
        mutationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.scalar.db.rpc.Mutation, com.scalar.db.rpc.Mutation.Builder, com.scalar.db.rpc.MutationOrBuilder>(
                mutations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mutations_ = null;
      }
      return mutationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rpc.MutateRequest)
  }

  // @@protoc_insertion_point(class_scope:rpc.MutateRequest)
  private static final com.scalar.db.rpc.MutateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalar.db.rpc.MutateRequest();
  }

  public static com.scalar.db.rpc.MutateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateRequest>
      PARSER = new com.google.protobuf.AbstractParser<MutateRequest>() {
    @java.lang.Override
    public MutateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalar.db.rpc.MutateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

