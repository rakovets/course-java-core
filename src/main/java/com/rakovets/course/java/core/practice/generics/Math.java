package com.rakovets.course.java.core.practice.generics;

public abstract class Math<T extends Number> {
    public static <T> T getMaximum(T first, T second, T third) {
        T[] arr = (T[]) new Object[]{first, second, third};
        return getMaximumInArray(arr);
    }

    public static <T> T getMinimum(T first, T second, T third, T fourth, T fifth) {
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
        T max = getFirstOrNull(array);
        if (max == null) {
            return null;
        }
        for (T t : array) {
            if (t != null && getDouble(max) < getDouble(t)) {
                max = t;
            }
        }
        return max;
    }

    public static <T> T getMinimumInArray(T[] array) {
      T min = getFirstOrNull(array);
        if (min == null) {
            return null;
        }
        for (T t : array) {
            if (t != null && getDouble(min) > getDouble(t)) {
                min = t;
            }
        }
        return min;
    }

    private static<T> T getFirstOrNull(T[]array) {
        T first = null;
        for (T t : array) {
            if (t != null) {
                first = t;
                break;
            }
        }
        return first;
    }

    public static <T> T[] sortArray(T[] array) {
        int count = 0;
        for (T t : array) {
            if (t == null) {
                count++;
            }
        }
        T[] arrayNew = (T[]) new Object[array.length - count];
        int k = 0;
        for (T t : array) {
            if (t != null) {
                arrayNew[k] = t;
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

    private static <T> double getDouble(T element) {
        return Double.parseDouble(element.toString());
    }
}
