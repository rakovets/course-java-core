package com.rakovets.course.java.core.practice.generics.project_math;

import java.util.Arrays;

public abstract class Math<T extends Number> {
    private T[] array;

    public Math(T[] array) {
        this.array = array;
    }

    public static <T extends Number> T getMaximumFromThreeParameters(T t1, T t2, T t3) {
        T maxValue = t1;
        if (maxValue.doubleValue() < t2.doubleValue()) {
            maxValue = t2;
        }
        if (maxValue.doubleValue() < t3.doubleValue()) {
            maxValue = t3;
        }
        return maxValue;
    }

    public static <T extends Number> T getMinFromFiveParameters(T t1, T t2, T t3, T t4, T t5) {
        T minValue = t1;
        if (minValue.doubleValue() > t2.doubleValue()) {
            minValue = t2;
        }
        if (minValue.doubleValue() > t3.doubleValue()) {
            minValue = t3;
        }
        if (minValue.doubleValue() > t4.doubleValue()) {
            minValue = t4;
        }
        if (minValue.doubleValue() > t5.doubleValue()) {
            minValue = t5;
        }
        return minValue;
    }

    public static <T extends Number> double getAverageValueOfArray(T[] array) {
        double averageValueOfArray = 0.0d;
        for (T t : array) {
            averageValueOfArray += t.doubleValue();
        }
        return averageValueOfArray / array.length;
    }

    public static <T extends Number> T getMinArrayValue(T[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static <T extends Number> T getMaxArrayValue(T[] array) {
        Arrays.sort(array);
        return array[(array.length - 1)];
    }

    public T[] getArray() {
        return this.array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}
