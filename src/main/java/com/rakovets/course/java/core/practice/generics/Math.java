package com.rakovets.course.java.core.practice.generics;

public interface Math {
    /**
     * Finds the maximum value (numeric) from the passed data.
     *
     * @param numbers passed parameters.
     * @param <T>     generic data type.
     * @return maximum parameter.
     */
    @SafeVarargs
    static <T extends Number> T getMaximumNumber(T... numbers) {
        Math.selectionSort(numbers);

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
    static <T extends Number> T getMinimumNumber(T... numbers) {
        Math.selectionSort(numbers);

        return numbers[0];
    }

    /**
     * Finds the arithmetic mean of the numbers in an array.
     *
     * @param numbers passed parameters.
     * @param <T>     generic data type.
     * @return arithmetical mean.
     */
    static <T extends Number> double getAverage(T[] numbers) {
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
    static <T extends Number> T getMaximumNumberInArray(T[] numbers) {
        return getMaximumNumber(numbers);
    }

    /**
     * Finds the minimum value in an array.
     *
     * @param numbers passed parameters.
     * @param <T>     generic data type.
     * @return the minimum value in the array.
     */
    static <T extends Number> T getMinimumNumberInArray(T[] numbers) {
        return getMinimumNumber(numbers);
    }

    /**
     * Sorting an array using the "selection sort" method.
     * <li> Lines 84 - 94 in cycle move the boundary of an unsorted sub-array in turn.
     * <li> Lines 86 - 90 in cycle finds the minimum element in an unsorted array
     * <li> Lines 91 - 93 within the first cycle we do a swap of the found minimal element with the first element.
     * <p>
     *
     * @param array the array to be sorted.
     * @param <T>   generic data type.
     * @return sorted array.
     */
    static <T extends Number> T[] selectionSort(T[] array) {
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
     * <li> Sorting an array of strings 118.
     * <li> On line 121, jumpStep contains the size of the square root of the length of the array.
     * <li> Lines 124 - 130 in a loop, we jump forward step by step with the value from the variable jumpStep
     * until we find an element that is greater than or equal to the element we are looking for.
     * <li> Lines 127 - 129 inside the loop, if we went beyond the array,
     * then the element we need is not in the array.
     * <li> Lines 131 - 136, when the condition is true,
     * performs a linear search between the [previousStep] array and the [jumpStep] array or greater.
     * <li> Lines 133 - 135, if the value matches array[previousStep], returns the array position of the desired element.
     * <p>
     *
     * @param array array to look up the value.
     * @param value the value to look up in the array.
     * @param <T>   generic data type.
     * @return the position of the found element. If the return value is -1,
     * then the required element is not in the array.
     */
    static <T extends Number> int jumpSearch(T[] array, T value) {
        Math.selectionSort(array);

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
