package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Math <T> An array that stores objects of a numeric type
 */
public abstract class Math<T extends Number> {
    public static <T extends Number> Number getMaxArgument(T a, T b, T c) {
        Number result = java.lang.Math.max(java.lang.Math.max(a.doubleValue(), b.doubleValue()), c.doubleValue());
        if (a.getClass() == Integer.class) {
            result = result.intValue();
        } else if ((a.getClass() == Float.class)) {
            result = result.floatValue();
        } else if ((a.getClass() == Long.class)) {
            result = result.longValue();
        }
        return result;
    }

    public static <T extends Number> Number getMaxArgumentUseArray(T a, T b, T c) {
        return getMaxArray(new Number[]{a, b, c});
    }

    public static <T extends Number> Number getMinArgumentUseArray(T a, T b, T c, T d, T e) {
        return getMinArray(new Number[]{a, b, c, d, e});
    }

    public static <T extends Number> float getAverageArray(T[] array) {
        float count = array.length;
        float sum = 0.0f;
        if (count > 0) {
            for (T arr : array) {
                sum += arr.floatValue();
            }
        }
        return sum / array.length;
    }

    public static <T extends Number> T getMaxArray(T[] array) {
        Arrays.sort(array, Collections.reverseOrder());
        return array[0];
    }

    public static <T extends Number> T getMinArray(T[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
