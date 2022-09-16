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
        int month = 11;

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
        String zodiacSign = "";
        if (month == 1) {
            if (day < 21) {
                zodiacSign = "Goat";
            } else {
                zodiacSign = "Water-bearer";
            }
        } else if (month == 2) {
            if (day < 20) {
                zodiacSign = "Water-bearer";
            } else {
                zodiacSign = "Fish";
            }
        } else if (month == 3) {
            if (day < 21) {
                zodiacSign = "Fish";
            } else {
                zodiacSign = "Ram";
            }
        } else if (month == 4) {
            if (day < 21) {
                zodiacSign = "Ram";
            } else {
                zodiacSign = "Bull";
            }
        } else if (month == 5) {
            if (day < 21) {
                zodiacSign = "Bull";
            } else {
                zodiacSign = "Twins";
            }
        } else if (month == 6) {
            if (day < 22) {
                zodiacSign = "Twins";
            } else {
                zodiacSign = "Crab";
            }
        } else if (month == 7) {
            if (day < 23) {
                zodiacSign = "Crab";
            } else {
                zodiacSign = "Lion";
            }
        } else if (month == 8) {
            if (day < 23) {
                zodiacSign = "Lion";
            } else {
                zodiacSign = "Maiden";
            }
        } else if (month == 9) {
            if (day < 22) {
                zodiacSign = "Maiden";
            } else {
                zodiacSign = "Scales";
            }
        } else if (month == 10) {
            if (day < 23) {
                zodiacSign = "Scales";
            } else {
                zodiacSign = "Scorpion";
            }
        } else if (month == 11) {
            if (day < 23) {
                zodiacSign = "Scorpion";
            } else {
                zodiacSign = "Archer";
            }
        } else if (month == 12) {
            if (day < 22) {
                zodiacSign = "Archer";
            } else {
                zodiacSign = "Goat";
            }
        }
        return zodiacSign;
    }
}
