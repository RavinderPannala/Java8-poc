package com.java8.features.LamdaExpressions.predicate;

import java.util.function.BiPredicate;

public class BipredicateEx {

    public static void main(String[] args) {

        BiPredicate<String, String> biPredicate = (s, s1) -> s.matches("Ra") && s1.contains("Ra");

        BiPredicate<String, String> biPredicate1 = biPredicate.and((s, s1) -> s.endsWith("Ra") && s1.startsWith("Ra"));

        System.out.println(biPredicate1.test("Ra", "Ra"));

        BiPredicate<Integer,Integer> biPredicate2 = (i1,i2)->i1>20&& i2<20;
        System.out.println(biPredicate2.test(30,10));

        BiPredicate<String,Integer> biPredicate3 = (s,a)->{
            return s.equals("Ravi") && a > 5;
        };

        BiPredicate<String, Integer> andPredicate = biPredicate3.or((s, a) -> s.endsWith("vi") && a >= 5);
        System.out.println(andPredicate.test("Ravi",5));

    }
}
