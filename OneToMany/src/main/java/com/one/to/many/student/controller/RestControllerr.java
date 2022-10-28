package com.one.to.many.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.one.to.many.student.model.Student;
import com.one.to.many.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class RestControllerr {
	@Autowired
	private StudentService studentService;

	@GetMapping("/get")
	public List<Student> listAllItems() {
		return studentService.listall();
	}

	@PostMapping("/post")
	public Student postMapping(@RequestBody Student Student) {
		return studentService.postmethod(Student);
	}

}
