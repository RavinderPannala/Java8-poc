package com.java8.features.FunctionalInterfaces.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "Cat", null, "Apple", "Is");

        list.stream().sorted(Comparator.comparing(s -> s, Comparator.nullsLast(Comparator.reverseOrder()))).forEach(System.out::println);
        list.stream().sorted(Comparator.comparing(s -> s, Comparator.nullsFirst(Comparator.naturalOrder()))).forEach(System.out::println);
        list.stream().sorted(Comparator.comparing(s->s)).forEach(System.out::println);
        list.stream().sorted(Comparator.comparing(s->s,Comparator.reverseOrder())).forEach(System.out::println);
    }


}
