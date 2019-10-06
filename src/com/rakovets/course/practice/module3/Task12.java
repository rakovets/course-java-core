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
        if (month==1 && year==2001){
            System.out.println("Zodiac Sign: Sea-Goat. Chinese Zodiac: Snake");
        }else if(month==2 && year==2002){
            System.out.println("Zodiac Sign: Water-Bearer. Chinese Zodiac: Horse");
        }else if(month==3 && year==2003){
            System.out.println("Zodiac Sign: Fishes. Chinese Zodiac: Ram");
        }else if(month==4 && year==2004){
            System.out.println("Zodiac Sign: Ram. Chinese Zodiac: Monkey");
        }else if(month==5 && year==2005){
            System.out.println("Zodiac Sign: Bull. Chinese Zodiac: Rooster");
        }else if(month==6 && year==2006){
            System.out.println("Zodiac Sign: Twins. Chinese Zodiac: Dog");
        }else if(month==7 && year==2007){
            System.out.println("Zodiac Sign: Crab. Chinese Zodiac: Pig");
        }else if(month==8 && year==2008){
            System.out.println("Zodiac Sign: Lion. Chinese Zodiac: Rat");
        }else if(month==9 && year==2009){
            System.out.println("Zodiac Sign: Maiden. Chinese Zodiac: Ox");
        }else if(month==10 && year==2010){
            System.out.println("Zodiac Sign: Scales. Chinese Zodiac: Tiger");
        }else if(month==11 && year==2011){
            System.out.println("Zodiac Sign: Scorpion. Chinese Zodiac: Rabbit");
        }else if(month==12 && year==2012){
            System.out.println("Zodiac Sign: Archer. Chinese Zodiac: Dragon");
        }

    }
}