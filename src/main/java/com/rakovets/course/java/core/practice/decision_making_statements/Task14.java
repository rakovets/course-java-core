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
     * @param year год дня рождения (больше 0 г. н.э.)
     * @return название года по китайскому календарю
     */
    static String getZodiacYearName(int year) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String result;
        if ((2001 - year) % 12 == 0) {
            result = "Snake";
        } else if ((2002 - year) % 12 == 0) {
            result = "Horse";
        } else if ((2003 - year) % 12 == 0) {
            result = "Ram";
        } else if ((2004 - year) % 12 == 0) {
            result = "Monkey";
        } else if ((2005 - year) % 12 == 0) {
            result = "Rooster";
        } else if ((2006 - year) % 12 == 0) {
            result = "Dog";
        } else if ((2007 - year) % 12 == 0) {
            result = "Pig";
        } else if ((2008 - year) % 12 == 0) {
            result = "Rat";
        } else if ((2009 - year) % 12 == 0) {
            result = "Ox";
        } else if ((2010 - year) % 12 == 0) {
            result = "Tiger";
        } else if ((2011 - year) % 12 == 0) {
            result = "Rabbit";
        } else {
            result = "Dragon";
        }
        return result;
    }
}
