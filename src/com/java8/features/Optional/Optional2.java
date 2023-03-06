package com.java8.features.Optional;

import com.java8.features.Employee;
import com.java8.features.EmployeeUtils;
import com.java8.features.Utils.Student;
import com.java8.features.Utils.StudentUtils;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Optional2 {

    /*
    optionalExmaple.displayFirstEmployeeFromList();
        optionalExmaple.groupEmployeesByDepartment();
        optionalExmaple.getEmployeesMatchingWithString();
        optionalExmaple.changeStoreIdBasedOnCurrentLength();
        optionalExmaple.getEmployeesNotMatchingDepartment();
        optionalExmaple.arrangeEmployeesByFirstName();
        optionalExmaple.getEmployeeWhoseIdIsHighest();
        optionalExmaple.printAllEmployeeNamesWithPipe();
        optionalExmaple.getNthElementFromEmployee(5);
        optionalExmaple.fetchEmployeeMatchingWithIds();
        optionalExmaple.fetchEmployeesByGender();
        optionalExmaple.printMalesAndFemalesList();
     */

    Optional<List<Student>> studentList = StudentUtils.fetchStudent();

    public static void main(String[] args) {


        Optional2 optional2 = new Optional2();
        optional2.displayFirstStudentFromList();
        optional2.groupStudentsByDepartment();
        optional2.getStudentMatchingWithString();
        optional2.arrangeStudentsByFirstName();
        optional2.printMalesAndFemalesList();
    }

    public void displayFirstStudentFromList() {
        Student student = studentList.orElseGet(Collections::emptyList).stream().limit(1).findFirst().get();
        student.displayStudent();
    }


    public void groupStudentsByDepartment() {
        Map<Optional<String>, Long> collect = studentList.orElseGet(Collections::emptyList).stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting()));
        System.out.println(collect);
    }

    public void getStudentMatchingWithString() {
        Map<Optional<String>, List<Student>> studentGropByDepMap = studentList.orElseGet(Collections::emptyList).stream().collect(Collectors.groupingBy(Student::getDepartmentName));
        List<Student> collect = studentGropByDepMap.values().stream().flatMap(List::stream).collect(Collectors.toList());
        List<Student> student = this.biFunction.apply("RAVI", collect);
        System.out.println(student);
    }

    public void arrangeStudentsByFirstName() {
        List<Student> collect = studentList.orElseGet(Collections::emptyList).stream().sorted(Comparator.comparing(s->s.getFirstName().get())).collect(Collectors.toList());
        System.out.println(collect);
    }

    public void printMalesAndFemalesList(){

        List<Student> female = studentList.orElseGet(Collections::emptyList).stream().filter(s -> s.getGender().equals("FEMALE")).map(std -> this.fullNameFunction.apply(std)).collect(Collectors.toList());
        System.out.println("Female--->"+female);
    }

    public BiFunction<String, List<Student>, List<Student>> biFunction = (searchName, stdList) -> {
        List<Student> collect = stdList.stream().filter(std -> this.predicate.test(std, searchName)).collect(Collectors.toList());
        return collect;
    };

    public BiPredicate<Student, String> predicate = (std, searchName) -> {
        boolean b = std.getFirstName().get().toUpperCase().equals(searchName) || std.getFirstName().get().toLowerCase().equals(searchName);
        return b;
    };

    public Function<Student,Student> fullNameFunction =(std)->{
       String fullName =  new StringBuilder().append(std.getFirstName()).append("-").append(std.getLastName()).toString();
       std.setFullName(fullName);
       return std;
    };
}
