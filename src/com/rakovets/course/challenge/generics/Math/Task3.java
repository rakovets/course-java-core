package com.rakovets.course.challenge.generics.Math;

public class Task3 {
    public static <T> void middleOfValues(T[] array) {
        int counter = 0;
        float sum = 0f;
        for (int i = 0; i < array.length; i++) {
            sum +=(Integer) array[i];
            counter++;
            System.out.printf("Values [%d] " + sum + "\n", i);
        }
        System.out.println("Number of Values is " + counter + "\n");
        float answer = (sum / counter);
        System.out.println("Dividing on number of values is " + answer + "\n");
    }
}
