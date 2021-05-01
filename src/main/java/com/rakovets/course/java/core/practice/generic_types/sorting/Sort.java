package com.rakovets.course.java.core.practice.generic_types.sorting;

public class Sort {

    public  static <T extends Number> void swap(T[] array, int firstElement, int secondElement) {
        T bubble = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = bubble;
    }
}
