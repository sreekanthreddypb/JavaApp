package com.example.demo2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="employee_details")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class EmployeeDetails {
	
	
	@Column(name="employee_name")
	private String employee_name;
	
	@Id
	@Column(name="emp_id")
	private String emp_id;
	
	@Column(name="contact")
	private int contact;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "designation_id", referencedColumnName = "designation_id", nullable = false)
	private Designation designation_id;

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public Designation getDesignation_id() {
		return designation_id;
	}

	public void setDesignation_id(Designation designation_id) {
		this.designation_id = designation_id;
	}
	
	
	
}
