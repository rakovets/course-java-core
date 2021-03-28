package com.rakovets.course.java.core.practice.decision_making_statement;

/**
 * Разработать программу для сайта посвященного астрологии.
 * <p>
 * Определить знак зодиака.
 * <p>
 * 21.3-20.4 - `Ram`
 * 21.4-20.5 - `Bull`
 * 21.5-21.6 - `Twins`
 * 22.6-22.7 - `Crab`
 * 23.7-22.8 - `Lion`
 * 23.8-21.9 - `Maiden`
 * 22.9-22.10 - `Scales`
 * 23.10-22.11 - `Scorpion`
 * 23.11-21.12 - `Archer`
 * 22.12-20.1 - `Goat`
 * 21.1-19.2 - `Water-bearer`
 * 20.2-20.3 - `Fish`
 */
class Task12 {
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

        String zodiacSign = getZodiacSign(day, month, year);
        System.out.printf("Result: %s", zodiacSign);
    }

    /**
     * Определяет знак зодиака.
     *
     * @param day   число дня рождения
     * @param month месяц дня рождения
     * @param year  год дня рождения (больше 0 г. н.э.)
     * @return знак зодиака
     */
    static String getZodiacSign(int day, int month, int year) {
        if ((21 <= day && month == 3) || (20 >= day && month == 4))
            return "Ram";
        if ((21 <= day && month == 4) || (20 >= day && month == 5))
            return "Bull";
        if ((21 <= day && month == 5) || (21 >= day && month == 6))
            return "Twins";
        if ((22 <= day && month == 6) || (22 >= day && month == 7))
            return "Crab";
        if ((23 <= day && month == 7) || (22 >= day && month == 8))
            return "Lion";
        if ((23 <= day && month == 8) || (21 >= day && month == 9))
            return "Maiden";
        if ((22 <= day && month == 9) || (22 >= day && month == 10))
            return "Scales";
        if ((23 <= day && month == 10) || (22 >= day && month == 11))
            return "Scorpion";
        if ((23 <= day && month == 11) || (21 >= day && month == 12))
            return "Archer";
        if ((22 <= day && month == 12) || (20 >= day && month == 1))
            return "Goat";
        if ((21 <= day && month == 1) || (19 >= day && month == 2))
            return "Water-bearer";
        if ((20 <= day && month == 2) || (20 >= day && month == 3))
            return "Fish";

        return null;
    }
}
