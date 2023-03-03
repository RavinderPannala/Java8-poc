package com.java8.features.FunctionalInterfaces.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filter {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 4, 5, 6, 7);
        Predicate<Integer> integerPredicate = (i) -> i < 5;
        Consumer<Integer> integerConsumer = (i) -> System.out.println(i);
        list.stream().filter(integerPredicate).forEach(integerConsumer);

    }
}
