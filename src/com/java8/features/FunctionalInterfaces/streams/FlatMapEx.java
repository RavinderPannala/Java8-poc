package com.java8.features.FunctionalInterfaces.streams;

import com.java8.features.Utils.Address;
import com.java8.features.Utils.Student;
import com.java8.features.Utils.StudentUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class FlatMapEx {

    public static void main(String[] args) {

        //Input : [[1,2,3,4],[5,6,7,8] output :[1,2,3,4,5,6,7,8]
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7, 8));

        list.stream().flatMap(List::stream).forEach(System.out::println);//1,2,3,4,5,6,7,8

        List<Student> students = StudentUtils.fetchAllStudent();

        students.stream().map(Student::getFirstName).collect(Collectors.toList());

        List<Address> collect = students.stream().flatMap(s -> s.getAddresses().get().stream()).collect(Collectors.toList());

        System.out.println(collect);

    }
}
