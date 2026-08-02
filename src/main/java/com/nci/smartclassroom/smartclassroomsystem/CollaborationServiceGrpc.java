package com.nci.smartclassroom.smartclassroomsystem;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: smart_classroom.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CollaborationServiceGrpc {

  private CollaborationServiceGrpc() {}

  public static final String SERVICE_NAME = "smartclassroom.CollaborationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.TutorRequest,
      com.nci.smartclassroom.smartclassroomsystem.TutorResponse> getFindTutorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindTutor",
      requestType = com.nci.smartclassroom.smartclassroomsystem.TutorRequest.class,
      responseType = com.nci.smartclassroom.smartclassroomsystem.TutorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.TutorRequest,
      com.nci.smartclassroom.smartclassroomsystem.TutorResponse> getFindTutorMethod() {
    io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.TutorRequest, com.nci.smartclassroom.smartclassroomsystem.TutorResponse> getFindTutorMethod;
    if ((getFindTutorMethod = CollaborationServiceGrpc.getFindTutorMethod) == null) {
      synchronized (CollaborationServiceGrpc.class) {
        if ((getFindTutorMethod = CollaborationServiceGrpc.getFindTutorMethod) == null) {
          CollaborationServiceGrpc.getFindTutorMethod = getFindTutorMethod =
              io.grpc.MethodDescriptor.<com.nci.smartclassroom.smartclassroomsystem.TutorRequest, com.nci.smartclassroom.smartclassroomsystem.TutorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindTutor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartclassroom.smartclassroomsystem.TutorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartclassroom.smartclassroomsystem.TutorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollaborationServiceMethodDescriptorSupplier("FindTutor"))
              .build();
        }
      }
    }
    return getFindTutorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.GroupMessage,
      com.nci.smartclassroom.smartclassroomsystem.GroupUpdate> getCoordinateStudyGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CoordinateStudyGroup",
      requestType = com.nci.smartclassroom.smartclassroomsystem.GroupMessage.class,
      responseType = com.nci.smartclassroom.smartclassroomsystem.GroupUpdate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.GroupMessage,
      com.nci.smartclassroom.smartclassroomsystem.GroupUpdate> getCoordinateStudyGroupMethod() {
    io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.GroupMessage, com.nci.smartclassroom.smartclassroomsystem.GroupUpdate> getCoordinateStudyGroupMethod;
    if ((getCoordinateStudyGroupMethod = CollaborationServiceGrpc.getCoordinateStudyGroupMethod) == null) {
      synchronized (CollaborationServiceGrpc.class) {
        if ((getCoordinateStudyGroupMethod = CollaborationServiceGrpc.getCoordinateStudyGroupMethod) == null) {
          CollaborationServiceGrpc.getCoordinateStudyGroupMethod = getCoordinateStudyGroupMethod =
              io.grpc.MethodDescriptor.<com.nci.smartclassroom.smartclassroomsystem.GroupMessage, com.nci.smartclassroom.smartclassroomsystem.GroupUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CoordinateStudyGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartclassroom.smartclassroomsystem.GroupMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartclassroom.smartclassroomsystem.GroupUpdate.getDefaultInstance()))
              .setSchemaDescriptor(new CollaborationServiceMethodDescriptorSupplier("CoordinateStudyGroup"))
              .build();
        }
      }
    }
    return getCoordinateStudyGroupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CollaborationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CollaborationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CollaborationServiceStub>() {
        @java.lang.Override
        public CollaborationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CollaborationServiceStub(channel, callOptions);
        }
      };
    return CollaborationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CollaborationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CollaborationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CollaborationServiceBlockingStub>() {
        @java.lang.Override
        public CollaborationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CollaborationServiceBlockingStub(channel, callOptions);
        }
      };
    return CollaborationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CollaborationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CollaborationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CollaborationServiceFutureStub>() {
        @java.lang.Override
        public CollaborationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CollaborationServiceFutureStub(channel, callOptions);
        }
      };
    return CollaborationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void findTutor(com.nci.smartclassroom.smartclassroomsystem.TutorRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.TutorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindTutorMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.GroupMessage> coordinateStudyGroup(
        io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.GroupUpdate> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCoordinateStudyGroupMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CollaborationService.
   */
  public static abstract class CollaborationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CollaborationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CollaborationService.
   */
  public static final class CollaborationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CollaborationServiceStub> {
    private CollaborationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollaborationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CollaborationServiceStub(channel, callOptions);
    }

    /**
     */
    public void findTutor(com.nci.smartclassroom.smartclassroomsystem.TutorRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.TutorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindTutorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.GroupMessage> coordinateStudyGroup(
        io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.GroupUpdate> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCoordinateStudyGroupMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CollaborationService.
   */
  public static final class CollaborationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CollaborationServiceBlockingStub> {
    private CollaborationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollaborationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CollaborationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.nci.smartclassroom.smartclassroomsystem.TutorResponse> findTutor(
        com.nci.smartclassroom.smartclassroomsystem.TutorRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindTutorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CollaborationService.
   */
  public static final class CollaborationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CollaborationServiceFutureStub> {
    private CollaborationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollaborationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CollaborationServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_FIND_TUTOR = 0;
  private static final int METHODID_COORDINATE_STUDY_GROUP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_TUTOR:
          serviceImpl.findTutor((com.nci.smartclassroom.smartclassroomsystem.TutorRequest) request,
              (io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.TutorResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COORDINATE_STUDY_GROUP:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.coordinateStudyGroup(
              (io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.GroupUpdate>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getFindTutorMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.nci.smartclassroom.smartclassroomsystem.TutorRequest,
              com.nci.smartclassroom.smartclassroomsystem.TutorResponse>(
                service, METHODID_FIND_TUTOR)))
        .addMethod(
          getCoordinateStudyGroupMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.nci.smartclassroom.smartclassroomsystem.GroupMessage,
              com.nci.smartclassroom.smartclassroomsystem.GroupUpdate>(
                service, METHODID_COORDINATE_STUDY_GROUP)))
        .build();
  }

  private static abstract class CollaborationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CollaborationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nci.smartclassroom.smartclassroomsystem.SmartClassroomServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CollaborationService");
    }
  }

  private static final class CollaborationServiceFileDescriptorSupplier
      extends CollaborationServiceBaseDescriptorSupplier {
    CollaborationServiceFileDescriptorSupplier() {}
  }

  private static final class CollaborationServiceMethodDescriptorSupplier
      extends CollaborationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CollaborationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CollaborationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CollaborationServiceFileDescriptorSupplier())
              .addMethod(getFindTutorMethod())
              .addMethod(getCoordinateStudyGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
