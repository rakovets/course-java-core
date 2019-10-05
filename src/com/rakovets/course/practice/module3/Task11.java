package com.rakovets.course.practice.module3;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * Необходимо определить, какие символы вводит пользователь:
 * - латиници
 * - кирилица
 * - цифра
 * - спец. символ
 * Так же программа не должна зависеть от регистра. Известно:
 * @param letter - символ введенный пользователем
 * @return 'latin'/'cyrillic'/'digit'/'undefined'
 *
 * Help: Unicode (decimal)
 */

public class Task11 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        char letter = (args.length != 1) ? scanner.next().charAt(0) : args[0].charAt(0);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        if (letter >= 'A' & letter <= 'Z') {
            System.out.println("latin");
        } else if (letter >= 'a' & letter <= 'z') {
            System.out.println("latin");
        } else if (letter== 'ё' | letter == 'Ё') {
            System.out.println("cyrillic");
        } else if (letter >= 'а' & letter <= 'я') {
            System.out.println("cyrillic");
        } else if (letter >= 'А' & letter <= 'Я') {
            System.out.println("cyrillic");
        } else if (letter >= '0' & letter <= '9') {
            System.out.println("digit");
        } else {
            System.out.println("undefined");
        }

    }
}