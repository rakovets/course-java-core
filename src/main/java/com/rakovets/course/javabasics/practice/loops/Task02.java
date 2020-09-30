package com.rakovets.course.javabasics.practice.loops;

import java.util.Scanner;

/**
 * Разработать программу для табличного процессора:
 * Программа генерирует номера строк при создании таблицы. Известно:
 *
 * @param rows            количество строк в таблице
 * @param headerRowEnable имеет ли таблица строку-заголовок 'true'/'false', если имеет, то для первой строки не нужно
 *                        генерировать номер
 * @author Dmitry Rakovets
 * @version 1.0
 * @return номера строк, где каждый номер на новой строке
 */
public class Task02 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);

        // Код необходимый для тестирования, не изменять
        int rows = (args.length != 2) ? scanner.nextInt() : Integer.parseInt(args[0]);
        boolean headerRowEnable = (args.length != 2) ? scanner.nextBoolean() : Boolean.parseBoolean(args[1]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
    }
}