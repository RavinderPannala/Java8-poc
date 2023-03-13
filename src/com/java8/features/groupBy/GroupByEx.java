package com.java8.features.groupBy;

import com.java8.features.Utils.Student;
import com.java8.features.Utils.StudentUtils;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByEx {

    public static void main(String[] args) {

        List<Employee> employeesList = new ArrayList<>();

        employeesList.add(new Employee(101, "Glady", "Manager", "Male", 25_00_000));
        employeesList.add(new Employee(102, "Vlad", "Software Engineer", "Female", 15_00_000));
        employeesList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 20_00_000));
        employeesList.add(new Employee(104, "Nike", "Manager", "Female", 25_00_000));
        employeesList.add(new Employee(105, "Slagan", "Software Engineer", "Male", 15_00_000));
        employeesList.add(new Employee(106, "Murekan", "Software Engineer", "Male", 15_00_000));
        employeesList.add(new Employee(107, "Gagy", "Software Engineer", "Male", 15_00_000));

        //Group by one Field
        Map<String, List<Employee>> collect = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDesignation));
        System.out.println(collect);

        //Group by multiple Fields and find the count
        Map<String, Map<String, Long>> collect1 = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDesignation, Collectors.groupingBy(Employee::getGender, Collectors.counting())));
        System.out.println(collect1);

        //Getting Employees who are belongs to Designation
        Map<String, List<String>> collect2 = employeesList.stream().
                collect(Collectors.groupingBy(Employee::getDesignation, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(collect2);

        //Grouping by Multiple Values
        Map<String, Map<String, List<Employee>>> collect3 = employeesList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDesignation, Collectors.groupingBy(Employee::getGender)));
        System.out.println(collect3);

        //Collectors.groupingBy() with a Classification Function, Downstream Collector and Supplier
        LinkedHashMap<String, List<String>> collect4 = employeesList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDesignation, LinkedHashMap::new, Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println(collect4);

        LinkedHashMap<String, List<String>> collect5 = collect4.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(collect5);

        //Maximum salary based on group by
        Map<String, Optional<Employee>> collect6 = employeesList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDesignation, Collectors.maxBy(Comparator.comparingLong(Employee::getSalary))));
        System.out.println(collect6);
    }

}
