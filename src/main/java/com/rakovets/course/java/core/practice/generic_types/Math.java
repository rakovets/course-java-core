package com.rakovets.course.java.core.practice.generic_types;

import com.rakovets.course.java.core.practice.generic_types.search.SearchMiddleElement;
import com.rakovets.course.java.core.practice.generic_types.sorting.Sort;

public abstract class Math {

    public static <T extends Number & Comparable<T>> T maxValueOfThree(T firstValue, T secondValue, T thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0) {
            return firstValue;
        } else if (secondValue.compareTo(thirdValue) > 0) {
            return secondValue;
        } else {
            return thirdValue;
        }
    }

    public static <T extends Number & Comparable<T>> T minValueOfAll(T... value) {
        T minValue = value[0];
        for (T oneValue : value) {
            if (minValue.compareTo(oneValue) > 0) {
                minValue = oneValue;
            }
        }
        return minValue;
    }

    public static <T extends Number & Comparable<T>> double averageValue(T... value) {
        double sum = 0.0;
        for (T oneValue : value) {
            sum += oneValue.doubleValue();
        }
        return sum / value.length;
    }

    public static <T extends Number> T maxInArray(T[] Array) {
        T maxValue = Array[0];
        for (T oneElement : Array) {
            if (maxValue.doubleValue() < oneElement.doubleValue()) {
                maxValue = oneElement;
            }
        }
        return maxValue;
    }

    public static <T extends Comparable<T>> T minInArray(T[] Array) {
        T minValue = Array[0];
        for (T oneElement : Array) {
            if (minValue.compareTo(oneElement) > 0) {
                minValue = oneElement;
            }
        }
        return minValue;
    }

    public <T extends Number & Comparable<T>> T[] sortArray(T[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(array[i - 1]) < 0) {
                Sort.swap(array, i, i - 1);
                for (int j = i - 1; (j - 1) >= 0; j--) {
                    if (array[j].compareTo(array[j - 1]) < 0) {
                        Sort.swap(array, j, j - 1);
                    } else {
                        break;
                    }
                }
            }

        }
        return array;
    }

    public static <T extends Number & Comparable<T>> int recursiveBinarySearch(T[] array, int min, int max, T searchItem) {
        if (max < min) {
            return -1;
        } else {
            int midPoint = SearchMiddleElement.midElement(min, max);
            if (array[midPoint].compareTo(searchItem) < 0) {
                return recursiveBinarySearch(array, midPoint + 1, max, searchItem);
            } else if (array[midPoint].compareTo(searchItem) > 0) {
                return recursiveBinarySearch(array, min, midPoint - 1, searchItem);
            } else {
                return midPoint;
            }
        }
    }
}
