package com.example.demo2.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.entity.Designation;
import com.example.demo2.repository.DesignationRepository;
import com.example.demo2.service.DesignationService;

@Service
public class DesignationServiceImpl implements DesignationService {

	@Autowired
	DesignationRepository repo;
	@Override
	public Designation create(Designation employee) {
		// TODO Auto-generated method stub
		System.out.println("Create request.");
		return repo.save(employee);
	}
	@Override
	public List<Designation> getDesignation() {
		// TODO Auto-generated method stub
		System.out.println("Get request.");
		return repo.findAll();
	}

}
