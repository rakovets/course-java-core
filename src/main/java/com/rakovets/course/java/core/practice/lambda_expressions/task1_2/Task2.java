package com.rakovets.course.java.core.practice.lambda_expressions.task1_2;

public class Task2 {
    // Вывести таблицу умножения от 1 до 10 в 1 столбец
    public static void getMultiplicationTableColumn() {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println(i * j + " ");
            }
        }
    }

    // Вывести таблицу умножения от 1 до 10 в 5 столбцов
    public static void getMultiplicationTable5Column() {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if (j == 6) {
                    System.out.println();
                }
                System.out.printf("%5d", (i * j));
            }
            System.out.println();
        }
    }
}
