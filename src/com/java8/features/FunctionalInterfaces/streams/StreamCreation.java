package com.java8.features.FunctionalInterfaces.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

    public static void main(String[] args) {

        //The empty() method is used upon creation to avoid returning null for streams with no element
        Stream<Object> empty = Stream.empty();
        System.out.println(empty.findFirst());//Optional.empty

        //Stream.of(T…t) method can be used to create a stream with the specified t values, where t are the elements
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        //Create Stream with Collection
        Collection<String> integers = Arrays.asList("A","B","C");
        Stream<String> stream = integers.stream();
        stream.forEach(System.out::println);

        List<String> list = Arrays.asList("D","E","F");
        Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);

        //From Array
        String[] stringArray = new String[]{"Ravi","Raju","Pannala"};
        Stream<String> stream2 = Arrays.stream(stringArray);
        stream2.forEach(System.out::println);

        //StreamBuilder
        Stream<Character> build = Stream.<Character>builder().add('a').add('b').add('c').add('d').build();
        build.forEach(System.out::println);

        //create stream with generate
        Supplier<Integer> integerSupplier = ()-> 10;
        Stream<Integer> limit = Stream.generate(integerSupplier).limit(10);
        limit.forEach(System.out::println);

        //Create Stream with Iterate
        /*
        The iterate() method returns an infinite sequential ordered Stream produced by
        iterative application of a function f to an initial element seed
         */
        UnaryOperator<Integer> integerUnaryOperator = i->i*10;
        Stream<Integer> limit1 = Stream.iterate(1, integerUnaryOperator).limit(10);
        limit1.forEach(System.out::println);

        //With The help of Primities
        IntStream range = IntStream.range(0, 4);
        range.forEach(System.out::println);

        DoubleStream limit2 = DoubleStream.iterate(0.0, i -> i + 10.0).limit(2);
        limit2.forEach(System.out::println);
    }

}
