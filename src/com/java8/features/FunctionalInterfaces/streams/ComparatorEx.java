package com.java8.features.FunctionalInterfaces.streams;

import com.java8.features.Employee;
import com.java8.features.EmployeeUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class ComparatorEx {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeUtils.fetchEmployee();

        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getFirstName);
        Comparator<Employee> reversed = employeeComparator.reversed();
        Comparator<Employee> employeeComparator1 = Comparator.comparingInt(Employee::getId);
        Comparator<Employee> employeeComparator2 = Comparator.comparingDouble(Employee::getSalary);
        Comparator<Employee> employeeComparator3 = Comparator.nullsFirst(employeeComparator);
        Comparator<Employee> employeeComparator4 = Comparator.nullsLast(employeeComparator);
        Comparator<Employee> employeeComparator5 = Comparator.comparing(Employee::getLastName).thenComparing(Employee::getId);
        Comparator<Employee> employeeComparator6 = Comparator.comparingInt(Employee::getId).thenComparingDouble(Employee::getSalary);

        //Sort Last Name in Reverse Order
        employeeList.stream().sorted(Comparator.comparing(Employee::getLastName, Comparator.reverseOrder())).forEach(System.out::println);

        //Sort Last Name in Natural Order
        employeeList.stream().sorted(Comparator.comparing(Employee::getLastName)).forEach(System.out::println);

        //Sort Last Name in Reverser Order
        employeeList.stream().sorted(Comparator.comparing(Employee::getLastName).reversed()).forEach(System.out::println);

        //Sort By LastName and Id
        employeeList.stream().sorted(employeeComparator5).forEach(System.out::println);

        //Sort By ID and Salary
        employeeList.stream().sorted(employeeComparator6).forEach(System.out::println);

        //Collections ReverserOrdered
        employeeList.stream().sorted(Collections.reverseOrder(employeeComparator1)).forEach(System.out::println);

        //null values coming as first
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getFirstName,
                        Comparator.nullsFirst(Comparator.naturalOrder())))
                .forEach(System.out::println);

        //null Values coming as Last
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getFirstName, Comparator.nullsLast(Comparator.reverseOrder())))
                .forEach(System.out::println);
    }

}
