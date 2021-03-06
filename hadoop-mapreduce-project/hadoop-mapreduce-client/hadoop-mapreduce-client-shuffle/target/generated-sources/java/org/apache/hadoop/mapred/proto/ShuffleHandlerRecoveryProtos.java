// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShuffleHandlerRecovery.proto

package org.apache.hadoop.mapred.proto;

public final class ShuffleHandlerRecoveryProtos {
  private ShuffleHandlerRecoveryProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface JobShuffleInfoProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string user = 1;
    /**
     * <code>optional string user = 1;</code>
     */
    boolean hasUser();
    /**
     * <code>optional string user = 1;</code>
     */
    java.lang.String getUser();
    /**
     * <code>optional string user = 1;</code>
     */
    com.google.protobuf.ByteString
        getUserBytes();

    // optional .hadoop.common.TokenProto jobToken = 2;
    /**
     * <code>optional .hadoop.common.TokenProto jobToken = 2;</code>
     */
    boolean hasJobToken();
    /**
     * <code>optional .hadoop.common.TokenProto jobToken = 2;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProto getJobToken();
    /**
     * <code>optional .hadoop.common.TokenProto jobToken = 2;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getJobTokenOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.mapreduce.JobShuffleInfoProto}
   */
  public static final class JobShuffleInfoProto extends
      com.google.protobuf.GeneratedMessage
      implements JobShuffleInfoProtoOrBuilder {
    // Use JobShuffleInfoProto.newBuilder() to construct.
    private JobShuffleInfoProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private JobShuffleInfoProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final JobShuffleInfoProto defaultInstance;
    public static JobShuffleInfoProto getDefaultInstance() {
      return defaultInstance;
    }

    public JobShuffleInfoProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private JobShuffleInfoProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              user_ = input.readBytes();
              break;
            }
            case 18: {
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = jobToken_.toBuilder();
              }
              jobToken_ = input.readMessage(org.apache.hadoop.security.proto.SecurityProtos.TokenProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(jobToken_);
                jobToken_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.internal_static_hadoop_mapreduce_JobShuffleInfoProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.internal_static_hadoop_mapreduce_JobShuffleInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto.class, org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto.Builder.class);
    }

    public static com.google.protobuf.Parser<JobShuffleInfoProto> PARSER =
        new com.google.protobuf.AbstractParser<JobShuffleInfoProto>() {
      public JobShuffleInfoProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JobShuffleInfoProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<JobShuffleInfoProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string user = 1;
    public static final int USER_FIELD_NUMBER = 1;
    private java.lang.Object user_;
    /**
     * <code>optional string user = 1;</code>
     */
    public boolean hasUser() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string user = 1;</code>
     */
    public java.lang.String getUser() {
      java.lang.Object ref = user_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          user_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string user = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserBytes() {
      java.lang.Object ref = user_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        user_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional .hadoop.common.TokenProto jobToken = 2;
    public static final int JOBTOKEN_FIELD_NUMBER = 2;
    private org.apache.hadoop.security.proto.SecurityProtos.TokenProto jobToken_;
    /**
     * <code>optional .hadoop.common.TokenProto jobToken = 2;</code>
     */
    public boolean hasJobToken() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .hadoop.common.TokenProto jobToken = 2;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getJobToken() {
      return jobToken_;
    }
    /**
     * <code>optional .hadoop.common.TokenProto jobToken = 2;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getJobTokenOrBuilder() {
      return jobToken_;
    }

    private void initFields() {
      user_ = "";
      jobToken_ = org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (hasJobToken()) {
        if (!getJobToken().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getUserBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, jobToken_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getUserBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, jobToken_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.mapreduce.JobShuffleInfoProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.internal_static_hadoop_mapreduce_JobShuffleInfoProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.internal_static_hadoop_mapreduce_JobShuffleInfoProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto.class, org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto.Builder.class);
      }

      // Construct using org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getJobTokenFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        user_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (jobTokenBuilder_ == null) {
          jobToken_ = org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance();
        } else {
          jobTokenBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.internal_static_hadoop_mapreduce_JobShuffleInfoProto_descriptor;
      }

      public org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto getDefaultInstanceForType() {
        return org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto.getDefaultInstance();
      }

      public org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto build() {
        org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto buildPartial() {
        org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto result = new org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.user_ = user_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (jobTokenBuilder_ == null) {
          result.jobToken_ = jobToken_;
        } else {
          result.jobToken_ = jobTokenBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto) {
          return mergeFrom((org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto other) {
        if (other == org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto.getDefaultInstance()) return this;
        if (other.hasUser()) {
          bitField0_ |= 0x00000001;
          user_ = other.user_;
          onChanged();
        }
        if (other.hasJobToken()) {
          mergeJobToken(other.getJobToken());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (hasJobToken()) {
          if (!getJobToken().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.mapred.proto.ShuffleHandlerRecoveryProtos.JobShuffleInfoProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string user = 1;
      private java.lang.Object user_ = "";
      /**
       * <code>optional string user = 1;</code>
       */
      public boolean hasUser() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string user = 1;</code>
       */
      public java.lang.String getUser() {
        java.lang.Object ref = user_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          user_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string user = 1;</code>
       */
      public com.google.protobuf.ByteString
          getUserBytes() {
        java.lang.Object ref = user_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          user_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string user = 1;</code>
       */
      public Builder setUser(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        user_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string user = 1;</code>
       */
      public Builder clearUser() {
        bitField0_ = (bitField0_ & ~0x00000001);
        user_ = getDefaultInstance().getUser();
        onChanged();
        return this;
      }
      /**
       * <code>optional string user = 1;</code>
       */
      public Builder setUserBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        user_ = value;
        onChanged();
        return this;
      }

      // optional .hadoop.common.TokenProto jobToken = 2;
      private org.apache.hadoop.security.proto.SecurityProtos.TokenProto jobToken_ = org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> jobTokenBuilder_;
      /**
       * <code>optional .hadoop.common.TokenProto jobToken = 2;</code>
       */
      public boolean hasJobToken() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .hadoop.common.TokenProto jobToken = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getJobToken() {
        if (jobTokenBuilder_ == null) {
          return jobToken_;
        } else {
          return jobTokenBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.common.TokenProto jobToken = 2;</code>
       */
      public Builder setJobToken(org.apache.hadoop.security.proto.SecurityProtos.TokenProto value) {
        if (jobTokenBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          jobToken_ = value;
          onChanged();
        } else {
          jobTokenBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.common.TokenProto jobToken = 2;</code>
       */
      public Builder setJobToken(
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder builderForValue) {
        if (jobTokenBuilder_ == null) {
          jobToken_ = builderForValue.build();
          onChanged();
        } else {
          jobTokenBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.common.TokenProto jobToken = 2;</code>
       */
      public Builder mergeJobToken(org.apache.hadoop.security.proto.SecurityProtos.TokenProto value) {
        if (jobTokenBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              jobToken_ != org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance()) {
            jobToken_ =
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.newBuilder(jobToken_).mergeFrom(value).buildPartial();
          } else {
            jobToken_ = value;
          }
          onChanged();
        } else {
          jobTokenBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.common.TokenProto jobToken = 2;</code>
       */
      public Builder clearJobToken() {
        if (jobTokenBuilder_ == null) {
          jobToken_ = org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance();
          onChanged();
        } else {
          jobTokenBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .hadoop.common.TokenProto jobToken = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder getJobTokenBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getJobTokenFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.common.TokenProto jobToken = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getJobTokenOrBuilder() {
        if (jobTokenBuilder_ != null) {
          return jobTokenBuilder_.getMessageOrBuilder();
        } else {
          return jobToken_;
        }
      }
      /**
       * <code>optional .hadoop.common.TokenProto jobToken = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> 
          getJobTokenFieldBuilder() {
        if (jobTokenBuilder_ == null) {
          jobTokenBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder>(
                  jobToken_,
                  getParentForChildren(),
                  isClean());
          jobToken_ = null;
        }
        return jobTokenBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.mapreduce.JobShuffleInfoProto)
    }

    static {
      defaultInstance = new JobShuffleInfoProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.mapreduce.JobShuffleInfoProto)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_mapreduce_JobShuffleInfoProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_mapreduce_JobShuffleInfoProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ShuffleHandlerRecovery.proto\022\020hadoop.m" +
      "apreduce\032\016Security.proto\"P\n\023JobShuffleIn" +
      "foProto\022\014\n\004user\030\001 \001(\t\022+\n\010jobToken\030\002 \001(\0132" +
      "\031.hadoop.common.TokenProtoBA\n\036org.apache" +
      ".hadoop.mapred.protoB\034ShuffleHandlerReco" +
      "veryProtos\210\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_hadoop_mapreduce_JobShuffleInfoProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_hadoop_mapreduce_JobShuffleInfoProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_mapreduce_JobShuffleInfoProto_descriptor,
              new java.lang.String[] { "User", "JobToken", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.hadoop.security.proto.SecurityProtos.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
