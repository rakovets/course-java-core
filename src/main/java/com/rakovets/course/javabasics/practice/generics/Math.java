package com.rakovets.course.javabasics.practice.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

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

    public T getMinOf(T a, T b, T c, T d, T e) {
        LinkedList<T> array = new LinkedList<T>();
        array.add(a);
        array.add(b);
        array.add(c);
        array.add(d);
        array.add(e);
        T min = array.getFirst();
        for (int i = 1; i < array.size(); i++) {
            if (min.doubleValue() > array.get(i).doubleValue()) {
                min = array.get(i);
            }
        }
        return min;
    }


}

