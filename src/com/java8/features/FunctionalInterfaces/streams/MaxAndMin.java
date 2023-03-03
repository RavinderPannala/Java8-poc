package com.java8.features.FunctionalInterfaces.streams;

import com.java8.features.Employee;
import com.java8.features.EmployeeUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxAndMin {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,45,3,89,32,22);

        //get Max element from List
        Optional<Integer> max = list.stream().max(Comparator.comparing(a -> a));
        if(max.isPresent()){
            System.out.println(max.get());
        }

        //get Min element from List
        Integer integer = list.stream().min(Comparator.comparing(a -> a)).get();
        System.out.println(integer);


        List<Employee> employees = EmployeeUtils.fetchEmployee();
        //Minimum salary employee
        Employee employee = employees.stream().min(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Minimum salaried employee"+ employee);

        //Maximum salaried EMployee
        Employee employee1 = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Maximum salaried employee"+ employee1);

    }
}
