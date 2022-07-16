package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Array<T> {
    private final Number[] array;
    private final int arrayLength;

    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    /**
     * Constructor.
     *
     * @param arrayLength array length.
     */
    public Array(int arrayLength) {
        array = new Number[arrayLength];
        this.arrayLength = arrayLength;
    }

    /**
     * Additional constructor.
     *
     * @param array       passed array.
     * @param arrayLength array length.
     */
    public Array(T[] array, int arrayLength) {
        this.array = (Number[]) array;
        this.arrayLength = arrayLength;
    }


    /**
     * Filling an array with integer values from the keyboard.
     */
    public void arrayFillIntegers() {
        for (int i = 0; i < arrayLength; i++) {
            this.array[i] = scanner.nextBigInteger();
        }
    }

    /**
     * Filling an array with floating point values from the keyboard.
     */
    public void arrayFillFloatingPoint() {
        for (int i = 0; i < arrayLength; i++) {
            this.array[i] = scanner.nextBigDecimal();
        }
    }

    /**
     * Fills an array with random integers.
     */
    public void arrayFillRandomInters() {
        for (int i = 0; i < arrayLength; i++) {
            this.array[i] = random.nextInt();
        }
    }

    /**
     * Fills an array with random integers from 0 to the given value.
     *
     * @param size the maximum value is from 0 to size.
     */
    public void arrayFillRandomInters(int size) {
        for (int i = 0; i < arrayLength; i++) {
            this.array[i] = random.nextInt(size);
        }
    }

    /**
     * Fills an array with random floating point numbers.
     */
    public void arrayFillRandomFloatingPoint() {
        for (int i = 0; i < arrayLength; i++) {
            this.array[i] = random.nextDouble();
        }
    }

    /**
     * Prints the contents of the array.
     *
     * @return the contents of the array as a string.
     */
    public String printArray() {
        return "array " + Arrays.toString(getArray());
    }

    /**
     * Prints the contents of the array.
     *
     * @param array array to print.
     * @param <T>   generic data type.
     * @return the contents of the array as a string.
     */
    public static <T extends Number> String printArray(T[] array) {
        return "array " + Arrays.toString(array);
    }

    /**
     * Finds the maximum value in an array.
     *
     * @return maximum value.
     */
    public Number getMaximumNumber() {
        return Math.getMaximumNumber(this.array);
    }

    /**
     * Finds the maximum value in an array.
     *
     * @param array for finding the maximum value.
     * @param <T>   generic data type.
     * @return maximum parameter.
     */
    public static <T extends Number> T getMaximumNumber(T[] array) {
        return Math.getMaximumNumber(array);
    }

    /**
     * Finds the minimum value in an array.
     *
     * @return minimum value.
     */
    public Number getMinimumNumber() {
        return Math.getMinimumNumber(this.array);
    }

    /**
     * Finds the minimum value in an array.
     *
     * @param array for finding the minimum value.
     * @param <T>   generic data type.
     * @return minimum parameter.
     */
    public static <T extends Number> T getMinimumNumber(T[] array) {
        return Math.getMinimumNumber(array);
    }

    /**
     * Finds the arithmetic mean of the numbers in an array.
     *
     * @return arithmetical mean.
     */
    public Number getAverage() {
        return Math.getAverage(this.array);
    }

    /**
     * Finds the arithmetic mean of the numbers in an array.
     *
     * @param array for finding the arithmetic mean value.
     * @param <T>   generic data type.
     * @return arithmetic mean of numbers from the array.
     */
    public static <T extends Number> double getAverage(T[] array) {
        return Math.getAverage(array);
    }

    /**
     * Sorts the array in ascending order.
     *
     * @return sorted array.
     */
    public Number[] sortAscending() {
        return Math.selectionSort(this.array);
    }

    /**
     * Sorts the array in ascending order.
     *
     * @param array for sorting.
     * @param <T>   generic data type.
     * @return sorted array.
     */
    public static <T extends Number> T[] sortAscending(T[] array) {
        return Math.selectionSort(array);
    }

    /**
     * Sorts an array in descending order.
     * <p>Calculates the middle of the array - array. length / 2.
     * Iterates over the elements of the array from the beginning to the middle and simultaneously
     * swaps the elements with index i and array. length - i - 1.
     *
     * @return sorted array.
     */
    public Number[] descendingSorting() {
        Math.selectionSort(this.array);

        for (int i = 0; i < arrayLength / 2; i++) {
            Number sort = this.array[i];
            this.array[i] = this.array[arrayLength - i - 1];
            this.array[arrayLength - i - 1] = sort;
        }
        return this.array;
    }

    /**
     * Sorts an array in descending order.
     * <p>Calculates the middle of the array - array. length / 2.
     * Iterates over the elements of the array from the beginning to the middle and simultaneously
     * swaps the elements with index i and array. length - i - 1.
     *
     * @param array for sorting.
     * @param <T>   generic data type.
     * @return sorted array.
     */
    public static <T extends Number> T[] descendingSorting(T[] array) {
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
     * <p>See description in class Math.
     *
     * @param value the value to search.
     * @return the position of the found element. If the return value is -1,
     * then the required element is not in the array.
     */
    public int jumpSearch(Number value) {
        Math.selectionSort(array);

        return Math.jumpSearch(array, value);
    }

    /**
     * Method of binary search in an array using the "jumping search" algorithm.
     * <p> The array is being sorted.
     * <p>See description in class Math.
     *
     * @param array array to look up the value.
     * @param value the value to look up in the array.
     * @return the position of the found element. If the return value is -1,
     * then the required element is not in the array.
     */
    public static <T extends Number> int jumpSearch(T[] array, T value) {
        Math.selectionSort(array);

        return Math.jumpSearch(array, value);
    }

    /**
     * Replaces a value in an array with a new value.
     *
     * @param value new value.
     * @param index value index.
     * @return the current array after the replacement.
     */
    public Number[] replace(Number value, int index) {
        Math.selectionSort(array);

        array[index] = value;

        return array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Array<?> array1 = (Array<?>) o;

        return arrayLength == array1.arrayLength && Arrays.equals(array, array1.array) && scanner.equals(array1.scanner) && random.equals(array1.random);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(arrayLength, scanner, random);
        result = 31 * result + Arrays.hashCode(array);

        return result;
    }

    @Override
    public String toString() {
        return "array " + Arrays.toString(getArray());
    }

    public Number[] getArray() {
        return array;
    }
}
