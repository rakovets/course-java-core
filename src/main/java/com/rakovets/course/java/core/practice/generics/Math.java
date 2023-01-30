package com.rakovets.course.java.core.practice.generics;

public abstract class Math<T extends Number> {
    T[] array;

    Math(T[] array) {
        this.array = array;
    }

    public static <T extends Number> T findMax(T[] someArray) {
        T max = someArray[0];
        for (int i = 1; i < someArray.length; i++) {
            if (someArray[i].doubleValue() > max.doubleValue()) {
                max = someArray[i];
            }
        }
        return max;
    }

    public static <T extends Number> T findMin(T[] someArray) {
        T min = someArray[0];
        for (T element : someArray) {
            if (element.doubleValue() < min.doubleValue()) {
                min = element;
            }
        }
        return min;
    }

    /*public static <T extends Number> T calculateMean(Math<?> someArray) {
        int count = 0;
        T sum = ;
        for (T element : someArray) {
             sum += element.doubleValue();
             count++;
        }
        return sum/count;
    }*/
}
