package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public class Math<T> {  //extends Number
    private T[] numbers;

    public Math(T[] numbers) {
        this.numbers = numbers;
    }

    public static <T extends Number> T getMaxFromThreeNumbers(T numberOne, T numberTwo, T numberThree) {
        Number[] array = new Number[]{numberOne, numberTwo, numberThree};
        Number maxNumber = array[0];
        Arrays.sort(array);
        return (T) array[array.length - 1];
    }

    public static <T extends Number> T getMinFromFiveNumbers(T numberOne, T numberTwo, T numberThree, T numberFour, T NumberFive) {
        Number[] array = new Number[]{numberOne, numberTwo, numberThree, numberFour, NumberFive};
        Arrays.sort(array);
        return (T) array[0];
    }

    public static <T extends Number> T arithmeticMean(T[] numbers) {
        return null;
    }
}
