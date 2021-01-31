package com.rakovets.course.java.core.practice.generic_types;

public abstract class Math {
    public static <T extends Number> double getMaxOf3numbers(T x, T y, T z) {
        return java.lang.Math.max(x.doubleValue(), (java.lang.Math.max(y.doubleValue(), z.doubleValue())));
    }

    public static <T extends Number> double getMinOf5numbers(T x, T y, T z, T p, T n) {
        double num1 = x.doubleValue();
        double num2 = y.doubleValue();
        double num3 = z.doubleValue();
        double num4 = p.doubleValue();
        double num5 = p.doubleValue();
        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
            return num1;
        } else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
            return num2;
        } else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
            return num3;
        } else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
        return num4;
        } else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4) {
            return num5;
        } else if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5) {
            return num1;
        } else if (num2 == num3 || num2 == num4 || num2 == num5) {
            return num2;
        } else if (num3 == num4 || num3 == num5) {
            return num5;
        } else if (num4 == num5) {
            return num4;
        } else {
            return num5;
        }
    }

    public static <T extends Number> double getAverage(T[] myArray) {
        double sum = 0;
        int i = 0;
        for ( ; i < myArray.length; i++) {
            sum += myArray[i].doubleValue();
        }
        return sum / i;
    }

    public static <T extends Number> double getMaxOfArray(T[] myArray) {
        double max = myArray[0].doubleValue();
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i].doubleValue() > max) {
                max = myArray[i].doubleValue();
            }
        }
        return max;
    }

    public static <T extends Number> double getMinOfArray(T[] myArray) {
        double min = myArray[0].doubleValue();
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i].doubleValue() < min) {
                min = myArray[i].doubleValue();
            }
        }
        return min;
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
