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

        double sum = 0;
        double[] marksCalc = new double[marks.length];
        int counter = 0;

        for (int[] mark : marks) {
            for (int i : mark) {
                sum += i;
            }
            marksCalc[counter] = BigDecimal.valueOf(sum / mark.length).setScale(2, RoundingMode.HALF_UP).doubleValue();
            counter++;
            sum = 0;
        }
        return marksCalc;
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

        int[] minMark = new int[marks.length];
        int counter = 0;

        for (int[] mark : marks) {
            int minNum = mark[0];
            for (int markCounter : mark) {
                if (markCounter < minNum) {
                    minNum = markCounter;
                }
            }
            minMark[counter] = minNum;
            counter++;
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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода

        int[] maxMark = new int[marks.length];
        int counter = 0;

        for (int[] mark : marks) {
            int maxNum = mark[0];
            for (int markCounter : mark) {
                if (markCounter > maxNum) {
                    maxNum = markCounter;
                }
            }
            maxMark[counter] = maxNum;
            counter++;
        }
        return maxMark;
    }
}
