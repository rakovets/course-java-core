package com.rakovets.course.javabasics.practice.arrays;

import com.rakovets.course.javabasics.util.StandardInputTask;

import java.text.DecimalFormat;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками по каждому предмету.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int countDisciplines = INPUT_SCANNER.nextInt();
        int countSemesters = INPUT_SCANNER.nextInt();
        int[][] marks = nextArray(countDisciplines, countSemesters);

        // Вызов методов
        getAverageMark(marks);
        getMinMark(marks);
        getMaxMark(marks);
    }

    /**
     * Возвращает средне арифметическую отметку по предметам за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double[] getAverageMark(int[][] marks) {
        double summ = 0;
        double averageMark = 0D;
        double[] ResultArray = new double[marks.length];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                summ += marks[i][j];
                averageMark = summ / marks[i].length;
            }
            ResultArray[i] = averageMark;
            DecimalFormat newFormat = new DecimalFormat("#.##");
            double result = Double.valueOf(newFormat.format(averageMark));
            ResultArray[i] = result;
            summ = 0;
        }
        return ResultArray;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMark(int[][] marks) {

        int[] ResultArray = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int minMark = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (minMark > marks[i][j]) {
                    minMark = marks[i][j];
                }
                ResultArray[i] = minMark;
            }
        }
        return ResultArray;
    }

    /**
     * Возвращает максимальну отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMark(int[][] marks) {

        int[] ResultArray = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int maxMark = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (maxMark < marks[i][j]) {
                    maxMark = marks[i][j];
                }
                ResultArray[i] = maxMark;
            }
        }
        return ResultArray;

    }

    private static int[][] nextArray(int countDisciplines, int countSemesters) {
        int[][] marks = new int[countDisciplines][countSemesters];
        for (int i = 0; i < countDisciplines; i++) {
            for (int j = 0; j < countSemesters; j++) {
                marks[i][j] = INPUT_SCANNER.nextInt();
            }
        }
        return marks;
    }
}