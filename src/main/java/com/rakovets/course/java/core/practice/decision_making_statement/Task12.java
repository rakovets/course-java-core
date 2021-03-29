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
        final int JANUARY = 1;
        final int FEBRUARY = 2;
        final int MARCH = 3;
        final int APRIL = 4;
        final int MAY = 5;
        final int JUNE = 6;
        final int JULY = 7;
        final int AUGUST = 8;
        final int SEPTEMBER = 9;
        final int OCTOBER = 10;
        final int NOVEMBER = 11;
        final int DECEMBER = 12;

        if (year > 0 && month == MARCH && 21 <= day || month == APRIL && day <= 20) {
            return "Ram";
        } else if (year > 0 && month == APRIL || month == MAY && day <= 20){
            return "Bull";
        } else if (year > 0 && month == MAY || month == JUNE && day <= 21) {
            return "Twins";
        } else if (year > 0 && month == JUNE || month == JULY && day <= 22) {
            return "Crab";
        } else if (year > 0 && month == JULY || month == AUGUST && day <= 22) {
            return "Lion";
        } else if (year > 0 && month == AUGUST || month == SEPTEMBER && day <= 21) {
            return "Maiden";
        } else if (year > 0 && month == SEPTEMBER || month == OCTOBER && day <= 22) {
            return "Scales";
        } else if (year > 0 && month == OCTOBER || month == NOVEMBER && day <= 22) {
            return "Scorpion";
        } else if (year > 0 && month == NOVEMBER || month == DECEMBER && day <= 21) {
            return "Archer";
        } else if (year > 0 && month == DECEMBER || month == JANUARY && day <= 20) {
            return "Goat";
        } else if (year > 0 && month == JANUARY || month == FEBRUARY && day <= 19) {
            return "Water-bearer";
        } else if (year > 0 && month == FEBRUARY || month == MARCH) {
            return "Fish";
        } else {
            return null;
        }
    }
}
