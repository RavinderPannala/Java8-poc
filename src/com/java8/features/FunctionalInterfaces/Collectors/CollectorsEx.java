package com.java8.features.FunctionalInterfaces.Collectors;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsEx {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,34,5,66,77);

        //Averaging the List values
        Double collect = list.stream().collect(Collectors.averagingDouble(a -> a));
        System.out.println(collect);

        //Summary Statistics
        IntSummaryStatistics collect1 = list.stream().collect(Collectors.summarizingInt(a -> a));
        System.out.println("Sum---"+collect1.getSum()+" avg--"+collect1.getAverage()+" min ----"+collect1.getMin()+" max ---"+collect1.getMax());

        //Grouping the elements based on conditions
        Function<Integer,Boolean> function = (i)->{
            return i%2==0;
        };

        Map<Boolean, List<Integer>> collect2 = list.stream().collect(Collectors.groupingBy(function));
        System.out.println("Grouping the list with even and add--->"+ collect2);

        Map<Boolean, Long> collect3 = list.stream().collect(Collectors.groupingBy(function, Collectors.counting()));
        System.out.println("Even and odd count in list----- "+ collect3);



    }
}
