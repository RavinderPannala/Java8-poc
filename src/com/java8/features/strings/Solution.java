package com.java8.features.strings;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if (s.length() == 0) {
            System.out.print(0);
        } else {
            String[] splitArray = s.split("[,[ ]+'?!._@]+");
            System.out.println(splitArray.length);
            for (String string : splitArray) {
                System.out.println(string);
            }
        }
        scan.close();

    }
}
