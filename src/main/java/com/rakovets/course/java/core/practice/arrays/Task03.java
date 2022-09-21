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
        int[][] marks = { {6, 4, 7}, {0, 1, 2}, {1, 4, 4}, {4, 4, 5} };

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
        double sum = 0;
        int oneLength = marks.length;
        double[] averageArray = new double[oneLength];
        double averageMark;
        for (int i = 0; i < oneLength; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }
            averageMark = NumberUtil.roundValueToTwoDigitsForMantissa(sum / marks[i].length);
            averageArray[i] = averageMark;
            sum = 0;
        }
        return averageArray;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        int min = Integer.MAX_VALUE;
        int oneLength = marks.length;
        int[] minArray = new int[oneLength];
        for (int i = 0; i < oneLength; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                min = Math.min(min, marks[i][j]);
            }
            minArray[i] = min;
            min = Integer.MAX_VALUE;
        }
        return minArray;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int max = Integer.MIN_VALUE;
        int oneLength = marks.length;
        int[] maxArray = new int[oneLength];
        for (int i = 0; i < oneLength; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                max = Math.max(max, marks[i][j]);
            }
            maxArray[i] = max;
            max = Integer.MIN_VALUE;
        }
        return maxArray;
    }
}
