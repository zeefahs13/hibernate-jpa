package com.springjpa.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springjpa.main.model.Student;
import com.springjpa.main.repository.StudentRepository;

@SpringBootApplication
public class HibernateJpaApplication {
	
	
	@Autowired
	private StudentRepository studentRepo;

	void saveStudent() {
		
		Student student = new Student();
		student.setEmailId("hafeez1.shaik@gmail.com");
		student.setFirstName("Hafeez");
		student.setLastName("Shaik");
		studentRepo.save(student);
	}

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaApplication.class, args);
//		HibernateJpaApplication app = new HibernateJpaApplication();
//		app.saveStudent();
		
	}

}
