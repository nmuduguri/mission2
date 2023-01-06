package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	
	public void save(Student student) {
		studentRepository.save(student);
	}
	
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}
}
