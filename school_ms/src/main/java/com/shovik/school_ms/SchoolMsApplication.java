package com.shovik.school_ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.shovik.school_ms.controller.TeacherController;
import com.shovik.school_ms.entity.Student;
import com.shovik.school_ms.entity.Teacher;
import com.shovik.school_ms.repository.StudentRepository;
import com.shovik.school_ms.repository.TeacherRepository;

@SpringBootApplication
public class SchoolMsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SchoolMsApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Shovik","Samar","sshovik@gmail.com","ise");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Raj","K","Raj@gmail.com","cse");
//		studentRepository.save(student2);
//		
//		Teacher teacher1 = new Teacher("sonu","kumar","skk@gmail.com","cse","professor");
//		teacherRepository.save(teacher1);
//		
//		Teacher teacher2 = new Teacher("Raj","kumar","Rkk@gmail.com","ise","professor");
//		teacherRepository.save(teacher1);
////		
		
	}

}
