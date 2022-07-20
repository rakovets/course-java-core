package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exception.IncorrectValuesWhenWorkingWithAnArrayException;

import java.util.Random;

public class Task05 {
    private static final Random RANDOM = new Random();

    /**
     * Fills an array with random numbers.
     * <li>The method gets the length value for the new array.
     * <li> The method displays the value from the array by its index.
     *
     * @param index  the index of the array to display.
     * @param number received array length value.
     * @return value from the array by its index.
     * @throws IncorrectValuesWhenWorkingWithAnArrayException displays the text
     *                                                        about the error when the array is incorrectly processed.
     */
    public String getIndexArray(int index, int number) throws IncorrectValuesWhenWorkingWithAnArrayException {
        int maximumNegativeNumber = 0;

        int[] array;

        try {
            if (number <= maximumNegativeNumber) {
                throw new NegativeArraySizeException();
            }
            array = new int[number];
            for (int i = 0; i < array.length; i++) {
                array[i] = RANDOM.nextInt();
            }
        } catch (NegativeArraySizeException e) {
            throw new IncorrectValuesWhenWorkingWithAnArrayException("IncorrectValuesWhenWorkingWithAnArray");
        }
        return String.valueOf(array[index]);
    }
}
