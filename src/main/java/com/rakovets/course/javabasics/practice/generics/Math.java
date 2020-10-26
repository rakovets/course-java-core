package com.rakovets.course.javabasics.practice.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Math<T extends Number> {


    public T getMaxOf(T a, T b, T c) {

        if (a.doubleValue() > b.doubleValue() && b.doubleValue() > c.doubleValue()) {
            return a;
        } else if (a.doubleValue() > c.doubleValue() && c.doubleValue() > b.doubleValue()) {
            return a;
        } else if (b.doubleValue() > c.doubleValue() && c.doubleValue() > a.doubleValue()) {
            return b;
        } else if (b.doubleValue() > a.doubleValue() && a.doubleValue() > c.doubleValue()) {
            return b;
        } else if (c.doubleValue() > a.doubleValue() && a.doubleValue() > b.doubleValue()) {
            return c;
        } else if (c.doubleValue() > b.doubleValue() && b.doubleValue() > a.doubleValue()) {
            return c;
        }
        return null;

    }

    public double getMinOf(T a, T b, T c, T d, T e) {
        double[] array = new double[5];
        array[0] = a.doubleValue();
        array[1] = b.doubleValue();
        array[2] = c.doubleValue();
        array[3] = d.doubleValue();
        array[4] = e.doubleValue();
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        } return min;
    }


}

