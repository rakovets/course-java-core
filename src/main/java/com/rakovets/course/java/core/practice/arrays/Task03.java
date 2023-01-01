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
                {6, 4, 7},
                {0, 1, 2},
                {1, 4, 4},
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
        int lenght = marks[0].length;
        int lenghtmas = marks.length;
        double average[] = new double[lenghtmas];
        double averageLine;
        double sumLine = 0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                sumLine += marks[i][j];
            }
            averageLine = NumberUtil.roundValueToTwoDigitsForMantissa(sumLine / lenght);
            average[i] = averageLine;
            sumLine = 0;
        }
        return average;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        int lenght = marks.length;
        int average[] = new int[lenght];
        int minLine;
        for (int i = 0; i < marks.length; i++) {
            minLine = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (minLine > marks[i][j]) {
                    minLine = marks[i][j];
                }
                average[i] = minLine;
            }
        }
        return average;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int lenght = marks.length;
        int average[] = new int[lenght];
        int maxLine;
        for (int i = 0; i < marks.length; i++) {
            maxLine = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (maxLine < marks[i][j]) {
                    maxLine = marks[i][j];
                }
                average[i] = maxLine;
            }
        }
        return average;
    }
}
