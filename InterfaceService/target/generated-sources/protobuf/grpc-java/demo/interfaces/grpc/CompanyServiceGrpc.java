package demo.interfaces.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: Company.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CompanyServiceGrpc {

  private CompanyServiceGrpc() {}

  public static final String SERVICE_NAME = "demo.interfaces.grpc.CompanyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<demo.interfaces.grpc.CompanyNameRequest,
      demo.interfaces.grpc.Company> getGetCompanyByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCompanyByName",
      requestType = demo.interfaces.grpc.CompanyNameRequest.class,
      responseType = demo.interfaces.grpc.Company.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<demo.interfaces.grpc.CompanyNameRequest,
      demo.interfaces.grpc.Company> getGetCompanyByNameMethod() {
    io.grpc.MethodDescriptor<demo.interfaces.grpc.CompanyNameRequest, demo.interfaces.grpc.Company> getGetCompanyByNameMethod;
    if ((getGetCompanyByNameMethod = CompanyServiceGrpc.getGetCompanyByNameMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getGetCompanyByNameMethod = CompanyServiceGrpc.getGetCompanyByNameMethod) == null) {
          CompanyServiceGrpc.getGetCompanyByNameMethod = getGetCompanyByNameMethod =
              io.grpc.MethodDescriptor.<demo.interfaces.grpc.CompanyNameRequest, demo.interfaces.grpc.Company>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCompanyByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.CompanyNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.Company.getDefaultInstance()))
              .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("getCompanyByName"))
              .build();
        }
      }
    }
    return getGetCompanyByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<demo.interfaces.grpc.EmployeeIDRequest,
      demo.interfaces.grpc.Company> getGetCompanyByEmployeeIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCompanyByEmployeeID",
      requestType = demo.interfaces.grpc.EmployeeIDRequest.class,
      responseType = demo.interfaces.grpc.Company.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<demo.interfaces.grpc.EmployeeIDRequest,
      demo.interfaces.grpc.Company> getGetCompanyByEmployeeIDMethod() {
    io.grpc.MethodDescriptor<demo.interfaces.grpc.EmployeeIDRequest, demo.interfaces.grpc.Company> getGetCompanyByEmployeeIDMethod;
    if ((getGetCompanyByEmployeeIDMethod = CompanyServiceGrpc.getGetCompanyByEmployeeIDMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getGetCompanyByEmployeeIDMethod = CompanyServiceGrpc.getGetCompanyByEmployeeIDMethod) == null) {
          CompanyServiceGrpc.getGetCompanyByEmployeeIDMethod = getGetCompanyByEmployeeIDMethod =
              io.grpc.MethodDescriptor.<demo.interfaces.grpc.EmployeeIDRequest, demo.interfaces.grpc.Company>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCompanyByEmployeeID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.EmployeeIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.Company.getDefaultInstance()))
              .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("getCompanyByEmployeeID"))
              .build();
        }
      }
    }
    return getGetCompanyByEmployeeIDMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompanyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompanyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CompanyServiceStub>() {
        @java.lang.Override
        public CompanyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CompanyServiceStub(channel, callOptions);
        }
      };
    return CompanyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompanyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompanyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CompanyServiceBlockingStub>() {
        @java.lang.Override
        public CompanyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CompanyServiceBlockingStub(channel, callOptions);
        }
      };
    return CompanyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompanyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompanyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CompanyServiceFutureStub>() {
        @java.lang.Override
        public CompanyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CompanyServiceFutureStub(channel, callOptions);
        }
      };
    return CompanyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CompanyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCompanyByName(demo.interfaces.grpc.CompanyNameRequest request,
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.Company> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCompanyByNameMethod(), responseObserver);
    }

    /**
     */
    public void getCompanyByEmployeeID(demo.interfaces.grpc.EmployeeIDRequest request,
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.Company> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCompanyByEmployeeIDMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCompanyByNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                demo.interfaces.grpc.CompanyNameRequest,
                demo.interfaces.grpc.Company>(
                  this, METHODID_GET_COMPANY_BY_NAME)))
          .addMethod(
            getGetCompanyByEmployeeIDMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                demo.interfaces.grpc.EmployeeIDRequest,
                demo.interfaces.grpc.Company>(
                  this, METHODID_GET_COMPANY_BY_EMPLOYEE_ID)))
          .build();
    }
  }

  /**
   */
  public static final class CompanyServiceStub extends io.grpc.stub.AbstractAsyncStub<CompanyServiceStub> {
    private CompanyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompanyServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCompanyByName(demo.interfaces.grpc.CompanyNameRequest request,
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.Company> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCompanyByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCompanyByEmployeeID(demo.interfaces.grpc.EmployeeIDRequest request,
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.Company> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCompanyByEmployeeIDMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CompanyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CompanyServiceBlockingStub> {
    private CompanyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompanyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public demo.interfaces.grpc.Company getCompanyByName(demo.interfaces.grpc.CompanyNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCompanyByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public demo.interfaces.grpc.Company getCompanyByEmployeeID(demo.interfaces.grpc.EmployeeIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCompanyByEmployeeIDMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CompanyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CompanyServiceFutureStub> {
    private CompanyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompanyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<demo.interfaces.grpc.Company> getCompanyByName(
        demo.interfaces.grpc.CompanyNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCompanyByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<demo.interfaces.grpc.Company> getCompanyByEmployeeID(
        demo.interfaces.grpc.EmployeeIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCompanyByEmployeeIDMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_COMPANY_BY_NAME = 0;
  private static final int METHODID_GET_COMPANY_BY_EMPLOYEE_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompanyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompanyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_COMPANY_BY_NAME:
          serviceImpl.getCompanyByName((demo.interfaces.grpc.CompanyNameRequest) request,
              (io.grpc.stub.StreamObserver<demo.interfaces.grpc.Company>) responseObserver);
          break;
        case METHODID_GET_COMPANY_BY_EMPLOYEE_ID:
          serviceImpl.getCompanyByEmployeeID((demo.interfaces.grpc.EmployeeIDRequest) request,
              (io.grpc.stub.StreamObserver<demo.interfaces.grpc.Company>) responseObserver);
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

  private static abstract class CompanyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompanyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return demo.interfaces.grpc.CompanyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompanyService");
    }
  }

  private static final class CompanyServiceFileDescriptorSupplier
      extends CompanyServiceBaseDescriptorSupplier {
    CompanyServiceFileDescriptorSupplier() {}
  }

  private static final class CompanyServiceMethodDescriptorSupplier
      extends CompanyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompanyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CompanyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompanyServiceFileDescriptorSupplier())
              .addMethod(getGetCompanyByNameMethod())
              .addMethod(getGetCompanyByEmployeeIDMethod())
              .build();
        }
      }
    }
    return result;
  }
}
