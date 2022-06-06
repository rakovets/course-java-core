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
        String text;
        if(month == 12 && day >= 22 || month == 1 && day <= 20) {
            text = "Capricorn";
        }
        else if(month == 1 && day >= 21 || month == 2 && day <= 18) {
            text = "Aquarius";
        }
        else if(month == 2 && day >= 19 || month == 3 && day <= 20) {
            text = "Pisces";
        }
        else if(month == 3 && day >= 21 || month == 4 && day <= 20) {
            text = "Aries";
        }
        else if(month == 4 && day >= 21 || month == 5 && day <= 21) {
            text = "Taurus";
        }
        else if(month == 5 && day >= 22 || month == 6 && day <= 21) {
            text = "Gemini";
        }
        else if(month == 6 && day >= 22 || month == 7 && day <= 22) {
            text = "Cancer";
        }
        else if(month == 7 && day >= 23 || month == 8 && day <= 23) {
            text = "Leo";
        }
        else if(month == 8 && day >= 24 || month == 9 && day <= 22) {
            text = "Virgo";
        }
        else if(month == 9 && day >= 23 || month == 10 && day <= 23) {
            text = "Libra";
        }
        else if(month == 10 && day >= 24 || month == 11 && day <= 22) {
            text = "Scorpio";
        }
        else if(month == 11 && day >= 17 || month == 12 && day <= 21) {
            text = "Sagittarius";
        }
        else {
            throw new Error();
        }
        return text;
    }
}
