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
                {0, 1, 2},
                {1, 4, 4},
                {4, 4, 5}
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
        double sum = 0;
        double countOfMarks = 0;
        double[] arrayOfMarks = new double[marks.length];

        for (int i = 0; i < marks.length; i++) {
            for (int mark : marks[i]) {
                sum += mark;
                countOfMarks++;
            }
            arrayOfMarks[i] = BigDecimal.valueOf(sum * 1.0 / countOfMarks).setScale(2, RoundingMode.HALF_UP).doubleValue();
            sum = 0;
            countOfMarks = 0;
        }

        return arrayOfMarks;
    }


    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {

        int[] arrayOfMarks = new int[marks.length];

        for (int i = 0; i < marks.length; i++) {
            int minMark = marks[i][0];
            for (int mark : marks[i]) {
                if (minMark > mark) {
                    minMark = mark;
                }
            }
            arrayOfMarks[i] = minMark;
        }

        return arrayOfMarks;
    }


    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int[] arrayOfMarks = new int[marks.length];

        for (int i = 0; i < marks.length; i++) {
            int maxMark = marks[i][0];
            for (int mark : marks[i]) {
                if (maxMark < mark) {
                    maxMark = mark;
                }
            }
            arrayOfMarks[i] = maxMark;
        }

        return arrayOfMarks;
    }
}
