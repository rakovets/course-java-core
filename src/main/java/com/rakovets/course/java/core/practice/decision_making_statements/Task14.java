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
        String _zodiacYearName = "Неправильно введен год рождения";
        switch (year % 12) {
            case (2001 % 12):
                _zodiacYearName = "Snake";
                break;
            case (2002 % 12):
                _zodiacYearName = "Horse";
                break;
            case (2003 % 12):
                _zodiacYearName = "Ram";
                break;
            case (2004 % 12):
                _zodiacYearName = "Monkey";
                break;
            case (2005 % 12):
                _zodiacYearName = "Rooster";
                break;
            case (2006 % 12):
                _zodiacYearName = "Dog";
                break;
            case (2007 % 12):
                _zodiacYearName = "Pig";
                break;
            case (2008 % 12):
                _zodiacYearName = "Rat";
                break;
            case (2009 % 12):
                _zodiacYearName = "Ox";
                break;
            case (2010 % 12):
                _zodiacYearName = "Tiger";
                break;
            case (2011 % 12):
                _zodiacYearName = "Rabbit";
                break;
            case (2012 % 12):
                _zodiacYearName = "Dragon";
                break;
        } return _zodiacYearName;
    }
}
