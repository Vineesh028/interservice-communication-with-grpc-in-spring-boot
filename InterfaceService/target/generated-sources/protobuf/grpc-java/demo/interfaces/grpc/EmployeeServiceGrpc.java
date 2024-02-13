package demo.interfaces.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: Employee.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "demo.interfaces.grpc.EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<demo.interfaces.grpc.IDRequest,
      demo.interfaces.grpc.Employee> getGetEmployeeByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployeeByID",
      requestType = demo.interfaces.grpc.IDRequest.class,
      responseType = demo.interfaces.grpc.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<demo.interfaces.grpc.IDRequest,
      demo.interfaces.grpc.Employee> getGetEmployeeByIDMethod() {
    io.grpc.MethodDescriptor<demo.interfaces.grpc.IDRequest, demo.interfaces.grpc.Employee> getGetEmployeeByIDMethod;
    if ((getGetEmployeeByIDMethod = EmployeeServiceGrpc.getGetEmployeeByIDMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetEmployeeByIDMethod = EmployeeServiceGrpc.getGetEmployeeByIDMethod) == null) {
          EmployeeServiceGrpc.getGetEmployeeByIDMethod = getGetEmployeeByIDMethod =
              io.grpc.MethodDescriptor.<demo.interfaces.grpc.IDRequest, demo.interfaces.grpc.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployeeByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.IDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployeeByID"))
              .build();
        }
      }
    }
    return getGetEmployeeByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<demo.interfaces.grpc.CompanyRequest,
      demo.interfaces.grpc.Employee> getGetEmployeeByCompanyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployeeByCompany",
      requestType = demo.interfaces.grpc.CompanyRequest.class,
      responseType = demo.interfaces.grpc.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<demo.interfaces.grpc.CompanyRequest,
      demo.interfaces.grpc.Employee> getGetEmployeeByCompanyMethod() {
    io.grpc.MethodDescriptor<demo.interfaces.grpc.CompanyRequest, demo.interfaces.grpc.Employee> getGetEmployeeByCompanyMethod;
    if ((getGetEmployeeByCompanyMethod = EmployeeServiceGrpc.getGetEmployeeByCompanyMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetEmployeeByCompanyMethod = EmployeeServiceGrpc.getGetEmployeeByCompanyMethod) == null) {
          EmployeeServiceGrpc.getGetEmployeeByCompanyMethod = getGetEmployeeByCompanyMethod =
              io.grpc.MethodDescriptor.<demo.interfaces.grpc.CompanyRequest, demo.interfaces.grpc.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployeeByCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.CompanyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployeeByCompany"))
              .build();
        }
      }
    }
    return getGetEmployeeByCompanyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub>() {
        @java.lang.Override
        public EmployeeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceStub(channel, callOptions);
        }
      };
    return EmployeeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub>() {
        @java.lang.Override
        public EmployeeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceBlockingStub(channel, callOptions);
        }
      };
    return EmployeeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub>() {
        @java.lang.Override
        public EmployeeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceFutureStub(channel, callOptions);
        }
      };
    return EmployeeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EmployeeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEmployeeByID(demo.interfaces.grpc.IDRequest request,
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeByIDMethod(), responseObserver);
    }

    /**
     */
    public void getEmployeeByCompany(demo.interfaces.grpc.CompanyRequest request,
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeByCompanyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEmployeeByIDMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                demo.interfaces.grpc.IDRequest,
                demo.interfaces.grpc.Employee>(
                  this, METHODID_GET_EMPLOYEE_BY_ID)))
          .addMethod(
            getGetEmployeeByCompanyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                demo.interfaces.grpc.CompanyRequest,
                demo.interfaces.grpc.Employee>(
                  this, METHODID_GET_EMPLOYEE_BY_COMPANY)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeServiceStub extends io.grpc.stub.AbstractAsyncStub<EmployeeServiceStub> {
    private EmployeeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEmployeeByID(demo.interfaces.grpc.IDRequest request,
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployeeByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEmployeeByCompany(demo.interfaces.grpc.CompanyRequest request,
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployeeByCompanyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public demo.interfaces.grpc.Employee getEmployeeByID(demo.interfaces.grpc.IDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public demo.interfaces.grpc.Employee getEmployeeByCompany(demo.interfaces.grpc.CompanyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeByCompanyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<demo.interfaces.grpc.Employee> getEmployeeByID(
        demo.interfaces.grpc.IDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployeeByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<demo.interfaces.grpc.Employee> getEmployeeByCompany(
        demo.interfaces.grpc.CompanyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployeeByCompanyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EMPLOYEE_BY_ID = 0;
  private static final int METHODID_GET_EMPLOYEE_BY_COMPANY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EMPLOYEE_BY_ID:
          serviceImpl.getEmployeeByID((demo.interfaces.grpc.IDRequest) request,
              (io.grpc.stub.StreamObserver<demo.interfaces.grpc.Employee>) responseObserver);
          break;
        case METHODID_GET_EMPLOYEE_BY_COMPANY:
          serviceImpl.getEmployeeByCompany((demo.interfaces.grpc.CompanyRequest) request,
              (io.grpc.stub.StreamObserver<demo.interfaces.grpc.Employee>) responseObserver);
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

  private static abstract class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return demo.interfaces.grpc.EmployeeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
              .addMethod(getGetEmployeeByIDMethod())
              .addMethod(getGetEmployeeByCompanyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
