package com.rakovets.course.java.core.practice.concurrent_utilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

public class ImprovedCalculatorTest {
    private static final ImprovedParallelCalculator calculator = new ImprovedParallelCalculator(5);

    @Test
    void testImprovedCalculator() throws InterruptedException {
        Map<int[], Integer> map = calculator.calculate(calculator.createListOfArrays
                (5, 5, 1, 300));

        map.forEach((key, value) -> Assertions.assertEquals(Arrays.stream(key).sum(), value));
    }
}
