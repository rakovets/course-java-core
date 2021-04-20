package com.rakovets.course.java.core.practice.array;

import java.util.Arrays;
import java.math.BigDecimal;
import java.math.RoundingMode;

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
        double[] marksAverage = new double[marks.length];
        double marksSum = 0;
        int newArrayCounter = 0;

        for (int[] mark : marks) {
            for (int markCounter : mark) {
                marksSum += markCounter;
            }
            marksAverage[newArrayCounter] = BigDecimal.valueOf(marksSum / mark.length).setScale(2, RoundingMode.HALF_UP).doubleValue();
            newArrayCounter++;
            marksSum = 0;
        }
        return  marksAverage;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        int[] minMark = new int [marks.length];
        int newArrayCounter = 0;

        for (int[] mark : marks) {
            int minNumber = mark[0];
            for (int markCounter : mark) {
                if (markCounter < minNumber) {
                    minNumber = markCounter;
                }
            }
            minMark[newArrayCounter] = minNumber;
            newArrayCounter++;
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
        int[] maxMark = new int [marks.length];
        int newArrayCounter = 0;

        for (int[] mark : marks) {
            int maxNumber = mark[0];
            for (int markCounter : mark) {
                if (markCounter > maxNumber) {
                    maxNumber = markCounter;
                }
            }
            maxMark[newArrayCounter] = maxNumber;
            newArrayCounter++;
        }
        return maxMark;
    }
}
