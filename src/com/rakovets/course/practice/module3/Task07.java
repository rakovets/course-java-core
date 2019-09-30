package com.rakovets.course.practice.module3;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * Определить количество дней в году.
 * В високосном годе - 366 дней, тогда как в обычном 365. Високосными годами являются все года
 * делящиеся без остатка на 4 за исключением годов, которые делятся нацело на 400
 * Известно:
 *
 * @param year - год
 * @return 'leap year'/'not a leap year'
 */

public class Task07 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int year = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int result;
        int result400;
        result = year % 4;
        result400 = year % 400;
        if ((result != 0) || (result400 == 0)) {
            System.out.println("not a leap year");
        }
        else {
            System.out.println("leap year");
        }
    }
}