package com.employee.service.services;


import demo.interfaces.grpc.CompanyRequest;
import demo.interfaces.grpc.Employee;
import demo.interfaces.grpc.EmployeeServiceGrpc.EmployeeServiceImplBase;
import demo.interfaces.grpc.IDRequest;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class EmployeeGrpcServiceImpl extends EmployeeServiceImplBase{

	@Override
	public void getEmployeeByID(IDRequest request, StreamObserver<Employee> responseObserver) {
		 Employee employee = Employee.newBuilder().setEmployeeFirstName(null).setEmployeeLastName(null)
		.setEmployeeID(1234).setCompanyName("Amazon").build();
		 
			responseObserver.onNext(employee);
			responseObserver.onCompleted();
	}

	@Override
	public void getEmployeeByCompany(CompanyRequest request, StreamObserver<Employee> responseObserver) {
		 Employee employee = Employee.newBuilder().setEmployeeFirstName("Lucy").setEmployeeLastName("Baker")
					.setEmployeeID(1234).setCompanyName(request.getCompanyName()).build();
					 
			responseObserver.onNext(employee);
			responseObserver.onCompleted();
	}

}
