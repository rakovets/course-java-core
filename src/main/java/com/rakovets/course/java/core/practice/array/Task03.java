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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода

        double sumOfMarks = 0;
        double[] markCalculating = new double[marks.length];
        int newArrayCounter = 0;

        for (int[] mark : marks) {
            for (int markCounter : mark) {
                sumOfMarks += markCounter;
            }
            markCalculating[newArrayCounter] = BigDecimal.valueOf(sumOfMarks / mark.length).setScale(2, RoundingMode.HALF_UP).doubleValue();
            newArrayCounter++;
            sumOfMarks = 0;
        }
        return markCalculating;
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

        int[] minMarkCalculating = new int[marks.length];
        int newArrayCounter = 0;

        for (int[] mark : marks) {
            int minNumber = mark[0];
            for (int markCounter : mark) {
                if (markCounter < minNumber) {
                    minNumber = markCounter;
                }
            }
            minMarkCalculating[newArrayCounter] = minNumber;
            newArrayCounter++;
        }
        return minMarkCalculating;
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

        int[] maxMarkCalculating = new int[marks.length];
        int newArrayCounter = 0;

        for (int[] mark : marks) {
            int maxNumber = mark[0];
            for (int markCounter : mark) {
                if (markCounter > maxNumber) {
                    maxNumber = markCounter;
                }
            }
            maxMarkCalculating[newArrayCounter] = maxNumber;
            newArrayCounter++;
        }
        return maxMarkCalculating;
    }
}
