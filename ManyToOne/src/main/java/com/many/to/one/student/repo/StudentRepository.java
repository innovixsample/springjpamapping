package com.many.to.one.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.many.to.one.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
