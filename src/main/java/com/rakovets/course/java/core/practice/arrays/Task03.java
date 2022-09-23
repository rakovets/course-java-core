package com.rakovets.course.java.core.practice.arrays;

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
        double averageMark[] = new double[marks.length];
        int DEGREE_OF_ROUNDING = 2;
        for (int i = 0; i < marks.length; i++) {
            double averageMarkInRow = 0;
            for (int j = 0; j < marks[0].length; j++) {
                averageMarkInRow += marks[i][j];
            } averageMarkInRow /= marks[0].length;
            averageMarkInRow = doubleRounding(averageMarkInRow, DEGREE_OF_ROUNDING);
            averageMark[i] = averageMarkInRow;
        }
        return averageMark;
    }

    static double doubleRounding (double valueToBeRounded, int degreeOfValueRounding) {
        valueToBeRounded *= Math.pow(10, (degreeOfValueRounding + 1)); // better make a rounding function
        long  valueRounding = (long) valueToBeRounded;
        if ((valueRounding % 10) < 5) {
            valueRounding /=10;
        } else {
            valueRounding /= 10;
            valueRounding ++;
        }
        return valueToBeRounded = valueRounding / (Math.pow(10, degreeOfValueRounding));
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        int minMark[] = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int minMarkInRow = marks[i][0];
            for (int j = 0; j < marks[0].length; j++) {
                if (minMarkInRow > marks[i][j]) {
                    minMarkInRow = marks[i][j];
                }
            } minMark[i] = minMarkInRow;
        }
        return minMark;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int maxMark[] = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int maxMarkInRow = marks[i][0];
            for (int j = 0; j < marks[0].length; j++) {
                if (maxMarkInRow < marks[i][j]) {
                    maxMarkInRow = marks[i][j];
                }
            } maxMark[i] = maxMarkInRow;
        }
        return maxMark;
    }
}
