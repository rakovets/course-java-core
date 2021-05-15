package com.rakovets.course.java.core.practice.generic_types;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.stream.Stream;

public abstract class Math<T extends  Number> {
    public static <T extends Number> T getMaxValueOfThree(T a, T b, T c) {
        double da = a.doubleValue();
        double db = b.doubleValue();
        double dc = c.doubleValue();
        if (da >= db && da >=dc)
            return a;
        else if (db >= da && db >= dc) {
            return b;
        } else return c;
    }

    public static <T extends Number> T getMinValueOfFive(T a, T b, T c, T d, T f) {
        T min = a;
        if(min.doubleValue() > b.doubleValue()) {
            min = b;
        }
        if(min.doubleValue() > c.doubleValue()) {
            min = c;
        }
        if(min.doubleValue() > d.doubleValue()) {
            min = d;
        }
        if(min.doubleValue() > f.doubleValue()) {
            min = f;
        }
        return min;
    }

    public static <T extends Number> double getAverageMeanInArray(T[] array) {
        double sum = 0.0;
        for (T item : array) {
            sum += item.doubleValue();
        }
        double result = sum / array.length;
        return BigDecimal.valueOf(result).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static <T extends Number> T getMaxValueInArray(T[] array) {
        T min = array[0];
        for (T value : array) {
            if (value.doubleValue() < min.doubleValue()) {
                min = value;
            }
        }
        return min;
    }

    public static <T extends Number> T getMinValueInArray(T[] array) {
        T max = array[0];
        for (T value : array) {
            if (value.doubleValue() > max.doubleValue()) {
                max = value;
            }
        }
        return max;
    }
}
