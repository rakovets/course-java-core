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
        double[] averageMarksInSubjects = new double[marks.length];
        int sum = 0;
        int i = 0;

        for ( ; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                sum = sum + marks[i][j];
            }
            double isAverageMark = 1.0 * sum / marks.length;
            sum = 0;
            averageMarksInSubjects[i] = BigDecimal.valueOf(isAverageMark).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
        return averageMarksInSubjects;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        int[] minMarketInSubject = new int[marks.length];
        int isMinMark;
        int j = 0;

        for (int i = 0; i < marks.length; i++) {
            isMinMark = marks[i][0];
            for ( ; j < marks[0].length; j++) {
                if (isMinMark > marks[i][j]) {
                    isMinMark = marks[i][j];
                }
            }
            minMarketInSubject[i] = isMinMark;
            isMinMark = 0;
            j = 0;
        }
        return minMarketInSubject;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int[] maxMarketInSubject = new int[marks.length];
        int isMaxMark;
        int j = 0;

        for (int i = 0; i < marks.length; i++) {
            isMaxMark = marks[i][0];
            for ( ; j < marks[0].length; j++) {
                if (isMaxMark < marks[i][j]) {
                    isMaxMark = marks[i][j];
                }
            }
            maxMarketInSubject[i] = isMaxMark;
            isMaxMark = 0;
            j = 0;
        }
        return maxMarketInSubject;
    }
}
