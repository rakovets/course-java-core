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
        int year = 2023;

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
        String Zodiac = null;
        switch(year % 12){
            case 0:
                Zodiac = "Monkey";
                break;
            case 1:
                Zodiac = "Rooster";
                break;
            case 2:
                Zodiac = "Dog";
                break;
            case 3:
                Zodiac = "Pig";
                break;
            case 4:
                Zodiac = "Rat";
                break;
            case 5:
                Zodiac = "Ox";
                break;
            case 6:
                Zodiac = "Tiger";
                break;
            case 7:
                Zodiac = "Rabbit";
                break;
            case 8:
                Zodiac = "Dragon";
                break;
            case 9:
                Zodiac = "Snake";
                break;
            case 10:
                Zodiac = "Horse";
                break;
            case 11:
                Zodiac = "Ram";
                break;
        }
        return Zodiac;
    }
}
