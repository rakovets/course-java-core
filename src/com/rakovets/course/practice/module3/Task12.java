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

        int numberYear = year % 12;
        String chineseZodiac = "";
        String zodiacSign = "";
                switch (numberYear) {
                     case 0:
                       chineseZodiac = "Monkey";
                       break;
                   case 1:
                       chineseZodiac = "Rooster";
                       break;
                   case 2:
                       chineseZodiac = "Dog";
                       break;
                   case 3:
                       chineseZodiac = "Pig";
                       break;
                   case 4:
                       chineseZodiac = "Rat";
                       break;
                   case 5:
                       chineseZodiac = "Ox";
                       break;
                   case 6:
                       chineseZodiac = "Tiger";
                       break;
                   case 7:
                       chineseZodiac = "Rabbit";
                       break;
                   case 8:
                       chineseZodiac = "Dragon";
                       break;
                   case 9:
                       chineseZodiac = "Snake";
                       break;
                   case 10:
                       chineseZodiac = "Horse";
                       break;
                   case 11:
                       chineseZodiac = "Ram";
                       break;
                }
        switch (month) {
            case 1:
                zodiacSign = "Sea-Goat";
                break;
            case 2:
                zodiacSign = "Water-Bearer";
                break;
            case 3:
                zodiacSign = "Fishes";
                break;
            case 4:
                zodiacSign = "Ram";
                break;
            case 5:
                zodiacSign = "Bull";
                break;
            case 6:
                zodiacSign = "Twins";
                break;
            case 7:
                zodiacSign = "Crab";
                break;
            case 8:
                zodiacSign = "Lion";
                break;
            case 9:
                zodiacSign = "Maiden";
                break;
            case 10:
                zodiacSign = "Scales";
                break;
            case 11:
                zodiacSign = "Scorpion";
                break;
            case 12:
                zodiacSign = "Archer";
                break;
            default:
                System.out.println("Number of Month is incorrect!!! Try again!");
                break;
        }
             System.out.println("Zodiac Sign: " + zodiacSign + ". Chinese Zodiac: " + chineseZodiac);
    }
}