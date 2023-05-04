package com.java8.features.practice;

import com.java8.features.Employee;
import com.java8.features.EmployeeUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeExample {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtils.fetchEmployee1();

        //sort the employees by sal in asc?
        List<Employee> collect = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(collect);

        //sort the employees by sal in desc?
        List<Employee> collect1 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(collect1);

        //Maximum salary employee
        Employee employee = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Maximum salary employee--->" + employee);

        //Minimum salary employee
        Employee employee1 = employees.stream().min(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Minimum salary employee--->" + employee1);

        //Second Maximum salary employee
        Employee secondMaximum = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get();
        System.out.println("Second Maximum salary employee--->" + secondMaximum);

        List<Employee> collect2 = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(2).skip(1).collect(Collectors.toList());
        System.out.println("Second Minimum salary employee--->" + collect2);

        //get the Employees by Department
        Map<String, List<Employee>> collect3 = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println("Get the Employees by Department--->" + collect3);

        //Get The Maximum salary of Employee in each department ?
        Map<String, Optional<Employee>> collect4 = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println("Get The Maximum salary of Employee in each department-->" + collect4);

        //Get The Minimum salary of Employee in each department ?
        Map<String, Optional<Employee>> collect5 = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        System.out.println("Get The Minimum salary of Employee in each department-->" + collect5);

        //Get the department and their employees count?
        Map<String, Long> collect6 = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
        System.out.println("Get the department and their employees count?-->" + collect6);
        
        //Get Max Sa
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
    }

}
