package com.springjpa.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springjpa.main.model.CourseMaterial;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long>{

	
	
	/*********************** CASCADING TYPES *****************************
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
