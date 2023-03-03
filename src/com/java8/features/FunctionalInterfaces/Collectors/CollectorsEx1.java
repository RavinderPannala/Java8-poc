package com.java8.features.FunctionalInterfaces.Collectors;

import com.java8.features.Employee;
import com.java8.features.EmployeeUtils;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectorsEx1 {

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeUtils.fetchEmployee();

        //Get Employee List
        List<Employee> collect = employeeList.stream().collect(Collectors.toList());
        //Get Employee Set
        Set<Employee> set = employeeList.stream().collect(Collectors.toSet());
        //Get Employee Map
        Map<Integer, Employee> map = employeeList.stream().collect(Collectors.toMap(Employee::getId, e -> e));
        //Employee salary sum
        Double collect1 = employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));

        //CollectingAndThen
        String collect2 = employeeList.stream().collect(Collectors
                .collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                        (emp) -> emp.isPresent() ? emp.get().getFirstName() : "none"));

        System.out.println("Collecting max Salaried Employee--->" + collect2);

        //Partioning By Salaray
        Map<Boolean, List<Employee>> collect3 = employeeList.stream().collect(Collectors.partitioningBy(i -> i.getSalary() > 10002.00));
        System.out.println("Partioning by--->" + collect3);

        //Grouping by Salary
        Map<Double, List<Employee>> collect4 = employeeList.stream().collect(Collectors.groupingBy(i -> i.getSalary()));

        //Partioning and Mapping to Uppercase
        List<String> stringList = Arrays.asList("APPLE","KIWI","BANANA");
        Map<Boolean, List<String>> collect5 = stringList.stream()
                .collect(Collectors.partitioningBy(f -> f.length() > 4, Collectors.mapping(String::toUpperCase, Collectors.toList())));
        System.out.println("Partioning and Mapping to Uppercase--->" + collect5);

        Map<String, List<String>> collect6 = stringList.stream()
                .collect(Collectors.groupingBy(s -> s,
                        Collectors.mapping(String::toUpperCase, Collectors.toList())));
        System.out.println("Grouping  and Mapping to Uppercase--->" + collect6);
    }


}
