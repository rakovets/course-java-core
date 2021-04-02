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
                {5, 4, 5},
                {4, 9, 4},
                {9, 4, 5}
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
        double[]  result = new double[marks.length];
        double middleMark = 0.0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                middleMark += marks[i][j];
                if (j == (marks[i].length-1)) {
                    middleMark /= marks[i].length;
                    result[i] += BigDecimal.valueOf(middleMark).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
                    middleMark = 0.0;
                }
            }
        }
        return result;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        int[]  result = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int minMark = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (minMark > marks[i][j]) {
                    minMark = marks[i][j];
                }
                if (j == (marks[i].length-1)) {
                    result[i] += minMark;
                }
            }
        }
        return result;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int[]  result = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int maxMark = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (maxMark < marks[i][j]) {
                    maxMark = marks[i][j];
                }
                if (j == (marks[i].length-1)) {
                    result[i] += maxMark;
                }
            }
        }
        return result;
    }

}
