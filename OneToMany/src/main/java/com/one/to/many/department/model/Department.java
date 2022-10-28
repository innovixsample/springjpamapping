package com.one.to.many.department.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.one.to.many.student.model.Student;

@Entity
@Table(name = "OneToMany_Department")
//onetomany
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String departmentName;

	@OneToMany(mappedBy = "Department",fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<Student> students;

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Department() {
		super();
	}

	public Department(int id, String departmentName) {
		super();
		this.id = id;
		this.departmentName = departmentName;
	}

}
