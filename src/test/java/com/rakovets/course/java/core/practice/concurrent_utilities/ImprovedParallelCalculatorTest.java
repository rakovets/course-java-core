package com.rakovets.course.java.core.practice.concurrent_utilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ImprovedParallelCalculatorTest {

    @Test
    public void getSumNumbersInArraysTest() {
        ImprovedParallelCalculator calculator = new ImprovedParallelCalculator();
        int[] firstArray = new int[]{1, 2, 3};
        int[] secondArray = new int[]{4, 2, 6};
        int[] thirdArray = new int[]{1, 1, 1, 1};
        List<int[]> list = new ArrayList<>(List.of(firstArray, secondArray, thirdArray));

        List<Pair> listExpected = new ArrayList<>();
        Pair firstArrayPair = new Pair(6, firstArray);
        Pair secondArrayPair = new Pair(12, secondArray);
        Pair thirdArrayPair = new Pair(4, thirdArray);
        listExpected.add(firstArrayPair);
        listExpected.add(secondArrayPair);
        listExpected.add(thirdArrayPair);

        List<Pair> listActual = calculator.getArrayAndSum(list);
        Assertions.assertEquals(listExpected, listActual);
    }

    @Test
    public void getSumNumbersInArraysWithThreadTest() {
        ImprovedParallelCalculator calculator = new ImprovedParallelCalculator();
        int[] firstArray = new int[]{1, 1, 1};
        int[] secondArray = new int[]{2, 3, 4};
        int[] thirdArray = new int[]{7, 1, 2, 1};
        List<int[]> list = new ArrayList<>(List.of(firstArray, secondArray, thirdArray));

        List<Pair> listExpected = new ArrayList<>();
        Pair firstArrayPair = new Pair(3, firstArray);
        Pair secondArrayPair = new Pair(9, secondArray);
        Pair thirdArrayPair = new Pair(1, thirdArray);
        listExpected.add(firstArrayPair);
        listExpected.add(secondArrayPair);
        listExpected.add(thirdArrayPair);

        List<Pair> listActual = calculator.getArraySumAndAcceptingCountOfThreads(list, 1);
        List<Pair> listActual2 = calculator.getArraySumAndAcceptingCountOfThreads(list, 2);
        List<Pair> listActual5 = calculator.getArraySumAndAcceptingCountOfThreads(list, 5);
        List<Pair> listActual10 = calculator.getArraySumAndAcceptingCountOfThreads(list, 10);
        Assertions.assertEquals(listExpected, listActual);
        Assertions.assertEquals(listExpected, listActual2);
        Assertions.assertEquals(listExpected, listActual5);
        Assertions.assertEquals(listExpected, listActual10);
    }
}
