package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exception.IncorrectValuesWhenWorkingWithAnArrayException;

public class Task04 {
    /**
     * Gets the value from the array at its index.
     * <p> If the value is 1, an error is returned.
     *
     * @param index index of the number in the array.
     * @return the number value of the received index.
     * @throws ArrayIndexOutOfBoundsException returns an error if the index is invalid.
     */
    public String getIndexArray(int index, int[] array) throws IncorrectValuesWhenWorkingWithAnArrayException {
        int exceptionNumber = 0;

        if (index < exceptionNumber) {
            throw new IncorrectValuesWhenWorkingWithAnArrayException("IncorrectValuesWhenWorkingWithAnArray");
        }
        return "numbers[" + index + "] = " + array[index];
    }
}
