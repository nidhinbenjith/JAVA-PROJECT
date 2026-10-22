package com.college.automatictimetable.repository;

import com.college.automatictimetable.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CourseRepository extends JpaRepository<Course, Long> {}
