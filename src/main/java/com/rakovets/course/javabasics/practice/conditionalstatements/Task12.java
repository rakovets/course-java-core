package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для сайта посвященного астрологии:
 * Которая выводит знак зодиака и названия года по китайскому календарю, если известно:
 *
 * @param day   - число дня рождения
 * @param month - месяц дня рождения
 * @param year  - год дня рождения (больше 0 г. н.э. и нет никаких циклических смещений)
 *              <p>
 *              21.3-20.4 - `Ram`
 *              21.4-20.5 - `Bull`
 *              21.5-21.6 - `Twins`
 *              22.6-22.7 - `Crab`
 *              23.7-22.8 - `Lion`
 *              23.8-21.9 - `Maiden`
 *              22.9-22.10 - `Scales`
 *              23.10-22.11 - `Scorpion`
 *              23.11-21.12 - `Archer`
 *              22.12-20.1 - `Goat`
 *              21.1-19.2 - `Water-bearer`
 *              20.2-20.3 - `Fish`
 *              <p>
 *              2001 - `Snake`
 *              2002 - `Horse`
 *              2003 - `Ram`
 *              2004 - `Monkey`
 *              2005 - `Rooster`
 *              2006 - `Dog`
 *              2007 - `Pig`
 *              2008 - `Rat`
 *              2009 - `Ox`
 *              2010 - `Tiger`
 *              2011 - `Rabbit`
 *              2012 - `Dragon`
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
    }
}
