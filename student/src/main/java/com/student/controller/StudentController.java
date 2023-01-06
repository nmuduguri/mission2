package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController //= @Controller + @ResponseBody
//@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	@Autowired
	Integer intt;
	
	
	@GetMapping("/get")
	//@ResponseBody
	public String get() { 
		
		return "index";  //index.html //index.jsp
	}
	
	
	
	
	

	@PostMapping("/save") // save, create, add
	@ResponseBody
	public void save(@RequestBody Student student) {

		studentService.save(student);
	}
	
	@GetMapping("/getAll")
	@ResponseBody
	public List<Student> getAllStudents() { 
		
		return studentService.getAllStudents();
	}
	
	// http://localhost:9090/getAll

	
	
}
