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
        double averageAllSubjectMarks = 0.0;
        double[] averageAllSubjectsMarks = new double[marks.length];

        for (int i = 0; i < marks.length; i++) {
            double sumAllSubjectMarks = 0.0;
            for (int j = 0; j < marks[i].length; j++) {
                sumAllSubjectMarks += marks[i][j];
            }
            averageAllSubjectMarks = (double) Math.round((sumAllSubjectMarks / marks[i].length) * 100) / 100;
            averageAllSubjectsMarks[i] += averageAllSubjectMarks;
        }

        return averageAllSubjectsMarks;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        int[] minAllSubjectsMark = new int[marks.length];

        for (int i = 0; i < marks.length; i++) {
            int minSubjectMark = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (minSubjectMark > marks[i][j]) {
                    minSubjectMark = marks[i][j];
                }
            }
            minAllSubjectsMark[i] += minSubjectMark;
        }

        return minAllSubjectsMark;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int[] maxAllSubjectsMark = new int[marks.length];

        for (int i = 0; i < marks.length; i++) {
            int maxSubjectMark = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (maxSubjectMark < marks[i][j]) {
                    maxSubjectMark = marks[i][j];
                }
            }
            maxAllSubjectsMark[i] += maxSubjectMark;
        }

        return maxAllSubjectsMark;
    }
}
