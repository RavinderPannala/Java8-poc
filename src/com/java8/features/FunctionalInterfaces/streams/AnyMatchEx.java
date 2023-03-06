package com.java8.features.FunctionalInterfaces.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AnyMatchEx {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,4,5,6,2);

        //Check if any elements of stream are divisible by 3 or not using
        Predicate<Integer> anyMatchP = i -> i % 2 == 0;
        boolean anyMatch = list.stream().anyMatch(anyMatchP);
        System.out.println("any  elements are divisible by 2 or not : "+ anyMatch);

        //Check if all elements of stream are divisible by 3 or not using
        Predicate<Integer> allMatchP = i-> i %3==0;
        boolean b = list.stream().allMatch(allMatchP);
        System.out.println("All elements are divisible by 3 or not : "+ b);

        // returns true if either no elements of the stream match the provided predicate or the stream is empty,
        // otherwise false
        Predicate<Integer> noneMatchP = i->i<4;
        boolean b1 = list.stream().noneMatch(noneMatchP);
        System.out.println("To check that there is no number of length 4. "+b1);

        //Count the number of elements in stream
        long count = list.stream().count();
        System.out.println("Count the number of elements available in Stream"+ count);

        //Distinct elements from the stream
        list.stream().distinct().forEach(System.out::println);
    }
}
