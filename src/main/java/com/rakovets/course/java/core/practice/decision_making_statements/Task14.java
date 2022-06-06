package com.rakovets.course.java.core.practice.decision_making_statements;

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
        int year = 1989;

        String monthName = getZodiacYearName(year);
        System.out.printf("Result: %s", monthName);
    }

    /**
     * Определяет названия года по китайскому календарю.
     *
     * @param year  год дня рождения (больше 0 г. н.э.)
     * @return название года по китайскому календарю
     */
    static String getZodiacYearName(int year) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода

        int num = year % 100;
        String text;
        if(num <= 12) {
                if(num == 1) {
                    text = "Snake";
                } else if (num == 2) {
                    text = "Horse";
                } else if (num == 3) {
                    text = "Ram";
                } else if (num == 4) {
                    text = "Monkey";
                } else if (num == 5) {
                    text = "Rooster";
                } else if (num == 6) {
                    text = "Dog";
                } else if (num == 7) {
                    text = "Pig";
                } else if (num == 8) {
                    text = "Rat";
                } else if (num == 9) {
                    text = "Ox";
                } else if (num == 10) {
                    text = "Tiger";
                } else if (num == 11) {
                    text = "Rabbit";
                }
                else if (num == 12) {
                    text = "Dragon";
                }
                else {
                    throw new Error();
                }
        }
        else {
            int buf = num % 10;
            if(buf == 1) {
                text = "Snake";
            } else if (buf == 2) {
                text = "Horse";
            } else if (buf == 3) {
                text = "Ram";
            } else if (buf == 4) {
                text = "Monkey";
            } else if (buf == 5) {
                text = "Rooster";
            } else if (buf == 6) {
                text = "Dog";
            } else if (buf == 7) {
                text = "Pig";
            } else if (buf == 8) {
                text = "Rat";
            } else if (buf == 9) {
                text = "Ox";
            }
            else {
                throw new Error();
            }
        }
        return text;
    }
}
