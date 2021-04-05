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
        int god = year % 12;
        String nameOfYear = null;

        switch (god) {
            case 0:
                nameOfYear = "Monkey";
                break;
            case 1:
                nameOfYear = "Rooster";
                break;
            case 2:
                nameOfYear = "Dog";
                break;
            case 3:
                nameOfYear = "Pig";
                break;
            case 4:
                nameOfYear = "Rat";
                break;
            case 5:
                nameOfYear = "Ox";
                break;
            case 6:
                nameOfYear = "Tiger";
                break;
            case 7:
                nameOfYear = "Rabbit";
                break;
            case 8:
                nameOfYear = "Dragon";
                break;
            case 9:
                nameOfYear = "Snake";
                break;
            case 10:
                nameOfYear = "Horse";
                break;
            case 11:
                nameOfYear = "Ram";
                break;
        }

        return nameOfYear;
    }
}
