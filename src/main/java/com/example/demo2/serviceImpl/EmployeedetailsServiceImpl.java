package com.example.demo2.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.entity.Designation;
import com.example.demo2.entity.EmployeeDetails;
import com.example.demo2.repository.DesignationRepository;
import com.example.demo2.repository.EmployeedetailsRepository;
import com.example.demo2.service.EmployeedetailsService;

@Service
public class EmployeedetailsServiceImpl implements EmployeedetailsService {
	@Autowired
	EmployeedetailsRepository EmployeedetailsRepository;
	@Autowired
	DesignationRepository designationRepository;

	@Override 
	public List<EmployeeDetails> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return EmployeedetailsRepository.findAll();
	}

	@Override
	public EmployeeDetails getEmployeedetailsbyEmpid(String emp_id) {
		// TODO Auto-generated method stub
		return EmployeedetailsRepository.findEmployeedetailsbyEmpid(emp_id);
	}

	@Override
	public EmployeeDetails createEmployeedetails(Map<String, String> employee) {
		// TODO Auto-generated method stub
		EmployeeDetails emp = new EmployeeDetails();
		Designation role = designationRepository.findByDesignationId(Integer.parseInt(employee.get("designation_id")));
		emp.setDesignation_id(role);
		emp.setEmp_id(employee.get("emp_id"));
		emp.setEmployee_name(employee.get("emp_name"));
		emp.setContact(Integer.parseInt(employee.get("contact")));
		return EmployeedetailsRepository.save(emp);
	}

	/*
	 * @Override public List<Employeedetails>
	 * getEmployeedetailsByNameAndDesignation(String emp_name, Map<String, String>
	 * request) { // TODO Auto-generated method stub String
	 * designation=request.get("xxxdf");
	 * System.out.println("designation----"+designation);
	 * 
	 * return
	 * EmployeedetailsRepository.findEmployeedetailsbyNameAndDesignation(emp_name,
	 * designation); }
	 */

	
	
	
	
}
