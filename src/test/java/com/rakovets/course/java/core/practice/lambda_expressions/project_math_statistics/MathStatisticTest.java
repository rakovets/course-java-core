package com.rakovets.course.java.core.practice.lambda_expressions.project_math_statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathStatisticTest {

    @Test
    void countEven() {
        //Given
        List<Integer> numberList = new ArrayList<>();
        numberList.add(0);
        numberList.add(5);
        numberList.add(6);
        numberList.add(2);
        numberList.add(1);
        numberList.add(-2);
        long expectedResult = 4;

        //When
        long actualResult = MathStatistic.countEven(numberList);

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void countNotEven() {
        //Given
        List<Integer> numberList = new ArrayList<>();
        numberList.add(0);
        numberList.add(5);
        numberList.add(6);
        numberList.add(2);
        numberList.add(1);
        numberList.add(-2);
        long expectedResult = 2;

        //When
        long actualResult = MathStatistic.countNotEven(numberList);

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void countZeros() {
        //Given
        List<Integer> numberList = new ArrayList<>();
        numberList.add(0);
        numberList.add(5);
        numberList.add(6);
        numberList.add(2);
        numberList.add(1);
        numberList.add(-2);
        long expectedResult = 1;

        //When
        long actualResult = MathStatistic.countZeros(numberList);

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void countValue() {
        //Given
        List<Integer> numberList = new ArrayList<>();
        numberList.add(0);
        numberList.add(5);
        numberList.add(6);
        numberList.add(6);
        numberList.add(1);
        numberList.add(-2);
        long expectedResult = 2;

        //When
        long actualResult = MathStatistic.countValue(numberList,6);

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
