package com.one.to.many.department.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.one.to.many.department.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	
}
