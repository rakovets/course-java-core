package com.rakovets.course.practice.module3;

import java.util.Scanner;

/**
 * Разработать программу для сайта посвященного астрологии:
 * Которая выводит знак зодиака и названия года по китайскому календарю, если известно:
 *
 * @param day   - число дня рождения
 * @param month - месяц дня рождения
 * @param year  - год дня рождения
 * @return 'Zodiac Sign: {0}. Chinese Zodiac: {1}', где {0} - знак зодиака, {1} - год зодиака
 */
public class Task12 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int day = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int month = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        int year = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[2]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        if ((day >= 21 && month == 3) || (day <= 19 && month == 4))
            System.out.println("Zodiac Sign: Ram. Chinese Zodiac: Monkey");
        if ((day >= 20 && month ==4) || (day <= 20 && month ==5))
            System.out.println("Zodiac Sign: Bull. Chinese Zodiac: Rooster");
        if ((day >= 21 && month ==5) || (day <= 20 && month ==6))
            System.out.println("Zodiac Sign: Twins. Chinese Zodiac: Dog");
        if ((day >= 21 && month ==6) || (day <= 22 && month ==7))
            System.out.println("Zodiac Sign: Crab. Chinese Zodiac: Pig");
        if ((day >= 23 && month ==7) || (day <= 22 && month ==8))
            System.out.println("Zodiac Sign: Lion. Chinese Zodiac: Rat");
        if ((day >= 23 && month ==8) || (day <= 22 && month ==9))
            System.out.println("Zodiac Sign: Maiden. Chinese Zodiac: Ox");
        if ((day >= 23 && month ==9) || (day <= 22 && month ==10))
            System.out.println("Zodiac Sign: Scales. Chinese Zodiac: Tiger");
        if ((day > 23 && month ==10) || (day <= 21 && month ==11))
            System.out.println("Zodiac Sign: Scorpion. Chinese Zodiac: Rabbit");
        if ((day >= 22 && month ==11) || (day <= 21 && month ==12))
            System.out.println("Zodiac Sign: Archer. Chinese Zodiac: Dragon");
        if ((day >= 22 && month ==12) || (day <= 19 && month ==1))
            System.out.println("Zodiac Sign: Sea-Goat. Chinese Zodiac: Snake");
        if ((day >= 20 && month ==1) || (day <= 18 && month ==2))
            System.out.println("Zodiac Sign: Water-Bearer. Chinese Zodiac: Horse");
        if ((day >= 19 && month ==2) || (day <= 20 && month ==3))
            System.out.println("Zodiac Sign: Fishes. Chinese Zodiac: Ram");
    }
}