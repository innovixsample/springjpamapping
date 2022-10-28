package com.many.to.one.department.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.many.to.one.department.model.Department;
import com.many.to.one.department.repository.DepartmentRepository;

@Service
public class DepatmentService {

	@Autowired
	private DepartmentRepository repository;

	public List<Department> listall() {

		return repository.findAll();
	}

	public Department postMethod(Department department) {
		return repository.save(department);
	}

}
