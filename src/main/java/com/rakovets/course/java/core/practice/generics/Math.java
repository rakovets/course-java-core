package com.rakovets.course.java.core.practice.generics;

import com.rakovets.course.java.core.practice.exception_handling.InputParameterInvalidException;

public abstract class Math<T extends Number> {
    public static <T> T getMaximum(T first, T second, T third) throws InputParameterInvalidException {
        if (first == null || second == null || third == null) {
            throw new InputParameterInvalidException("Insert a none-zero value");
        }
        T[] arr = (T[]) new Object[]{first, second, third};
        return getMaximumInArray(arr);
    }

    public static <T> T getMinimum(T first, T second, T third, T fourth, T fifth) throws InputParameterInvalidException {
        if (first == null || second == null || third == null || fourth == null || fifth == null) {
            throw new InputParameterInvalidException("Insert a none-zero value");
        }
        T[] arr = (T[]) new Object[]{first, second, third, fourth, fifth};
        return getMinimumInArray(arr);

    }

    public static <T> double getAverageInArray(T[] array) {
        double sum = 0;
        for (T t : array) {
            if (t == null) {
                continue;
            }
            sum += getDouble(t);
        }
        return sum / array.length;
    }

    public static <T> T getMaximumInArray(T[] array) {
        int position = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[position] == null) {
                continue;
            } else if (array[i] == null) {
                continue;
            } else if (getDouble(array[position]) < getDouble(array[i])) {
                position = i;
            }
        }
        return array[position];
    }

    public static <T> T getMinimumInArray(T[] array) {
        int position = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[position] == null) {
                continue;
            } else if (array[i] == null) {
                continue;
            } else if (getDouble(array[position]) > getDouble(array[i])) {
                position = i;
            }
        }
        return array[position];
    }

    public static <T> T[] sortArray(T[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                count++;
            }
        }
        T[] arrayNew = (T[]) new Object[array.length - count];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                arrayNew[k] = array[i];
                k++;
            }
        }
        for (int i = 0; i < arrayNew.length; i++) {
            if (arrayNew[i] == null) {
                continue;
            }
            for (int j = i + 1; j < arrayNew.length; j++) {
                if (arrayNew[j] == null) {
                    continue;
                }
                T position;
                if (getDouble(arrayNew[i]) > getDouble(arrayNew[j])) {
                    position = arrayNew[i];
                    arrayNew[i] = arrayNew[j];
                    arrayNew[j] = position;
                }
            }
        }
        return arrayNew;
    }

    public static <T> boolean binarySearchInArray(T[] array, T value) {
        T[] arrayNew = sortArray(array);
        int firstIndex = 0;
        int lastIndex = arrayNew.length - 1;
        int valuePosition = -1;
        while (firstIndex <= lastIndex) {
            int midIndex = (firstIndex + lastIndex) / 2;
            if (getDouble(value) == getDouble(arrayNew[midIndex])) {
                valuePosition = midIndex;
                break;
            } else if (getDouble(value) < getDouble(arrayNew[midIndex])) {
                lastIndex = midIndex - 1;
            } else if (getDouble(value) > getDouble(arrayNew[midIndex])) {
                firstIndex = midIndex + 1;
            }
        }
        return valuePosition != -1;
    }

    public static <T> double getDouble(T element) {
        return Double.parseDouble(element.toString());
    }

}

