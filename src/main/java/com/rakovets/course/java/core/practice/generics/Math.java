package com.rakovets.course.java.core.practice.generics;

import java.util.ArrayList;

public abstract class Math<T extends Number> {
    private T[] numbers;

    public Math(T[] numbers) {
        this.numbers = numbers;
    }

    public static <T extends Number> T getMaxFromThreeNumbers(T numberOne, T numberTwo, T numberThree) {
        Number[] array = new Number[]{numberOne, numberTwo, numberThree};
        Number maxNumber = array[0];
        for (Number i : array) {
            //if (i > maxNumber) {
            maxNumber = i;
        }
        return null;
    }
}


