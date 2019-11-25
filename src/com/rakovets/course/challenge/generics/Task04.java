package com.rakovets.course.challenge.generics;

public class Task04 {
    public static void main(String[] args) {
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        findMin(numbers);
    }

    public static <T extends Number> void findMin(T[] array) {
        T min = array[0];
        Number n1 = null;
        Number n2 = null;
        boolean b = n1.intValue() < n2.intValue();
        for (int i = 0; i < array.length; i++) {
            if (array[i].intValue() < array[0].intValue()) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
