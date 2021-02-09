package com.example.demo2.service;

import java.util.List;

import com.example.demo2.entity.Designation;

public interface DesignationService {

	Designation create(Designation employee);

	List<Designation> getDesignation();

}
