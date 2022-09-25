package com.rakovets.course.java.core.practice.decision_making_statements;

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
        int day = 20;
        int month = 1;

        String zodiacSign = getZodiacSign(day, month);
        System.out.printf("Result: %s", zodiacSign);
    }

    /**
     * Определяет знак зодиака.
     *
     * @param day   число дня рождения
     * @param month месяц дня рождения
     * @return знак зодиака
     */
    static String getZodiacSign(int day, int month) {
        String zodiacSign = "Неправильно введена дата рождения";
        float dateMonthDay = month + (float) day / 100;
        if (1.01f <= dateMonthDay && dateMonthDay <= 1.20f) {
            zodiacSign = "Goat";
        } else if (1.21f <= dateMonthDay && dateMonthDay <= 2.19f) {
            zodiacSign = "Water-bearer";
        } else if (2.20f <= dateMonthDay && dateMonthDay <= 3.20f) {
            zodiacSign = "Fish";
        } else if (3.21f <= dateMonthDay && dateMonthDay <= 4.20f) {
            zodiacSign = "Ram";
        } else if (4.21f <= dateMonthDay && dateMonthDay <= 5.20f) {
            zodiacSign = "Bull";
        } else if (5.21f <= dateMonthDay && dateMonthDay <= 6.21f) {
            zodiacSign = "Twins";
        } else if (6.22f <= dateMonthDay && dateMonthDay <= 7.22f) {
            zodiacSign = "Crab";
        } else if (7.22f <= dateMonthDay && dateMonthDay <= 8.22f) {
            zodiacSign = "Lion";
        } else if (8.23f <= dateMonthDay && dateMonthDay <= 9.21f) {
            zodiacSign = "Maiden";
        } else if (9.22f <= dateMonthDay && dateMonthDay <= 10.22f) {
            zodiacSign = "Scales";
        } else if (10.23f <= dateMonthDay && dateMonthDay <= 11.22f) {
            zodiacSign = "Scorpion";
        } else if (11.23f <= dateMonthDay && dateMonthDay <= 12.21f) {
            zodiacSign = "Archer";
        } else if (12.22f <= dateMonthDay && dateMonthDay <= 12.31f) {
            zodiacSign = "Goat";
        }
        return zodiacSign;
    }
}
