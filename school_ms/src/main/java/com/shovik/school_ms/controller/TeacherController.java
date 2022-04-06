package com.shovik.school_ms.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.shovik.school_ms.entity.Teacher;
import com.shovik.school_ms.service.TeacherService;

@Controller
public class TeacherController {

	private TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		super();
		this.teacherService = teacherService;
	}
	
	    @GetMapping("/teachers")	
		public String listTeachers(Model model) {
	    	
	    	model.addAttribute("teachers", teacherService.getAllTeachers());
	    	return "teachers";
	    		
	    	}
	 
	    @GetMapping("teachers/new")
	    public String createTeacherForm(Model model) {
	   
	    	Teacher teacher = new Teacher();
	    	model.addAttribute("teacher",teacher);
	    	return "create_teacher";
	    	
	    }
	    
	    @PostMapping("/teachers")
	    public String saveTeacher(@ModelAttribute("teacher") Teacher teacher) {
	    	teacherService.addTeacher(teacher);
	    	return "redirect:/teachers";
	    	
	    }
	    
	    @GetMapping("/teachers/edit/{id}")
	    public String editTeacher(@PathVariable Long id, Model model) {
	    	model.addAttribute("teacher",teacherService.getTeacherById(id));
	    	return "edit_teacher";
	    }
	    
//	    @PostMapping("/teachers/{id}")
//	    public String updateTeacher(@PathVariable Long id, @ModelAttribute("teacher") Teacher teacher, Model model) {
//	    	
//	    	//get the teacher from db by id
//	    	Teacher existingTeacher = teacherService.getTeacherById(id);
//	    	existingTeacher.setId(id);
//	    	existingTeacher.setFirstName(teacher.getFirstName());
//	    	existingTeacher.setLastName(teacher.getLastName());
//	    	existingTeacher.setEmail(teacher.getEmail());
//	    	existingTeacher.setBranch(teacher.getBranch());
//	    	existingTeacher.setPosition(teacher.getPosition());
//	    	
////	    	//save updated  object
////	    	teacherService.updateTeacher(existingTeacher);
////	    	return "redirect:/teachers";
////	    }
	    
	    //handler method to handle delete  request
	   
	    @GetMapping("/teachers/{id}")
	    public String deleteTeacher(@PathVariable Long id) {
	    	teacherService.deleteTeacherById(id);
	    	return "redirect:/teachers";
	    }
}
