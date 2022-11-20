package com.rakovets.course.java.core.practice.concurrent_utilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImprovedCalculatorTest {
    ImprovedParallelCalculator calculator;
    List<int[]> list;

    @BeforeEach
    void setUp() {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{2, 5, 7};
        int[] array3 = new int[]{1, 1, 1};
        int[] array4 = new int[]{2, 3, 4};
        list = new ArrayList<>((Arrays.asList(array1, array2, array3, array4)));
    }

    @Test
    public void testCounter() throws InterruptedException {
        new ImprovedParallelCalculator();
        List<Pair> expected = new ArrayList<>();
//        expected.add(16, array1);
//        expected.add();
//        expected.add();
//        expected.add();

        List<Pair> actual = calculator.getArrayAndSum(list);

        Assertions.assertEquals(expected, actual);
    }
}

