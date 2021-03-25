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
        final int SECONDS_IN_ONE_DAY = 86400;
        final int SECONDS_IN_ONE_HOUR = 3600;
        final int SECONDS_IN_ONE_MINUTE = 60;

        int daysInGame = playingTimeInSeconds / SECONDS_IN_ONE_DAY;
        int hoursInGame = playingTimeInSeconds % SECONDS_IN_ONE_DAY / SECONDS_IN_ONE_HOUR;
        int minutesInGame = playingTimeInSeconds % SECONDS_IN_ONE_DAY % SECONDS_IN_ONE_HOUR / SECONDS_IN_ONE_MINUTE;
        int secondsInGame = playingTimeInSeconds % SECONDS_IN_ONE_DAY % SECONDS_IN_ONE_HOUR % SECONDS_IN_ONE_MINUTE;
        return (daysInGame + " " + hoursInGame + ":" + minutesInGame + ":" + secondsInGame);
    }
}
