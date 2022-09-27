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
        double sum = 0;
        int oneLength = marks.length;
        double[] averageArray = new double[oneLength];
        double averageMark;
        for (int i = 0; i < oneLength; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }
            averageMark = sum / marks[i].length;
            averageArray[i] = averageMark;
            averageMark = BigDecimal.valueOf(averageMark)
                    .setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
        return averageArray;
    }
        /**
         * Возвращает минимальную отметку по предметам за весь период обучения.
         *
         * @param marks отметки
         * @return минимальная отметка
         */

        static int[] getMinMarks ( int[][] marks){
            int[] allMinMarks = new int[marks.length];
            for (int i = 0; i < marks.length; i++) {
                int minMark = marks[i][0];
                for (int j = 0; j < marks[i].length; j++) {
                    if (minMark > marks[i][j]) {
                        minMark = marks[i][j];
                    }
                }
                allMinMarks[i] = minMark;
            }
            return allMinMarks;
        }

        /**
         * Возвращает максимальную отметку по предметам за весь период обучения.
         *
         * @param marks отметки
         * @return максимальная отметка
         */
        static int[] getMaxMarks ( int[][] marks){
            int[] allMaxMarks = new int[marks.length];
            for (int i = 0; i < marks.length; i++) {
                int maxMark = marks[i][0];
                for (int j = 0; j < marks[i].length; j++) {
                    if (maxMark < marks[i][j]) {
                        maxMark = marks[i][j];
                    }
                }
                allMaxMarks[i] = maxMark;
            }
            return allMaxMarks;
        }
    }
