package com.one.to.many.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one.to.many.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
