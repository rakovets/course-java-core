package com.rakovets.course.javabasics.practice.lambdaexpressions;


import java.util.Arrays;

public class MathStatistics {
    public static int[] getArrayOfRandomNumber() {
        int sizeOfArray = 20;
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] =  (int) Math.round(Math.random() * 20);
        }
        return array;
    }

    public static int getCountOfEvenNumbers(int[] array) {
        return (int) Arrays.stream(array)
                .filter(x -> x % 2 == 0 && x != 0)
                .count();
    }

    public static int getCountOfOddNumbers(int[] array) {
        return (int) Arrays.stream(array)
                .filter(x -> x % 2 != 0)
                .count();
    }

    public static int getCountOfZeroNumbers(int[] array) {
        return (int) Arrays.stream(array)
                .filter(x -> x == 0)
                .count();
    }

    public static int getCountOfSomeNumbers(int[] array, int number) {
        return (int) Arrays.stream(array)
                .filter(x -> x == number)
                .count();
    }

}
