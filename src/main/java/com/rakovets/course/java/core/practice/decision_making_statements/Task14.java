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
        int year = 2012;

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
        int counter = 1;
        int chinaCalendarYear = 1;
        String nameOfYear = "";

        while (counter < year) {
            counter++;
            chinaCalendarYear++;
            if (chinaCalendarYear > 12) {
                chinaCalendarYear = 1;
            }
        }
        if (chinaCalendarYear == 1) {
            nameOfYear = "Rooster";
        } else if (chinaCalendarYear == 2) {
            nameOfYear = "Dog";
        } else if (chinaCalendarYear == 3) {
            nameOfYear = "Pig";
        } else if (chinaCalendarYear == 4) {
            nameOfYear = "Rat";
        } else if (chinaCalendarYear == 5) {
            nameOfYear = "Ox";
        } else if (chinaCalendarYear == 6) {
            nameOfYear = "Tiger";
        } else if (chinaCalendarYear == 7) {
            nameOfYear = "Rabbit";
        } else if (chinaCalendarYear == 8) {
            nameOfYear = "Dragon";
        } else if (chinaCalendarYear == 9) {
            nameOfYear = "Snake";
        } else if (chinaCalendarYear == 10) {
            nameOfYear = "Horse";
        } else if (chinaCalendarYear == 11) {
            nameOfYear = "Ram";
        } else if (chinaCalendarYear == 12) {
            nameOfYear = "Monkey";
        }

        return nameOfYear;
    }
}
