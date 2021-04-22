package com.rakovets.course.java.core.practice.generic_types;

import static java.util.Arrays.sort;



public abstract class Math {
    public static Number getMaxValueOfThree(Number a, Number b, Number c) {
        double da = a.doubleValue();
        double db = b.doubleValue();
        double dc = c.doubleValue();
        if (da > db && da > db) {
            return a;
        } else if (db > da && db > dc) {
            return b;
        } else {
            return c;
        }
    }

    public static Number getMinValueOfFive(Number a, Number b, Number c, Number d, Number f) {
        double da = a.doubleValue();
        double db = b.doubleValue();
        double dc = c.doubleValue();
        double dd = d.doubleValue();
        double df = d.doubleValue();

        double[] array = new double[]{da, db, dc, dd, df};
        sort(array);
        Number result = array[0];
        return result;
    }

    public static Number getArithmeticMeanInArray(Number[] array) {
        Double sum = 0.0;
        for (Number item : array) {
            sum += (item).doubleValue();
        }
        Number average = sum / array.length;
        return average;
    }

    public static Number getMaxValueInArray(Number[] array) {
        sort(array);
        Number result = array[array.length - 1];
        return result;
    }

    public static Number getMinValueInArray(Number[] array) {
        sort(array);
        Number result = array[0];
        return result;
    }
}


