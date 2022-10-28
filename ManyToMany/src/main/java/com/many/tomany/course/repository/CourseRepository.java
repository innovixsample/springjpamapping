package com.many.tomany.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.many.tomany.course.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

//	@Query(value = "SELECT * FROM student t1 INNER JOIN student_course t2 ON t1.id = t2.student_id WHERE t2.course_id = :id", nativeQuery = true)
//	ResponseEntity<List<Course>> listByTheID(long id);

}
