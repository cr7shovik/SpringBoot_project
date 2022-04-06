package com.shovik.school_ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.shovik.school_ms.entity.Student;
import com.shovik.school_ms.service.StudentService;

@Controller
public class StudentController {

	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}	
	
	// handler to handle list student and return model and view
    @GetMapping("/students")	
	public String listStudents(Model model) {
    	
    	model.addAttribute("students", studentService.getAllStudents());
    	return "students";
    		
    	}
    
    @GetMapping("students/new")
    public String createStudentForm(Model model) {
          // create student obj to hold new student form data 
    	Student student = new Student();
    	model.addAttribute("student",student);
    	return "create_student";
    	
    }
    
    
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
    	studentService.addStudent(student);
    	return "redirect:/students";
    	
    }
    
    @GetMapping("/students/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
    	model.addAttribute("student",studentService.getStudentById(id));
    	return "edit_student";
    }
    
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
    	
    	//get the student from db by id
    	Student existingStudent = studentService.getStudentById(id);
    	existingStudent.setId(id);
    	existingStudent.setFirstName(student.getFirstName());
    	existingStudent.setLastName(student.getLastName());
    	existingStudent.setEmail(student.getEmail());
    	existingStudent.setBranch(student.getBranch());
    	
    	//save updated student object
    	studentService.updateStudent(existingStudent);
    	return "redirect:/students";
    }
    
    //handler method to handle delete student request
   
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
    	studentService.deleteStudentById(id);
    	return "redirect:/students";
    }

}
