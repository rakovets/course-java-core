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
        int day = 23;
        int month = 12;
        int year = 1985;

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
        String zodiac = "";
        int zodiacYear = year % 12;
        if (day <= 0 || day > 31) {
            zodiac = "Wrong day";
        } else {
            if (month <= 0 || month > 12) {
                zodiac = "Wrong month";
            }
            else {
                switch (zodiacYear) {
                    case 0:
                        zodiac = "Monkey";
                        break;
                    case 1:
                        zodiac = "Rooster";
                        break;
                    case 2:
                        zodiac = "Dog";
                        break;
                    case 3:
                        zodiac = "Pig";
                        break;
                    case 4:
                        zodiac = "Rat";
                        break;
                    case 5:
                        zodiac = "Ox";
                        break;
                    case 6:
                        zodiac = "Tiger";
                        break;
                    case 7:
                        zodiac = "Rabbit";
                        break;
                    case 8:
                        zodiac = "Dragon";
                        break;
                    case 9:
                        zodiac = "Snake";
                        break;
                    case 10:
                        zodiac = "Horse";
                        break;
                    case 11:
                        zodiac = "Ram";
                        break;
                }
            }
        }
        return zodiac;
    }
}
