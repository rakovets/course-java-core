package com.rakovets.course.practice.module3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.GregorianCalendar;
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

        String chinesZodiac;
        String zodiacSing;
        int zodiac = year % 12;

        switch (zodiac) {
            case 0:
                chinesZodiac = "Monkey";
                break;
            case 1:
                chinesZodiac = "Rooster";
                break;
            case 2:
                chinesZodiac = "Dog";
                break;
            case 3:
                chinesZodiac = "Pig";
                break;
            case 4:
                chinesZodiac = "Rat";
                break;
            case 5:
                chinesZodiac = "Ox";
                break;
            case 6:
                chinesZodiac = "Tiger";
                break;
            case 7:
                chinesZodiac = "Rabbit";
                break;
            case 8:
                chinesZodiac = "Dragon";
                break;
            case 9:
                chinesZodiac = "Snake";
                break;
            case 10:
                chinesZodiac = "Horse";
                break;
            case 11:
                chinesZodiac = "Ram";
                break;
            default:
                chinesZodiac = "Incorect Year";
        }
        switch (month) {
            case 1:
                if (day < 21) {
                    zodiacSing = "Sea-Goat";
                } else {
                    zodiacSing = "Water-Bearer";
                }
                break;
            case 2:
                if (day < 20) {
                    zodiacSing = "Water-Bearer";
                } else {
                    zodiacSing = "Fishes";
                }
                break;
            case 3:
                if (day < 21) {
                    zodiacSing = "Fishes";
                } else {
                    zodiacSing = "Ram";
                }
                break;
            case 4:
                if (day < 21) {
                    zodiacSing = "Ram";
                } else {
                    zodiacSing = "Bull";
                }
                break;
            case 5:
                if (day < 22) {
                    zodiacSing = "Bull";
                } else {
                    zodiacSing = "Twins";
                }
                break;
            case 6:
                if (day < 22) {
                    zodiacSing = "Twins";
                } else {
                    zodiacSing = "Crab";
                }
                break;
            case 7:
                if (day < 23) {
                    zodiacSing = "Crab";
                } else {
                    zodiacSing = "Lion";
                }
                break;
            case 8:
                if (day < 23) {
                    zodiacSing = "Lion";
                } else {
                    zodiacSing = "Maiden";
                }
                break;
            case 9:
                if (day < 24) {
                    zodiacSing = "Maiden";
                } else {
                    zodiacSing = "Scales";
                }
                break;
            case 10:
                if (day < 24) {
                    zodiacSing = "Scales";
                } else {
                    zodiacSing = "Scorpion";
                }
                break;
            case 11:
                if (day < 23) {
                    zodiacSing = "Scorpion";
                } else {
                    zodiacSing = "Archer";
                }
                break;
            case 12:
                if (day < 23) {
                    zodiacSing = "Archer";
                } else {
                    zodiacSing = "Sea-Goat";
                }
                break;
            default:
                zodiacSing = "Incorect Day or Month";
        }

        System.out.println("Zodiac Sign: " + zodiacSing + ". Chinese Zodiac: " + chinesZodiac);
    }
}