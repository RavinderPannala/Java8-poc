package com.java8.features.FunctionalInterfaces.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Peek {


    /*
    This method exists mainly to support debugging, where you want to see the elements
    as they flow past a certain point in a pipeline
     */
    public static void main(String[] args) {

        List<String> collect = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }
}
