// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Employee.proto

package demo.interfaces.grpc;

public final class EmployeeOuterClass {
  private EmployeeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_demo_interfaces_grpc_IDRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_demo_interfaces_grpc_IDRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_demo_interfaces_grpc_CompanyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_demo_interfaces_grpc_CompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_demo_interfaces_grpc_Employee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_demo_interfaces_grpc_Employee_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Employee.proto\022\024demo.interfaces.grpc\"\037" +
      "\n\tIDRequest\022\022\n\nemployeeID\030\001 \001(\003\"%\n\016Compa" +
      "nyRequest\022\023\n\013companyName\030\001 \001(\t\"h\n\010Employ" +
      "ee\022\022\n\nemployeeID\030\001 \001(\003\022\031\n\021employeeFirstN" +
      "ame\030\002 \001(\t\022\030\n\020employeeLastName\030\003 \001(\t\022\023\n\013c" +
      "ompanyName\030\004 \001(\t2\307\001\n\017EmployeeService\022T\n\017" +
      "getEmployeeByID\022\037.demo.interfaces.grpc.I" +
      "DRequest\032\036.demo.interfaces.grpc.Employee" +
      "\"\000\022^\n\024getEmployeeByCompany\022$.demo.interf" +
      "aces.grpc.CompanyRequest\032\036.demo.interfac" +
      "es.grpc.Employee\"\000B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_demo_interfaces_grpc_IDRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_demo_interfaces_grpc_IDRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_demo_interfaces_grpc_IDRequest_descriptor,
        new java.lang.String[] { "EmployeeID", });
    internal_static_demo_interfaces_grpc_CompanyRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_demo_interfaces_grpc_CompanyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_demo_interfaces_grpc_CompanyRequest_descriptor,
        new java.lang.String[] { "CompanyName", });
    internal_static_demo_interfaces_grpc_Employee_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_demo_interfaces_grpc_Employee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_demo_interfaces_grpc_Employee_descriptor,
        new java.lang.String[] { "EmployeeID", "EmployeeFirstName", "EmployeeLastName", "CompanyName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
