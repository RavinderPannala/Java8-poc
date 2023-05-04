package com.java8.features.strings;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean test = true;
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
                test = false;
                break;
            }
        }
        if (test) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
}