package com.rakovets.course.java.core.practice.exception_handling;

public class Task02 {
    public static void throwArrayIndexOutOfBoundsException() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(array[5]);
    }
}
