package com.rakovets.course.java.core.practice.generic_types;

public abstract class Math<T> {

    public static <T> int findMaximum(int value1, int value2, int value3) {
        if (value1 > value2 && value1 > value3) {
            return value1;
        } else if (value2 > value1 && value2 > value3) {
            return value2;
        } else {
            return value3;
        }
    }

    public static <T> int findMinimum(int value1, int value2, int value3, int value4, int value5) {
        if (value1 < value2 && value1 < value3 && value1 < value4 && value1 < value5) {
            return value1;
        } else if (value2 < value1 && value2 < value3 && value2 < value4 && value2 < value5) {
            return value2;
        } else if (value3 < value1 && value3 < value2 && value3 < value4 && value3 < value5){
            return value3;
        } else if (value4 < value1 && value4 < value2 && value4 < value3 && value4 < value5) {
            return value4;
        } else {
            return value5;
        }
    }

    public static <T> double findArrayArithmetical(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum /= array.length;
    }

    public static <T> int findArrayMaximum(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static <T> int findArrayMinimum(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public static <T> int[] sortArray(int[] array) {
        boolean check = false;
        int value;
        while(!check) {
            check = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    value = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                    check = false;
                }
            }
        }
        return array;
    }
}
