package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exception.IndexOutOfBoundsException;

public class Task04 {
    /**
     * Gets the value from the array at its index.
     * <p> If the value is 1, an error is returned.
     *
     * @param index index of the number in the array.
     * @return the number value of the received index.
     * @throws IndexOutOfBoundsException returns an error if the index is invalid.
     */
    public static String getIndexArray(int index, int[] array) throws IndexOutOfBoundsException {
        final int EXCEPTION_NUMBER = 1;

        if (index == EXCEPTION_NUMBER) {
            throw new IndexOutOfBoundsException();
        }
        return "numbers[" + index + "] = " + array[index];
    }
}
