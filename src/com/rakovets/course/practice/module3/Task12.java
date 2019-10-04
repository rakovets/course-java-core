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
        String ChineseZodiac = getChineseZodiac(year);
        String NormalZodiac = getNormalZodiac(day, month);

        System.out.println("Zodiac Sign: " + NormalZodiac + ". Chinese Zodiac: " + ChineseZodiac);
    }

    private static String getNormalZodiac(int day, int month) {
    String NormalZodiac = "";

    switch (month) {
        case 1:
            if (day < 21) {
                NormalZodiac = "Sea-Goat";
            } else {
                NormalZodiac = "Water-Bearer";
            }
            break;
        case 2:
            if (day < 21) {
                NormalZodiac = "Water-Bearer";
            } else {
                NormalZodiac = "Fishes";
            }
            break;
        case 3:
            if (day < 21) {
                NormalZodiac = "Fishes";
            } else {
                NormalZodiac = "Ram";
            }
            break;
        case 4:
            if (day < 21) {
                NormalZodiac = "Ram";
            } else {
                NormalZodiac = "Bull";
            }
            break;
        case 5:
            if (day < 22) {
                NormalZodiac = "Bull";
            } else {
                NormalZodiac = "Twins";
            }
            break;
        case 6:
            if (day < 22) {
                NormalZodiac = "Twins";
            } else {
                NormalZodiac = "Crab";
            }
            break;
        case 7:
            if (day < 23) {
                NormalZodiac = "Crab";
            } else {
                NormalZodiac = "Lion";
            }
            break;
        case 8:
            if (day < 24) {
                NormalZodiac = "Lion";
            } else {
                NormalZodiac = "Maiden";
            }
            break;
        case 9:
            if (day < 24) {
                NormalZodiac = "Maiden";
            } else {
                NormalZodiac = "Scales";
            }
            break;
        case 10:
            if (day < 24) {
                NormalZodiac = "Scales";
            } else {
                NormalZodiac = "Scorpion";
            }
            break;
        case 11:
            if (day < 23) {
                NormalZodiac = "Scorpion";
            } else {
                NormalZodiac = "Archer";
            }
            break;
        case 12:
            if (day < 22) {
                NormalZodiac = "Archer";
            } else {
                NormalZodiac = "Sea-Goat";
            }
            break;
    }

    return  NormalZodiac;
    }

    private static String getChineseZodiac(int year) {
        int numberOfChineseZodiac;
        String ChineseZodiac = "";

        numberOfChineseZodiac = year % 12;
        switch (numberOfChineseZodiac) {
            case 0:
                ChineseZodiac = "Monkey";
                break;
            case 1:
                ChineseZodiac = "Rooster";
                break;
            case 2:
                ChineseZodiac = "Dog";
                break;
            case 3:
                ChineseZodiac = "Pig";
                break;
            case 4:
                ChineseZodiac = "Rat";
                break;
            case 5:
                ChineseZodiac = "Ox";
                break;
            case 6:
                ChineseZodiac = "Tiger";
                break;
            case 7:
                ChineseZodiac = "Rabbit";
                break;
            case 8:
                ChineseZodiac = "Dragon";
                break;
            case 9:
                ChineseZodiac = "Snake";
                break;
            case 10:
                ChineseZodiac = "Horse";
                break;
            case 11:
                ChineseZodiac = "Ram";
                break;
        }

        return ChineseZodiac;
    }
}