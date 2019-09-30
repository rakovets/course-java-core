package com.rakovets.course.practice.module3;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * которая выведет приветствии для пользователя в зависимости от времени суток.
 * Известно:
 *
 * @param hour - текущее значение часов (от 0 до 23)
 * @return приветствие согласно шаблону 'Good morning/day/evening/night'
 */
public class Task02 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int hour = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        if (hour>=0 && hour<=5) {
            System.out.println("Good night");
        } else if (hour>=6 && hour<=11) {
            System.out.println("Good morning");
        } else if (hour>=12 && hour<=17) {
            System.out.println("Good day");
        } else if (hour>=18 && hour<=23) {
            System.out.println("Good evening");

        }


    }
}