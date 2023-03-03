package com.java8.features.FunctionalInterfaces;

@FunctionalInterface
interface Marks {

    int total(int x);
}

@FunctionalInterface
interface Grade {

    String grade();
    static String grader() {
        return "A";
    }

}

class Student implements Marks, Grade {

    @Override
    public int total(int x) {
        return 0;
    }
    @Override
    public String grade() {
        return "A";
    }


}

public class School {

    public static void main(String[] args) {
        Marks marks = (i) -> {
            return i * 10;
        };
        Marks marks1 = (a) -> {
            return a + 10;
        };
        Grade g = () -> {
            return "A";
        };
        System.out.println(g.grade());
        System.out.println(marks.total(100));
        System.out.println(marks1.total(10));
    }


}
