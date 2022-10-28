package com.one.to.many.department.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one.to.many.department.model.Department;
import com.one.to.many.department.repository.DepartmentRepository;

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
