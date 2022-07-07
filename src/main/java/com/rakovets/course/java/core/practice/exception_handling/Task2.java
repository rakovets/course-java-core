package com.rakovets.course.java.core.practice.exception_handling;

public class Task2 {
    public void createFillNumsArray(int numberOfArrayElements, int index, int value) {
        int[] nums = new int[numberOfArrayElements];
        if (index < 0 || index >= nums.length) {
            throw new ArrayIndexOutOfBoundsException("Array index out of bounds");
        }
        nums[index] = value;
    }
}
