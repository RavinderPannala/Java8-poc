package com.java8.features.FunctionalInterfaces.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Find {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,4,5,6,7);

        //FindAny any element from stream
        Optional<Integer> any = list.stream().findAny();
        //list.stream().parallel().findAny() : it will give different value
        if(any.isPresent()){
            System.out.println(any.get());
        }


        //Find First : it always gives first element from the Stream
        Optional<Integer> first = list.stream().findFirst();
        if(first.isPresent()){
            System.out.println(first.get());
        }
    }
}
