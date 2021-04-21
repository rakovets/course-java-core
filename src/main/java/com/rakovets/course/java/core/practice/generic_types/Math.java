package com.rakovets.course.java.core.practice.generic_types;

import static java.lang.Math.max;
import static java.lang.Math.min;

public abstract class Math {
    public static <T extends Number> T getMaxValueOfThreeNumbers(T n1, T n2, T n3) {
        double value1 = n1.doubleValue();
        double value2 = n2.doubleValue();
        double value3 = n3.doubleValue();
        double maxValue = max(value1, max(value2, value3));

        if (maxValue == value1) {
            return n1;
        } else if (maxValue == value2) {
            return n2;
        } else {
            return n3;
        }
    }

    public static  <T extends Number> T getMinValueOfFiveNumbers (T n1, T n2, T n3, T n4, T n5) {
        double value1 = n1.doubleValue();
        double value2 = n2.doubleValue();
        double value3 = n3.doubleValue();
        double value4 = n4.doubleValue();
        double value5 = n5.doubleValue();
        double minValueOfThreeNumbers = min(value1, min(value2, value3));
        double finalMinValue = min(minValueOfThreeNumbers, min(value4, value5));

        if (finalMinValue == value1) {
            return n1;
        } else if (finalMinValue == value2) {
            return n2;
        } else if (finalMinValue == value3) {
            return n3;
        } else if (finalMinValue == value4) {
            return  n4;
        } else {
            return n5;
        }
    }

    public static <T extends Number> double getArrayAverage(T[] array) {
        double sum = 0;

        for (T index : array) {
            sum += index.doubleValue();
        }
        return sum / array.length;
    }
}
