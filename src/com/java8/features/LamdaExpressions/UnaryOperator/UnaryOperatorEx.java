package com.java8.features.LamdaExpressions.UnaryOperator;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorEx {

    public static void main(String[] args) {

        UnaryOperator<String> unaryOperator = (s)->s.toUpperCase();
        System.out.println(unaryOperator.apply("Ravi"));

        IntUnaryOperator intUnaryOperator = (a)-> Math.decrementExact(a);
        System.out.println(intUnaryOperator.applyAsInt(10));

        DoubleUnaryOperator doubleUnaryOperator = (b)->Math.abs(b);
        System.out.println(doubleUnaryOperator.applyAsDouble(20.00));

        LongUnaryOperator longUnaryOperator = (c)->Math.incrementExact(c);
        System.out.println(longUnaryOperator.applyAsLong(30L));


    }

}
