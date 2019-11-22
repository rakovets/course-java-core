package com.rakovets.course.challenge.generics;

public class Task3 {
    public static  <T> void middleOfValues(T[] array) {
        int counter = 0;
        T sum;
        for (int i = 0, j = 1; i < array.length; i++, j++) {
            sum = array[0];
            sum = array[i];
//            counter++;
//            System.out.println(array[i]);
            System.out.println(sum);
        }
//        float answer = sum / counter;
//        System.out.println(answer);
    }
}
