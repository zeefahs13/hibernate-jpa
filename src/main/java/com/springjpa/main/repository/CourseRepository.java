package com.springjpa.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springjpa.main.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
