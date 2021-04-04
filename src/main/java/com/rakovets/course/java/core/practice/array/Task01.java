package com.rakovets.course.java.core.practice.array;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Разработать программу для электронного дневника, которая работает с отметками только по одному предмету.
 *
 * @author Dmitry Rakovets
 */
class Task01 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int[] marks = {8, 2, 10, 4, 5, 6};

        double averageMark = getAverageMark(marks);
        System.out.printf("Average mark: %f\n", averageMark);
        int minMark = getMinMark(marks);
        System.out.printf("Min mark: %d\n", minMark);
        int maxMark = getMaxMark(marks);
        System.out.printf("Max mark: %d\n", maxMark);
    }

    /**
     * Возвращает средне арифметическую отметку с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double getAverageMark(int[] marks) {
        double averageMarks = 0.0;
        double totalAmountmarks = 0.0;

        for (int i = 0; i < marks.length; i++) {
            totalAmountmarks += marks[i];
        }
        averageMarks = BigDecimal.valueOf(totalAmountmarks / marks.length).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
        return averageMarks;
    }

    /**
     * Возвращает минимальную отметку.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[] marks) {
        int minMark = marks [0];
        for (int i = 0; i < marks.length; i++) {
            if (minMark > marks[i]) {
                minMark = marks[i];
            }
        }
        return minMark;
    }

    /**
     * Возвращает максимальную отметку.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[] marks) {
        int maxMark = marks [0];
        for (int i = 0; i < marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
            }
        }
        return maxMark;
    }
}
