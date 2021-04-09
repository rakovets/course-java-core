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
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
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
        double[] averageMarks = new double [marks.length];
        double sumMark = 0.0;

        for (int i = 0; i < marks.length; i++) {
            for (int j : marks[i]) {
                sumMark += j;
            }
            averageMarks[i] = BigDecimal.valueOf(sumMark / marks[i].length).setScale(2, RoundingMode.HALF_UP).doubleValue();
            sumMark = 0.0;
        }
        return averageMarks;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        int[] minMarks = new int [marks.length];
        int minMark;

        for (int i = 0; i < marks.length; i++) {
            minMark = marks[i][0];
            for (int j : marks[i]) {
                if (minMark > j) {
                    minMark = j;
                }
                minMarks[i] = minMark;
            }
        }
        return minMarks;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int[] maxMarks = new int [marks.length];
        int maxMark;

        for (int i = 0; i < marks.length; i++) {
            maxMark = marks[i][0];
            for (int j : marks[i]) {
                if (maxMark < j) {
                    maxMark = j;
                }
                maxMarks[i] = maxMark;
            }
        }
        return maxMarks;
    }
}
