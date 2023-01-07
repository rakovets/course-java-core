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

        String monthName;
        final int CYCLE = 12;
        int cycleYear = year % CYCLE;
        switch (cycleYear) {
            case 0:
                monthName = "Dragon";
                break;
            case 1:
                monthName = "Snake";
                break;
            case 2:
                monthName = "Horse";
                break;
            case 3:
                monthName = "Ram";
                break;
            case 4:
                monthName = "Monkey";
                break;
            case 5:
                monthName = "Rooster";
                break;
            case 6:
                monthName = "Dog";
                break;
            case 7:
                monthName = "Pig";
                break;
            case 8:
                monthName = "Rat";
                break;
            case 9:
                monthName = "Ox";
                break;
            case 10:
                monthName = "Tiger";
                break;
            case 11:
                monthName = "Rabbit";
                break;
            default:
                monthName = "Wrong";
        }
        return monthName;
    }
}
