package com.example.demo2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="designation")
public class Designation {
	
	@Id
	
	  @SequenceGenerator(name = "designationSequence", initialValue = 1,
	  allocationSize = 1, sequenceName = "designationSequence")
	  
	  @GeneratedValue(generator = "designationSequence", strategy =
	  GenerationType.SEQUENCE)
	 
	@Column(name="designation_id")
	private int designation_id;
	
	@Column(name="designation")
	private String designation;
	
	
	

	public int getDesignation_id() {
		return designation_id;
	}

	public void setDesignation_id(int designation_id) {
		this.designation_id = designation_id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}	
	
}
