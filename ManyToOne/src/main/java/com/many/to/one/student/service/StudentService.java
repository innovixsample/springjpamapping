package com.many.to.one.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.many.to.one.department.model.Department;
import com.many.to.one.student.model.Student;
import com.many.to.one.student.repo.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;

	public List<Student> listall() {
		// TODO Auto-generated method stub
		return repository.findAll();

	}

	public Student postmethod(Student student) {
		return repository.save(student);
	}
}
