package com.rakovets.course.java.core.practice.exception_handling;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task02 {
    public void fill(int[] array, int number) throws IndexOutOfBoundsException {
        Arrays.fill(array, number);
        array[array.length] = 15;
    }
}
