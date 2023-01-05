package com.rakovets.course.java.core.practice.arrays;

import com.rakovets.course.java.core.util.NumberUtil;

/**
 * Разработать программу для электронного дневника, которая работает с отметками по всем предметам.
 *
 * @author Dmitry Rakovets
 */
class Task02 {
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int[][] marks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double averageMark = getAverageMark(marks);
        System.out.printf("Average mark: %f\n", averageMark);
        int minMark = getMinMark(marks);
        System.out.printf("Min mark: %d\n", minMark);
        int maxMark = getMaxMark(marks);
        System.out.printf("Max mark: %d\n", maxMark);
    }

    /**
     * Возвращает средне арифметическую отметку за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double getAverageMark(int[][] marks) {

        double averageMark;
        int totalElementsMarks = 0;
        int sumMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) { // перебор элементов массива marks
                sumMarks += marks[i][j]; // сумма всех элементов массива
                totalElementsMarks += 1; // кол-во элементов в массиве
            }
        }
        // averageMark - среднее арифметическое
        averageMark = NumberUtil.roundValueToTwoDigitsForMantissa((double) sumMarks / totalElementsMarks);
        return averageMark;
    }

    /**
     * Возвращает минимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[][] marks) {

        int minMark = marks[0][0];

        for (int i = 0; i < marks.length; i++) { // перебор строк в массиве
            for (int j = 0; j < marks[i].length; j++) { // перебор элементов в строке
                if (minMark > marks[i][j]) { // поиск минимального значения
                    minMark = marks[i][j];
                }
            }
        }
        return minMark;
    }

    /**
     * Возвращает максимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[][] marks) {

        int maxMark = marks[0][0];

        for (int i = 0; i < marks.length; i++) { // перебор строк в массиве
            for (int j = 0; j < marks[i].length; j++) { // перебор элементов в строке
                if (maxMark < marks[i][j]) { // поиск максимального значения
                    maxMark = marks[i][j];
                }
            }
        }
        return maxMark;
    }
}
