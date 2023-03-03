package com.java8.features.LamdaExpressions.predicate;

import java.util.function.BiPredicate;

public class BipredicateEx {

    public static void main(String[] args) {

        BiPredicate<String, String> biPredicate = (s, s1) -> s.matches("Ra") && s1.contains("Ra");

        BiPredicate<String, String> biPredicate1 = biPredicate.and((s, s1) -> s.endsWith("Ra") && s1.startsWith("Ra"));

        System.out.println(biPredicate1.test("Ra", "Ra"));

        BiPredicate<Integer,Integer> biPredicate2 = (i1,i2)->i1>20&& i2<20;
        System.out.println(biPredicate2.test(30,10));

    }
}
