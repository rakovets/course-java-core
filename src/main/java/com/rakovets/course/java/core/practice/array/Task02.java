package com.rakovets.course.java.core.practice.array;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
                {6, 4, 7}, {0, 1, 2}, {1, 4, 4}, {4, 4, 5}
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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        double arrayNumberElements = 0;
        double elementsAmount = 0;
        double averageMark = 0;
        for (int i = 0; i<marks.length;i++) {
            for (int j = 0; j<marks[0].length;j++) {
                arrayNumberElements = marks[0].length * marks.length;
            }
        }
        for (int[] mark : marks) {
            for (int j = 0; marks[0].length > j; j++) {
                elementsAmount += mark[j];
                averageMark = elementsAmount / arrayNumberElements;
                averageMark = new BigDecimal(averageMark).setScale(2, RoundingMode.HALF_UP).doubleValue();
            }
        }
        return averageMark;
    }

    /**
     * Возвращает минимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int min = marks[0][0];
        for (int[] mark : marks) {
            for (int j = 0; j < marks[0].length; j++) {
                if (min > mark[j]) {
                    min = mark[j];
                }
            }
        }
        return min;
    }

    /**
     * Возвращает максимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int max = marks[0][0];
        for (int[] mark : marks) {
            for (int j = 0; j < marks[0].length; j++) {
                if (max < mark[j]) {
                    max = mark[j];
                }
            }
        }
        return max;
    }
}
