package com.rakovets.course.javabasics.practice.conditionalstatements;

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
public class Task12 {
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
        int month = 2;
        int year = 2019;

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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода

        if (month == 4 && day >= 1 && day <= 20 || month == 3 && day >= 21 && day <= 31) {
            return "Ram";
        }
        if (month == 5 && day >= 1 && day <= 20 || month == 4 && day >= 21 && day <= 30) {
            return "Bull";
        }
        if (month == 6 && day >= 1 && day <= 21 || month == 5 && day >= 21 && day <= 31) {
            return "Twins";
        }
        if (month == 7 && day >= 1 && day <= 22 || month == 6 && day >= 22 && day <= 30) {
            return "Crab";
        }
        if (month == 8 && day >= 1 && day <= 22 || month == 7 && day >= 23 && day <= 31) {
            return "Lion";
        }
        if (month == 9 && day >= 1 && day <= 21 || month == 8 && day >= 23 && day <= 31) {
            return "Maiden";
        }
        if (month == 10 && day >= 1 && day <= 22 || month == 9 && day >= 22 && day <= 30) {
            return "Scales";
        }
        if (month == 11 && day >= 1 && day <= 22 || month == 10 && day >= 23 && day <= 31) {
            return "Scorpion";
        }
        if (month == 12 && day >= 1 && day <= 21 || month == 11 && day >= 23 && day <= 30) {
            return "Archer";
        }
        if (month == 1 && day >= 1 && day <= 20 || month == 12 && day >= 22 && day <= 31) {
            return "Goat";
        }
        if (month == 2 && day >= 1 && day <= 19 || month == 1 && day >= 21 && day <= 31) {
            return "Water-bearer";
        }
        if ((year % 4 == 0) && !(year % 400 == 0)) {
            if (month == 3 && day >= 1 && day <= 20 || month == 2 && day >= 20 && day <= 29) {
                return "Fish";
            } else {
                return null;
            }
        } else if (month == 3 && day >= 1 && day <= 20 || month == 2 && day >= 20 && day <= 28) {
            return "Fish";
        }
        else {
            return null;
        }
    }
}
