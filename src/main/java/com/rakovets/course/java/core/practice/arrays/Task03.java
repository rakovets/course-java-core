package com.rakovets.course.java.core.practice.arrays;

import com.rakovets.course.java.core.util.NumberUtil;

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
        double sumOfMarks;
        double averageMarkForOneSubject;
        double[] averageMarks = new double[marks.length];
        for (int i = 0; i < marks.length; i++) {
            sumOfMarks = 0.0;
            for (int j = 0; j < marks[i].length; j++) {
                sumOfMarks += marks[i][j];
            }
            averageMarkForOneSubject = NumberUtil.roundValueToTwoDigitsForMantissa(sumOfMarks / marks[i].length);
            averageMarks[i] = averageMarkForOneSubject;
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
        int[] minMarks = new int[marks.length];
        int minMarkForOneSubject;
        for (int i = 0; i < marks.length; i++) {
            minMarkForOneSubject = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < minMarkForOneSubject) {
                    minMarkForOneSubject = marks[i][j];
                }
                minMarks[i] = minMarkForOneSubject;
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
        int[] maxMarks = new int[marks.length];
        int maxMarkForOneSubject;
        for (int i = 0; i < marks.length; i++) {
            maxMarkForOneSubject = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] > maxMarkForOneSubject) {
                    maxMarkForOneSubject = marks[i][j];
                }
                maxMarks[i] = maxMarkForOneSubject;
            }
        }
        return maxMarks;
    }
}
