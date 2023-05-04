package com.java8.features.LamdaExpressions.Function;

import com.java8.features.Employee;
import com.java8.features.EmployeeUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionEx1 {

    public static void main(String[] args) {

        Function<Integer, String> function = (i) -> i + "ravi";
        System.out.println(function.apply(2));

        Function<Integer, Integer> integerFunction = (i) -> i * i;
        System.out.println(integerFunction.apply(5));

        Function<String, String> function1 = x -> "First" + x;
        Function<String, String> function2 = x -> "Second" + x;

        Function<String, String> stringFunction = function1.andThen(function2);
        System.out.println(stringFunction.apply("Ravinder"));

        Function<String, String> andThen2 = function2.andThen(function1);
        System.out.println("andThen Output2 : " + andThen2.apply("Ravinder"));


        Function<String, String> compose = function1.compose(function2);
        System.out.println(compose.apply("Ravinder"));

        List<Employee> employees = EmployeeUtils.fetchEmployee();

        Function<Employee, String> function3 = (employee) -> {
            return employee.getFirstName() + employee.getLastName();
        };
        Consumer<String> employeeConsumer = employee -> System.out.println(employee);
        employees.stream().map(function3).forEach(employeeConsumer);

        Function<Double, BigDecimal> decimalFunction = (salary) -> {
            return new BigDecimal(salary);
        };
        employees.stream().map(e -> e.getSalary()).map(decimalFunction).forEach(System.out::println);

        Function<Employee, Employee> employeeFunction = (employee) -> {
            String fullName = new StringBuilder().append(employee.getFirstName()).append(employee.getLastName()).toString();
            employee.setFirstName(fullName);
            return employee;
        };
        Consumer<Employee> employeeConsumer1 = (e) -> System.out.println(e);
        employees.stream().map(employeeFunction).forEach(employeeConsumer1);


        Function<String, String> function4 = (s) -> s.substring(1);
        Function<String, String> function5 = function4.andThen(s -> s.toUpperCase());
        System.out.println(function5.apply("ravinder"));

        IntFunction<Double> intFunction = a -> a / 2.0;
        System.out.println(intFunction.apply(3));

    }
}
