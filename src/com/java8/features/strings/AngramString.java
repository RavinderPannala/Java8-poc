package com.java8.features.strings;

import java.util.Arrays;

public class AngramString {
    public static void main(String[] args) {

        boolean b = anagramString("anagram", "margana");
        if (b) {
            System.out.println("anagram");
        } else {
            System.out.println("Not anagrams");
        }
    }

    public static boolean anagramString(String input1, String input2) {

        input1 = input1.replaceAll("\\s", "");
        input2 = input2.replaceAll("\\s", "");
        boolean test = true;
        if (input1.length() != input2.length()) {
            test = false;
        } else {
            char[] chars1 = input1.toLowerCase().toCharArray();
            char[] chars2 = input2.toLowerCase().toCharArray();
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            test = Arrays.equals(chars1, chars2);
        }
        return test;
    }
}
