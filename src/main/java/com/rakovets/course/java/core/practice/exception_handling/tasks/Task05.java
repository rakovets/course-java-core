package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exception.IncorrectValuesWhenWorkingWithAnArray;

import java.util.Random;

public class Task05 {
    /**
     * Fills an array with random numbers.
     * <li>The method gets the length value for the new array.
     * <li> The method displays the value from the array by its index.
     *
     * @param index  the index of the array to display.
     * @param number received array length value.
     * @return value from the array by its index.
     * @throws IncorrectValuesWhenWorkingWithAnArray displays the text
     *                                               about the error when the array is incorrectly processed.
     */
    public static String getIndexArray(int index, int number) throws IncorrectValuesWhenWorkingWithAnArray {
        final int MAXIMUM_NEGATIVE_NUMBER = 0;

        int[] array;

        Random random = new Random();

        try {
            if (number <= MAXIMUM_NEGATIVE_NUMBER) {
                throw new NegativeArraySizeException();
            }
            array = new int[number];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt();
            }
        } catch (NegativeArraySizeException e) {
            throw new IncorrectValuesWhenWorkingWithAnArray(e.getMessage());
        }
        return String.valueOf(array[index]);
    }
}
