package com.college.automatictimetable.repository;

import com.college.automatictimetable.model.StudentClass;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentClassRepository extends JpaRepository<StudentClass, Long> {}
