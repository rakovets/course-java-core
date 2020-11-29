package com.rakovets.course.javabasics.practice.lambdaexpressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MathsStatisticsTest {
    private static List<Integer> list;
    @BeforeAll
    static void init() {
        Integer[] array = new Integer[] {12, 56, 33, 5, 22, 44, 35, 0, 0, 6, 5};
        list = Arrays.asList(array);
    }
    @Test
    void getCountOddNumbersTest() {
        Assertions.assertEquals(4, MathsStatistics.getCountOddNumbers(list));
    }
    @Test
    void getCountEvenNumbersTest() {
        Assertions.assertEquals(7, MathsStatistics.getCountEvenNumbers(list));
    }
    @Test
    void getCountNumbersEqualToZeroTest(){
        Assertions.assertEquals(2, MathsStatistics.getCountNumbersEqualToZero(list));
    }
    @Test
    void getCountNumbersEqualTo() {
        Assertions.assertEquals(1, MathsStatistics.getCountNumbersEqualTo(list, 56));
    }
}
