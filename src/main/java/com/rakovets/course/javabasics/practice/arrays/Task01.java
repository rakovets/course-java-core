package com.rakovets.course.javabasics.practice.arrays;

import com.rakovets.course.javabasics.util.StandardInputTask;

import java.text.DecimalFormat;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками только по одному предмету
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task01 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int countMarks = INPUT_SCANNER.nextInt();
        int[] marks = nextArray(countMarks);

        // Вызов методов
        getAverageMark(marks);
        getMinMark(marks);
        getMaxMark(marks);
    }

    /**
     * Возвращает средне арифметическую отметку с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double getAverageMark(int[] marks) {
        double averageMark = 0D;
        double tmp = 0D;
        double summ;
        for (int i = 0; i < marks.length; i++) {
            summ = tmp + marks[i];
            tmp = summ;
            averageMark = summ / marks.length;
        }
        DecimalFormat newFormat = new DecimalFormat("#.##");
        double result =  Double.valueOf(newFormat.format(averageMark));
        return result;
    }

    /**
     * Возвращает минимальную отметку.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[] marks) {
        int minMarks = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (minMarks > marks[i]) {
                minMarks = marks[i];
            }
        }
        return minMarks;
    }

    /**
     * Возвращает максимальну отметку.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[] marks) {

        int maxMarks = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (maxMarks < marks[i]) {
                maxMarks = marks[i];
            }
        }
        return maxMarks;
    }

    private static int[] nextArray(int countMarks) {
        int[] marks = new int[countMarks];
        for (int i = 0; i < countMarks; i++) {
            marks[i] = INPUT_SCANNER.nextInt();
        }
        return marks;
    }
}