package com.nci.smartclassroom.smartclassroomsystem;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: smart_classroom.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartResourceServiceGrpc {

  private SmartResourceServiceGrpc() {}

  public static final String SERVICE_NAME = "smartclassroom.SmartResourceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.ResourceCheckRequest,
      com.nci.smartclassroom.smartclassroomsystem.ResourceCheckResponse> getCheckResourceAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckResourceAvailability",
      requestType = com.nci.smartclassroom.smartclassroomsystem.ResourceCheckRequest.class,
      responseType = com.nci.smartclassroom.smartclassroomsystem.ResourceCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.ResourceCheckRequest,
      com.nci.smartclassroom.smartclassroomsystem.ResourceCheckResponse> getCheckResourceAvailabilityMethod() {
    io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.ResourceCheckRequest, com.nci.smartclassroom.smartclassroomsystem.ResourceCheckResponse> getCheckResourceAvailabilityMethod;
    if ((getCheckResourceAvailabilityMethod = SmartResourceServiceGrpc.getCheckResourceAvailabilityMethod) == null) {
      synchronized (SmartResourceServiceGrpc.class) {
        if ((getCheckResourceAvailabilityMethod = SmartResourceServiceGrpc.getCheckResourceAvailabilityMethod) == null) {
          SmartResourceServiceGrpc.getCheckResourceAvailabilityMethod = getCheckResourceAvailabilityMethod =
              io.grpc.MethodDescriptor.<com.nci.smartclassroom.smartclassroomsystem.ResourceCheckRequest, com.nci.smartclassroom.smartclassroomsystem.ResourceCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckResourceAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartclassroom.smartclassroomsystem.ResourceCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartclassroom.smartclassroomsystem.ResourceCheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartResourceServiceMethodDescriptorSupplier("CheckResourceAvailability"))
              .build();
        }
      }
    }
    return getCheckResourceAvailabilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.ResourceRequest,
      com.nci.smartclassroom.smartclassroomsystem.ResourceSummaryResponse> getRequestResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestResources",
      requestType = com.nci.smartclassroom.smartclassroomsystem.ResourceRequest.class,
      responseType = com.nci.smartclassroom.smartclassroomsystem.ResourceSummaryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.ResourceRequest,
      com.nci.smartclassroom.smartclassroomsystem.ResourceSummaryResponse> getRequestResourcesMethod() {
    io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.ResourceRequest, com.nci.smartclassroom.smartclassroomsystem.ResourceSummaryResponse> getRequestResourcesMethod;
    if ((getRequestResourcesMethod = SmartResourceServiceGrpc.getRequestResourcesMethod) == null) {
      synchronized (SmartResourceServiceGrpc.class) {
        if ((getRequestResourcesMethod = SmartResourceServiceGrpc.getRequestResourcesMethod) == null) {
          SmartResourceServiceGrpc.getRequestResourcesMethod = getRequestResourcesMethod =
              io.grpc.MethodDescriptor.<com.nci.smartclassroom.smartclassroomsystem.ResourceRequest, com.nci.smartclassroom.smartclassroomsystem.ResourceSummaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartclassroom.smartclassroomsystem.ResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartclassroom.smartclassroomsystem.ResourceSummaryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartResourceServiceMethodDescriptorSupplier("RequestResources"))
              .build();
        }
      }
    }
    return getRequestResourcesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartResourceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartResourceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartResourceServiceStub>() {
        @java.lang.Override
        public SmartResourceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartResourceServiceStub(channel, callOptions);
        }
      };
    return SmartResourceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartResourceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartResourceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartResourceServiceBlockingStub>() {
        @java.lang.Override
        public SmartResourceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartResourceServiceBlockingStub(channel, callOptions);
        }
      };
    return SmartResourceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartResourceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartResourceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartResourceServiceFutureStub>() {
        @java.lang.Override
        public SmartResourceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartResourceServiceFutureStub(channel, callOptions);
        }
      };
    return SmartResourceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void checkResourceAvailability(com.nci.smartclassroom.smartclassroomsystem.ResourceCheckRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.ResourceCheckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckResourceAvailabilityMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.ResourceRequest> requestResources(
        io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.ResourceSummaryResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRequestResourcesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmartResourceService.
   */
  public static abstract class SmartResourceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SmartResourceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SmartResourceService.
   */
  public static final class SmartResourceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SmartResourceServiceStub> {
    private SmartResourceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartResourceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartResourceServiceStub(channel, callOptions);
    }

    /**
     */
    public void checkResourceAvailability(com.nci.smartclassroom.smartclassroomsystem.ResourceCheckRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.ResourceCheckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckResourceAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.ResourceRequest> requestResources(
        io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.ResourceSummaryResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getRequestResourcesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmartResourceService.
   */
  public static final class SmartResourceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SmartResourceServiceBlockingStub> {
    private SmartResourceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartResourceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartResourceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nci.smartclassroom.smartclassroomsystem.ResourceCheckResponse checkResourceAvailability(com.nci.smartclassroom.smartclassroomsystem.ResourceCheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckResourceAvailabilityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmartResourceService.
   */
  public static final class SmartResourceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SmartResourceServiceFutureStub> {
    private SmartResourceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartResourceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartResourceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nci.smartclassroom.smartclassroomsystem.ResourceCheckResponse> checkResourceAvailability(
        com.nci.smartclassroom.smartclassroomsystem.ResourceCheckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckResourceAvailabilityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_RESOURCE_AVAILABILITY = 0;
  private static final int METHODID_REQUEST_RESOURCES = 1;

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
        case METHODID_CHECK_RESOURCE_AVAILABILITY:
          serviceImpl.checkResourceAvailability((com.nci.smartclassroom.smartclassroomsystem.ResourceCheckRequest) request,
              (io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.ResourceCheckResponse>) responseObserver);
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
        case METHODID_REQUEST_RESOURCES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.requestResources(
              (io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.ResourceSummaryResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCheckResourceAvailabilityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nci.smartclassroom.smartclassroomsystem.ResourceCheckRequest,
              com.nci.smartclassroom.smartclassroomsystem.ResourceCheckResponse>(
                service, METHODID_CHECK_RESOURCE_AVAILABILITY)))
        .addMethod(
          getRequestResourcesMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.nci.smartclassroom.smartclassroomsystem.ResourceRequest,
              com.nci.smartclassroom.smartclassroomsystem.ResourceSummaryResponse>(
                service, METHODID_REQUEST_RESOURCES)))
        .build();
  }

  private static abstract class SmartResourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartResourceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nci.smartclassroom.smartclassroomsystem.SmartClassroomServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartResourceService");
    }
  }

  private static final class SmartResourceServiceFileDescriptorSupplier
      extends SmartResourceServiceBaseDescriptorSupplier {
    SmartResourceServiceFileDescriptorSupplier() {}
  }

  private static final class SmartResourceServiceMethodDescriptorSupplier
      extends SmartResourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartResourceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartResourceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartResourceServiceFileDescriptorSupplier())
              .addMethod(getCheckResourceAvailabilityMethod())
              .addMethod(getRequestResourcesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
