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
        final int SECONDS_TO_HOURS = 3600;
        final byte SECONDS_TO_MINUTES = 60;
        final int SECONDS_TO_DAYS = 86400;
        final byte HOURS_IN_DAY = 24;
        final byte MINUTES_IN_HOURS = 60;
        final byte SECONDS_IN_SECONDS = 60;
              
        int hours = playingTimeInSeconds / SECONDS_TO_HOURS;
        int minutes = playingTimeInSeconds / SECONDS_TO_MINUTES;
        int days = playingTimeInSeconds / SECONDS_TO_DAYS;

        return (days + " " + hours % HOURS_IN_DAY + ":" + minutes % MINUTES_IN_HOURS + ":" + playingTimeInSeconds % SECONDS_IN_SECONDS);
    }
}
