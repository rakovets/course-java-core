package com.rakovets.course.java.core.practice.generic_types;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class ProjectArray<T> {
    private Object[] array = {};

    public ProjectArray(int setLength) {
        array = new Object[setLength];
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

    public Object[] replaceValue(int index, int value) {
        array[index] = value;
        return array;
    }

    public void setRandomValuesForArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 20);
        }
    }

    public int findArrayMaximum() {
        int max = (int)array[0];
        for (Object i : array) {
            if (max < (int)i) {
                max = (int)i;
            }
        }
        return max;
    }

    public int findArrayMinimum() {
        int min = (int)array[0];
        for (Object i : array) {
            if (min > (int)i) {
                min = (int)i;
            }
        }
        return min;
    }

    public double findArrayArithmetical() {
        double sum = 0;
        for (Object i : array) {
            sum += (int)i;
        }
        return sum / array.length;
    }

    public Object[] sortArrayAscending() {
        boolean check = false;
        int value;
        while(!check) {
            check = true;
            for (int i = 0; i < array.length - 1; i++) {
                if ((int)array[i] > (int)array[i + 1]) {
                    value = (int)array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                    check = false;
                }
            }
        }
        return array;
    }

    public Object[] sortArrayDescending() {
        boolean check = false;
        int value;
        while(!check) {
            check = true;
            for (int i = 0; i < array.length - 1; i++) {
                if ((int)array[i] < (int)array[i + 1]) {
                    value = (int)array[i];
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
