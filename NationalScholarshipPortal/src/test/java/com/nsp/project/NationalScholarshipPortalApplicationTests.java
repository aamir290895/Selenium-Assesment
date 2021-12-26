package com.nsp.project;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nsp.project.entity.Student;
import com.nsp.project.repository.StudentRepository;
import com.nsp.project.service.StudentServiceImpl;

@SpringBootTest
public class NationalScholarshipPortalApplicationTests {


    
    
    @Autowired
	StudentRepository repo;
    
    @Autowired
    StudentServiceImpl service;

	@Test
	void contextLoads() {

	}

	@Test
	public void insertDetails() {
        
		Student s = new Student();
		LocalDate ld = LocalDate.of(2021, 10, 11);

		s.setAdharNumber("462773832833");
		s.setBankAccountNumber("20380162843");
		s.setStudentName("Aamir");
		s.setBankIfsc("SBIN0000481");
		s.setGender("Male");
		s.setDistrict("Shahdol");
		s.setEmail("avinash@gmail.com");
		s.setBankName("SBI");
		s.setDateOfBirth(ld);
		s.setInstituteCode(1);

        repo.save(s);
	}
	
	@Test
	public void getStudents() {
      service.getAllStudents();
      
      List<Student> list = service.getAllStudents();
      for(Student stu: list)
		{
			System.out.println(stu.getStudentId());
			System.out.println(stu.getStudentName());
			System.out.println(stu.getBankIfsc());
			System.out.println(stu.getStudentId());
			System.out.println(stu.getStudentId());
			System.out.println(stu.getStudentId());
			System.out.println(stu.getStudentId());
			System.out.println(stu.getStudentId());

			
		}
	     
	}
}
