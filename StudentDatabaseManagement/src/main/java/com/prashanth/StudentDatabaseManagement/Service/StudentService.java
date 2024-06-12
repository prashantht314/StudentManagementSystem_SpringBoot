package com.prashanth.StudentDatabaseManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prashanth.StudentDatabaseManagement.Model.Student;
import com.prashanth.StudentDatabaseManagement.Repository.StudentRepository;

@Repository
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student addStudent(Student student)
	{
		studentRepository.save(student);
		return student;
	}
}
