package com.rakovets.course.java.core.practice.generic_types;

public abstract class Math {
    public static <T extends Number> T getMaxOfThreeNumbers(T x, T y, T z) {
        double max = java.lang.Math.max(x.doubleValue(), (java.lang.Math.max(y.doubleValue(), z.doubleValue())));
        if (max == x.doubleValue()) {
            return x;
        } else if (max == y.doubleValue()) {
            return y;
        }
        return z;
    }

    public static <T extends Number> T getMinOfFiveNumbers(T x, T y, T z, T p, T n) {
        double firstMin = java.lang.Math.min(x.doubleValue(), java.lang.Math.min(y.doubleValue(), z.doubleValue()));
        double lastMin = java.lang.Math.min(firstMin, java.lang.Math.min(p.doubleValue(), n.doubleValue()));
        if (lastMin == x.doubleValue()) {
            return x;
        } else if (lastMin == y.doubleValue()) {
            return y;
        } else if (lastMin == z.doubleValue()) {
            return z;
        } else if (lastMin == p.doubleValue()) {
            return p;
        }
        return n;
    }

    public static <T extends Number> double getAverage(T[] myArray) {
        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i].doubleValue();
        }
        return sum / myArray.length;
    }

    public static <T extends Number> T getMaxOfArray(T[] myArray) {
        double max = myArray[0].doubleValue();
        int index = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i].doubleValue() > max) {
                max = myArray[i].doubleValue();
                index = i;
            }
        }
        return myArray[index];
    }

    public static <T extends Number> T getMinOfArray(T[] myArray) {
        double min = myArray[0].doubleValue();
        int index = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i].doubleValue() < min) {
                min = myArray[i].doubleValue();
                index = i;
            }
        }
        return myArray[index];
    }

    public static <T extends Number> T[] sortArray(T[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j].doubleValue() < myArray[minIndex].doubleValue()) {
                    minIndex = j;
                }
            }
            T temp = myArray[i];
            myArray[i] = myArray[minIndex];
            myArray[minIndex] = temp;
        }
        return myArray;
    }


}
