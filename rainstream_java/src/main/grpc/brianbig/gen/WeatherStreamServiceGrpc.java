package brianbig.gen;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: rainstream_java.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WeatherStreamServiceGrpc {

  private WeatherStreamServiceGrpc() {}

  public static final String SERVICE_NAME = "brianbig.WeatherStreamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<brianbig.gen.WeatherStream.WeatherRequest,
      brianbig.gen.WeatherStream.WeatherResponse> getGetInfoOnceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getInfoOnce",
      requestType = brianbig.gen.WeatherStream.WeatherRequest.class,
      responseType = brianbig.gen.WeatherStream.WeatherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<brianbig.gen.WeatherStream.WeatherRequest,
      brianbig.gen.WeatherStream.WeatherResponse> getGetInfoOnceMethod() {
    io.grpc.MethodDescriptor<brianbig.gen.WeatherStream.WeatherRequest, brianbig.gen.WeatherStream.WeatherResponse> getGetInfoOnceMethod;
    if ((getGetInfoOnceMethod = WeatherStreamServiceGrpc.getGetInfoOnceMethod) == null) {
      synchronized (WeatherStreamServiceGrpc.class) {
        if ((getGetInfoOnceMethod = WeatherStreamServiceGrpc.getGetInfoOnceMethod) == null) {
          WeatherStreamServiceGrpc.getGetInfoOnceMethod = getGetInfoOnceMethod =
              io.grpc.MethodDescriptor.<brianbig.gen.WeatherStream.WeatherRequest, brianbig.gen.WeatherStream.WeatherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getInfoOnce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brianbig.gen.WeatherStream.WeatherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brianbig.gen.WeatherStream.WeatherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherStreamServiceMethodDescriptorSupplier("getInfoOnce"))
              .build();
        }
      }
    }
    return getGetInfoOnceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<brianbig.gen.WeatherStream.WeatherRequest,
      brianbig.gen.WeatherStream.WeatherResponse> getGetInfoContinuouslyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getInfoContinuously",
      requestType = brianbig.gen.WeatherStream.WeatherRequest.class,
      responseType = brianbig.gen.WeatherStream.WeatherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<brianbig.gen.WeatherStream.WeatherRequest,
      brianbig.gen.WeatherStream.WeatherResponse> getGetInfoContinuouslyMethod() {
    io.grpc.MethodDescriptor<brianbig.gen.WeatherStream.WeatherRequest, brianbig.gen.WeatherStream.WeatherResponse> getGetInfoContinuouslyMethod;
    if ((getGetInfoContinuouslyMethod = WeatherStreamServiceGrpc.getGetInfoContinuouslyMethod) == null) {
      synchronized (WeatherStreamServiceGrpc.class) {
        if ((getGetInfoContinuouslyMethod = WeatherStreamServiceGrpc.getGetInfoContinuouslyMethod) == null) {
          WeatherStreamServiceGrpc.getGetInfoContinuouslyMethod = getGetInfoContinuouslyMethod =
              io.grpc.MethodDescriptor.<brianbig.gen.WeatherStream.WeatherRequest, brianbig.gen.WeatherStream.WeatherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getInfoContinuously"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brianbig.gen.WeatherStream.WeatherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  brianbig.gen.WeatherStream.WeatherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherStreamServiceMethodDescriptorSupplier("getInfoContinuously"))
              .build();
        }
      }
    }
    return getGetInfoContinuouslyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WeatherStreamServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherStreamServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherStreamServiceStub>() {
        @java.lang.Override
        public WeatherStreamServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherStreamServiceStub(channel, callOptions);
        }
      };
    return WeatherStreamServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WeatherStreamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherStreamServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherStreamServiceBlockingStub>() {
        @java.lang.Override
        public WeatherStreamServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherStreamServiceBlockingStub(channel, callOptions);
        }
      };
    return WeatherStreamServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WeatherStreamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherStreamServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherStreamServiceFutureStub>() {
        @java.lang.Override
        public WeatherStreamServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherStreamServiceFutureStub(channel, callOptions);
        }
      };
    return WeatherStreamServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getInfoOnce(brianbig.gen.WeatherStream.WeatherRequest request,
        io.grpc.stub.StreamObserver<brianbig.gen.WeatherStream.WeatherResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInfoOnceMethod(), responseObserver);
    }

    /**
     */
    default void getInfoContinuously(brianbig.gen.WeatherStream.WeatherRequest request,
        io.grpc.stub.StreamObserver<brianbig.gen.WeatherStream.WeatherResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInfoContinuouslyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WeatherStreamService.
   */
  public static abstract class WeatherStreamServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WeatherStreamServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WeatherStreamService.
   */
  public static final class WeatherStreamServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WeatherStreamServiceStub> {
    private WeatherStreamServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherStreamServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherStreamServiceStub(channel, callOptions);
    }

    /**
     */
    public void getInfoOnce(brianbig.gen.WeatherStream.WeatherRequest request,
        io.grpc.stub.StreamObserver<brianbig.gen.WeatherStream.WeatherResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInfoOnceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInfoContinuously(brianbig.gen.WeatherStream.WeatherRequest request,
        io.grpc.stub.StreamObserver<brianbig.gen.WeatherStream.WeatherResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetInfoContinuouslyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WeatherStreamService.
   */
  public static final class WeatherStreamServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WeatherStreamServiceBlockingStub> {
    private WeatherStreamServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherStreamServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherStreamServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public brianbig.gen.WeatherStream.WeatherResponse getInfoOnce(brianbig.gen.WeatherStream.WeatherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInfoOnceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<brianbig.gen.WeatherStream.WeatherResponse> getInfoContinuously(
        brianbig.gen.WeatherStream.WeatherRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetInfoContinuouslyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WeatherStreamService.
   */
  public static final class WeatherStreamServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WeatherStreamServiceFutureStub> {
    private WeatherStreamServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherStreamServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherStreamServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<brianbig.gen.WeatherStream.WeatherResponse> getInfoOnce(
        brianbig.gen.WeatherStream.WeatherRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInfoOnceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INFO_ONCE = 0;
  private static final int METHODID_GET_INFO_CONTINUOUSLY = 1;

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
        case METHODID_GET_INFO_ONCE:
          serviceImpl.getInfoOnce((brianbig.gen.WeatherStream.WeatherRequest) request,
              (io.grpc.stub.StreamObserver<brianbig.gen.WeatherStream.WeatherResponse>) responseObserver);
          break;
        case METHODID_GET_INFO_CONTINUOUSLY:
          serviceImpl.getInfoContinuously((brianbig.gen.WeatherStream.WeatherRequest) request,
              (io.grpc.stub.StreamObserver<brianbig.gen.WeatherStream.WeatherResponse>) responseObserver);
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
          getGetInfoOnceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              brianbig.gen.WeatherStream.WeatherRequest,
              brianbig.gen.WeatherStream.WeatherResponse>(
                service, METHODID_GET_INFO_ONCE)))
        .addMethod(
          getGetInfoContinuouslyMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              brianbig.gen.WeatherStream.WeatherRequest,
              brianbig.gen.WeatherStream.WeatherResponse>(
                service, METHODID_GET_INFO_CONTINUOUSLY)))
        .build();
  }

  private static abstract class WeatherStreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WeatherStreamServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return brianbig.gen.WeatherStream.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WeatherStreamService");
    }
  }

  private static final class WeatherStreamServiceFileDescriptorSupplier
      extends WeatherStreamServiceBaseDescriptorSupplier {
    WeatherStreamServiceFileDescriptorSupplier() {}
  }

  private static final class WeatherStreamServiceMethodDescriptorSupplier
      extends WeatherStreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WeatherStreamServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WeatherStreamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WeatherStreamServiceFileDescriptorSupplier())
              .addMethod(getGetInfoOnceMethod())
              .addMethod(getGetInfoContinuouslyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
