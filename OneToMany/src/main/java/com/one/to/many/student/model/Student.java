package com.one.to.many.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.one.to.many.department.model.Department;

@Entity

@Table(name = "ManyToOne_student")
//manytoone
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String StudentName;

	@ManyToOne
	@JsonIgnore
	private Department Department;

	public Department getDepartment() {
		return Department;
	}

	public void setDepartment(Department department) {
		Department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public Student() {
		super();
	}

	public Student(int id, String studentName) {
		super();
		this.id = id;
		StudentName = studentName;
	}

}
