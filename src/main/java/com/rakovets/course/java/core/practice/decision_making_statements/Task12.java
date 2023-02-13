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
    private static final int DAY_JANUARY = 31;
    private static final int DAY_FEBRUARY = 28;
    private static final int DAY_MARCH = 31;
    private static final int DAY_APRIL = 30;
    private static final int DAY_MAY = 31;
    private static final int DAY_JUNE = 30;
    private static final int DAY_JULY = 31;
    private static final int DAY_AUGUST = 31;
    private static final int DAY_SEPTEMBER = 30;
    private static final int DAY_OCTOBER = 31;
    private static final int DAY_NOVEMBER = 30;
    private static final int DAY_DECEMBER = 31;

    private static final int WATER_BEARER_DAY_JANUARY = 21;
    private static final int WATER_BEARER_DAY_FEBRUARY = 19;
    private static final int WATER_BEARER_MONTH_NUMBER_FIRST = 1;
    private static final int WATER_BEARER_MONTH_NUMBER_SECOND = 2;

    private static final int FISH_DAY_FEBRUARY = 20;
    private static final int FISH_DAY_MARCH = 20;
    private static final int FISH_MONTH_NUMBER_FIRST = 2;
    private static final int FISH_MONTH_NUMBER_SECOND = 3;

    private static final int RAM_DAY_MARCH = 21;
    private static final int RAM_DAY_APRIL = 20;
    private static final int RAM_MONTH_NUMBER_FIRST = 3;
    private static final int RAM_MONTH_NUMBER_SECOND = 4;

    private static final int BULL_DAY_APRIL = 21;
    private static final int BULL_DAY_MAY = 20;
    private static final int BULL_MONTH_NUMBER_FIRST = 4;
    private static final int BULL_MONTH_NUMBER_SECOND = 5;

    private static final int TWINS_DAY_MAY = 21;
    private static final int TWINS_DAY_JUNE = 21;
    private static final int TWINS_MONTH_NUMBER_FIRST = 5;
    private static final int TWINS_MONTH_NUMBER_SECOND = 6;

    private static final int CRAB_DAY_JUNE = 22;
    private static final int CRAB_DAY_JULY = 22;
    private static final int CRAB_MONTH_NUMBER_FIRST = 6;
    private static final int CRAB_MONTH_NUMBER_SECOND = 7;

    private static final int LION_DAY_JULY = 23;
    private static final int LION_DAY_AUGUST = 22;
    private static final int LION_MONTH_NUMBER_FIRST = 7;
    private static final int LION_MONTH_NUMBER_SECOND = 8;

    private static final int MAIDEN_DAY_AUGUST = 23;
    private static final int MAIDEN_DAY_SEPTEMBER = 21;
    private static final int MAIDEN_MONTH_NUMBER_FIRST = 8;
    private static final int MAIDEN_MONTH_NUMBER_SECOND = 9;

    private static final int SCALES_DAY_SEPTEMBER = 22;
    private static final int SCALES_DAY_OCTOBER = 22;
    private static final int SCALES_MONTH_NUMBER_FIRST = 9;
    private static final int SCALES_MONTH_NUMBER_SECOND = 10;

    private static final int SCORPION_DAY_OCTOBER = 23;
    private static final int SCORPION_DAY_NOVEMBER = 22;
    private static final int SCORPION_MONTH_NUMBER_FIRST = 10;
    private static final int SCORPION_MONTH_NUMBER_SECOND = 11;

    private static final int ARCHER_DAY_NOVEMBER = 23;
    private static final int ARCHER_DAY_DECEMBER = 21;
    private static final int ARCHER_MONTH_NUMBER_FIRST = 11;
    private static final int ARCHER_MONTH_NUMBER_SECOND = 12;

    private static final int GOAT_DAY_DECEMBER = 22;
    private static final int GOAT_DAY_JANUARY = 20;
    private static final int GOAT_MONTH_NUMBER_FIRST = 12;
    private static final int GOAT_MONTH_NUMBER_SECOND = 1;


    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя



        int day = 20;
        int month = 2;

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
        String zodiacSign = null;

       if ((day >= WATER_BEARER_DAY_JANUARY && day <= DAY_JANUARY && month == WATER_BEARER_MONTH_NUMBER_FIRST) || (day <= WATER_BEARER_DAY_FEBRUARY && month == WATER_BEARER_MONTH_NUMBER_SECOND)) {
           zodiacSign = "Water-bearer";
       } else if ((day >= FISH_DAY_FEBRUARY && day <= DAY_FEBRUARY && month == FISH_MONTH_NUMBER_FIRST) || (day <= FISH_DAY_MARCH && month == FISH_MONTH_NUMBER_SECOND)) {
           zodiacSign = "Fish";
       } else if ((day >= RAM_DAY_MARCH && day <= DAY_MARCH && month == RAM_MONTH_NUMBER_FIRST) || (day <= RAM_DAY_APRIL && month == RAM_MONTH_NUMBER_SECOND)) {
           zodiacSign = "Ram";
       } else if ((day >= BULL_DAY_APRIL && day <= DAY_APRIL && month == BULL_MONTH_NUMBER_FIRST) || (day <= BULL_DAY_MAY && month == BULL_MONTH_NUMBER_SECOND)) {
           zodiacSign = "Bull";
       } else if ((day >= TWINS_DAY_MAY && day <= DAY_MAY && month == TWINS_MONTH_NUMBER_FIRST) || (day <= TWINS_DAY_JUNE && month == TWINS_MONTH_NUMBER_SECOND)) {
           zodiacSign = "Twins";
       } else if ((day >= CRAB_DAY_JUNE && day <= DAY_JUNE && month == CRAB_MONTH_NUMBER_FIRST) || (day <= CRAB_DAY_JULY && month == CRAB_MONTH_NUMBER_SECOND)) {
           zodiacSign = "Crab";
       } else if ((day >= LION_DAY_JULY && day <= DAY_JULY && month == LION_MONTH_NUMBER_FIRST) || (day <= LION_DAY_AUGUST && month == LION_MONTH_NUMBER_SECOND)) {
           zodiacSign = "Lion";
       } else if ((day >= MAIDEN_DAY_AUGUST && day <= DAY_AUGUST && month == MAIDEN_MONTH_NUMBER_FIRST) || (day <= MAIDEN_DAY_SEPTEMBER && month == MAIDEN_MONTH_NUMBER_SECOND)) {
           zodiacSign = "Maiden";
       } else if ((day >= SCALES_DAY_SEPTEMBER && day <= DAY_SEPTEMBER && month == SCALES_MONTH_NUMBER_FIRST) || (day <= SCALES_DAY_OCTOBER && month == SCALES_MONTH_NUMBER_SECOND)) {
           zodiacSign = "Scales";
       } else if ((day >= SCORPION_DAY_OCTOBER && day <= DAY_OCTOBER && month == SCORPION_MONTH_NUMBER_FIRST) || (day <= SCORPION_DAY_NOVEMBER && month == SCORPION_MONTH_NUMBER_SECOND)) {
           zodiacSign = "Scorpion";
       } else if ((day >= ARCHER_DAY_NOVEMBER && day <= DAY_NOVEMBER && month == ARCHER_MONTH_NUMBER_FIRST) || (day <= ARCHER_DAY_DECEMBER && month == ARCHER_MONTH_NUMBER_SECOND)) {
           zodiacSign = "Archer";
       } else if ((day >= GOAT_DAY_DECEMBER && day <= DAY_DECEMBER && month == GOAT_MONTH_NUMBER_FIRST) || (day <= GOAT_DAY_JANUARY && month == GOAT_MONTH_NUMBER_SECOND)) {
           zodiacSign = "Goat";
       }

        return zodiacSign;
    }
}
