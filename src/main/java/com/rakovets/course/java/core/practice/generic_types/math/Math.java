package com.rakovets.course.java.core.practice.generic_types.math;

public abstract class Math<T> {

    public static <T> int returnMaximumOfThreeParameters(int parameter1, int parameter2, int parameter3) {
        if (parameter1 > parameter2 && parameter1 > parameter3) {
            return parameter1;
        } else if (parameter2 > parameter1 && parameter2 > parameter3) {
            return parameter2;
        } else {
            return parameter3;
        }
    }

    public static <T> int returnMaximumOfFiveParameters(int parameter1, int parameter2, int parameter3, int parameter4, int parameter5) {
        if (parameter1 < parameter2 && parameter1 < parameter3 && parameter1 < parameter4 && parameter1 < parameter5) {
            return parameter1;
        } else if (parameter2 < parameter1 && parameter2 < parameter3 && parameter2 < parameter4 && parameter2 < parameter5) {
            return parameter2;
        } else if (parameter3 < parameter1 && parameter3 < parameter2 && parameter3 < parameter4 && parameter3 < parameter5){
            return parameter3;
        } else if (parameter4 < parameter1 && parameter4 < parameter2 && parameter4 < parameter3 && parameter4 < parameter5) {
            return parameter4;
        } else {
            return parameter5;
        }
    }

    public static <T> int returnArithmeticMeanArray(int[] array) {
        int sumParameters = 0;
        for (int i : array) {
            sumParameters += i;
        }
        return sumParameters /= array.length;
    }

    public static <T> int returnArrayMaximum(int[] array) {
        int maximum = array[0];
        for (int i : array) {
            if (maximum < i) {
                maximum = i;
            }
        }
        return maximum;
    }

    public static <T> int returnArrayMinimum(int[] array) {
        int minimum = array[0];
        for (int i : array) {
            if (minimum > i) {
                minimum = i;
            }
        }
        return minimum;
    }
}
