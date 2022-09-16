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
        String result = "";
        if (year % 12 == 0) {result = "Monkey";
        } else if (year % 12 == 1) result = "Rooster";
        else if (year % 12 == 2) result = "Dog";
        else if (year % 12 == 3) result = "Pig";
        else if (year % 12 == 4) result = "Rat";
        else if (year % 12 == 5) result = "Ox";
        else if (year % 12 == 6) result = "Tiger";
        else if (year % 12 == 7) result = "Rabbit";
        else if (year % 12 == 8) result = "Dragon";
        else if (year % 12 == 9) result = "Snake";
        else if (year % 12 == 10) result = "Horse";
        else if (year % 12 == 11) result = "Ram";
        return result;
    }
}
