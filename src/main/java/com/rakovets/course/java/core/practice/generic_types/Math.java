package com.rakovets.course.java.core.practice.generic_types;

import java.net.PortUnreachableException;
import java.util.Objects;

public abstract class Math {
    public static Number findMax(Number a, Number b, Number c) {
        double fN = a.doubleValue();
        double sN = b.doubleValue();
        double tN = c.doubleValue();
        return java.lang.Math.max(java.lang.Math.max(fN, sN), tN);
    }

    public static Number findMin(Number a, Number b, Number c, Number d, Number e){
        Number[] number = new Number[] {a, b, c, d, e};
        Number min = number[0];
        for (var iterator: number) {
            if (iterator.doubleValue() < min.doubleValue()) {
                min = iterator;
            }
        }
        return min;
    }

    public static Number findAverage(Number[] array) {
        double average = 0;
        for (var iterator: array) {
            average += iterator.doubleValue();
        }
        return average / array.length;
    }

    public static Number findMax(Number[] array) {
        double max =  array[0].doubleValue();
        for (var iterator: array) {
            if (iterator.doubleValue() > max) {
                max = iterator.doubleValue();
            }
        }
        return max;
    }

    public static Number findMin(Number[] array) {
        double min = array[0].doubleValue();
        for (var iterator: array) {
            if (iterator.doubleValue() < min) {
                min = iterator.doubleValue();
            }
        }
        return min;
    }

    public static Number[] sort(Number[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].doubleValue() > array[j].doubleValue()) {
                    Number tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public static int searchBinary(Number[] array, int startElement, int finishElement, Number searchElement) {
        if (finishElement > array.length) {
            throw new IndexOutOfBoundsException();
        }
        if (finishElement >= startElement) {
            int indexMid = startElement + (finishElement - startElement) / 2;

            if (array[indexMid].doubleValue() == searchElement.doubleValue()) {
                return indexMid;
            }

            if (array[indexMid].doubleValue() > searchElement.doubleValue()) {
                return searchBinary(array, startElement, indexMid - 1, searchElement);
            }

            return searchBinary(array, indexMid + 1, finishElement, searchElement);
        }
        return -1;
    }
}
