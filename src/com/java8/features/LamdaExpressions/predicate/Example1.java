package com.java8.features.LamdaExpressions.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {


        Predicate<String> p = s -> s.equals("Ravi");

        Predicate<String> pr = str -> str.length() < 12;

        boolean test = pr.or(str -> str.contains("Ra")).and(str -> str.equals("Ravi")).test("Ravinder");
        //System.out.println(test);

        //System.out.println(p.test("Hello"));
        //System.out.println(p.test("Ravi"));

        Predicate<Integer> integerPredicate = i -> i % 2 == 0;

        //System.out.println(integerPredicate.test(10));

        Predicate<Integer> and = integerPredicate.or(i -> i.equals(0)).and(i -> i >= 0);
        System.out.println(and.test(20));

        Predicate<String> stringPredicate = (string)->{
            List<String> list = Arrays.asList("Ravi","Ramu");
            boolean contains = list.contains(string);
            return contains;
        };

        System.out.println(stringPredicate.test("Hello"));
        
        Predicate<Integer> even = i->i%2==0;
        Predicate<Integer> odd = even.negate();
        
        List<Integer> integers = Arrays.asList(1,4,2,3,5,6,2,3);
        List<Integer> collect = integers.stream().filter(even).collect(Collectors.toList());
        List<Integer> collect1 = integers.stream().filter(odd).collect(Collectors.toList());
        collect1.forEach(c->System.out.println(c));

        //BiPredicate
        BiPredicate<Integer,String>  biPredicate= (i,s)->i>3 && s.equals("Ravi");

        System.out.println(biPredicate.test(10,"Ravi"));

    }
}
