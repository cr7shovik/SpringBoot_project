package com.shovik.school_ms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shovik.school_ms.entity.Teacher;
import com.shovik.school_ms.repository.TeacherRepository;
import com.shovik.school_ms.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	private TeacherRepository teacherRepository;
	
	

	public TeacherServiceImpl(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	@Override
	public Teacher getTeacherById(Long id) {
		// TODO Auto-generated method stub
		return teacherRepository.findById(id).get();
	}

//	@Override
//	public Teacher updateTeacher(Teacher teacher) {
//		// TODO Auto-generated method stub
//		return teacherRepository.save(teacher) ;
//	}

	@Override
	public void deleteTeacherById(Long id) {
		// TODO Auto-generated method stub
		teacherRepository.deleteById(id);
		
	}
	
}




////////

