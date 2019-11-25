package com.rakovets.course.challenge.generics;

import java.util.Arrays;

public class Task07 {
    public static void main(String[] args) {
        Integer[] array = {40, 80, 120};
        Integer key = 120;
        System.out.printf("Array = %s\n", Arrays.toString(array));
        System.out.printf("Num = %d\n", key);
        Task07.binarySearch(array, key);

    }

    static <T> void binarySearch(T[] array, Number num) {
        int index = Arrays.binarySearch(array, num);
        System.out.printf("Binary search, index = %d", index);
    }
}
