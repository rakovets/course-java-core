package com.rakovets.course.javabasics.practice.generics;


import java.util.Arrays;
import java.util.LinkedList;


public class Math<T extends Number & Comparable> {


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

    public double getAverageFromArray(T[] array) {

        double avarage = 0.0;
        for (int i = 0; i < array.length; i++) {
            avarage += array[i].doubleValue() / array.length;
        }
        return avarage;
    }

    public T getMaximumFromArray(T[] array) {

        T maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maximum.compareTo(array[i]) < 0) {
                maximum = array[i];
            }
        }
        return maximum;

    }

    public T getMinimumFromArray(T[] array) {

        T minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minimum.compareTo(array[i]) > 0) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public T[] getSortedArray(T[] array) {
        Arrays.sort(array);
        return array;
    }

    public T getBinarySearch(T[] array, T key) {
        T[] sortedArray = getSortedArray(array);
        int first = 0;
        int last = array.length;
        int median = (first + last) / 2;
        T foundedValue = null;
        do {
            if (key.compareTo(sortedArray[median]) < 0) {
                last = median;
            } else {
                first = median;
            }
            median = (first + last) / 2;

            if (key.compareTo(sortedArray[median]) == 0) {
                foundedValue = key ;
            }
        }
        while (key.compareTo(sortedArray[median]) != 0 && first <= last);
        return foundedValue;
    }

}

