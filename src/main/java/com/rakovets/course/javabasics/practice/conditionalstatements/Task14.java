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
        int year = 1989;

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
        String zodiacYearName = null;
        if (year == 2001 || (year - 2001) % 12 == 0) {
            zodiacYearName = "Snake";
        } else if (year == 2002 || (year - 2002) % 12 == 0) {
            zodiacYearName = "Horse";
        } else if (year == 2003 || (year - 2003) % 12 == 0) {
            zodiacYearName = "Ram";
        } else if (year == 2004 || (year - 2004) % 12 == 0) {
            zodiacYearName = "Monkey";
        } else if (year == 2005 || (year - 2005) % 12 == 0) {
            zodiacYearName = "Rooster";
        } else if (year == 2006 || (year - 2006) % 12 == 0) {
            zodiacYearName = "Dog";
        } else if (year == 2007 || (year - 2007) % 12 == 0) {
            zodiacYearName = "Pig";
        } else if (year == 2008 || (year - 2008) % 12 == 0) {
            zodiacYearName = "Rat";
        } else if (year == 2009 || (year - 2009) % 12 == 0) {
            zodiacYearName = "Ox";
        } else if (year == 2010 || (year - 2010) % 12 == 0) {
            zodiacYearName = "Tiger";
        } else if (year == 2011 || (year - 2011) % 12 == 0) {
            zodiacYearName = "Rabbit";
        } else if (year == 2012 || (year - 2012) % 12 == 0) {
            zodiacYearName = "Dragon";
        } else {
            return null;
        }
        {
            return zodiacYearName;
        }
    }
}
