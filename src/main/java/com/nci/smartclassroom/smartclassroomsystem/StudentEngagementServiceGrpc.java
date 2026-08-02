package com.nci.smartclassroom.smartclassroomsystem;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: smart_classroom.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StudentEngagementServiceGrpc {

  private StudentEngagementServiceGrpc() {}

  public static final String SERVICE_NAME = "smartclassroom.StudentEngagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.AttendanceRequest,
      com.nci.smartclassroom.smartclassroomsystem.AttendanceResponse> getTrackAttendanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrackAttendance",
      requestType = com.nci.smartclassroom.smartclassroomsystem.AttendanceRequest.class,
      responseType = com.nci.smartclassroom.smartclassroomsystem.AttendanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.AttendanceRequest,
      com.nci.smartclassroom.smartclassroomsystem.AttendanceResponse> getTrackAttendanceMethod() {
    io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.AttendanceRequest, com.nci.smartclassroom.smartclassroomsystem.AttendanceResponse> getTrackAttendanceMethod;
    if ((getTrackAttendanceMethod = StudentEngagementServiceGrpc.getTrackAttendanceMethod) == null) {
      synchronized (StudentEngagementServiceGrpc.class) {
        if ((getTrackAttendanceMethod = StudentEngagementServiceGrpc.getTrackAttendanceMethod) == null) {
          StudentEngagementServiceGrpc.getTrackAttendanceMethod = getTrackAttendanceMethod =
              io.grpc.MethodDescriptor.<com.nci.smartclassroom.smartclassroomsystem.AttendanceRequest, com.nci.smartclassroom.smartclassroomsystem.AttendanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrackAttendance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartclassroom.smartclassroomsystem.AttendanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartclassroom.smartclassroomsystem.AttendanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentEngagementServiceMethodDescriptorSupplier("TrackAttendance"))
              .build();
        }
      }
    }
    return getTrackAttendanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.EngagementRequest,
      com.nci.smartclassroom.smartclassroomsystem.EngagementResponse> getMonitorEngagementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorEngagement",
      requestType = com.nci.smartclassroom.smartclassroomsystem.EngagementRequest.class,
      responseType = com.nci.smartclassroom.smartclassroomsystem.EngagementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.EngagementRequest,
      com.nci.smartclassroom.smartclassroomsystem.EngagementResponse> getMonitorEngagementMethod() {
    io.grpc.MethodDescriptor<com.nci.smartclassroom.smartclassroomsystem.EngagementRequest, com.nci.smartclassroom.smartclassroomsystem.EngagementResponse> getMonitorEngagementMethod;
    if ((getMonitorEngagementMethod = StudentEngagementServiceGrpc.getMonitorEngagementMethod) == null) {
      synchronized (StudentEngagementServiceGrpc.class) {
        if ((getMonitorEngagementMethod = StudentEngagementServiceGrpc.getMonitorEngagementMethod) == null) {
          StudentEngagementServiceGrpc.getMonitorEngagementMethod = getMonitorEngagementMethod =
              io.grpc.MethodDescriptor.<com.nci.smartclassroom.smartclassroomsystem.EngagementRequest, com.nci.smartclassroom.smartclassroomsystem.EngagementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MonitorEngagement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartclassroom.smartclassroomsystem.EngagementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartclassroom.smartclassroomsystem.EngagementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentEngagementServiceMethodDescriptorSupplier("MonitorEngagement"))
              .build();
        }
      }
    }
    return getMonitorEngagementMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentEngagementServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentEngagementServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentEngagementServiceStub>() {
        @java.lang.Override
        public StudentEngagementServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentEngagementServiceStub(channel, callOptions);
        }
      };
    return StudentEngagementServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentEngagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentEngagementServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentEngagementServiceBlockingStub>() {
        @java.lang.Override
        public StudentEngagementServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentEngagementServiceBlockingStub(channel, callOptions);
        }
      };
    return StudentEngagementServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentEngagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentEngagementServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentEngagementServiceFutureStub>() {
        @java.lang.Override
        public StudentEngagementServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentEngagementServiceFutureStub(channel, callOptions);
        }
      };
    return StudentEngagementServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void trackAttendance(com.nci.smartclassroom.smartclassroomsystem.AttendanceRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.AttendanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrackAttendanceMethod(), responseObserver);
    }

    /**
     */
    default void monitorEngagement(com.nci.smartclassroom.smartclassroomsystem.EngagementRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.EngagementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMonitorEngagementMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StudentEngagementService.
   */
  public static abstract class StudentEngagementServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StudentEngagementServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StudentEngagementService.
   */
  public static final class StudentEngagementServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StudentEngagementServiceStub> {
    private StudentEngagementServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentEngagementServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentEngagementServiceStub(channel, callOptions);
    }

    /**
     */
    public void trackAttendance(com.nci.smartclassroom.smartclassroomsystem.AttendanceRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.AttendanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrackAttendanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void monitorEngagement(com.nci.smartclassroom.smartclassroomsystem.EngagementRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.EngagementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getMonitorEngagementMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StudentEngagementService.
   */
  public static final class StudentEngagementServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StudentEngagementServiceBlockingStub> {
    private StudentEngagementServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentEngagementServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentEngagementServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nci.smartclassroom.smartclassroomsystem.AttendanceResponse trackAttendance(com.nci.smartclassroom.smartclassroomsystem.AttendanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrackAttendanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.nci.smartclassroom.smartclassroomsystem.EngagementResponse> monitorEngagement(
        com.nci.smartclassroom.smartclassroomsystem.EngagementRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getMonitorEngagementMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StudentEngagementService.
   */
  public static final class StudentEngagementServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StudentEngagementServiceFutureStub> {
    private StudentEngagementServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentEngagementServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentEngagementServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nci.smartclassroom.smartclassroomsystem.AttendanceResponse> trackAttendance(
        com.nci.smartclassroom.smartclassroomsystem.AttendanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrackAttendanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRACK_ATTENDANCE = 0;
  private static final int METHODID_MONITOR_ENGAGEMENT = 1;

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
        case METHODID_TRACK_ATTENDANCE:
          serviceImpl.trackAttendance((com.nci.smartclassroom.smartclassroomsystem.AttendanceRequest) request,
              (io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.AttendanceResponse>) responseObserver);
          break;
        case METHODID_MONITOR_ENGAGEMENT:
          serviceImpl.monitorEngagement((com.nci.smartclassroom.smartclassroomsystem.EngagementRequest) request,
              (io.grpc.stub.StreamObserver<com.nci.smartclassroom.smartclassroomsystem.EngagementResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getTrackAttendanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nci.smartclassroom.smartclassroomsystem.AttendanceRequest,
              com.nci.smartclassroom.smartclassroomsystem.AttendanceResponse>(
                service, METHODID_TRACK_ATTENDANCE)))
        .addMethod(
          getMonitorEngagementMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.nci.smartclassroom.smartclassroomsystem.EngagementRequest,
              com.nci.smartclassroom.smartclassroomsystem.EngagementResponse>(
                service, METHODID_MONITOR_ENGAGEMENT)))
        .build();
  }

  private static abstract class StudentEngagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentEngagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nci.smartclassroom.smartclassroomsystem.SmartClassroomServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentEngagementService");
    }
  }

  private static final class StudentEngagementServiceFileDescriptorSupplier
      extends StudentEngagementServiceBaseDescriptorSupplier {
    StudentEngagementServiceFileDescriptorSupplier() {}
  }

  private static final class StudentEngagementServiceMethodDescriptorSupplier
      extends StudentEngagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentEngagementServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StudentEngagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentEngagementServiceFileDescriptorSupplier())
              .addMethod(getTrackAttendanceMethod())
              .addMethod(getMonitorEngagementMethod())
              .build();
        }
      }
    }
    return result;
  }
}
