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
        String zodiacYearName = "Неправильно введен год рождения";
        final int numberOfMonthsInYear = 12;
        switch (year % numberOfMonthsInYear) {
            case (2001 % numberOfMonthsInYear):
                zodiacYearName = "Snake";
                break;
            case (2002 % numberOfMonthsInYear):
                zodiacYearName = "Horse";
                break;
            case (2003 % numberOfMonthsInYear):
                zodiacYearName = "Ram";
                break;
            case (2004 % numberOfMonthsInYear):
                zodiacYearName = "Monkey";
                break;
            case (2005 % numberOfMonthsInYear):
                zodiacYearName = "Rooster";
                break;
            case (2006 % numberOfMonthsInYear):
                zodiacYearName = "Dog";
                break;
            case (2007 % numberOfMonthsInYear):
                zodiacYearName = "Pig";
                break;
            case (2008 % numberOfMonthsInYear):
                zodiacYearName = "Rat";
                break;
            case (2009 % numberOfMonthsInYear):
                zodiacYearName = "Ox";
                break;
            case (2010 % 12):
                zodiacYearName = "Tiger";
                break;
            case (2011 % numberOfMonthsInYear):
                zodiacYearName = "Rabbit";
                break;
            case (2012 % numberOfMonthsInYear):
                zodiacYearName = "Dragon";
                break;
        } return zodiacYearName;
    }
}
