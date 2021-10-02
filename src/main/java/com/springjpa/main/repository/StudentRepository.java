package com.springjpa.main.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springjpa.main.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
	
	
	/***************** DATA FETCHING TECHNIQUES WITH JPQL and @Query *********************
	 * 
	 */
	
	//Using JPQL Queries
	//JPQL is based on the classes that we have created and not based on db tables
	@Query("select s from Student s where s.emailId=?1")
	Student getStudentByEmailAddress(String emailId);
	
	//Applicable complex query
	//Using native queries where it involves lot of complexities
	@Query(value="SELECT * FROM student WHERE studentId=?1",
			nativeQuery = true
			)
	Student getStudentById(String studentId);
	

	//Native named Parameter
	@Query(value="SELECT * FROM student WHERE studentId=:emailId",
			nativeQuery=true
			)
	Student getStudentByMailAddress(@Param("emailId") String mailId);
	
	
	/********************* DATA MODIFYING WAYS *******************
	 * ***************** UPDATING DB RECORDS *******************
	 */
	
	
	@Modifying
	@Transactional  //Ideally all the @Transactional will be added at the service layer
	@Query(value="UPDATE student SET lastName=:lastName WHERE emailId=:emailId ",
			nativeQuery=true
			)
	int updateLastNameOfStudent(
			@Param("lastName") String lastName,
			@Param("emailId") String emailId
			);
	
	
}
