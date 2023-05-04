package com.java8.features.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;

public class SortHashMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("ravinder", "Pannala");
        map.put("Lavanya", "Etykyla");
        map.put("Madhu", "Katippelyy");
        map.put("Ayaan", "Aleti");
        map.put("Jithendhar", "Yenugu");

        LinkedHashMap<String, String> collect = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        LinkedHashMap<String, String> collect1 = map.entrySet().stream().sorted(comparingByKey(Collections.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        LinkedHashMap<String, String> collect2 = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        LinkedHashMap<String, String> collect3 = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("Sort By Keys--->" + collect);
        System.out.println("Sort By Keys DESC--->" + collect1);
        System.out.println("Sort By Values--->" + collect2);
        System.out.println("Sort By Values DESC--->" + collect3);
    }
}
