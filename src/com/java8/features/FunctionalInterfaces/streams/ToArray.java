package com.java8.features.FunctionalInterfaces.streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToArray {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Ravi", "Ayaan", "Raju");

        Object[] string = stream.toArray();
        System.out.println(Arrays.toString(string));

        //Filter the stream and store in array
        Object[] objects = stream.filter(s -> s.length() > 4).toArray();
    }
}
