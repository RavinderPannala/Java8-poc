package com.java8.features.strings;

import java.io.*;
import java.util.*;

public class String1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.print(A.length() + B.length() + "\n");
        if (A.compareTo(B) <= 0) {
            System.out.print("No" + "\n");
        } else if (A.compareTo(B) > 0) {
            System.out.print("Yes" + "\n");
        }
        A = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
        B = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.print(A + " " + B);
    }

}
