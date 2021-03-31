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
        double[] averageValueArray = new double[marks.length];

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                averageValueArray[i] += marks[i][j];
            }
            averageValueArray[i] = BigDecimal.valueOf(averageValueArray[i] /= marks[0].length )
                    .setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
        return  averageValueArray;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        int[] minValueArray = new int [marks.length];

        for (int i = 0; i < marks.length; i++) {
            minValueArray[i] = marks[i][0];
            for (int j = 0; j < marks[0].length; j++) {
                if (minValueArray[i] > marks[i][j]){
                    minValueArray[i] = marks[i][j];

                }
            }
        }
        return minValueArray;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int[] maxValueArray = new int [marks.length];

        for (int i = 0; i < marks.length; i++) {
            maxValueArray[i] = marks[i][0];
            for (int j = 0; j < marks[0].length; j++) {
                if (maxValueArray[i] < marks[i][j]){
                    maxValueArray[i] = marks[i][j];
                }
            }
        }
        return maxValueArray;
    }
}
