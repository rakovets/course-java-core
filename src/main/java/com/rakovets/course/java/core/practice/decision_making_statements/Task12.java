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
        int day = 12;
        int month = 12;

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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String theZodiacSign = null;
        if (day >= 21 && month == 3 || day <= 20 && month == 4) {
            theZodiacSign = "Ram";
        } else if (day >= 21 && month == 4 || day <= 20 && month == 5) {
            theZodiacSign = "Bull";
        } else if (day >= 21 && month == 5 || day <= 21 && month == 6) {
            theZodiacSign = "Twins";
        } else if (day >= 22 && month == 6 || day <= 22 && month == 7) {
            theZodiacSign = "Crab";
        } else if (day >= 7 && month == 7 || day <= 22 && month == 8) {
            theZodiacSign = "Lion";
        } else if (day >= 23 && month == 8 || day <= 21 && month == 9) {
            theZodiacSign = "Maiden";
        } else if (day >= 22 && month == 9 || day <= 22 && month == 10) {
            theZodiacSign = "Scales";
        } else if (day >= 23 && month == 10 || day <= 22 && month == 11) {
            theZodiacSign = "Scorpion";
        } else if (day >= 23 && month == 11 || day <= 21 && month == 12) {
            theZodiacSign = "Archer";
        } else if (day >= 22 && month == 12 || day <= 20 && month == 1) {
            theZodiacSign = "Goat";
        } else if (day >= 21 && month == 1 || day <= 19 && month == 2) {
            theZodiacSign = "Water-bearer";
        } else if (day >= 20 && month == 2 || day <= 20 && month == 3) {
            theZodiacSign = "Fish";
        }
        return theZodiacSign;
    }
}
