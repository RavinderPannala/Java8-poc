package com.java8.features.FunctionalInterfaces.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SkipAndLimit {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,4,5,6,7);

        //Skip the elemets from list
        List<Integer> collect1 = list.stream().skip(1).collect(Collectors.toList());
        System.out.println("Skip the n elements from list"+ collect1);

        //Limit the Elemets from list

        List<Integer> collect = list.stream().limit(1).collect(Collectors.toList());
        List<Integer> collect3 =list.stream().limit(1).collect(Collectors.toList());
        List<Integer> collect2=  list.stream().limit(1).collect(Collectors.toList());
        System.out.println("Limit  the n elements from list"+ collect);
        System.out.println("Limit  the n elements from list"+ collect3);
        System.out.println("Limit  the n elements from list"+ collect2);

        List<Integer> collect4=  list.parallelStream().limit(1).collect(Collectors.toList());
        System.out.println("Limit  the n elements from list"+ collect4);
    }
}
