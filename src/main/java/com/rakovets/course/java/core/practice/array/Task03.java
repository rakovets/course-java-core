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
        double[] averageMarks = new double[marks.length];
        for (int i = 0; i < marks.length; i++) {
            double summ = 0.0;
            int quantityMarks = 0;
            for (int j = 0; j < marks[i].length; j++) {
                summ += marks[i][j];
                quantityMarks ++;
            }
            averageMarks[i] = BigDecimal.valueOf(summ / quantityMarks).setScale(2, RoundingMode.HALF_UP).doubleValue();
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
        int[] minimalMarks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int minimalMark = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (minimalMark > marks[i][j]) {
                    minimalMark = marks[i][j] ;
                }
                minimalMarks[i] = minimalMark;
            }
        }
        return minimalMarks;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int[] maxMarks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int maxMark = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (maxMark < marks[i][j]) {
                    maxMark = marks[i][j];
                }
                maxMarks[i] = maxMark;
            }
        }
        return maxMarks;
    }
}
