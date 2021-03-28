package com.rakovets.course.java.core.practice.decision_making_statement;

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
        if (day > 0 && month > 0)
            if ((year % 12) == 0)
                return "Monkey";
            if ((year % 12) == 1)
                return "Rooster";
            if ((year % 12) == 2)
                return "Dog";
            if ((year % 12) == 3)
                return "Pig";
            if ((year % 12) == 4)
                return "Rat";
            if ((year % 12) == 5)
                return "Ox";
            if ((year % 12) == 6)
                return "Tiger";
            if ((year % 12) == 7)
                return "Rabbit";
            if ((year % 12) == 8)
                return "Dragon";
            if ((year % 12) == 9)
                return "Snake";
            if ((year % 12) == 10)
                return "Horse";
           if ((year % 12) == 11)
                return "Ram";
        return null;
    }
}
