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
                {6, 4, 7},
                {0, 1, 2},
                {1, 4, 4}
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
        int numberMarks = 0;

        for (int[] subject : marks) {
            for (int mark : subject) {
                sum += mark;
                numberMarks++;
            }
        }
        double isAverageMark = 1.0 * sum / numberMarks;
        return BigDecimal.valueOf(isAverageMark).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * Возвращает минимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[][] marks) {
        int isMinMark = marks [0][0];

        for (int[] subject : marks) {
            for (int mark : subject) {
                if (isMinMark > mark) {
                    isMinMark = mark;
                }
            }
        }
        return isMinMark;
    }

    /**
     * Возвращает максимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[][] marks) {
        int isMaxMark = marks [0][0];

        for (int[] subject : marks) {
            for (int mark : subject) {
                if (isMaxMark < mark) {
                    isMaxMark = mark;
                }
            }
        }
        return isMaxMark;
    }
}
