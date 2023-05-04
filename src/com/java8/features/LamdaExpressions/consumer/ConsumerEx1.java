package com.java8.features.LamdaExpressions.consumer;

import com.java8.features.Employee;
import com.java8.features.EmployeeUtils;

import java.util.List;
import java.util.function.*;

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

        Consumer<String> consumer1 = (name)->{
            System.out.println(name+ " --name of the value--");
        };
        consumer1.andThen(s->System.out.println(s.toUpperCase())).accept("Ravinder");

        BiConsumer<String,String> biConsumer2 = (s1,s2)->{
            System.out.println("Actual ---name"+ s1+"--SurName--"+s2);
        };
        biConsumer2.andThen((s1,s2)->System.out.println(s1.toUpperCase()+"  "+s2.toUpperCase())).accept("Ravinder","Pannala");

        IntConsumer intConsumer = (a)->{
            System.out.println(a);
        };

        intConsumer.accept(10);

        DoubleConsumer doubleConsumer = (b)->{
            System.out.println(b);
        };

        doubleConsumer.accept(200);

        LongConsumer longConsumer = (c)->{
            System.out.println(c);
        };

        longConsumer.accept(20L);
    }

}
