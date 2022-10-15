package com.rakovets.course.java.core.practice.exception_handling;

public class Task02 {
    public static int getSumOfFirstNumbersOfArray(int[] array, int number) throws ArrayIndexOutOfBoundsException {
        int sumOfFirstNumbersOfArray = 0;
        for (int i = 0; i < number; i++) {
            sumOfFirstNumbersOfArray += array[i];
        }
        return sumOfFirstNumbersOfArray;
    }
}
