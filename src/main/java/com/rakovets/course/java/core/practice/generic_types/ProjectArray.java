package com.rakovets.course.java.core.practice.generic_types;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class ProjectArray<T> {
    private static Number[] array = {};

    public ProjectArray(int setLength) {
        array = new Number[setLength];
    }

    public void inputValuesArray() {
        Scanner cin = new Scanner(System.in);
        System.out.println("Заполните массив");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Заполнено " + i + " из " + array.length);
            array[i] = cin.nextInt();
        }
        cin.close();
    }

    public Number[] replaceValue(int index, T value) {
        array[index] = (Number)value;
        return array;
    }

    public void setRandomValuesForArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 20);
        }
    }

    public static <T extends Number> Number findArrayMaximum() {
        double max = array[0].doubleValue();
        for (Number i : array) {
            if (max > i.doubleValue()) {
                max = i.doubleValue();
            }
        }
        return max;
    }

    public static <T extends Number> Number findArrayMinimum() {
        double max = array[0].doubleValue();
        for (Number i : array) {
            if (max < i.doubleValue()) {
                max = i.doubleValue();
            }
        }
        return max;
    }

    public static <T extends Number> Number findArrayArithmetical() {
        double sum = 0;
        for (Number i : array) {
            sum += i.doubleValue();
        }
        return sum / array.length;
    }

    public static <T extends Number> Number[] sortArrayAscending() {
        boolean check = false;
        Number value;
        while(!check) {
            check = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].doubleValue() > array[i + 1].doubleValue()) {
                    value = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                    check = false;
                }
            }
        }
        return array;
    }

    public static <T extends Number> Number[] sortArrayDescending() {
        boolean check = false;
        Number value;
        while(!check) {
            check = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].doubleValue() < array[i + 1].doubleValue()) {
                    value = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                    check = false;
                }
            }
        }
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
