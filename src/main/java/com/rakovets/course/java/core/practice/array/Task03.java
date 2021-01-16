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
        double sum;
        int counter;
        double average;
        double[] averageGrade = new double[marks.length];
        int k = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = 0;
            counter = 0;
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }
            counter += marks[i].length;
            average = sum / counter;
            averageGrade[k] = (double) Math.round(average * 100) / 100;
            k++;
        }
        return averageGrade;
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
        int min;
        int k = 0;
        int[] minGrade = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            min = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < min) {
                    min = marks[i][j];
                }
            }
            minGrade[k] = min;
            k++;
        }
        return minGrade;
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
        int max;
        int k = 0;
        int[] maxGrade = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            max = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] > max) {
                    max = marks[i][j];
                }
            }
            maxGrade[k] = max;
            k++;
        }
        return maxGrade;
    }
}
