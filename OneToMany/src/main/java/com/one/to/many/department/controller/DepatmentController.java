package com.one.to.many.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.one.to.many.department.model.Department;
import com.one.to.many.department.service.DepatmentService;

@RestController
@RequestMapping("/department")
public class DepatmentController {
	
	@Autowired
	private DepatmentService departmentService;

	@GetMapping("/get")
	public List<Department> listAllItems() {
		return departmentService.listall();
	}

	@PostMapping("/post")
	public Department postMapping(@RequestBody Department department) {
		return departmentService.postMethod(department);
	}

}
