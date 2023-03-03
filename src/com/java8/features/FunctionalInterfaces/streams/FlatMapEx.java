package com.java8.features.FunctionalInterfaces.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class FlatMapEx {

    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7, 8));

        list.stream().flatMap(List::stream).forEach(System.out::println);//1,2,3,4,5,6,7,8


    }
}
