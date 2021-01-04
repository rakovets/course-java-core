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
        int day = 12;
        int month = 12;
        int year = 2008;

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
        int a = year % 12;

        if (2001 % 12 == a) {
            return "Snake";
        }

        if (2002 % 12 == a) {
            return "Horse";
        }

        if (2003 % 12 == a) {
            return "Ram";
        }

        if (2004 % 12 == a) {
            return "Monkey";
        }

        if (2005 % 12 == a) {
            return "Rooster";
        }

        if (2006 % 12 == a) {
            return "Dog";
        }

        if (2007 % 12 == a) {
            return "Pig";
        }

        if (2008 % 12 == a) {
            return "Rat";
        }

        if (2009 % 12 == a) {
            return "Ox";
        }

        if (2010 % 12 == a) {
            return "Tiger";
        }

        if (2011 % 12 == a) {
            return "Rabbit";
        }

        if (2012 % 12 == a) {
            return "Dragon";
        }

        return null;

    }
}
