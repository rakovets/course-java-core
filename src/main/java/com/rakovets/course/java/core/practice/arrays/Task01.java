package com.rakovets.course.java.core.practice.arrays;

import com.rakovets.course.java.core.util.NumberUtil;

import static com.rakovets.course.java.core.util.NumberUtil.roundValueToTwoDigitsForMantissa;

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
        double totalAllNumber = 0;
        double averageArithmetic = 0;
        for (int i : marks) {
            totalAllNumber += i;
        }
        averageArithmetic = totalAllNumber / marks.length;
        return NumberUtil.roundValueToTwoDigitsForMantissa(averageArithmetic);
    }

    /**
     * Возвращает минимальную отметку.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[] marks) {
        int minimalGrade = marks[0];
        for (int k : marks) {
            if (minimalGrade > k) {
                minimalGrade = k;
            }
        }
        return minimalGrade;
    }

    /**
     * Возвращает максимальную отметку.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[] marks) {
        int maximumGrade = marks[0];
        for (int i : marks) {
            if (maximumGrade < i) {
                maximumGrade = i;
            }
        }
        return maximumGrade;
    }
}
