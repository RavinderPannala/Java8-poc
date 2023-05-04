package com.java8.features;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtils {

    public static List<Employee> fetchEmployee() {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(3434, null, "developer", 10001.00, "BA"));
        empList.add(new Employee(123, "ashoke", "manager", 10001.00, "DEV"));
        empList.add(new Employee(424, "bharat", "lead", 10002.00, "QA"));
        empList.add(new Employee(621, "chandu", "director", 10005.00, "BA"));
        empList.add(new Employee(93, "danish", "developer", 10006.00, "DEV"));
        empList.add(new Employee(448, "eenadu", "developer", 10001.00, "BA"));
        empList.add(new Employee(432, null, "developer", 10001.00, "BA"));
        return empList;

    }

    public static List<Employee> fetchEmployee1() {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(3434, "Raghu", "developer", 70000.00, "BA"));
        empList.add(new Employee(123, "ashoke", "manager", 1000.00, "DEV"));
        empList.add(new Employee(424, "bharat", "lead", 20000.00, "QA"));
        empList.add(new Employee(621, "chandu", "director", 100000.00, "BA"));
        empList.add(new Employee(93, "danish", "developer", 500000.00, "DEV"));
        empList.add(new Employee(448, "eenadu", "developer", 2000.00, "BA"));
        empList.add(new Employee(432, "Ayaan", "developer", 300000.00, "BA"));
        empList.add(new Employee(426, "Bhargav", "Enginnerr", 2000000.00, "QA"));
        return empList;

    }
}
