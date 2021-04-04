package com.rakovets.course.java.core.practice.array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

/**
 * Разработать программу для электронного дневника, которая работает с отметками по каждому предмету.
 *
 * @author Dmitry Rakovets
 */
class Task03 {
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int[][] marks = {
                {6, 4, 7},
                {0, 1, 2},
                {1, 4, 4},
                {4, 4, 5}
        };

        double[] averageMark = getAverageMarks(marks);
        System.out.printf("Average mark: %s\n", Arrays.toString(averageMark));
        int[] minMark = getMinMarks(marks);
        System.out.printf("Min mark: %s\n", Arrays.toString(minMark));
        int[] maxMark = getMaxMarks(marks);
        System.out.printf("Max mark: %s\n", Arrays.toString(maxMark));
    }

    /**
     * Возвращает средне арифметическую отметку по предметам за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double[] getAverageMarks(int[][] marks) {
        double[] averagemarks = new double[marks.length];
        double sum = 0;
        for(int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                sum = sum + marks[i][j];
                if (j + 1 == marks[0].length) {
                    averagemarks[i] = BigDecimal.valueOf(sum /= marks[0].length).setScale(2, RoundingMode.HALF_UP).doubleValue();
                    sum = 0;
                }
            }
        }
        return averagemarks;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        int[] minmarks = new int[marks.length];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                if (min > marks[i][j]) {
                    min = marks[i][j];
                }
                if (j + 1 == marks[0].length){
                    minmarks[i] = min;
                    min = Integer.MAX_VALUE;

                }
            }
        }
        return minmarks;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int[] maxi = new int[marks.length];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                if (max < marks[i][j]) {
                    max = marks[i][j];
                }
                if (j + 1 == marks[0].length){
                    maxi[i] = max;
                    max = Integer.MIN_VALUE;

                }
            }
        }
        return maxi;
    }
}
