package com.shovik.school_ms.service;

import java.util.List;

import com.shovik.school_ms.entity.Student;

public interface StudentService {

	  List<Student> getAllStudents();
	  
	  Student addStudent(Student student);
	  
	  Student getStudentById(Long id);
	  
	  Student updateStudent(Student student);
	  
	  void deleteStudentById(Long id);
	   
}
