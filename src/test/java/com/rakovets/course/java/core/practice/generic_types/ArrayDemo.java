package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;

class ArrayDemo {
    public static void main(String[] args) {

        Array<Integer> array = new Array<>();

        System.out.println("Random array");
        array.random();
        array.display();

        array.maxValue();
        System.out.println("Maximum value: " + array.maxValue());

        array.minValue();
        System.out.println("Minimum value: " + array.minValue());

        array.averageValue();
        System.out.println("Average value: " + array.averageValue());

        array.ascendingOrder();
        System.out.println("Sorted array in ascending order: " + Arrays.toString(array.ascendingOrder()));

        array.descendingOrder();
        System.out.println("Sorted array in descending order: " + Arrays.toString(array.descendingOrder()));

        array.binarySearch(10);
        System.out.println("Binary search: " + array.binarySearch(10));

        array.changeVariable(2, 10);
        System.out.println("Change variable: " + Arrays.toString(array.changeVariable(2, 10)));
    }
}
