package com.rakovets.course.javabasics.util;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Array utils.
 *
 * @author Dmitry Rakovets
 * @since 1.0
 */
public abstract class ArrayUtil {
    /**
     * Fill two-dimensional array with {@link Scanner} for {@code System.in}.
     *
     * @param scanner         {@link Scanner} for {@code System.in}
     * @param firstDimension  first dimension
     * @param secondDimension second dimension
     */
    public static int[][] fill2DArrayFromStandardInput(Scanner scanner, int firstDimension, int secondDimension) {
        int[][] marks = new int[firstDimension][secondDimension];
        for (int i = 0; i < firstDimension; i++) {
            for (int j = 0; j < secondDimension; j++) {
                marks[i][j] = scanner.nextInt();
            }
        }
        return marks;
    }

    /**
     * Fill array with {@link Scanner} for {@code System.in}.
     *
     * @param scanner   {@link Scanner} for {@code System.in}
     * @param arraySize size for array
     */
    public static int[] fillArrayFromStandardInput(Scanner scanner, int arraySize) {
        int[] marks = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            marks[i] = scanner.nextInt();
        }
        return marks;
    }

    /**
     * Parser {@link String} to array of type {@code double}.
     *
     * @param s           {@link String}
     * @param spliterator spliterator for split {@code s} to array
     */
    public static double[] parseToDouble(String s, String spliterator) {
        return (s == null)
                ? new double[]{}
                : Arrays.stream(s.split(spliterator)).mapToDouble(Double::valueOf).toArray();
    }

    /**
     * Parser {@link String} to array of type {@code int}.
     *
     * @param s           {@link String}
     * @param spliterator spliterator for split {@code s} to array
     */
    public static int[] parseToInt(String s, String spliterator) {
        return (s == null)
                ? new int[]{}
                : Arrays.stream(s.split(spliterator)).mapToInt(Integer::valueOf).toArray();
    }
}
