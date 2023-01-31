package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public abstract class Math {
    private static Number[] array;

    public Math(Number[] array) {
        Math.array = array;
    }

    public static <T extends Number> Number getMaxFromThreeNumbers(T n1, T n2, T n3) {
        array = new Number[]{n1, n2, n3};
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static <T extends Number> Number getMinFromFiveNumbers(T n1, T n2, T n3, T n4, T n5) {
        array = new Number[]{n1, n2, n3, n4, n5};
        Arrays.sort(array);
        return array[0];
    }

    public static <T extends Number> Number getArithmeticMean(T[] array) {
        Number sum = 0;
        for (Number i : array) {
            sum = sum.intValue() + i.intValue();
        }
        return sum.intValue() / array.length;
    }

    public static <T extends Number> Number getMaxFromArray(T[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static <T extends Number> Number getMinFromArray(T[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
