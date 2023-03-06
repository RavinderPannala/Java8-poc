package com.java8.features.Optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalEx {

    public static void main(String[] args) {

        //Empty Optional Object
        Optional<Object> empty = Optional.empty();



        //String name=null; Null Pointer Exception will get
        String name="Ravi";
        Optional<String> name1 = Optional.of(name);

        System.out.println(name1.get());

        String s= "Hello";
        Optional<String> s1 = Optional.ofNullable(s); //If s value available it will s value other wise it give Optional.empty
        System.out.println(s1.get()); //If you get value if it is not present  java.util.NoSuchElementException

        String str1 = null;
        String value = Optional.ofNullable(str1).orElse("Ravi");
        System.out.println("If value is not present -->"+value);

        Supplier<String> stringSupplier = ()->"Pannala"; // If value is not present then it will give supplier value
        String s2 = Optional.ofNullable(str1).orElseGet(stringSupplier);
        System.out.println("If value is not present then it will give supplier value-->"+s2);

        //if value is not present then it will give supplier object
        Supplier<NullPointerException> exceptionSupplier = ()-> new NullPointerException("Value is not resent");
        String s3 = Optional.ofNullable(str1).orElseThrow(exceptionSupplier);
        System.out.println("if value is not present then it will give supplier object-->"+s3);

        Optional<String> s4 = Optional.of(s);
        if(s4.isPresent()){
            System.out.println("Value present--->"+s4.get());
        }
    }
}
