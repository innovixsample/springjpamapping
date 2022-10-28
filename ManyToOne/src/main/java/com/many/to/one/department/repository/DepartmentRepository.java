package com.many.to.one.department.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.many.to.one.department.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	
}
