package com.prashanth.StudentDatabaseManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.StudentDatabaseManagement.Model.Student;
import com.prashanth.StudentDatabaseManagement.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping(value = "/add")
	public Student addStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}
}
