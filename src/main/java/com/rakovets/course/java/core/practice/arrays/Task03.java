package com.rakovets.course.java.core.practice.arrays;

import com.rakovets.course.java.core.example.generics.model.restrict.D;

import java.text.DecimalFormat;
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
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double[] averageMarks = new double[marks.length];
        double marksSum = 0;
        for (int internalArray = 0; internalArray < marks.length; internalArray++) {
            for (int mark = 0; mark < marks[internalArray].length; mark++) {
                marksSum += marks[internalArray][mark];
            }
            averageMarks[internalArray] = Double.parseDouble(decimalFormat.format(marksSum / marks[internalArray].length));
            marksSum = 0;
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
        int[] minimizeMarks = new int[marks.length];
        int minimizeMark = 0;
        for (int internalArray = 0; internalArray < marks.length; internalArray++) {
            minimizeMark = Arrays.stream(marks[internalArray]).findFirst().getAsInt();
            for (int mark = 0; mark < marks[internalArray].length; mark++) {
                if (marks[internalArray][mark] < minimizeMark) {
                    minimizeMark = marks[internalArray][mark];
                }
            }
            minimizeMarks[internalArray] = minimizeMark;
        }
        return minimizeMarks;
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
        int[] maximizeMarks = new int[marks.length];
        int maximizeMark = 0;
        for (int internalArray = 0; internalArray < marks.length; internalArray++) {
            maximizeMark = Arrays.stream(marks[internalArray]).findFirst().getAsInt();
            for (int mark = 0; mark < marks[internalArray].length; mark++) {
                if (marks[internalArray][mark] > maximizeMark) {
                    maximizeMark = marks[internalArray][mark];
                }
            }
            maximizeMarks[internalArray] = maximizeMark;
        }
        return maximizeMarks;
    }
}
