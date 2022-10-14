package com.rakovets.course.java.core.practice.exception_handling.task5;

public class Array {
    public int showElementOfArray(int[] arr, int index) throws ArrayException {
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayException("there is no such index");
        }
    }
}
