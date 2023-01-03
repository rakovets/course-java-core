package com.rakovets.course.java.core.practice.arrays;

import java.text.DecimalFormat;
import java.util.Arrays;

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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int arrayCounter = 0;
        double marksSum = 0;
        for (int[] internalArray : marks) {
            for (int mark : internalArray) {
                marksSum += mark;
                arrayCounter++;
            }
        }
        return Double.parseDouble(new DecimalFormat("#.##").format(marksSum / arrayCounter));
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
        int minimizeMark = Arrays.stream(marks[0]).findFirst().getAsInt();
        for (int[] internalArray : marks) {
            for (int mark : internalArray) {
                if (mark < minimizeMark) {
                    minimizeMark = mark;
                }
            }
        }
        return minimizeMark;
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
        int maximizeMark = Arrays.stream(marks[0]).findFirst().getAsInt();
        for (int[] internalArray : marks) {
            for (int mark : internalArray) {
                if (mark > maximizeMark) {
                    maximizeMark = mark;
                }
            }
        }
        return maximizeMark;
    }
}
