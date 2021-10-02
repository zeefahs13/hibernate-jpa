package com.springjpa.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="course_material")
public class CourseMaterial {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="course_materialId")
	private Long courseMaterialId;
	@Column(name="url")
	private String url;
	
	@OneToOne(cascade=CascadeType.ALL,
				fetch=FetchType.LAZY  //brings down the related table info only if you specifically call it
			)
	@JoinColumn(
			name="course_id",
			referencedColumnName = "courseId"
			)
	private Course course;
	
	public Long getCourseMaterialId() {
		return courseMaterialId;
	}
	public void setCourseMaterialId(Long courseMaterialId) {
		this.courseMaterialId = courseMaterialId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
