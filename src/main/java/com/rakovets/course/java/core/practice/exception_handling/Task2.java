package com.rakovets.course.java.core.practice.exception_handling;

public class Task2 {
    public int[] makeArray(int number) {
        int[] result = new int[number];
        for (int i = 0; i <= number; i++) {
            result[i] = i;
        }
        return result;
    }
}
