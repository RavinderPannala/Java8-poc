package com.java8.features.strings;

public class String2 {

    public static void main(String[] args) {
       // smallestAndLargestString("welcometojava", 3);
        String s = "2A";String s1 = "B";
        boolean matches = s.matches(".*\\d.*");
        System.out.println("Matches--->"+matches);

        boolean matches1 = s1.matches(".*\\d.*");
        System.out.println("Matches1--->"+matches1);
    }

    public static void smallestAndLargestString(String intput, int value) {
        String output = intput.substring(0, value);
        String smallest = output;
        String largest = output;

        for (int i = value; i < intput.length(); i++) {
            output = output.substring(1, value) + intput.charAt(i);
            if (largest.compareTo(output) < 0) {
                largest = output;
            }
            if (smallest.compareTo(output) > 0) {
                smallest = output;
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
