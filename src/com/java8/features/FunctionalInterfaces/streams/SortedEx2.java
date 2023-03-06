package com.java8.features.FunctionalInterfaces.streams;

import com.java8.features.Employee;
import com.java8.features.EmployeeUtils;
import com.java8.features.Utils.Student;
import com.java8.features.Utils.StudentUtils;

import java.util.*;
import java.util.stream.Collectors;

public class SortedEx2 {

    public static void main(String[] args) {

        Map<String,Integer>  map = new HashMap<>();
        map.put("Hello",4);
        map.put("Ravinder",5);
        map.put("Apple",1);
        map.put("Zoo",3);
        map.put("Pannala",6);

        //Sort the map using Keys
        LinkedHashMap<String, Integer> collect = map.entrySet().stream().
                sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap
                        (Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println("Comparing by Keys asc order: ---"+collect);

        //Sort the Keys in Desc orders
        LinkedHashMap<String, Integer> collect2 = map.entrySet().stream().
                sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println("Comparing by Keys in desc order: ---"+collect2);

        //Sort the Map using values
        LinkedHashMap<String, Integer> collect1 = map.entrySet().stream().
                sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("Comparing by values: ---"+collect1);

        //Sort the values in desc order
        LinkedHashMap<String, Integer> collect3 = map.entrySet().stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("Comparing by values in desc: ---"+collect3);

    }
}
