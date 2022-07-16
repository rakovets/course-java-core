package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public abstract class Math {
    /**
     * Finds the maximum value (numeric) from the passed data.
     *
     * @param numbers passed parameters.
     * @param <T>     generic data type.
     * @return maximum parameter.
     */
    @SafeVarargs
    public static <T extends Number> T getMaximumNumber(T... numbers) {
        Arrays.sort(numbers);

        return numbers[numbers.length - 1];
    }

    /**
     * Finds the minimum value (numeric) from the passed data.
     *
     * @param numbers passed parameters.
     * @param <T>     generic data type.
     * @return minimum parameter.
     */
    @SafeVarargs
    public static <T extends Number> T getMinimumNumber(T... numbers) {
        Arrays.sort(numbers);

        return numbers[0];
    }

    /**
     * Finds the arithmetic mean of the numbers in an array.
     *
     * @param numbers passed parameters.
     * @param <T>     generic data type.
     * @return arithmetical mean.
     */
    public static <T extends Number> double getAverage(T[] numbers) {
        double sum = 0.0;

        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.length;
    }

    /**
     * Finds the maximum value in an array.
     *
     * @param numbers passed parameters.
     * @param <T>     generic data type.
     * @return the maximum value in the array.
     */
    public static <T extends Number> T getMaximumNumberInArray(T[] numbers) {
        return getMaximumNumber(numbers);
    }

    /**
     * Finds the minimum value in an array.
     *
     * @param numbers passed parameters.
     * @param <T>     generic data type.
     * @return the minimum value in the array.
     */
    public static <T extends Number> T getMinimumNumberInArray(T[] numbers) {
        return getMinimumNumber(numbers);
    }

    /**
     * Sorting an array using the "selection sort" method.
     * <li> Lines 86 - 96 in cycle move the boundary of an unsorted subarray in turn.
     * <li> Lines 88 - 92 in cycle finds the minimum element in an unsorted array
     * <li> Lines 93 - 95 within the first cycle we do a swap of the found minimal element with the first element.
     * <p>
     *
     * @param array the array to be sorted.
     * @param <T>   generic data type.
     * @return sorted array.
     */
    public static <T extends Number> T[] selectionSort(T[] array) {
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength - 1; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[j].doubleValue() < array[minimumIndex].doubleValue()) {
                    minimumIndex = j;
                }
            }
            T sort = array[minimumIndex];
            array[minimumIndex] = array[i];
            array[i] = sort;
        }
        return array;
    }

    /**
     * Method of binary search in an array using the "jumping search" algorithm.
     * <li> Line 120 array sorting.
     * <li> Line 123 variable jumpStep contains the size of the square root of the length of the array.
     * <li> Lines 126 - 132 in a loop, we jump forward step by step with the value from the jumpStep variable
     * until we find an element that is greater than or equal to the element we are looking for.
     * <li> Lines 129 - 131 inside the loop, if we went beyond the array,
     * then the element we need is not in the array.
     * <li> Lines 133 - 138 when array[previousStep].doubleValue() < value.doubleValue()
     * performs a linear search between array[previousStep] and array[jumpStep] or element greater than T.
     * <li> Lines 135 - 137 if value matches array[previousStep] return the position in the array under the value T.
     * <p>
     *
     * @param array array to look up the value.
     * @param value the value to look up in the array.
     * @param <T>   generic data type.
     * @return the position of the found element. If the return value is -1,
     * then the required element is not in the array.
     */
    public static <T extends Number> int jumpSearch(T[] array, T value) {
        selectionSort(array);

        int arrayLength = array.length;
        int jumpStep = (int) java.lang.Math.sqrt(array.length);
        int previousStep = 0;

        while (array[java.lang.Math.min(jumpStep, arrayLength) - 1].doubleValue() < value.doubleValue()) {
            previousStep = jumpStep;
            jumpStep += (int) (java.lang.Math.sqrt(arrayLength));
            if (previousStep >= arrayLength) {
                return -1;
            }
        }
        while (array[previousStep].doubleValue() < value.doubleValue()) {
            previousStep++;
            if (previousStep == java.lang.Math.min(jumpStep, arrayLength)) {
                return -1;
            }
        }
        if (array[previousStep].equals(value)) {
            return previousStep;
        }
        return -1;
    }
}
