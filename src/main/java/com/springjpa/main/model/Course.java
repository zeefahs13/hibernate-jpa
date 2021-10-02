package com.springjpa.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="course")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="courseId")
	private Long courseId;
	@Column(name="title")
	private String title;
	@Column(name="credit")
	private Integer credit;
	
	
	//FOR BIDIRECTIONAL ONE TO ONE MAPPING OF THE TABLES
	//THIS TELLS THE APPLICATION THAT A ATTRIBUTE COURSE HAS ALREADY DEFINED A MAPPING AND THIS ESTABLISHES
	//RELATIONSHIP WITH THAT TABLE WHICH ADDS FOREIGN KEY OF THIS TABLE.
	
	@OneToOne(
			mappedBy = "course"
			)
	private CourseMaterial courseMaterial;
	
	
	@ManyToOne(
			cascade=CascadeType.ALL
			)
	@JoinColumn(
			name="teacherId",
			referencedColumnName = "teacherId"
			)
	private Teacher teacher;
	
	
	// FOR MANY TO MANY MAPPINGS YOU NEED A SEPERATE TABLE
	@ManyToMany
	@JoinTable(
			name="student_course", //name of new table
			joinColumns = @JoinColumn(
					name ="course_id",
					referencedColumnName = "courseId"
					
					),
			inverseJoinColumns = @JoinColumn(
									name="student_id",
									referencedColumnName = "studentId"
					
					)
			
			)
	private List<Student> students;
	
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getCredit() {
		return credit;
	}
	public void setCredit(Integer credit) {
		this.credit = credit;
	}
	

}
