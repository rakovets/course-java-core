package com.rakovets.course.javabasics.practice.lambdaexpressions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static java.lang.System.*;

public class MathStatTest {

    @Test
    void test() {
        int[] array = MathStat.generate(10);
        out.println("Array: " + Arrays.toString(array));
        array = new int[]{0, 0, 2, 2, 2, 1, 1, 3};
        assertEquals(5, MathStat.amountOfEvens(array));
        assertEquals(3, MathStat.amountOfOdds(array));
        assertEquals(2, MathStat.amountOfZeroes(array));
        assertEquals(3, MathStat.amountOfCurrentValue(array,2));
    }
}
