package com.java8.features.Utils;

import java.util.List;
import java.util.Optional;

public class Student {

    private String firstName;

    private String lastName;

    private String fullName;

    private List<Address> addresses;

    private Long salary;

    private String departmentName;

    private Integer studentId;

    private String gender;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Optional<String> getGender() {
        return Optional.ofNullable(gender);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<String> getFullName() {
        return Optional.ofNullable(fullName);
    }

    public Optional<List<Address>> getAddresses() {
        return Optional.ofNullable(addresses);
    }

    public Optional<Long> getSalary() {
        return Optional.ofNullable(salary);
    }

    public Optional<String> getDepartmentName() {
        return Optional.ofNullable(departmentName);
    }

    public Optional<Integer> getStudentId() {
        return Optional.ofNullable(studentId);
    }

    public Student(String firstName, String lastName, String fullName, List<Address> addresses, Long salary, String departmentName, Integer studentId,String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.addresses = addresses;
        this.salary = salary;
        this.departmentName = departmentName;
        this.studentId = studentId;
        this.gender = gender;
    }

    public Student() {
    }

    public void displayStudent() {
        System.out.println(new StringBuilder().append("StudentId : ").append(this.studentId)
                .append("Student Name:: ").append(this.firstName).append(this.lastName)
                .append(" and Salary :: ").append(this.salary)
                .append("Full Name").append(this.fullName)
                .append(" Dept ").append(this.departmentName)
                .toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", addresses=" + addresses +
                ", salary=" + salary +
                ", departmentName='" + departmentName + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
