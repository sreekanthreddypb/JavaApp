package com.example.demo2.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.entity.EmployeeDetails;
import com.example.demo2.service.EmployeedetailsService;

@RestController
@RequestMapping("/demo2/Employeedetails")
public class EmployeedetailsController {
	@Autowired
	EmployeedetailsService EmployeedetailsService;
	
	@GetMapping("/getAllEmployeedetails")
	public ResponseEntity<List<EmployeeDetails>> getAllEmployeedetails(){
		return new ResponseEntity<List<EmployeeDetails>>(EmployeedetailsService.getAllEmployeeDetails(), HttpStatus.OK);
	}
	
	@GetMapping("/getEmployeedetailsbyEmpid/{emp_id}")
	public ResponseEntity<EmployeeDetails> getEmployeedetailsbyEmpid(@PathVariable("emp_id") String emp_id){
		return new ResponseEntity<EmployeeDetails> (EmployeedetailsService.getEmployeedetailsbyEmpid(emp_id), HttpStatus.OK);
	}
	
	@PostMapping("/createEmployeedetails")
	public ResponseEntity<EmployeeDetails> createEmployeedetailsEmpid(@RequestBody Map<String, String> employee){
		return new ResponseEntity<EmployeeDetails>(EmployeedetailsService.createEmployeedetails(employee), HttpStatus.OK);
		
	}
	
	@GetMapping("/Home")
	public String welcome(){
		return "\t Welcome to the Home Page of Hygieia!!";
	}
	

	
	/*
	 * @PostMapping("/getEmployeedetailsbyNameAndDesignation/{employee_name}")
	 * public ResponseEntity<List<Employeedetails>>
	 * getEmployeedetailsbyNameAndDesignation(@PathVariable("employee_name") String
	 * emp_name,
	 * 
	 * @RequestBody final Map<String, String> request){ return new
	 * ResponseEntity<List<Employeedetails>>(EmployeedetailsService.
	 * getEmployeedetailsByNameAndDesignation(emp_name,request), HttpStatus.OK); }
	 */
}
