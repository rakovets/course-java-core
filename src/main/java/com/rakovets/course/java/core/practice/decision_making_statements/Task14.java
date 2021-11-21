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
        int year = 2024;

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
        if (year < 2001) {
            while (year < 2001) {
                year += 12;
            }
        }
        if (year > 2012) {
            while (year > 2012) {
                year -= 12;
            }
        }

        switch (year) {
            case 2001:
                return "Snake";
            case 2002:
                return "Horse";
            case 2003:
                return "Ram";
            case 2004:
                return "Monkey";
            case 2005:
                return "Rooster";
            case 2006:
                return "Dog";
            case 2007:
                return "Pig";
            case 2008:
                return "Rat";
            case 2009:
                return "Ox";
            case 2010:
                return "Tiger";
            case 2011:
                return "Rabbit";
            case 2012:
                return "Dragon";
            default:
                return null;
        }
    }


}
