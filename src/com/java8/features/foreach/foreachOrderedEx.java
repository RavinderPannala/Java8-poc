package com.java8.features.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class foreachOrderedEx {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Consumer<Integer> consumer= (i)->System.out.println("iterating elements using forEachOrdered method-->"+i);
        list.stream().forEachOrdered(consumer);
        Consumer<Integer> consumer1 = (i)->System.out.println("Iterating elements parallel stream -->"+i);
        list.parallelStream().forEachOrdered(consumer1);
    }

}
