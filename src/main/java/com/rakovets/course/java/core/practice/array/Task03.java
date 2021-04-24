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

        for (int[] subject : marks) {
            for (int mark : subject) {
                sum += mark;
            }
            double isAverageMark = 1.0 * sum / marks[i].length;
            sum = 0;
            averageMarksInSubjects[i] = BigDecimal.valueOf(isAverageMark).setScale(2, RoundingMode.HALF_UP).doubleValue();
            i++;
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
        int i = 0;

        for (int[] subject : marks) {
            isMinMark = subject [0];
            for (int mark : subject) {
                if (isMinMark > mark) {
                    isMinMark = mark;
                }
            }
            minMarketInSubject[i] = isMinMark;
            i++;
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
        int i = 0;

        for (int[] subject : marks) {
            isMaxMark = subject [0];
            for (int mark : subject) {
                if (isMaxMark < mark) {
                    isMaxMark = mark;
                }
            }
            maxMarketInSubject[i] = isMaxMark;
            i++;
        }
        return maxMarketInSubject;
    }
}
