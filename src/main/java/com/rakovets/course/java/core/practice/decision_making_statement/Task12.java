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

        String horoscopeSign = null;

        switch (month) {

            case 1:

                if (day <= 20) {
                    horoscopeSign = "Goat";
                } else horoscopeSign = "Water-bearer";

                break;

            case 2:

                if (day <= 19) {
                    horoscopeSign = "Water-bearer";
                } else horoscopeSign = "Fish";

                break;

            case 3:

                if (day <= 20) {
                    horoscopeSign = "Fish";
                } else horoscopeSign = "Ram";

                break;

            case 4:

                if (day <= 20) {
                    horoscopeSign = "Ram";
                } else horoscopeSign = "Bull";
                break;

            case 5:

                if (day <= 20) {
                    horoscopeSign = "Bull";
                } else horoscopeSign = "Twins";
                break;

            case 6:

                if (day <= 21) {
                    horoscopeSign = "Twins";
                } else horoscopeSign = "Crab";
                break;

            case 7:

                if (day <= 22) {
                    horoscopeSign = "Crab";
                } else horoscopeSign = "Lion";
                break;

            case 8:

                if (day <= 22) {
                    horoscopeSign = "Lion";
                } else horoscopeSign = "Maiden";
                break;

            case 9:

                if (day <= 21) {
                    horoscopeSign = "Maiden";
                } else horoscopeSign = "Scales";
                break;

            case 10:

                if (day <= 22) {
                    horoscopeSign = "Scales";
                } else horoscopeSign = "Scorpion";
                break;

            case 11:
                if (day <= 22) {
                    horoscopeSign = "Scorpion";
                } else horoscopeSign = "Archer";
                break;

            case 12:
                if (day <= 21) {
                    horoscopeSign = "Archer";
                } else horoscopeSign = "Goat";
                break;
        }


        return horoscopeSign;
    }
}
