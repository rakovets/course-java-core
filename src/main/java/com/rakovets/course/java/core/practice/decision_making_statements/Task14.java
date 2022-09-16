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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int zodiacYearsCircle = 12;
        String zodiacName = "";
        switch (year % zodiacYearsCircle) {
            case 0:
                zodiacName = "Monkey";
                break;
            case 1:
                zodiacName = "Rooster";
                break;
            case 2:
                zodiacName = "Dog";
                break;
            case 3:
                zodiacName = "Pig";
                break;
            case 4:
                zodiacName = "Rat";
                break;
            case 5:
                zodiacName = "Ox";
                break;
            case 6:
                zodiacName = "Tiger";
                break;
            case 7:
                zodiacName = "Rabbit";
                break;
            case 8:
                zodiacName = "Dragon";
                break;
            case 9:
                zodiacName = "Snake";
                break;
            case 10:
                zodiacName = "Horse";
                break;
            case 11:
                zodiacName = "Ram";
                break;

        }
        return zodiacName;
    }
}
