package com.rakovets.course.java.core.practice.decision_making_statement;

/**
 * Разработать программу для сайта посвященного астрологии.
 * <p>
 * Определить название года по китайскому календарю, если считать что нет никаких циклических смещений, т.е.
 * нижеприведенный цикл повторяется для любых 12 лет после 0 н.э..
 * <p>
 * 2001 - `Snake`
 * 2002 - `Horse`
 * 2003 - `Ram`
 * 2004 - `Monkey`
 * 2005 - `Rooster`
 * 2006 - `Dog`
 * 2007 - `Pig`
 * 2008 - `Rat`
 * 2009 - `Ox`
 * 2010 - `Tiger`
 * 2011 - `Rabbit`
 * 2012 - `Dragon`
 */
class Task14 {
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
        int year = 2000;

        String monthName = getZodiacYearName(day, month, year);
        System.out.printf("Result: %s", monthName);
    }

    /**
     * Определяет названия года по китайскому календарю.
     *
     * @param day   число дня рождения
     * @param month месяц дня рождения
     * @param year  год дня рождения (больше 0 г. н.э.)
     * @return название года по китайскому календарю
     */
    static String getZodiacYearName(int day, int month, int year) {

        int fullPeriod = 12;
        int yearsExceptThousands = (year - (year / 1000 * 1000));
        int yearsExeptFullPeriod = yearsExceptThousands - (yearsExceptThousands / fullPeriod * fullPeriod);
        String zodiacNameYear;

        if (yearsExceptThousands % fullPeriod != 0){

            if (yearsExeptFullPeriod / 11 == 1){
                zodiacNameYear = "Rabbit";
            } else if (yearsExeptFullPeriod / 10 == 1) {
                zodiacNameYear = "Tiger";
            }else if (yearsExeptFullPeriod / 9 == 1) {
                zodiacNameYear = "Ox";
            }else if (yearsExeptFullPeriod / 8 == 1) {
                zodiacNameYear = "Rat";
            }else if (yearsExeptFullPeriod / 7 == 1) {
                zodiacNameYear = "Pig";
            }else if (yearsExeptFullPeriod / 6 == 1) {
                zodiacNameYear = "Dog";
            }else if (yearsExeptFullPeriod / 5 == 1) {
                zodiacNameYear = "Rooster";
            }else if (yearsExeptFullPeriod / 4 == 1) {
                zodiacNameYear = "Monkey";
            }else if (yearsExeptFullPeriod / 3 == 1) {
                zodiacNameYear = "Ram";
            }else if (yearsExeptFullPeriod / 2 == 1) {
                zodiacNameYear = "Horse";
            }else {
                zodiacNameYear = "Snake";
            }

        } else {
            zodiacNameYear = "Dragon";
        }

        return zodiacNameYear;
    }
}
