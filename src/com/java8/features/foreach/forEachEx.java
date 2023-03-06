package com.java8.features.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachEx {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Consumer<Integer> consumer= (i)->System.out.println("iterating elements using forEach method-->"+i);
        list.stream().forEach(consumer);
        Consumer<Integer> consumer1 = (i)->System.out.println("Iterating elements parallee stream -->"+i);
        list.parallelStream().forEach(consumer1);
    }
}
