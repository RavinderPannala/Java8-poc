package com.java8.features.LamdaExpressions.Function;

import com.java8.features.Employee;
import com.java8.features.EmployeeUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiFunctionEx {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeUtils.fetchEmployee();

        //List<Employee> matchedEmployees = fetchEmployeesMatchingToKey.apply("MOHAN", employees);




    }

    private  BiFunction<String, List<Employee>, List<Employee>> fetchEmployeesMatchingToKey = (search, empList) -> {
        List<Employee> collect = empList.stream().filter(emp -> this.biPredicate.test(emp, search)).collect(Collectors.toList());
        return collect;
    };

    private  BiPredicate<Employee, String> biPredicate = (employee, search) -> {
        boolean matches = employee.getFirstName().toLowerCase().matches(search)
                || employee.getLastName().toUpperCase().matches(search);
        return matches;
    };

    public void biFunctionExamples() {
        BiFunction<Integer, Integer, Integer> biFunction = Integer::compareTo;
        System.out.println(biFunction.apply(10, 20));

        BiFunction<Integer, Integer, Integer> biFunction1 = Integer::max;
        System.out.println(biFunction1.apply(10, 20));

        BiFunction<String, String, String> biFunction2 = (s1, s2) -> {
            return s1.toUpperCase() + s2.toUpperCase();
        };
        System.out.println(biFunction2.apply("Ravi", "Pannala"));

        BiFunction<Integer, Integer, Integer> biFunction3 = (i, i2) -> {
            return i * i2;
        };
        System.out.println(biFunction3.apply(20, 30));
    }
}
