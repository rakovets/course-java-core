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
        String chineseZodiac = new String();
        switch(year) {
            case 2001:
            case 2013:
                chineseZodiac = "Snake";
                break;
            case 2002:
            case 2014:
                chineseZodiac = "Horse";
                break;
            case 2003:
            case 2015:
                chineseZodiac = "Ram";
                break;
            case 2004:
            case 2016:
                chineseZodiac = "Monkey";
                break;
            case 2005:
            case 2017:
                chineseZodiac = "Rooster";
                break;
            case 2006:
            case 2018:
                chineseZodiac = "Dog";
                break;
            case 2007:
            case 2019:
                chineseZodiac = "Pig";
                break;
            case 2008:
            case 2020:
                chineseZodiac = "Rat";
                break;
            case 2009:
            case 2021:
                chineseZodiac = "Ox";
                break;
            case 2010:
            case 2022:
                chineseZodiac = "Tiger";
                break;
            case 2011:
            case 2023:
                chineseZodiac = "Rabbit";
                break;
            case 2012:
            case 2024:
                chineseZodiac = "Dragon";
                break;
        }
        String zodiacSign = new String();
//        if (day > 23 && month == 12 | day < 22 && month == 1) {
//            zodiacSign = "Sea-Goat";
//        } else if (day > 20 && month == 1 | day < 21 && month == 2) {
//            zodiacSign = "Water-Bearer";
//        } else if (day > 20 && month == 2 | day < 21 && month == 3) {
//            zodiacSign = "Fishes";
//        } else if (day > 20 && month == 3 | day < 21 && month == 4) {
//            zodiacSign = "Ram";
//        } else if (day > 20 && month == 4 | day < 21 && month == 5) {
//            zodiacSign = "Bull";
//        } else if (day > 21 && month == 5 | day < 22 && month == 6) {
//            zodiacSign = "Twins";
//        } else if (day > 22 && month == 6 | day < 23 && month == 7) {
//            zodiacSign = "Crab";
//        } else if (day > 23 && month == 7 | day < 24 && month == 8) {
//            zodiacSign = "Lion";
//        } else if (day > 23 && month == 8 | day < 24 && month == 9) {
//            zodiacSign = "Maiden";
//        } else if (day > 23 && month == 9 | day < 24 && month == 10) {
//            zodiacSign = "Scales";
//        } else if (day > 22 && month == 10 | day < 23 && month == 11) {
//            zodiacSign = "Scorpion";
//        } else if (day > 21 && month == 11 | day < 23 && month == 12) {
//            zodiacSign = "Archer";
//        }
        switch(month) {
            case 1:
                if (day < 21) {
                    zodiacSign = "Sea-Goat";
                } else {
                    zodiacSign = "Water-Bearer";
                }
                break;
            case 2:
                if (day < 21) {
                    zodiacSign = "Water-Bearer";
                } else {
                    zodiacSign = "Fishes";
                }
                break;
            case 3:
                if (day < 21) {
                    zodiacSign = "Fishes";
                } else {
                    zodiacSign = "Ram";
                }
                break;
            case 4:
                if (day < 21) {
                    zodiacSign = "Ram";
                } else {
                    zodiacSign = "Bull";
                }
                break;
            case 5:
                if (day < 21) {
                    zodiacSign = "Bull";
                } else {
                    zodiacSign = "Twins";
                }
                break;
            case 6:
                if (day < 22) {
                    zodiacSign = "Twins";
                } else {
                    zodiacSign = "Crab";
                }
                break;
            case 7:
                if (day < 23) {
                    zodiacSign = "Crab";
                } else {
                    zodiacSign = "Lion";
                }
                break;
            case 8:
                if (day < 24) {
                    zodiacSign = "Lion";
                } else {
                    zodiacSign = "Maiden";
                }
                break;
            case 9:
                if (day < 24) {
                    zodiacSign = "Maiden";
                } else {
                    zodiacSign = "Scales";
                }
                break;
            case 10:
                if (day < 23) {
                    zodiacSign = "Scales";
                } else {
                    zodiacSign = "Scorpion";
                }
                break;
            case 11:
                if (day < 22) {
                    zodiacSign = "Scorpion";
                } else {
                    zodiacSign = "Archer";
                }
                break;
            case 12:
                if (day < 22) {
                    zodiacSign = "Archer";
                } else {
                    zodiacSign = "Sea-Goat";
                }
        }

        System.out.println("Zodiac Sign: " + zodiacSign + ". Chinese Zodiac: " + chineseZodiac);
    }
}