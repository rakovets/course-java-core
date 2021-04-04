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
                {6, 7, 6},
                {4, 5, 3},
                {8, 9, 7}
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
        double totalAmountmarks = 0.0;

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                totalAmountmarks += marks[i][j];
            }
            averageMarks[i] = BigDecimal.valueOf(totalAmountmarks / marks[i].length).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
            totalAmountmarks = 0.0;
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
        int[] minMarkSubjects = new int [marks.length];

        for (int i = 0; i < marks.length; i++) {
            int minMarkSubject = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (minMarkSubject > marks[i][j]) {
                    minMarkSubject = marks[i][j];
                }
                minMarkSubjects [i] = minMarkSubject;
            }
        }
        return minMarkSubjects;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int[] maxMarkSubjects = new int [marks.length];

        for (int i = 0; i < marks.length; i++) {
            int maxMarkSubject = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (maxMarkSubject < marks[i][j]) {
                    maxMarkSubject = marks[i][j];
                }
                maxMarkSubjects [i] = maxMarkSubject;
            }
        }
        return maxMarkSubjects;
    }
}
