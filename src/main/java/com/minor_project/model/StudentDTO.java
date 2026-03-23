package com.minor_project.model;

import java.time.LocalDate;

public class StudentDTO {

    // 🔗 From Auth Service
    private Integer userId;
    private String userName;
    private String email;

    // 🎓 Student Information
    private String rollNumber;
    private String registrationNumber;

    private Integer departmentId;
    private Integer courseId;

    private Integer year;
    private Integer semester;

    private String guardianName;
    private String guardianPhone;

    private String address;
    private LocalDate dateOfBirth;

    // Constructors
    public StudentDTO() {}

    public StudentDTO(Integer userId, String userName, String email,
                      String rollNumber, String registrationNumber,
                      Integer departmentId, Integer courseId,
                      Integer year, Integer semester,
                      String guardianName, String guardianPhone,
                      String address, LocalDate dateOfBirth) {

        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.rollNumber = rollNumber;
        this.registrationNumber = registrationNumber;
        this.departmentId = departmentId;
        this.courseId = courseId;
        this.year = year;
        this.semester = semester;
        this.guardianName = guardianName;
        this.guardianPhone = guardianPhone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters & Setters

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianPhone() {
        return guardianPhone;
    }

    public void setGuardianPhone(String guardianPhone) {
        this.guardianPhone = guardianPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}