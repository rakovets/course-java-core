package com.rakovets.course.challenge.generics;

public class Task05 {
    public static void main(String[] args) {
        Integer[] integers = {1, 3, 5, 7, 8, 9, 33, 452, 4, 5,};
        findMax(integers);

    }

    public static <T extends Number> void findMax(T[] array) {
        T max = array[0];
        Number n1 = null;
        Number n2 = null;
        boolean b = n1.intValue() < n2.intValue();
        for (int i = 0; i > array.length; i++) {
            if (array[i].intValue() < array[0].intValue()) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}

