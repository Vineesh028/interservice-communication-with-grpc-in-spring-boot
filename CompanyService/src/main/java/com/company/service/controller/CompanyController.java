package com.company.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.company.service.services.CompanyGrpcClientImpl;

import demo.interfaces.grpc.Company;
import demo.interfaces.grpc.Employee;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyGrpcClientImpl companyGrpcClientImpl;
	
	@GetMapping("/company/{companyName}")
	public Company getCompanyByName(@PathVariable String companyName) {
		return companyGrpcClientImpl.getCompanyByName(companyName);
	}
	
	@GetMapping("/employee/{companyName}")
	public Employee getEmployeeByCompanyName(@PathVariable String companyName) {
		return companyGrpcClientImpl.getEmployeeByCompanyName(companyName);
	}

}
