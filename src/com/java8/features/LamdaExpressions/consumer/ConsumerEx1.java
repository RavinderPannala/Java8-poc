package com.java8.features.LamdaExpressions.consumer;

import com.java8.features.Employee;
import com.java8.features.EmployeeUtils;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerEx1 {

    public static void main(String[] args) {
        Consumer<String> consumer = (string) -> {
            System.out.println("Hello");
        };

        Consumer<Integer> integerConsumer = (i) -> {
            return;
        };
        consumer.accept("Ravi");
        integerConsumer.accept(1);

        Consumer<String> stringConsumer = (string) -> System.out.println(string.toLowerCase());
        Consumer<String> stringConsumer1 = stringConsumer.andThen(s -> System.out.println(s.toUpperCase()));
        Consumer<String> stringConsumer2 = s -> System.out.println(s.charAt(2));
        stringConsumer1.andThen(stringConsumer2).accept("Ravinder");

        List<Employee> employees = EmployeeUtils.fetchEmployee();
        Consumer<Employee> employeeConsumer = emp -> System.out.println(emp);

        employees.stream().forEach(employeeConsumer);

        //Bi Consumer
        BiConsumer<String,String> biConsumer = (s1,s2)->System.out.println(s1+" "+s2);
        BiConsumer<String, String> biConsumer1 = biConsumer.andThen((s1, s2) -> System.out.println(s1.toLowerCase() + "" + s2.toUpperCase()));
        biConsumer1.accept("Ravi","Pannala");
    }

}
