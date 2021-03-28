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
        if (year > 0) {
            if (day >= 21)
                if (month == 3)
                    return "Ram";
                        if (day <= 20)
                            if (month == 4)
                            return "Ram";
            if (day >= 21)
                if (month == 4)
                    return "Bull";
                        if (day <= 20)
                            if (month == 5)
                                return "Bull";
            if (day >= 21)
                if (month == 5)
                    return "Twins";
                        if (day <= 21)
                            if (month == 6)
                                return "Twins";
            if (day >= 22)
                if (month ==6)
                    return "Crab";
                        if (day <= 22)
                            if (month == 7)
                                return "Crab";
            if (day >= 23)
                if (month == 7)
                    return "Lion";
                        if (day <= 22)
                            if (month == 8)
                                return "Lion";
            if (day >= 23)
                if (month == 8)
                    return "Maiden";
                        if (day <= 21)
                            if (month == 9)
                                return "Maiden";
            if (day >= 22)
                if (month == 9)
                    return "Scales";
                        if (day <= 22)
                            if (month == 10)
                                return "Scales";
            if (day >= 23)
                if (month == 10)
                    return "Scorpion";
                        if (day <= 22)
                            if (month == 11)
                                return "Scorpion";
            if (day >= 23)
                if (month == 11)
                    return "Archer";
                        if (day <= 21)
                            if (month == 12)
                                return "Archer";
            if (day >= 22)
                if (month == 12)
                    return "Goat";
                        if (day <= 20)
                            if (month == 1)
                                return "Goat";
            if (day >= 21)
                if (month == 1)
                    return "Water-bearer";
                        if (day <= 19)
                            if (month == 2)
                                return "Water-bearer";
            if (day >= 20)
                if (month == 2)
                    return "Fish";
                        if (day <= 20)
                            if (month == 3)
                                return "Fish";
        }    return null;
    }
}
