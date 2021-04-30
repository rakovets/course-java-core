package com.rakovets.course.java.core.practice.exception_handling;

public class Task02 {
    public static void throwArrayIndexOutOfBoundsException() {
        int[] array = new int[5];
        try {
            int currentNumber = array[5];
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
