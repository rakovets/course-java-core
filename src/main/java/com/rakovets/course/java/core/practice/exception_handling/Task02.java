package com.rakovets.course.java.core.practice.exception_handling;

public class Task02 {
    public static int throwArrayIndexOutOfBoundsException(int index) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        return array[index];
    }
}
