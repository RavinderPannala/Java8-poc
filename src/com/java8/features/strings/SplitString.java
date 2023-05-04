package com.java8.features.strings;

import java.util.Scanner;

public class SplitString {

    /*
    On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be unique).
    Next, print each of the  tokens on a new line in the same order as they appear in input string .
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] splitArray = s.trim().split("[, '?!._@]+");
        System.out.println(splitArray.length);
        for (String string : splitArray) {
            System.out.println(string);
        }
        scan.close();
    }
}