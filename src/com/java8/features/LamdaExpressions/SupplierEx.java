package com.java8.features.LamdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierEx {

    public static void main(String[] args) {

        String name = "Ravinder";

        Supplier<Boolean> booleanSupplier = () -> name.length() > 4;
        Supplier<Integer> integerSupplier = () -> name.indexOf('R');
        Supplier<String> supplier = () -> name.toLowerCase();

        Supplier<List> supplier1 = () -> new ArrayList();

        System.out.println(booleanSupplier.get());
        System.out.println(integerSupplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier1.get());

        Supplier<String> supplier2 = () -> name;
        System.out.println(supplier2.get());

        IntSupplier supplier3 = () -> 0;
        DoubleSupplier supplier4 = () -> 0.0;
        LongSupplier supplier5 = () -> 0L;

        System.out.println(supplier3.getAsInt() + "-->" + supplier4.getAsDouble() + "-->" + supplier5.getAsLong());
    }
}
