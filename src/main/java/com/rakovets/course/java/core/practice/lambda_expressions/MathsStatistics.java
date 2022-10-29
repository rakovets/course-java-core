package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MathsStatistics {
    private List<Integer> listOfNumbers;

    public MathsStatistics(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public List<Integer> getRandomNumbers(int listLength, int minValue, int maxValue) {
        return new Random().ints(listLength, minValue, maxValue)
                .boxed()
                .collect(Collectors.toList());
    }

    public int getCountNumberOfEven(List<Integer> listOfNumbers) {
        return (int) listOfNumbers.stream()
                .filter((x) -> x % 2 == 0 && x != 0)
                .count();
    }

    public int getCountNumberOfOdd(List<Integer> listOfNumbers) {
        return (int) listOfNumbers.stream()
                .filter((x) -> x % 2 != 0)
                .count();
    }

    public int getCountZero(List<Integer> listOfNumbers) {
        return (int) listOfNumbers.stream()
                .filter((x) -> x == 0)
                .count();
    }

    public int getCountNumberOfMatches(List<Integer> listOfNumbers, int givenNumber) {
        return (int) listOfNumbers.stream()
                .filter((x) -> x == givenNumber)
                .count();
    }
}
