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
        int day = 18;
        int month = 5;
        int year = 2001;

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
        if (day >=21 && day<=31 && month ==3  || day >=1 && day <=20 && month ==4 ){
            return "Ram";
        }
        if (day >=21 && day<=30 && month ==4  || day >=1 && day <=20 && month ==5 ){
            return "Bull";
        }
        if (day >=21 && day<=31 && month ==5  || day >=1 && day <=21 && month ==6 ){
            return "Twins";
        }
        if (day >=22 && day<=30 && month ==6  || day >=1 && day <=22 && month ==7 ){
            return "Crab";
        }
        if (day >=23 && day<=31 && month ==7  || day >=1 && day <=22 && month ==8 ){
            return "Lion";
        }
        if (day >=23 && day<=30 && month ==8  || day >=1 && day <=21 && month ==9 ){
            return "Maiden";
        }
        if (day >=22 && day<=31 && month ==9  || day >=1 && day <=22 && month ==10 ){
            return "Scales";
        }
        if (day >=23 && day<=30 && month ==10  || day >=1 && day <=22 && month ==11 ){
            return "Scorpion";
        }
        if (day >=23 && day<=31 && month ==11  || day >=1 && day <=21 && month ==12 ){
            return "Archer";
        }
        if (day >=22 && day<=30 && month ==12  || day >=1 && day <=20 && month ==1 ){
            return "Goat";
        }if (day >=21 && day<=31 && month ==1  || day >=1 && day <=19 && month ==2 ){
            return "Water-bearer";
        }
        if (day >=20 && day<=29 && month ==2  || day >=1 && day <=20 && month ==3 ){
            return "Fish";
        }
        else { return null;}
    }
}
