package com.rakovets.course.javabasics.practice.conditionalstatements;

/**
 * Разработать программу для сайта посвященного астрологии.
 * <p>
 * Определить название года по китайскому календарю, если считать что нет никаких циклических смещений, т.е.
 * нижеприведенный цикл повторяется для любых 12 лет после 0 н.э..
 * <p>
 * 2001 - `Snake`
 * 2002 - `Horse`
 * 2003 - `Ram`
 * 2004 - `Monkey`
 * 2005 - `Rooster`
 * 2006 - `Dog`
 * 2007 - `Pig`
 * 2008 - `Rat`
 * 2009 - `Ox`
 * 2010 - `Tiger`
 * 2011 - `Rabbit`
 * 2012 - `Dragon`
 */
public class Task14 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int day = 19;
        int month = 8;
        int year = 2000;

        String monthName = getZodiacYearName(day, month, year);
        System.out.printf("Result: %s", monthName);
    }

    /**
     * Определяет названия года по китайскому календарю.
     *
     * @param day   число дня рождения
     * @param month месяц дня рождения
     * @param year  год дня рождения (больше 0 г. н.э.)
     * @return название года по китайскому календарю
     */
    static String getZodiacYearName(int day, int month, int year) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int yearNumber = year % 12;
        switch (yearNumber) {
            case 0: {
               return "Monkey";
            } case 1: {
                return "Rooster";
            } case 2: {
                return  "Dog";
            } case 3: {
                return  "Pig";
            } case 4: {
                return  "Rat";
            } case 5: {
                return  "Ox";
            } case 6: {
                return  "Tiger";
            } case 7: {
                return  "Rabbit";
            } case 8: {
                return  "Dragon";
            } case 9: {
                return  "Snake";
            } case  10: {
                return "Horse";
            } case 11: {
                return  "Ram";
            } default:
                return  null;
        }
    }
}
