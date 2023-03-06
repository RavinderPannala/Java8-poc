package com.java8.features.FunctionalInterfaces.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedEx {

    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("Ravi","Ayyan","Zoo");

        //Sorting elements in asc order
        stringList.stream().sorted().forEach(System.out::println);

        //Sorting elemets in desc order
        stringList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

        //Sorting elements using comparator.comparing
        Function<String,String> function = (s)->{
            return s;
        };
        Comparator<String> comparator = Comparator.comparing(function);
        stringList.stream().sorted(comparator).forEach(System.out::println);

        //Sort the elements in desc order
        stringList.stream().sorted(comparator.reversed()).forEach(System.out::println);

        //Sort List of Integers and null values as first
        List<Integer> list = Arrays.asList(4,null,null,2,6,1,3);
        List<Integer> collect = list.stream().sorted(Comparator.comparing(i -> i, Comparator.nullsFirst(Comparator.naturalOrder()))).collect(Collectors.toList());
       System.out.println("print null values first and Compare elements"+ collect);

        List<Integer> collect1 = list.stream().sorted((Comparator.comparing(i -> i, Comparator.nullsLast(Comparator.reverseOrder())))).collect(Collectors.toList());
        System.out.println("print null values last and Compare elements"+ collect1);


    }
}
