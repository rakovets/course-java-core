package com.rakovets.course.java.core.practice.array;

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

        double[] averageMarks = new double[marks.length];
        for (int row = 0; row < marks.length; row++) {
            int rowTotal = 0;
            for (int column = 0; column < marks[row].length; column++) {
                rowTotal += marks[row][column];
            }
            averageMarks[row] = Math.round(100.0 * rowTotal / marks[row].length) / 100.0;
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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода

        int[] minMarks = new int[marks.length];
        int min = 0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                if (marks[i][j] < marks[i][min]) {
                    min = j;
                }
                minMarks[i] = marks[i][min];
            }
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
        int max = 0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                if (marks[i][j] > marks[i][max]) {
                    max = j;
                }
                maxMarks[i] = marks[i][max];
            }
        }
        return maxMarks;
    }
}
