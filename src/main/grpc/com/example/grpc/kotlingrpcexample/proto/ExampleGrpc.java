package com.example.grpc.kotlingrpcexample.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.1)",
    comments = "Source: Example.proto")
public final class ExampleGrpc {

  private ExampleGrpc() {}

  public static final String SERVICE_NAME = "Example";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.kotlingrpcexample.proto.CreateMessageRequest,
      com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse> getCreateMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMessage",
      requestType = com.example.grpc.kotlingrpcexample.proto.CreateMessageRequest.class,
      responseType = com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.kotlingrpcexample.proto.CreateMessageRequest,
      com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse> getCreateMessageMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.kotlingrpcexample.proto.CreateMessageRequest, com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse> getCreateMessageMethod;
    if ((getCreateMessageMethod = ExampleGrpc.getCreateMessageMethod) == null) {
      synchronized (ExampleGrpc.class) {
        if ((getCreateMessageMethod = ExampleGrpc.getCreateMessageMethod) == null) {
          ExampleGrpc.getCreateMessageMethod = getCreateMessageMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.kotlingrpcexample.proto.CreateMessageRequest, com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.kotlingrpcexample.proto.CreateMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExampleMethodDescriptorSupplier("CreateMessage"))
              .build();
        }
      }
    }
    return getCreateMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExampleStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleStub>() {
        @java.lang.Override
        public ExampleStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleStub(channel, callOptions);
        }
      };
    return ExampleStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExampleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleBlockingStub>() {
        @java.lang.Override
        public ExampleBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleBlockingStub(channel, callOptions);
        }
      };
    return ExampleBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExampleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleFutureStub>() {
        @java.lang.Override
        public ExampleFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleFutureStub(channel, callOptions);
        }
      };
    return ExampleFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ExampleImplBase implements io.grpc.BindableService {

    /**
     */
    public void createMessage(com.example.grpc.kotlingrpcexample.proto.CreateMessageRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.kotlingrpcexample.proto.CreateMessageRequest,
                com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse>(
                  this, METHODID_CREATE_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class ExampleStub extends io.grpc.stub.AbstractAsyncStub<ExampleStub> {
    private ExampleStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleStub(channel, callOptions);
    }

    /**
     */
    public void createMessage(com.example.grpc.kotlingrpcexample.proto.CreateMessageRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExampleBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExampleBlockingStub> {
    private ExampleBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse createMessage(com.example.grpc.kotlingrpcexample.proto.CreateMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExampleFutureStub extends io.grpc.stub.AbstractFutureStub<ExampleFutureStub> {
    private ExampleFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse> createMessage(
        com.example.grpc.kotlingrpcexample.proto.CreateMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExampleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExampleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_MESSAGE:
          serviceImpl.createMessage((com.example.grpc.kotlingrpcexample.proto.CreateMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse>) responseObserver);
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

  private static abstract class ExampleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExampleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.kotlingrpcexample.proto.GreeterProtobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Example");
    }
  }

  private static final class ExampleFileDescriptorSupplier
      extends ExampleBaseDescriptorSupplier {
    ExampleFileDescriptorSupplier() {}
  }

  private static final class ExampleMethodDescriptorSupplier
      extends ExampleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExampleMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExampleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExampleFileDescriptorSupplier())
              .addMethod(getCreateMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
