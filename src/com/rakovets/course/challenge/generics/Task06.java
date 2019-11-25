package com.rakovets.course.challenge.generics;

import java.util.Arrays;

public class Task06 {

    public static void main(String[] args) {
        Integer[] array = {100, 50, 400, 1000, 1, 500};
        Task06.sortingArray(array);
    }

    static <T> void sortingArray(T[] array) {
        System.out.printf("Not sorting array = %s\n", Arrays.toString(array));
        Arrays.sort(array);
        System.out.printf("Sorting array = %s", Arrays.toString(array));
    }
}
