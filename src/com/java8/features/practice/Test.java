package com.java8.features.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Number> list = Arrays.asList(1, 33.2, 3, 4);
        list.stream().map(s -> s + "").filter(a -> a.contains("3")).forEach(System.out::println);

        //List of Even Numbers and Odd Numbers from List
        List<Integer> integers = Arrays.asList(1, 4, 2, 5, 6, 3, 7, 8, 9);

        List<Integer> even = integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> odd = integers.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());

        System.out.println(even + " even--->");
        System.out.println(odd + "--->odd");

        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> integers1 = Arrays.asList(1, 14, 2, 5, 6, 13, 7, 18, 91);
        List<String> collect = integers1.stream().map(s -> s + "").filter(a -> a.startsWith("1")).collect(Collectors.toList());
        System.out.println(collect + "--->Number start with 1");

        // How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> integers2 = Arrays.asList(18, 13, 2, 5, 6, 13, 7, 18, 91);
        List<Integer> collect1 = integers2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(m -> m.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect1 + "--->find duplicate elements in a given integers");

        //How to find duplicate characters from String
        String name="ravinder pannala";
        List<Character> collect2 = name.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect2 + "---> duplicate characters from String");

        //Given a list of integers, find the maximum value element present in it using Stream functions?
        Integer integer = integers2.stream().max(Comparator.comparing(a -> a)).get();
        Integer integer1 = integers2.stream().max(Integer::compareTo).get();
        System.out.println(integer + "---> find the maximum value element present in--->"+integer1);

        //Given a String, find the first non-repeated character in it using Stream functions
        Optional<Character> first = name.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(m -> m.getValue() == 1L).map(Map.Entry::getKey).findFirst();
        System.out.println("find the first non-repeated character"+first.get());

        //Given a list of integers, sort all the values present in it using Stream functions?
        List<Integer> collect3 = integers2.stream().sorted(Comparator.comparing(a -> a)).collect(Collectors.toList());
        System.out.println("sort all the values present in it using Stream functions"+collect3);

        //Given a list of integers, sort all the values present reverse order in it using Stream functions?
        List<Integer> collect4 = integers2.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("sort all the values present reverse order in it using"+collect4);
    }
}
