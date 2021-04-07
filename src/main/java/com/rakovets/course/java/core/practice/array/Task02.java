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
                {9, 7, 9},
                {10, 9, 6},
                {7, 8, 10}
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
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            for (int mark : marks[i]) {
                sum = sum + mark;
            }
        }

        return BigDecimal.valueOf(sum * 1.0 / (marks.length * marks[0].length)).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * Возвращает минимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[][] marks) {
        int minMark = marks[0][0];

        for (int[] arrayOfMarks : marks) {
            for (int mark : arrayOfMarks) {
                if (minMark > mark) {
                    minMark = mark;
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

        for (int i = 0; i < marks.length; i++) {
            for (int mark : marks[i]) {
                if (maxMark < mark) {
                    maxMark = mark;
                }
            }
        }

        return maxMark;
    }
}
