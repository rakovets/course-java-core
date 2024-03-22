package com.rakovets.course.java.core.example.generics;

public class Example8Bounded {
    public static void main(String[] args) {
        int countGreater = countGreaterThan(new String[]{"Jhon", "Holly", "Jim"}, "Holly");
        System.out.println(countGreater);
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray) {
            if (e.compareTo(elem) > 0) {
                ++count;
            }
        }
        return count;
    }
}
