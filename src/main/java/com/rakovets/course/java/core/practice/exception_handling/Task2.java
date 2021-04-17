package com.rakovets.course.java.core.practice.exception_handling;

public class Task2 {
    public static void illegalArray() {
        int[] array = new int[3];
        array[4] = 21;
        System.out.println(array[4]);
    }
}
