package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MathTest {

    @Test
    void getMaxOfTest() {

        Math<Double> testD = new Math();
        Math<Integer> testI = new Math();

        Assertions.assertEquals(44.0, testD.getMaxOf(44.0, 33.0, 22.0));
        Assertions.assertEquals(44.0, testD.getMaxOf(33.0, 44.0, 22.0));
        Assertions.assertEquals(44.0, testD.getMaxOf(22.0, 33.0, 44.0));

        Assertions.assertEquals(43, testI.getMaxOf(43, 33, 22));
        Assertions.assertEquals(43, testI.getMaxOf(23, 43, 22));
        Assertions.assertEquals(43, testI.getMaxOf(22, 33, 43));
    }

    @Test
    void getMinOfTest() {
        Math<Double> testD = new Math();
        Math<Integer> testI = new Math();

        Assertions.assertEquals(15.0, testD.getMinOf(44.0, 33.0, 22.0, 20.0, 15.0));
        Assertions.assertEquals(10.0, testD.getMinOf(44.0, 33.0, 22.0, 10.0, 15.0));
        Assertions.assertEquals(9.0, testD.getMinOf(44.0, 33.0, 9.0, 10.0, 15.0));
        Assertions.assertEquals(8.0, testD.getMinOf(44.0, 8.0, 22.0, 10.0, 15.0));
        Assertions.assertEquals(7.0, testD.getMinOf(7.0, 33.0, 9.0, 10.0, 15.0));

        Assertions.assertEquals(15, testI.getMinOf(44, 33, 22, 20, 15));
        Assertions.assertEquals(10, testI.getMinOf(44, 33, 22, 10, 15));
        Assertions.assertEquals(9, testI.getMinOf(44, 33, 9, 20, 15));
        Assertions.assertEquals(8, testI.getMinOf(44, 8, 22, 20, 15));
        Assertions.assertEquals(7, testI.getMinOf(7, 33, 22, 20, 15));
    }

    @Test
    void getAverageFromArrayTest() {

        Double[] array = {100.0, 100.0, 100.0, 100.0, 133.0};
        Integer[] arrayI = {4, 23, 7, 37, 3, 34, 56, 32, 7, 16};
        Math<Double> test = new Math();
        Math<Integer> testI = new Math();

        Assertions.assertEquals(106.6, test.getAverageFromArray(array));
        Assertions.assertEquals(21.9, testI.getAverageFromArray(arrayI));
    }

    @Test
    void getMaximumFromArrayTest() {

        Double[] array = {100.0, 100.0, 100.0, 100.0, 133.0};
        Integer[] arrayI = {4, 23, 7, 37, 3, 34, 56, 32, 7, 16};
        Math<Double> test = new Math();
        Math<Integer> testI = new Math();

        Assertions.assertEquals(133, test.getMaximumFromArray(array));
        Assertions.assertEquals(56, testI.getMaximumFromArray(arrayI));
    }

    @Test
    void getMinimumFromArrayTest() {

        Double[] array = {19.0, 176.0, 18.0, 15.0, 133.0};
        Integer[] arrayI = {4, 23, 7, 37, 3, 34, 56, 32, 7, 16};
        Math<Double> test = new Math();
        Math<Integer> testI = new Math();

        Assertions.assertEquals(15.0, test.getMinimumFromArray(array));
        Assertions.assertEquals(3, testI.getMinimumFromArray(arrayI));
    }

    @Test
    void getSortedArrayTest() {

        Double[] array = {19.0, 176.0, 18.0, 15.0, 133.0};
        Integer[] arrayI = {4, 23, 7, 37, 3, 34, 56, 32, 7, 16};
        Math<Double> test = new Math();
        Math<Integer> testI = new Math();

        Assertions.assertArrayEquals( new Double[]{15.0, 18.0, 19.0, 133.0, 176.0}, test.getSortedArray(array));
        Assertions.assertArrayEquals( new Integer[]{3, 4, 7, 7, 16, 23, 32, 34, 37, 56}, testI.getSortedArray(arrayI));
    }

    @Test
    void getBinarySearchTest(){

        Integer[] array = {4, 23, 7, 37, 3, 34, 56, 32, 7, 16};
        Math<Integer> test = new Math();
        Assertions.assertEquals(16, test.getBinarySearch(array,16));
        Assertions.assertEquals(4, test.getBinarySearch(array,4));
        Assertions.assertEquals(3, test.getBinarySearch(array,3));
        Assertions.assertEquals(32, test.getBinarySearch(array,32));
        Assertions.assertEquals(7, test.getBinarySearch(array,7));
    }
}
