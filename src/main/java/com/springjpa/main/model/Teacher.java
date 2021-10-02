package com.springjpa.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long teacherId;
	private String firstname;
	private String lastname;
	
	
	// ######## We should always look for ManytoOne relationship creation as it is easier to read
	// Checkout in course entity for ManytoOne relationship
	
//	@OneToMany(
//			cascade=CascadeType.ALL
//			)
//	@JoinColumn(name="teacherId",
//				referencedColumnName = "teacherId"
//			)
//	private List<Course> courses;
//	
	
	
	
}
