package com.rakovets.course.java.core.practice.exception_handling;

public class Task6 {
    public void fillArrayWithNumbers(int indexOne, int valueOne, int indexTwo, int valueTwo, String string) {
        int[] arr = new int[4];
        arr[indexOne] = valueOne;
        arr[indexTwo] = valueTwo;
        arr[2] = arr[indexOne] / arr[indexTwo];
        arr[3] = string.length();
    }
}
