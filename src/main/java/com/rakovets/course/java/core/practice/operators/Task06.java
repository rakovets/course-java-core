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

    /**
     * Высчитывает сколько времени пользователь провел в игре.
     *
     * @param playingTimeInSeconds - количество секунд проведенных пользователем в игре
     * @return время в формате 'D H:m:s', где D - дни, H - часы, m - минуты, s - секунды
     */
    static String getPlayingTime(int playingTimeInSeconds) {
        final int SECONDS_IN_A_MINUTE = 60;
        final int MINUTES_IN_A_HOUR = 60;
        final int HOURS_IN_A_DAY = 24;

        int secondsInPlay = playingTimeInSeconds % SECONDS_IN_A_MINUTE;
        int minutesInPlay = (playingTimeInSeconds / SECONDS_IN_A_MINUTE) % MINUTES_IN_A_HOUR;
        int hoursInPlay = (playingTimeInSeconds / (SECONDS_IN_A_MINUTE * MINUTES_IN_A_HOUR)) % HOURS_IN_A_DAY;
        int daysInPlay = playingTimeInSeconds / (SECONDS_IN_A_MINUTE * MINUTES_IN_A_HOUR * HOURS_IN_A_DAY);

        return daysInPlay + " " + hoursInPlay + ":" + minutesInPlay + ":" + secondsInPlay;
    }
}
