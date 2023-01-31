package com.rakovets.course.java.core.practice.generics.math;

import java.util.Arrays;

public abstract class Math {
    private static Number[] arrayMath;

    private Math(Number[] arrayMath) {
        Math.arrayMath = arrayMath;
    }

    public static  <T extends Number> Number minOfFive(T e1, T e2, T e3, T e4, T e5) {
        arrayMath = new Number[5];
        arrayMath[0] = e1;
        arrayMath[1] = e2;
        arrayMath[2] = e3;
        arrayMath[3] = e4;
        arrayMath[4] = e5;

        Arrays.sort(arrayMath);

        return arrayMath[0];
    }

    public static  <T extends Number> Number maxOfThree(T e1, T e2, T e3) {
        arrayMath = new Number[3];
        arrayMath[0] = e1;
        arrayMath[1] = e2;
        arrayMath[2] = e3;

        Arrays.sort(arrayMath);

        return arrayMath[arrayMath.length - 1];
    }


    public static <T extends Number> Number avgInArray(T[] array) {
        Number result = 0;
        arrayMath = array;

        for (Number number : arrayMath) {
            result = result.doubleValue() + number.doubleValue();
        }
        result = result.doubleValue() / arrayMath.length;

        return result;
    }

    public static <T extends Number> Number maxInArray(T[] array) {
        arrayMath = array;

        Arrays.sort(arrayMath);

        return arrayMath[arrayMath.length - 1];
    }

    public static <T extends Number> Number minInArray(T[] array) {
        arrayMath = array;

        Arrays.sort(arrayMath);

        return arrayMath[0];
    }

    public static <T extends Number> Number[] bubbleSort(T[] array) {
        arrayMath = array;
        boolean isSorted = false;
        Number temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrayMath.length - 1; i++) {
                if (arrayMath[i].doubleValue() > arrayMath[i + 1].doubleValue()) {
                    isSorted = false;
                    temp = arrayMath[i];
                    arrayMath[i] = arrayMath[i + 1];
                    arrayMath[i + 1] = temp;
                }
            }
        }

        return arrayMath;
    }

    public static <T extends Number> int binarySearch(T[] array, Number elementToSearch) {
        System.arraycopy(array, 0, arrayMath, 0, array.length);
        int middleIndex;
        int firstIndex = 0;
        int lastIndex = arrayMath.length - 1;

        while (firstIndex <= lastIndex) {
            middleIndex = (firstIndex + lastIndex) / 2;
            if (arrayMath[middleIndex].doubleValue() == elementToSearch.doubleValue()) {
                return middleIndex;
            } else if (arrayMath[middleIndex].doubleValue() < elementToSearch.doubleValue()) {
                firstIndex = middleIndex + 1;
            } else if (arrayMath[middleIndex].doubleValue() > elementToSearch.doubleValue()) {
                lastIndex = middleIndex - 1;
            }
        }

        return -1;
    }
}
