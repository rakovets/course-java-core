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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        final int SECONDS_TO_DAYS = 86400;
        final int SECONDS_TO_HOURS = 3600;
        final int SECONDS_TO_MINUTES = 60;
        final int SECONDS_IN_MINUTE = 60;
        int day = playingTimeInSeconds / SECONDS_TO_DAYS;
        int hour = playingTimeInSeconds % SECONDS_TO_DAYS / SECONDS_TO_HOURS;
        int min = playingTimeInSeconds % SECONDS_TO_DAYS % SECONDS_TO_HOURS / SECONDS_TO_MINUTES;
        int sec = (playingTimeInSeconds % SECONDS_IN_MINUTE);
        return (day + " " + hour + ":" + min + ":" + sec);
    }
}
