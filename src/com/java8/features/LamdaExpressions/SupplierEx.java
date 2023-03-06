package com.java8.features.LamdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierEx {

    public static void main(String[] args) {

        String name = "Ravinder";

        Supplier<Boolean> booleanSupplier = () -> name.length() > 4;
        Supplier<Integer> integerSupplier = () -> name.indexOf('R');
        Supplier<String> supplier = ( )-> name.toLowerCase();

        Supplier<List> supplier1 = () ->new ArrayList();

        System.out.println(booleanSupplier.get());
        System.out.println(integerSupplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier1.get());
    }
}
