package com.rakovets.course.java.core.practice.operators;

/**
 * Разработать программу для игрового движка.
 *
 * @author Dmitry Rakovets
 */
class Task06 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int playingTimeInSeconds = 4567;


        String playingTime = getPlayingTime(playingTimeInSeconds);
        System.out.printf("Result: %s", playingTime);
    }

    public static final int SECONDS_IN_MINUTE = 60;
    public static  final  int HOURS_IN_DAY = 24;

    /**
     * Высчитывает сколько времени пользователь провел в игре.
     *
     * @param playingTimeInSeconds - количество секунд проведенных пользователем в игре
     * @return время в формате 'D H:m:s', где D - дни, H - часы, m - минуты, s - секунды
     */
    static String getPlayingTime(int playingTimeInSeconds) {
        int days = 0;
        int hours = 0;
        int min = 0;
        int sec = 0;

        days = playingTimeInSeconds / (SECONDS_IN_MINUTE * SECONDS_IN_MINUTE) * HOURS_IN_DAY;
        hours = playingTimeInSeconds % (SECONDS_IN_MINUTE * SECONDS_IN_MINUTE) * HOURS_IN_DAY;
        min = hours % (SECONDS_IN_MINUTE * SECONDS_IN_MINUTE);
        hours /= Math.pow(SECONDS_IN_MINUTE, 2);
        sec = min % SECONDS_IN_MINUTE;
        min /= SECONDS_IN_MINUTE;

        String time = days + " " + hours + ":" + min + ":" + sec;
        return time;
    }
}
