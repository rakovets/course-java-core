package com.rakovets.course.java.core.practice.generic_types;

public class Array <T extends Number> {

    private T[] array;

    public Array(T[] array) {
        this.array = array;
    }

    public static <T extends Number> double getAverage(T[] myArray) {
        double sum = 0;
        int i = 0;
        for ( ; i < myArray.length; i++) {
            sum += myArray[i].doubleValue();
        }
        return sum / i;
    }



}
