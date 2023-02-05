package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;
import java.util.Collections;

public abstract class Math {
    private static Number[] numbers;

    @SafeVarargs
    public static <T extends Number> T getMaxFromThreeNumbers(T... inputNumbers) {
        Arrays.sort(inputNumbers, Collections.reverseOrder());
        return inputNumbers[0];
    }

    @SafeVarargs
    public static <T extends Number> T getMinFromFiveNumbers(T... inputNumbers) {
        Arrays.sort(inputNumbers);
        return inputNumbers[0];
    }

    public static <T extends Number> double getArithmeticMean(T[] numbers) {
        double sum = 0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.length;
    }

    public static <T extends Number> T getMaxFromArray(T[] numbers) {
        Arrays.sort(numbers, Collections.reverseOrder());
        return numbers[0];
    }

    public static <T extends Number> T getMinFromArray(T[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static <T extends Number> T[] getBubbleSortArray(T[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j - 1].doubleValue() > numbers[j].doubleValue()) {
                    T tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        return numbers;
    }

    public static <T extends Number> int findIndexOfNumber(T[] numbers, T desiredNumber) {
        getBubbleSortArray(numbers);
        int firstIndex = 0;
        int lastIndex = numbers.length - 1;
        int result = -1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (desiredNumber.doubleValue() == numbers[middleIndex].doubleValue()) {
                result = middleIndex;
                break;
            } else if (desiredNumber.doubleValue() > numbers[middleIndex].doubleValue()) {
                firstIndex = middleIndex + 1;
            } else if (desiredNumber.doubleValue() < numbers[middleIndex].doubleValue()) {
                lastIndex = middleIndex - 1;
            }
        }
        return result;
    }
}
