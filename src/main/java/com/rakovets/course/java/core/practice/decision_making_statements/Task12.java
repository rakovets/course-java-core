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
        int day = 2;
        int month = 9;

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
        String ZodiacSign;

           switch (month) {
               case 1:
                   ZodiacSign = day >= 21 ? "Water-bearer" : "Goat";
                   break;
               case 2:
                   ZodiacSign = day >= 20 ? "Fish" : "Water-bearer";
                   break;
               case 3:
                   ZodiacSign = day >= 21 ? "Ram" : "Fish";
                   break;
               case 4:
                   ZodiacSign = day >= 21 ? "Bull" : "Ram";
                   break;
               case 5:
                   ZodiacSign = day >= 21 ? "Twins" : "Bull";
                   break;
               case 6:
                   ZodiacSign = day >= 22 ? "Crab" : "Twins";
                   break;
               case 7:
                   ZodiacSign = day >= 23 ? "Lion" : "Crab";
                   break;
               case 8:
                   ZodiacSign = day >= 23 ? "Maiden" : "Lion";
                   break;
               case 9:
                   ZodiacSign = day >= 22 ? "Scales" : "Maiden";
                   break;
               case 10:
                   ZodiacSign = day >= 23 ? "Scorpion" : "Scales";
                   break;
               case 11:
                   ZodiacSign = day >= 23 ? "Archer" : "Scorpion";
                   break;
               case 12:
                   ZodiacSign = day >= 22 ? "Goat" : "Archer";
                   break;
               default:
                   ZodiacSign = "Invalid date'";
                    break;
           }
        return ZodiacSign;
    }
}
