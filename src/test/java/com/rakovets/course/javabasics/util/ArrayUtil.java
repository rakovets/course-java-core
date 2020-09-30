package com.rakovets.course.javabasics.util;

import java.util.Arrays;

/**
 * Parser array from {@link String} to array.
 *
 * @author Dmitry Rakovets
 * @since 1.0
 */
public abstract class ArrayUtil {
    /**
     * Parser array from {@link String} to array of type {@code double}.
     */
    public static double[] parseToDouble(String s, String spliterator) {
        return (s == null)
                ? new double[]{}
                : Arrays.stream(s.split(spliterator)).mapToDouble(Double::valueOf).toArray();
    }

    /**
     * Parser array from {@link String} to array of type {@code int}.
     */
    public static int[] parseToInt(String s, String spliterator) {
        return (s == null)
                ? new int[]{}
                : Arrays.stream(s.split(spliterator)).mapToInt(Integer::valueOf).toArray();
    }
}
