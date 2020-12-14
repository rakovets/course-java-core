package com.rakovets.course.javabasics.practice.arrays;

import com.rakovets.course.javabasics.util.StandardInputTask;

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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int size = marks.length;
        double[] averageMarks = new double[size];
        double averageMark = 0;
        int numberMarks = 0;
        int sumMarks = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                sumMarks += marks[i][j];
                numberMarks += 1;
            }
            averageMark = (double) sumMarks / numberMarks;
            averageMark = (double) Math.round(averageMark * 100) / 100;
            averageMarks[i] = averageMark;
            sumMarks = 0;
            numberMarks = 0;
        }
        return averageMarks;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int minMark = 0;
        int size = marks.length;
        int[] minMarks = new int[size];
        for (int i = 0; i < size; i++) {
            minMark = marks[i][0];
            for (int j = 1; j < marks[i].length; j++) {
                if (minMark >= marks[i][j]) {
                    minMark = marks[i][j];
                }
            }
            minMarks[i] = minMark;
        }
        return minMarks;
    }

    /**
     * Возвращает максимальну отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int maxMark = 0;
        int size = marks.length;
        int[] maxMarks = new int[size];
        for (int i = 0; i < size; i++) {
            maxMark = marks[i][0];
            for (int j = 1; j < marks[i].length; j++) {
                if (maxMark <= marks[i][j]) {
                    maxMark = marks[i][j];
                }
            }
            maxMarks[i] = maxMark;
        }
        return maxMarks;
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