package com.employee.service.services;


import org.springframework.stereotype.Service;

import demo.interfaces.grpc.Company;
import demo.interfaces.grpc.CompanyServiceGrpc.CompanyServiceBlockingStub;
import demo.interfaces.grpc.EmployeeIDRequest;
import net.devh.boot.grpc.client.inject.GrpcClient;


@Service
public class EmployeeGrpcClientImpl {
	
	@GrpcClient("company-service")
	private CompanyServiceBlockingStub companyServiceBlockingStub;

	public Company getCompanyByEmployeeId(int empId) {
		// TODO Auto-generated method stub
		EmployeeIDRequest employeeIDRequest = EmployeeIDRequest.newBuilder().setEmployeeID(empId).build();
		return this.companyServiceBlockingStub.getCompanyByEmployeeID(employeeIDRequest);
	}
	
	

}
