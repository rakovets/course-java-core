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
        int year = 2022;

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

        if (year % 12 == 0) {
            return "Monkey";
        } else if ((year - 1) % 12 == 0) {
            return "Rooster";
        } else if ((year - 2) % 12 == 0) {
            return "Dog";
        } else if ((year - 3) % 12 == 0) {
            return "Pig";
        } else if ((year - 4) % 12 == 0) {
            return "Rat";
        } else if ((year - 5) % 12 == 0) {
            return "Ox";
        } else if ((year - 6) % 12 == 0) {
            return "Tiger";
        } else if ((year - 7) % 12 == 0) {
            return "Rabbit";
        } else if ((year - 8) % 12 == 0) {
            return "Dragon";
        } else if ((year - 9) % 12 == 0) {
            return "Snake";
        } else if ((year - 10) % 12 == 0) {
            return "Horse";
        } else {
            return "Ram";
        }
    }
}
