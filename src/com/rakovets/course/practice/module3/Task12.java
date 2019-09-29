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

        String сhineseZodiac;
        String zodiacSign;

        // Определение года по китайскому календарю

        int zodiac = year % 12;

        switch (zodiac) {
            case 0:
                сhineseZodiac = "Monkey";
                break;
            case 1:
                сhineseZodiac = "Rooster";
                break;
            case 2:
                сhineseZodiac = "Dog";
                break;
            case 3:
                сhineseZodiac = "Pig";
                break;
            case 4:
                сhineseZodiac = "Rat";
                break;
            case 5:
                сhineseZodiac = "Ox";
                break;
            case 6:
                сhineseZodiac = "Tiger";
                break;
            case 7:
                сhineseZodiac = "Rabbit";
                break;
            case 8:
                сhineseZodiac = "Dragon";
                break;
            case 9:
                сhineseZodiac = "Snake";
                break;
            case 10:
                сhineseZodiac = "Horse";
                break;
            case 11:
                сhineseZodiac = "Ram";
                break;
            default:
                сhineseZodiac = "Incorrect Year";
        }

        // Определение знака зодиака

        switch (month) {
            case 1:
                if (day < 21){
                    zodiacSign = "Sea-Goat";
                }
                else {zodiacSign = "Water-Bearer";}
            break;
            case 2:
                if (day < 20){
                    zodiacSign = "Water-Bearer";
                }
                else {zodiacSign = "Fishes";}
            break;
            case 3:
                if (day < 21){
                    zodiacSign = "Fishes";
                }
                else {zodiacSign = "Ram";}
            break;
            case 4:
                if (day < 21){
                    zodiacSign = "Ram";
                }
                else {zodiacSign = "Bull";}
            break;
            case 5:
                if (day < 22){
                    zodiacSign = "Bull";
                }
                else {zodiacSign = "Twins";}
            break;
            case 6:
                if (day < 22){
                    zodiacSign = "Twins";
                }
                else {zodiacSign = "Crab";}
            break;
            case 7:
                if (day < 23){
                    zodiacSign = "Crab";
                }
                else {zodiacSign = "Lion";}
            break;
            case 8:
                if (day < 22){
                    zodiacSign = "Lion";
                }
                else {zodiacSign = "Maiden";}
            break;
            case 9:
                if (day < 24){
                    zodiacSign = "Maiden";
                }
                else {zodiacSign = "Scales";}
            break;
            case 10:
                if (day < 24){
                    zodiacSign = "Scales";
                }
                else {zodiacSign = "Scorpion";}
            break;
            case 11:
                if (day < 23){
                    zodiacSign = "Scorpion";
                }
                else {zodiacSign = "Archer";}
            break;
            case 12:
                if (day < 23){
                    zodiacSign = "Archer";
                }
                else {zodiacSign = "Sea-Goat";}
            break;

            default:
                zodiacSign = "Incorrect Day or Month";
        }

        System.out.println("Zodiac Sign: " + zodiacSign + ". Chinese Zodiac: " + сhineseZodiac);
    }
}