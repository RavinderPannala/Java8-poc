package com.java8.features.FunctionalInterfaces.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class MapEx {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ravi", "ramu", "raghu");

        Function<String, String> function = (s) -> s.toUpperCase();
        Function<String, String> f1 = (s) -> s.concat("D");
        Stream<String> stringStream = list.stream().map(function).map(f1);
        stringStream.forEach(s -> System.out.println(s));

        //maptoInt
        List<String> list1 = Arrays.asList("1", "2", "3", "4");
        IntConsumer consumer = i -> System.out.println(i);
        ToIntFunction<String> integerFunction = Integer::parseInt;
        list1.stream().mapToInt(integerFunction).forEach(consumer);

        //MapToDouble
        ToDoubleFunction<String> doubleFunction = Double::valueOf;
        DoubleConsumer doubleConsumer = i -> System.out.println(i);
        list1.stream().mapToDouble(doubleFunction).forEach(doubleConsumer);

        //MaptoLong
        ToLongFunction<String> longFunction = Long::parseLong;
        LongConsumer longConsumer = i -> System.out.println(i);
        list1.stream().mapToLong(longFunction).forEach(longConsumer);
    }


}
