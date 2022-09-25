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
        double[] averageMarks = new double[marks.length];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                double sumAverageMarksPerArray = 0;
                double flow = 0;
                for (double flowMark : marks[i]) {
                    sumAverageMarksPerArray += flowMark;
                    flow++;
                }
                double averageMarkPerArray = sumAverageMarksPerArray / flow;
                averageMarks[i] = NumberUtil.roundValueToTwoDigitsForMantissa(averageMarkPerArray);
            }
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
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                int minMark = marks[i][j];
                for (int flowMark : marks[i]) {
                    if (minMark > flowMark) {
                        minMark = flowMark;
                    }
                    minMarks[i] = minMark;
                }
            }
        }
        return minMarks;
    }


    static int[] getMinMarks2(int[][] marks) {
        int[] minMarks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            Arrays.sort(marks[i]);
            minMarks[i] = marks[i][0];
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
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                int maxMark = marks[i][j];
                for (int flowMark : marks[i]) {
                    if (maxMark < flowMark) {
                        maxMark = flowMark;
                    }
                    maxMarks[i] = maxMark;
                }
            }
        }
        return maxMarks;
    }
    static int[] getMaxMarks2(int[][] marks) {
        int[] maxMarks = new int[marks[0].length];
        for (int i = maxMarks.length - 1; i >= 0; i--) {
            Arrays.sort(marks[i]);
            maxMarks[i] = marks[i][marks[0].length-1];
        }
        return maxMarks;
    }
}
