package com.java8.features.LamdaExpressions.UnaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperEx {

    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = BinaryOperator.maxBy((a, b) -> a.compareTo(b));
        System.out.println(binaryOperator.apply(100, 200));

        BinaryOperator<Integer> binaryOperator1 = BinaryOperator.minBy((a, b) -> a.compareTo(b));
        System.out.println(binaryOperator1.apply(100, 200));
    }
}
