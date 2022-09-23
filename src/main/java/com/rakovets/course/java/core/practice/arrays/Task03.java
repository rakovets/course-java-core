package com.rakovets.course.java.core.practice.arrays;

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
        double[] sumAverageMarks = new double[marks.length];
        double averageMarkPerSubject;

        for (int i = 0; i < marks.length; i++) {
            double subjectMark = 0;
            for (int j = 0; j < marks[0].length; j++) {
                subjectMark += marks[i][j];
            }
            averageMarkPerSubject = subjectMark / marks[i].length;
            averageMarkPerSubject = BigDecimal.valueOf(averageMarkPerSubject)
                    .setScale(2, RoundingMode.HALF_UP)
                    .doubleValue();
            sumAverageMarks[i] = averageMarkPerSubject;
        }
        return sumAverageMarks;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        int minMarks[] = new int[marks.length];
        int minMarkPerArray;

        for (int i = 0; i < marks.length; i++) {
            minMarkPerArray = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < minMarkPerArray) {
                    minMarkPerArray = marks[i][j];
                }
            }
            minMarks[i] = minMarkPerArray;
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
        int maxMarks[] = new int[marks.length];
        int maxMarkPerArray;

        for (int i = 0; i < marks.length; i++) {
            maxMarkPerArray = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if(marks[i][j] > maxMarkPerArray) {
                    maxMarkPerArray = marks[i][j];
                }
            }
            maxMarks[i] = maxMarkPerArray;
        }
        return maxMarks;
    }
}

