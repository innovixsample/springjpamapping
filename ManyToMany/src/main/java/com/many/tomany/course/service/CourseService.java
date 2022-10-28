package com.many.tomany.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.many.tomany.course.model.Course;
import com.many.tomany.course.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;
	
	
//	public ResponseEntity<List<Course>> listCourseAndStudentsBYCourseId(long id){
//		return repository.listByTheID(id);
//	}
	
	public List<Course> listAllCourse(){
		return repository.findAll();
	}
	
	public Course postCourseDeteils(Course course) {
		course.setStudent(course.getStudent());
		return repository.save(course);
	}
	
	public Optional<Course> listCorseStudiedByStudents(long id){
		return repository.findById(id);
	}
}
