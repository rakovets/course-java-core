package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MathsStatistics {

    public ArrayList<Integer> getRandomDigit(int listSize) {
        Random random = new Random();
        ArrayList<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            randomList.add(random.nextInt(100));
        }
        return randomList;
    }

    public long getEvenNumbers(ArrayList<Integer> listNumbers) {
        return listNumbers.stream()
                .filter(number -> number % 2 == 0)
                .count();
    }

    public long getOddNumbers(ArrayList<Integer> listNumbers) {
        return listNumbers.stream()
                .filter(number -> number % 2 != 0)
                .count();
    }

    public long getNulls(ArrayList<Integer> listNumbers) {
        return listNumbers.stream()
                .filter(number -> number == 0)
                .count();
    }

    public long getEqualToSomeNumber(ArrayList<Integer> listNumbers,int someNumber) {
        return listNumbers.stream()
                .filter(number -> number == someNumber)
                .count();
    }

}
