package com.java8.features.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OtherQuestions {

    public static void main(String[] args) {

        //Duplicate Number From a List?
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 1);
        List<Integer> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(m -> m.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("Duplicate Numbers from list" + collect);

        //Duplicate Number from List
        Set<Integer> collect1 = list.stream().filter(m -> Collections.frequency(list, m) > 1).collect(Collectors.toSet());
        System.out.println("Duplicate Numbers from list" + collect1);

        list.stream().filter(m->Collections.frequency(list,m)>1).collect(Collectors.toList());

        //How to remove duplicates from a collection list of integers
        List<Integer> collect3 = list.stream().distinct().collect(Collectors.toList());
        System.out.println("How to remove duplicates from a collection list of integers" + collect3);

        //Occurrence of a Character from a String?
        String s = "Ravinder";
        Map<Character, Long> collect2 = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Occurrence of a Character from a String" + collect2);

        //Reverse a collections
        List<Integer> reverseCollection = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Reverse a collections" + reverseCollection);

        List<Integer> integers = Arrays.asList(3,6,2,1,7,2);
        Collections.reverse(integers);
        System.out.println("Reverse a collections using" +integers);

      /*  //remove-all-occurrences-from-String
        List<String> stringList = Arrays.asList("A","B","C","A","B");
        List<String> collect4 = stringList.stream().filter(i -> !Objects.equals(i, stringList)).collect(Collectors.toList());
        System.out.println("remove-all-occurrences-from-String" + collect4);*/
    }
}
