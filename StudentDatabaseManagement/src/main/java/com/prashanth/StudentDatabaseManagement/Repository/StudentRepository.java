package com.prashanth.StudentDatabaseManagement.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.prashanth.StudentDatabaseManagement.Model.Student;

public interface StudentRepository extends MongoRepository<Student,String>{

}
