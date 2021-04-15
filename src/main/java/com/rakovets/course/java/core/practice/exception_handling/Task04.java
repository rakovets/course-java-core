package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.example.exception_handling.exception.ExceptionExtendsRunTime;

public class Task04 {
    public int findMaxNum(int[] array) throws ExceptionExtendsRunTime {
        int min = array[0];
        for (var iterator : array) {
            if (iterator > min) {
                min = iterator;
            }
        }
        return min;
    }

    public int findMaxNum(int[] array, int start, int finish) throws ExceptionExtendsRunTime {
        int max = array[start];
        for (int i = start; i <= finish; i++) {
            if (i >= array.length) {
                throw new ExceptionExtendsRunTime("IndexOfBoundException", i);
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
