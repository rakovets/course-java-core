package com.rakovets.course.java.core.practice.arrays;

import com.rakovets.course.java.core.util.NumberUtil;

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
        int[] marks = {1, 2, 3, 4, 5, 6};

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
        int divider = 0;
        double sumOfMarks = 0.0;
        for (double currentMark : marks) {
            sumOfMarks += currentMark;
            divider++;
        }
        double averageMark = sumOfMarks / divider;
        return NumberUtil.roundValueToTwoDigitsForMantissa(averageMark);
    }

    /**
     * Возвращает минимальную отметку.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[] marks) {
        int minMark = marks[0];
        for (int currentMark : marks) {
            if (minMark > currentMark) {
                minMark = currentMark;
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
        int maxMark = marks[0];
        for (int currentMark : marks) {
            if (maxMark < currentMark) {
                maxMark = currentMark;
            }
        }
        return maxMark;
    }
}
