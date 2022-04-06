package com.shovik.school_ms.service;

import java.util.List;

import com.shovik.school_ms.entity.Teacher;

public interface TeacherService {
	
	

	  List<Teacher> getAllTeachers();
	  
	  Teacher addTeacher(Teacher teacher);
	  
	  Teacher getTeacherById(Long id);
	  
//	  Teacher updateTeacher(Teacher teacher);
	  
	  void deleteTeacherById(Long id);
	   

}





