package com.rakovets.course.java.core.practice.decision_making_statements;

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
class Task14 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int year = 1989;

        String monthName = getZodiacYearName(year);
        System.out.printf("Result: %s", monthName);
    }

    /**
     * Определяет названия года по китайскому календарю.
     *
     * @param year  год дня рождения (больше 0 г. н.э.)
     * @return название года по китайскому календарю
     */
    static String getZodiacYearName(int year) {
        final int cycle = 12;
        String zodiac = " ";
            if (year % cycle == 0) {
                zodiac = "Monkey";
            } else if (year % cycle == 1) {
                zodiac = "Rooster";
            } else if (year % cycle == 2) {
                zodiac = "Dog";
            } else if (year % cycle == 3) {
                zodiac = "Pig";
            } else if (year % cycle == 4) {
                zodiac = "Rat";
            } else if (year % cycle == 5) {
                zodiac = "Ox";
            } else if (year % cycle == 6) {
                zodiac = "Tiger";
            } else if (year % cycle == 7) {
                zodiac = "Rabbit";
            } else if (year % cycle == 8) {
                zodiac = "Dragon";
            } else if (year % cycle == 9) {
                zodiac = "Snake";
            } else if (year % cycle == 10) {
                zodiac = "Horse";
            } else if (year % cycle == 11) {
                zodiac = "Ram";
            }
            return zodiac;
        }
    }
