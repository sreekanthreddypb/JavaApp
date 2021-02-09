package com.example.demo2.service;

import java.util.List;
import java.util.Map;

import com.example.demo2.entity.EmployeeDetails;


public interface EmployeedetailsService {
	public List<EmployeeDetails> getAllEmployeeDetails();
	public EmployeeDetails getEmployeedetailsbyEmpid(String emp_id);
	public EmployeeDetails createEmployeedetails(Map<String, String> employee);
	//public List<Employeedetails> getEmployeedetailsByNameAndDesignation(String emp_name,Map<String, String> request);
}
