package com.company.service.services;

import org.springframework.stereotype.Service;

import demo.interfaces.grpc.Company;
import demo.interfaces.grpc.CompanyRequest;
import demo.interfaces.grpc.Employee;
import demo.interfaces.grpc.EmployeeServiceGrpc.EmployeeServiceBlockingStub;
import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class CompanyGrpcClientImpl {
	
	@GrpcClient("employee-service")
	private EmployeeServiceBlockingStub employeeServiceBlockingStub;

	public Company getCompanyByName(String companyName) {
		return Company.newBuilder().setCompanyName("Amazon")
				.setCompanyLocation("Seattle").setEmployeeID(1234).build();
	}

	public Employee getEmployeeByCompanyName(String companyName) {
		
		CompanyRequest companyRequest = CompanyRequest.newBuilder().setCompanyName("Amazon").build();
		
		return employeeServiceBlockingStub.getEmployeeByCompany(companyRequest);
	}

}
