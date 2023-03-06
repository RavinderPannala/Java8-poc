package com.java8.features.FunctionalInterfaces.streams;

import com.java8.features.Employee;
import com.java8.features.EmployeeUtils;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedEx3 {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeUtils.fetchEmployee1();

        Map<Employee, Employee> collect = employees.stream().collect(Collectors.toMap(e -> e, e -> e));

        //Sort employees key in asc order

        //Sort employees values in asc order
        Map<Employee, Employee> result = collect.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getFirstName)))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("Sort tje "+ result);


    }
}
