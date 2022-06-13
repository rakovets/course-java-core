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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        double[] averageMark = new double[marks.length];
        int sumMark;
        int marksLength;
        int subject = 0;
        for (int[] row : marks) {
            sumMark = 0;
            marksLength = 0;
            for (int mark : row) {
                sumMark += mark;
                marksLength++;
            }
            averageMark[subject] = NumberUtil.roundValueToTwoDigitsForMantissa((double) sumMark / marksLength);
            subject++;
        }
        return averageMark;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int[] minMarks = new int[marks.length];
        int subject = 0;
        int minMark;
        for (int[] row : marks) {
            minMark = marks[subject][0];
            for (int mark : row) {
                if (mark < minMark) {
                    minMark = mark;
                }
            }
            minMarks[subject] = minMark;
            subject++;
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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int[] maxMarks = new int[marks.length];
        int subject = 0;
        int maxMark;
        for (int[] row : marks) {
            maxMark = marks[subject][0];
            for (int mark : row) {
                if (mark > maxMark) {
                    maxMark = mark;
                }
            }
            maxMarks[subject] = maxMark;
            subject++;
        }
        return maxMarks;
    }
}
