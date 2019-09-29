package com.rakovets.course.practice.module3;

import java.time.Month;
import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате dd/MM/yyyy.
 * В профиле игрока мы должны месяц выводить не в числовом формате, а в текстовом.
 * Определить название месяца в зависимости от номера.
 *
 * @param monthNumber - номер месяца
 * @return месяц на английском языке (upper case)
 */
public class Task05 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int monthNumber = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        switch (monthNumber){
            case (1):
                System.out.println(Month.JANUARY);
                break;
            case (2):
                System.out.println(Month.FEBRUARY);
                break;
            case (3):
                System.out.println(Month.MARCH);
                break;
            case (4):
                System.out.println(Month.APRIL);
                break;
            case (5):
                System.out.println(Month.MAY);
                break;
            case (6):
                System.out.println(Month.JUNE);
                break;
            case (7):
                System.out.println(Month.JULY);
                break;
            case (8):
                System.out.println(Month.AUGUST);
                break;
            case (9):
                System.out.println(Month.SEPTEMBER);
                break;
            case(10):
                System.out.println(Month.OCTOBER);
                break;
            case (11):
                System.out.println(Month.NOVEMBER);
                break;
            case (12):
                System.out.println(Month.DECEMBER);
                break;

        }
    }

}