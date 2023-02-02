package com.rakovets.course.java.core.practice.generics;

public abstract class Math<T extends Number> {
    T[] array;

    public static <T extends Number> T findMaxFromThree(T t1, T t2, T t3) {
        Number[] array = {t1, t2, t3};
        return (T) findMax(array);
    }

    public static <T extends Number> T findMinFromFive(T t1, T t2, T t3, T t4, T t5) {
        Number[] array = {t1, t2, t3, t4, t5};
        return (T) findMin(array);
    }

    public static <T extends Number> double calculateMean(T[] someArray) {
        double count = 0.0;
        double sum = 0;
        for (T element : someArray) {
            sum += element.doubleValue();
            count++;
        }
        return sum / count;
    }

    public static <T extends Number> T findMax(T[] someArray) {
        T max = someArray[0];
        for (int i = 1; i < someArray.length; i++) {
            if (someArray[i].doubleValue() > max.doubleValue()) {
                max = someArray[i];
            }
        }
        return max;
    }

    public static <T extends Number> T findMin(T[] someArray) {
        T min = someArray[0];
        for (T element : someArray) {
            if (element.doubleValue() < min.doubleValue()) {
                min = element;
            }
        }
        return min;
    }

    public static <T extends Number> T[] sortAscending(T[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length; i++) {
            for (int j = i; j < unsortedArray.length - 1; j++) {
                if (unsortedArray[i].doubleValue() > unsortedArray[j + 1].doubleValue()) {
                    T temp = unsortedArray[j + 1];
                    unsortedArray[j + 1] = unsortedArray[i];
                    unsortedArray[i] = temp;
                }
            }
        }
        return unsortedArray;
    }

    public static <T extends Number> int binarySearch(T[] array, T number) {
        T[] sortedArray = sortAscending(array);
        Number firstIndex = 0;
        Number lastIndex = sortedArray.length - 1;
        int middleIndex = -1;
        while (firstIndex.intValue() <= lastIndex.intValue()) {
            middleIndex = (lastIndex.intValue() + firstIndex.intValue()) / 2;
            if (number.doubleValue() == sortedArray[middleIndex].doubleValue()) {
                System.out.print(number + " has been found!");
                return middleIndex;
            } else if (number.doubleValue() < sortedArray[middleIndex].doubleValue()) {
                lastIndex = middleIndex;
            } else if (number.doubleValue() > sortedArray[middleIndex].doubleValue()) {
                firstIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}
