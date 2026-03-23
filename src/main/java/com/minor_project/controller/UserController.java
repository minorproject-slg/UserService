package com.minor_project.controller;

import com.minor_project.entity.Student;
import com.minor_project.repository.StudentRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class UserController {

    private final StudentRepository studentRepository;

    public UserController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // ✅ GET all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // ✅ GET student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    // ✅ CREATE student
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    // ✅ UPDATE student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student updatedStudent) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        student.setRollNumber(updatedStudent.getRollNumber());
        student.setRegistrationNumber(updatedStudent.getRegistrationNumber());
        student.setDepartmentId(updatedStudent.getDepartmentId());
        student.setCourseId(updatedStudent.getCourseId());
        student.setYear(updatedStudent.getYear());
        student.setSemester(updatedStudent.getSemester());
        student.setGuardianName(updatedStudent.getGuardianName());
        student.setGuardianPhone(updatedStudent.getGuardianPhone());
        student.setAddress(updatedStudent.getAddress());
        student.setDateOfBirth(updatedStudent.getDateOfBirth());

        return studentRepository.save(student);
    }

    // ✅ DELETE student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        studentRepository.deleteById(id);
        return "Student deleted successfully";
    }

    // ✅ PATCH status (active/inactive)
    @PatchMapping("/{id}/status")
    public Student updateStatus(@PathVariable Integer id, @RequestParam Boolean active) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        // you can store status later if needed
        return studentRepository.save(student);
    }
}