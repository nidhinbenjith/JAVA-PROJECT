package com.college.automatictimetable.repository;

import com.college.automatictimetable.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SubjectRepository extends JpaRepository<Subject, Long> {}
