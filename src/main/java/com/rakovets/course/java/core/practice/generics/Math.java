package com.rakovets.course.java.core.practice.generics;

import java.util.Objects;

import static java.lang.Math.max;
import static java.lang.Math.min;

public abstract class Math<T extends Number> {
    private T[] arr;

    public Math() {
    }

    public Math(T[] arr) {
        this.arr = arr;
    }

    public static <T extends Number> T getMaxOfThree(T obj1, T obj2, T obj3) {
        T max = obj1.doubleValue() >= obj2.doubleValue() && obj1.doubleValue() >= obj3.doubleValue() ? obj1 :
                obj2.doubleValue() >= obj1.doubleValue() && obj2.doubleValue() >= obj3.doubleValue() ? obj2 : obj3;
        return max;
    }

    public static <T extends Number> T getMinOfFive(T obj1, T obj2, T obj3, T obj4, T obj5) {
        T result = obj1;
        if(result.doubleValue() > obj2.doubleValue()) {
            result = obj2;
        }
        if(result.doubleValue() > obj3.doubleValue()) {
            result = obj3;
        }
        if(result.doubleValue() > obj4.doubleValue()) {
            result = obj4;
        }
        if(result.doubleValue() > obj5.doubleValue()) {
            result = obj5;
        }
        return result;
    }

    public static <T extends Number> double getAverage(T[] arr) {
        double average = 0;
        for (T num : arr) {
            average += num.doubleValue();
        }
        return average / arr.length;
    }

    public static <T extends Number> double getMax(T[] arr) {
        double maxNum = arr[0].doubleValue();
        for (T num : arr) {
            maxNum = max(num.doubleValue(), maxNum);
        }
        return maxNum;
    }

    public static <T extends Number> double getMin(T[] arr) {
        double minNum = arr[0].doubleValue();
        for (T num : arr) {
            minNum = min(num.doubleValue(), minNum);
        }
        return minNum;
    }

    public static <T extends Number> T[] sortArray(T[] arr) {
        T temporary = null;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].doubleValue() > arr[j].doubleValue()) {
                    temporary = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temporary;
                }
            }
        }
        return arr;
    }

    public static <T extends Number> int sortBinaryArray(T[] arr, T elementToFind) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (Objects.equals(arr[middleIndex], elementToFind)) {
                return middleIndex;
            } else if (arr[middleIndex].doubleValue() < elementToFind.doubleValue()) {
                firstIndex = middleIndex + 1;
            } else if (arr[middleIndex].doubleValue() > elementToFind.doubleValue()) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
