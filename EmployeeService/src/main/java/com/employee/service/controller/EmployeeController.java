package com.employee.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.service.services.EmployeeGrpcClientImpl;

import demo.interfaces.grpc.Company;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeGrpcClientImpl employeeGrpcClientImpl;
	
	
//	@GetMapping("/employee/{empId}")
//	public Employee getEmployeeById(@PathVariable int empId) {
//		return employeeGrpcClientImpl.getEmployeeById(empId);
//	}
	
	@GetMapping("/company/{empId}")
	public Company getCompanyByEmployeeId(@PathVariable int empId) {
		return employeeGrpcClientImpl.getCompanyByEmployeeId(empId);
	}

}
