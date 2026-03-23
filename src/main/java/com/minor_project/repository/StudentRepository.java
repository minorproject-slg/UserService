package com.minor_project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minor_project.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    // 🔗 Find by Auth Service userId
    Optional<Student> findByUserId(Integer userId);

    // 🎓 Academic queries
    List<Student> findByDepartmentId(Integer departmentId);

    List<Student> findByCourseId(Integer courseId);

    List<Student> findByYear(Integer year);

    List<Student> findBySemester(Integer semester);

    // 🔍 Unique fields
    Optional<Student> findByRollNumber(String rollNumber);

    Optional<Student> findByRegistrationNumber(String registrationNumber);
}