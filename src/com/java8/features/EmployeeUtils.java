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
}
