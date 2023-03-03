package com.java8.features.FunctionalInterfaces.Collectors;


import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Joining {

    public static void main(String[] args) {

       /* StringJoiner class internally uses StringBuilder class to join the strings.
       It is placed in java.util package. Using Java 8 StringJoiner, you can join only the strings,
       but not the array of strings or list of strings.

        //StringJoiner class to join the String
        */
        StringJoiner joiner = new StringJoiner(":", "[", "]");
        joiner.add("Hello");
        joiner.add("World");
        joiner.add("Example");
        System.out.println("Joining with String Joiner Class:--->" + joiner.toString());

        StringJoiner joiner1 = new StringJoiner("|");
        joiner1.add("Ravi").add("Ramu").add("Raju");
        StringJoiner merge = joiner1.merge(joiner);
        System.out.println("merge with String Joiner Class:--->" + merge + " length-->" + merge.length());

        /*
        String.join() method internally uses StringJoiner class.
        This method can be used to join strings or array of strings or list of strings,
        but only with delimiter not with prefix and suffix.
        */

        //Joining String with String.join()
        List<String> l1 = Arrays.asList("A", "B", "C");
        String join = String.join("~", l1);
        String b = String.join("|","A","B");
        String c = String.join("*",new String[]{"AA","BB","CC"});
        System.out.println("Joining with String ,join method---->" + join +"---##"+b +"Joining the Array of Strings-->"+c);


        //Join String with Joining method
        List<String> list = Arrays.asList("Ravi", "Ramu", "Raghu");

        String collect = list.stream().collect(Collectors.joining("|","[","]"));
        System.out.println("Joining String : " + collect);


    }
}
