package com.example.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo2.entity.Designation;

@Repository
public interface DesignationRepository extends JpaRepository<Designation, Integer> {

	@Query("select a from Designation a where a.designation_id=?1")
	Designation findByDesignationId(int designation_id);

}
