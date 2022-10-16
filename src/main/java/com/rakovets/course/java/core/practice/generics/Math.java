package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

class Math<T extends Number> {
    public static <T> T maxNumber(T numberOne, T numberTwo, T numberThree) {
        Object arrayNumbers[] = new Object[]{numberOne, numberTwo, numberThree};
        Arrays.sort(arrayNumbers);
        return (T) arrayNumbers[arrayNumbers.length - 1];
    }

    public static <T> T minNumber(T numberOne, T numberTwo, T numberThree, T numberFour, T numberFive) {
        Object arrayNumbers[] = new Object[]{numberOne, numberTwo, numberThree, numberFour, numberFive};
        Arrays.sort(arrayNumbers);
        return (T) arrayNumbers[0];
    }

    public static <T extends Number> double average(T[] array) {
        double sum = 0.0;
        for (T arrayNumber : array) {
            sum += arrayNumber.doubleValue();
        }
        return sum / array.length;
    }

    public static <T> T maxNumberInArray(T[] array) {
        Arrays.sort(array);
        return (T) array[array.length - 1];
    }

    public static <T> T minNumberInArray(T[] array) {
        Arrays.sort(array);
        return (T) array[0];
    }
}
