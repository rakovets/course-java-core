package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public abstract class Math<T extends Number> {
    /**
     * The method is looking for the maximum value in the array.
     *
     * @param array entry argument in the form of generic type array
     * @return maximum value from the array
     */
    public static <T> T getMaxFromArray(T[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    /**
     * The method looks for the minimum value in the array.
     *
     * @param array entry argument in the form of generic type array
     * @return minimum value from the array
     */
    public static <T> T getMinFromArray(T[] array) {
        Arrays.sort(array);
        return array[0];
    }

    /**
     * The method returns a maximum of the three passed parameters.
     *
     * @param firstParameter  entry argument in the form of generic type
     * @param secondParameter entry argument in the form of generic type
     * @param thirdParameter  entry argument in the form of generic type
     * @return maximum value of the three passed parameters
     */
    public static <T> T getMaxFromThreePassedParameters(T firstParameter, T secondParameter, T thirdParameter) {
        T[] array = (T[]) new Object[]{firstParameter, secondParameter, thirdParameter};
        return getMaxFromArray(array);
    }

    /**
     * The method returns a minimum of the fifth passed parameters.
     *
     * @param firstParameter  entry argument in the form of generic type
     * @param secondParameter entry argument in the form of generic type
     * @param thirdParameter  entry argument in the form of generic type
     * @param fourthParameter entry argument in the form of generic type
     * @param fifthParameter  entry argument in the form of generic type
     * @return minimum value of the fifth passed parameters
     */
    public static <T> T getMinFromThreePassedParameters(T firstParameter, T secondParameter, T thirdParameter, T fourthParameter, T fifthParameter) {
        T[] array = (T[]) new Object[]{firstParameter, secondParameter, thirdParameter, fourthParameter, fifthParameter};
        return getMinFromArray(array);
    }

    /**
     * The method looks for the arithmetic mean in the array.
     *
     * @param array entry argument in the form of generic type array
     * @return arithmetic mean from the array
     */
    public static <T extends Number> double getArithmeticMeanFromArray(T[] array) {
        double sumOfValues = 0;

        for (T t : array) {
            sumOfValues += t.doubleValue();
        }

        return sumOfValues / array.length;
    }
}
