package com.rakovets.course.java.core.practice.generics;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Array<T extends Number> {
    private final T[] array;

    private int arrayLength;

    @SuppressFBWarnings("DM_DEFAULT_ENCODING")
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Constructor.
     *
     * @param array received.
     */
    @SuppressFBWarnings("EI_EXPOSE_REP2")
    public Array(T[] array) {
        this.array = array;
    }

    /**
     * Constructor.
     *
     * @param arrayLength array length.
     */
    @SuppressWarnings("unchecked")
    public Array(int arrayLength) {
        array = (T[]) new Number[arrayLength];
        this.arrayLength = arrayLength;
    }

    /**
     * Filling an array with integer values from the keyboard.
     */
    @SuppressWarnings("unchecked")
    public void arrayFillIntegers() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (T) SCANNER.nextBigInteger();
        }
    }

    /**
     * Filling an array with floating point values from the keyboard.
     */
    @SuppressWarnings("unchecked")
    public void arrayFillFloatingPoint() {
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (T) SCANNER.nextBigDecimal();
        }
    }

    /**
     * Generates random integers ranging from minimum to maximum    .
     *
     * @param minimumNumber the smallest number in the array.
     * @param maximumNumber the largest number in the array.
     */
    @SuppressWarnings("unchecked")
    public void arrayFillRandomInters(int minimumNumber, int maximumNumber) {
        Random random = new Random();

        String minimum = Integer.toString(minimumNumber);
        String maximum = Integer.toString(maximumNumber + 1);

        BigInteger bigIntegerMinimum = new BigInteger(minimum);
        BigInteger bigIntegerMaximum = new BigInteger(maximum);

        int length = bigIntegerMaximum.bitLength();

        for (int i = 0; i < arrayLength; i++) {
            BigInteger number = new BigInteger(length, random);
            if (number.compareTo(bigIntegerMinimum) < 0) {
                number = number.add(bigIntegerMinimum);
            } else if (number.compareTo(bigIntegerMaximum) >= 0) {
                number = number.mod(bigIntegerMaximum).add(bigIntegerMinimum);
            }
            array[i] = (T) number;
        }
    }

    /**
     * Finds the maximum value in an array.
     *
     * @return maximum value.
     */
    public T getMaximumNumber() {
        return Math.getMaximumNumber(array);
    }

    /**
     * Finds the minimum value in an array.
     *
     * @return minimum value.
     */
    public T getMinimumNumber() {
        return Math.getMinimumNumber(array);
    }

    /**
     * Finds the arithmetic mean of the numbers in an array.
     *
     * @return arithmetical mean.
     */
    public double getAverage() {
        return Math.getAverage(array);
    }

    /**
     * Sorts the array in ascending order.
     *
     * @return sorted array.
     */
    public T[] sortAscending() {
        return Math.selectionSort(array);
    }

    /**
     * Sorts an array in descending order.
     * <p> Calculates the middle of the array - array. length / 2.
     * Iterates over the elements of the array from the beginning to the middle and simultaneously
     * swaps the elements with index i and array. length - i - 1.
     *
     * @return sorted array.
     */
    @SuppressFBWarnings("EI_EXPOSE_REP")
    public T[] descendingSorting() {
        Math.selectionSort(array);

        for (int i = 0; i < array.length / 2; i++) {
            T sort = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = sort;
        }
        return array;
    }

    /**
     * Method of binary search in an array using the "jumping search" algorithm.
     * <p> The array is being sorted.
     * <p> See description in class Math.
     *
     * @param value the value to search.
     * @return the position of the found element. If the return value is -1,
     * then the required element is not in the array.
     */
    public int jumpSearch(T value) {
        Math.selectionSort(array);

        return Math.jumpSearch(array, value);
    }

    /**
     * Replaces a value in an array with a new value.
     *
     * @param value new value.
     * @param index value index.
     */
    public void replace(T value, int index) {
        Math.selectionSort(array);

        array[index] = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Array)) {
            return false;
        }
        Array<?> array1 = (Array<?>) o;

        return arrayLength == array1.arrayLength && Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(arrayLength);
        result = 31 * result + Arrays.hashCode(array);

        return result;
    }

    @Override
    public String toString() {
        return "array " + Arrays.toString(array);
    }
}
