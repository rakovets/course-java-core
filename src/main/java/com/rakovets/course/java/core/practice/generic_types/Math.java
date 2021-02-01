package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;

public abstract class Math {
    // Task 1
    public static <K extends Number> K getMax(K x, K y, K z) {
        double ex = x.doubleValue();
        double ey = y.doubleValue();
        double ez = z.doubleValue();
        double result = java.lang.Math.max(ez, java.lang.Math.max(ex, ey));

        if (result == ex) {
            return x;
        } else if (result == ey) {
            return y;
        } else {
            return z;
        }
    }

    // Task 2
    public static <N extends Number> N getMin(N a, N b, N c, N d, N e) {
        double ad = a.doubleValue();
        double bd = b.doubleValue();
        double cd = c.doubleValue();
        double dd = d.doubleValue();
        double ed = e.doubleValue();

        double calculation = java.lang.Math.min(ad, java.lang.Math.min(bd, cd));
        double result = java.lang.Math.min(calculation, java.lang.Math.min(dd, ed));

        if (result == ad) {
            return a;
        } else if (result == bd) {
            return b;
        } else if (result == cd) {
            return c;
        } else if (result == dd) {
            return d;
        } else {
            return e;
        }
    }

    // Task 3
    public static <N extends Number> double getAverage(N[] array) {
        double sum = 0;

        for (N arrayMember : array) {
            sum += arrayMember.doubleValue();
        }
        return sum / array.length;
    }

    // Task 4
    public static <N extends Number> N getMaxFromArray(N[] array) {
        N[] calculationArray = array;
        Arrays.sort(calculationArray);

        return calculationArray[calculationArray.length - 1];
    }

    // Task 5
    public static <N extends Number> N getMinFromArray(N[] array) {
        N[] calculationArray = array;
        Arrays.sort(calculationArray);

        return calculationArray[0];
    }

    // Task 6
    public static <N extends Number> N[] sortGenericArray(N[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].doubleValue() > array[j + 1].doubleValue()) {
                    N auxiliary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliary;
                }
            }
        }
        return array;
    }

    // Task 7
    public static <N extends Number> int getIndexBinarySearchArray(N[] array, N key) {
        if (array == null || key == null) {
            return -1;
        }

        if (key.doubleValue() > array[array.length - 1].doubleValue() || key.doubleValue() < array[0].doubleValue()) {
            return -1;
        }

        int firstLimit = 0;
        int lastLimit = array.length - 1;

        while(lastLimit >= firstLimit) {
            int middleIndex = (firstLimit + lastLimit) / 2;

            if (array[middleIndex].doubleValue() == key.doubleValue()) {
                return middleIndex;
            } else if (array[middleIndex].doubleValue() < key.doubleValue()) {
                firstLimit = middleIndex + 1;
            } else if (array[middleIndex].doubleValue() > key.doubleValue()) {
                lastLimit = middleIndex - 1;
            }
        }
        return -1;
    }
}
