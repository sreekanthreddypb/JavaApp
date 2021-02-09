package com.example.demo2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo2.entity.EmployeeDetails;


@Repository
public interface EmployeedetailsRepository extends JpaRepository<EmployeeDetails, Integer> {
	@Query("select a from EmployeeDetails a where a.emp_id=?1")
	public EmployeeDetails findEmployeedetailsbyEmpid(String emp_id);

	
	/*
	 * @Query("select a from Employeedetails a where a.employee_name=?1 and a.designation=?2"
	 * ) public List<Employeedetails> findEmployeedetailsbyNameAndDesignation(String
	 * emp_name,String designation);
	 */
	 
	
}
