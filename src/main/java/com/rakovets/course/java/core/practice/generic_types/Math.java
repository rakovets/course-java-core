package com.rakovets.course.java.core.practice.generic_types;

public class Math<T extends Number> {

    public static <T extends Number> T getMaxOfThree(T parametr1, T parametr2, T parametr3) {
        T result = parametr1;
        if(parametr2.doubleValue() > parametr1.doubleValue() && parametr2.doubleValue() > parametr3.doubleValue()) {
            result = parametr3;
        } else if(parametr3.doubleValue() > parametr2.doubleValue() && parametr3.doubleValue() > parametr1.doubleValue()) {
            result = parametr3;
        }
        return result;
    }

    public static <T extends Number> T getMinOfFive(T parametr1, T parametr2, T parametr3, T parametr4, T parametr5) {
        T result = parametr1;
        if(result.doubleValue() > parametr2.doubleValue()) {
            result = parametr2;
        }
        if(result.doubleValue() > parametr3.doubleValue()) {
            result = parametr3;
        }
        if(result.doubleValue() > parametr4.doubleValue()) {
            result = parametr4;
        }
        if(result.doubleValue() > parametr5.doubleValue()) {
            result = parametr5;
        }
        return result;
    }

    public static <T extends Number> double getAverageValue(T[] array) {
        double sum = 0;
        for(T value : array) {
            sum += value.doubleValue();
        }
        return sum / array.length;
    }

    public static <T extends Number> T getMaxFromArray(T[] array) {
        T max = array[0];
        for(T value : array) {
            if(value.doubleValue() > max.doubleValue()) {
                max = value;
            }
        }
        return max;
    }

    public static <T extends Number> T getMinFromArray(T[] array) {
        T min = array[0];
        for(T value : array) {
            if(value.doubleValue() < min.doubleValue()) {
                min = value;
            }
        }
        return min;
    }

    public T[] getSortedArray(T[] array) {
        T temp = null;
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length;j++) {
                if(array[i].doubleValue() > array[j].doubleValue()) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
