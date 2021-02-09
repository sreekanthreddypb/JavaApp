package com.example.demo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.entity.Designation;
import com.example.demo2.service.DesignationService;


@RestController
@RequestMapping("/demo2/desination")
public class DesignationController {
	
	@Autowired
	DesignationService DesignationService;
	
	@PostMapping("/createDesignation")
	public ResponseEntity<Designation> create(@RequestBody Designation employee){
		return new ResponseEntity<Designation>( DesignationService.create(employee), HttpStatus.OK);
	}
	
	@GetMapping("/getAllDEsignation")
	public ResponseEntity<List<Designation>> getDesignation(){
		return new ResponseEntity<List<Designation>>(DesignationService.getDesignation(), HttpStatus.OK);
	}
		
	

}
