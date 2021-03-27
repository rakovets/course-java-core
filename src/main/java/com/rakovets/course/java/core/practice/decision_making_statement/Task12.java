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
        int day = 25;
        int month = 5;
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
        String zodiac = "";
        double birthday = (double) month + (double) day / 100;
        if (day <= 0 || day > 31) {
            zodiac = "Wrong day";
        } else {
            if (month <= 0 || month > 12) {
                zodiac = "Wrong month";
            } else {
                if (year < 0) {
                    zodiac = "Wrong year";
                } else {
                    if (birthday >= 3.21 && birthday <= 4.20) {
                        zodiac = "Ram";
                    }
                    if (birthday >= 4.21 && birthday <= 5.20) {
                        zodiac = "Bull";
                    }
                    if (birthday >= 5.21 && birthday <= 6.21) {
                        zodiac = "Twins";
                    }
                    if (birthday >= 6.22 && birthday <= 7.22) {
                        zodiac = "Crab";
                    }
                    if (birthday >= 7.23 && birthday <= 8.22) {
                        zodiac = "Lion";
                    }
                    if (birthday >= 8.23 && birthday <= 9.21) {
                        zodiac = "Maiden";
                    }
                    if (birthday >= 9.22 && birthday <= 10.22) {
                        zodiac = "Scales";
                    }
                    if (birthday >= 10.23 && birthday <= 11.22) {
                        zodiac = "Scorpion";
                    }
                    if (birthday >= 11.23 && birthday <= 12.21) {
                        zodiac = "Archer";
                    }
                    if (birthday >= 12.22 && birthday <= 12.31) {
                        zodiac = "Goat";
                    }
                    if (birthday >= 1.01 && birthday <= 1.20) {
                        zodiac = "Goat";
                    }
                    if (birthday >= 1.21 && birthday <= 2.19) {
                        zodiac = "Water-bearer";
                    }
                    if (birthday >= 2.20 && birthday <= 3.20) {
                        zodiac = "Fish";
                    }
                }
            }
        }
        return zodiac;
    }
}
