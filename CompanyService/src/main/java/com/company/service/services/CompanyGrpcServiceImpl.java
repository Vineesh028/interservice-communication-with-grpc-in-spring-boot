package com.company.service.services;

import demo.interfaces.grpc.Company;
import demo.interfaces.grpc.CompanyNameRequest;
import demo.interfaces.grpc.CompanyServiceGrpc.CompanyServiceImplBase;
import demo.interfaces.grpc.EmployeeIDRequest;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CompanyGrpcServiceImpl extends CompanyServiceImplBase{

	
	@Override
	public void getCompanyByName(CompanyNameRequest request, StreamObserver<Company> responseObserver) {
		
		Company company = Company.newBuilder().setCompanyName("Amazon")
		.setCompanyLocation("Seattle").setEmployeeID(1234).build();
		
		responseObserver.onNext(company);
		responseObserver.onCompleted();
	}

	@Override
	public void getCompanyByEmployeeID(EmployeeIDRequest request, StreamObserver<Company> responseObserver) {
		// TODO Auto-generated method stub
		
		Company company = Company.newBuilder().setCompanyName("Amazon")
				.setCompanyLocation("Seattle").setEmployeeID(request.getEmployeeID()).build();
				
				responseObserver.onNext(company);
				responseObserver.onCompleted();
	}

}
