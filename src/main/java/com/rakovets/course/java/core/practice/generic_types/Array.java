package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array<T> {
    private final Number[] array;
    private final int count;

    public Array() {
        array = new Number[5];
        count = 5;
    }

    // filling array
    public void fillArray() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            array[i] = in.nextInt();
        }
    }

    // filling array with random numbers
    public void random() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (new Random()).nextInt();
        }
    }

    // display array
    public void display() {
        System.out.println(Arrays.toString(array));
    }

    // finding the maximum value
    @SuppressWarnings("unchecked")
    public <Number extends Comparable<Number>> Number maxValue() {
        Number maxValue = (Number) array[0];
        for (java.lang.Number value : array) {
            if (maxValue.compareTo((Number) value) < 0)
                maxValue = (Number) value;
            }
        return maxValue;
    }

    // finding the minimum value
    @SuppressWarnings("unchecked")
    public <Number extends Comparable<Number>> Number minValue() {
        Number minValue = (Number) array[0];
        for (java.lang.Number value : array) {
            if (minValue.compareTo((Number) value) > 0)
                minValue = (Number) value;
        }
        return minValue;
    }

    // finding the average value
    public double averageValue() {
        double averageValue = 0;
        for (Number value : array) {
            averageValue += value.doubleValue() / array.length;
        }
        return averageValue;
    }

    // sorting array in ascending order
    public Number[] ascendingOrder() {
        Arrays.sort(array);
        return (array);
    }

    // sorting array in descending order
    public Number[] descendingOrder() {
        Arrays.sort(array);
        int last = array.length - 1;
        int middle = array.length / 2;
        for (int i = 0; i <= middle; i++) {
            Number temp = array[i];
            array[i] = array[last - i];
            array[last - i] = temp;
        }
        return array;
    }

    // searching for a value in array using binary search
    public int binarySearch(Number element) {
        return Arrays.binarySearch(array, element);
    }

    // replacing a value in array with a new value
    public Number[] changeVariable(int index, Number value) {
        array[index] = value;
        return array;
    }
}
