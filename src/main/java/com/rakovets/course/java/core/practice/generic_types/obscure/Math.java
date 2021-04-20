package com.rakovets.course.java.core.practice.generic_types.obscure;

public abstract class Math {

    public static <K extends Number> K getMax(K firstValue, K secondValue, K thirdValue) {
        int firstDIntValue = firstValue.intValue();
        int secondIntValue = secondValue.intValue();
        int thirdIntValue = thirdValue.intValue();
        int maxValue = java.lang.Math.max(firstDIntValue, java.lang.Math.max(secondIntValue, thirdIntValue));
        if (maxValue == firstDIntValue) {
            return firstValue;
        } else if (maxValue == secondIntValue) {
            return secondValue;
        } else {
            return thirdValue;
        }

    }

    public static <K extends Number> K getMin(K firstValue, K secondValue, K thirdValue, K fourthValue, K fifthValue) {
        int firstDIntValue = firstValue.intValue();
        int secondIntValue = secondValue.intValue();
        int thirdIntValue = thirdValue.intValue();
        int fourthIntValue = fourthValue.intValue();
        int fifthIntValue = fifthValue.intValue();
        int minValue = java.lang.Math.min(firstDIntValue, java.lang.Math.min(secondIntValue, java.lang.Math.min(thirdIntValue,
                java.lang.Math.min(fourthIntValue, fifthIntValue))));
        if (minValue == firstDIntValue) {
            return firstValue;
        } else if (minValue == secondIntValue) {
            return secondValue;
        } else if (minValue == thirdIntValue) {
            return thirdValue;
        } else if (minValue == fourthIntValue) {
            return fourthValue;
        } else {
            return fifthValue;
        }
    }

    public static <T extends Number> double getAverageInArray(T[] array) {
        double sum = 0;
        for (T items : array) {
            sum += items.doubleValue();
        }
        return sum / array.length;
    }

    public static <T extends Number> double getMaxInArray(T[] array) {
        double maxValue = array[0].doubleValue();
        for (T item : array) {
            if(item.doubleValue() > maxValue) {
                maxValue = item.doubleValue();
            }
        }
        return maxValue;
    }

    public static <T extends Number> double getMinInArray(T[] array) {
        double minValue = array[0].doubleValue();
        for (T item : array) {
            if(item.doubleValue() < minValue) {
                minValue = item.doubleValue();
            }
        }
        return minValue;
    }

    public static <T extends Number> T[] getSortArray(T[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i].doubleValue() < array[i - 1].doubleValue()) {
                    T tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] =tmp;
                    needIteration = true;
                }
            }
        }
        return array;
    }

    public static <T extends Number> int binarySearch(T[] array, T value) {
       Math.getSortArray(array);
        int firstValue = 0;
        int lastValue = array.length - 1;
        int indexValue = -1;
        while (firstValue <= lastValue) {
            int mid = (firstValue + lastValue) / 2;
            if (array[mid].doubleValue() < value.doubleValue()) {
                firstValue = mid + 1;
            } else if (array[mid].doubleValue() > value.doubleValue()) {
                lastValue = mid - 1;
            } else if (array[mid].doubleValue() == value.doubleValue()) {
                indexValue = mid;
                break;
            }
        }
        return indexValue+1;
    }
}
