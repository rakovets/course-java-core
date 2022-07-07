package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CheckedArrayBoundException;

public class Task5 {
    public void createFillNumsArray(int numberOfArrayElements, int index, int value) throws CheckedArrayBoundException {
        int[] nums = new int[numberOfArrayElements];
        try {
            nums[index] = value;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new CheckedArrayBoundException(e.getMessage());
        }
    }
}
