package com.java8.features.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        list = generate(s);
        System.out.println(list);
    }

    public static List<String> generate(String input) {
        if (input.isEmpty() && input.length() == 0) {
            return null;
        }
        List<String> result = new ArrayList<>();
        String cells[] = input.split(":");
        if (cells.length != 2) {
            return null;
        }
        String startcell = cells[0];
        String endcell = cells[1];
        if (!startcell.isEmpty() && startcell.length() > 1 && !endcell.isEmpty() && endcell.length() > 1) {
            if (Character.isAlphabetic(startcell.charAt(0)) && Character.isAlphabetic(endcell.charAt(0))) {
                char startcoloumn = Character.toUpperCase(startcell.charAt(0));
                char endcoloumn = Character.toUpperCase(endcell.charAt(0));
                int startrow = Integer.parseInt(startcell.substring(1));
                int endrow = Integer.parseInt(endcell.substring(1));
                for (char col = startcoloumn; col <= endcoloumn; col++) {
                    System.out.println(col);
                    for (int i = startrow; i <= endrow; i++) {
                        result.add(Character.toString(col) + i);
                    }
                }
            }
        }
        return result;
    }
}