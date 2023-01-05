package com.rakovets.course.java.core.practice.arrays;

import java.util.Arrays;

import com.rakovets.course.java.core.util.NumberUtil;

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

        double[] averageLineMark = new double[marks.length];  // массив для сред.арифметического строк
        for (int i = 0; i < marks.length; i++) {  // перебор строк в массиве
            int sumLineMarks = 0;
            for (int j = 0; j < marks[i].length; j++) {  // перебор элементов в строке
                sumLineMarks += marks[i][j];  // сумма элементов строки
            }
            // присвоение сред.арифм. в массив для каждой строки при переборе строк
            averageLineMark[i] = NumberUtil.roundValueToTwoDigitsForMantissa(sumLineMarks * 1.0 / marks[i].length);
        }
        return averageLineMark;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {

        int[] minLineMarks = new int[marks.length]; // массив для мин.значения каждой строки
        for (int i = 0; i < marks.length; i++) {  // перебор строк в массиве
            int min = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {  // перебор элементов в строке
                if (min > marks[i][j]) { // поиск мин.элемента в данной строке
                    min = marks[i][j];
                }
            }
            minLineMarks[i] = min; //присвоение мин. для каждой строки
        }
        return minLineMarks;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {

        int[] maxLineMarks = new int[marks.length]; // массив для макс.значения каждой строки
        for (int i = 0; i < marks.length; i++) { // перебор строк в массиве
            int max = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) { // перебор элементов в строке
                if (max < marks[i][j]) { // поиск макс.элемента в данной строке
                    max = marks[i][j];
                }
            }
            maxLineMarks[i] = max; // присвоение макс. для каждой строки
        }
        return maxLineMarks;
    }
}
