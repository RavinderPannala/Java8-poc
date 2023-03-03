package com.java8.features.FunctionalInterfaces.streams;

import com.java8.features.Employee;
import com.java8.features.EmployeeUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class ReduceEx {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 5, 6);

        Integer integer = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(integer);

        //Reduce to Some of all elements in List
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        Optional<Integer> reduce = list.stream().reduce(binaryOperator);
        if (reduce.isPresent()) {
            System.out.println(reduce.get());
        }

        //reduce to max number in list
        BinaryOperator<Integer> binaryOperator1 = (a, b) -> a > b ? a : b;
        Optional<Integer> reduce1 = list.stream().reduce(binaryOperator1);
        if (reduce1.isPresent()) {
            System.out.println(reduce1.get());
        }

        //Based on length reduce to Upper case or lower case
        List<String> stringList = Arrays.asList("Ravi", "Pannala", "Reddy");

        BinaryOperator<String> binaryOperator2 = (a, b) -> a.length() > b.length() ? a.toUpperCase() : b.toUpperCase();
        Optional<String> reduce2 = stringList.stream().reduce(binaryOperator2);
        if (reduce2.isPresent()) {
            System.out.println(reduce2.get());
        }

        //Sum of salaries in employee list
        List<Employee> employees = EmployeeUtils.fetchEmployee();
        Double reduce3 = employees.stream().map(Employee::getSalary).reduce(0.0, (a, b) -> a + b, Double::sum);
        System.out.println("Sum of all salaries in employees "+ reduce3);
    }
}
