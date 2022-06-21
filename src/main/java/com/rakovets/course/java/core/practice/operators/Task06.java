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
        final int SECONDS_IN_DAY = 86400;
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_MINUTE = 60;
        int daysCounter = playingTimeInSeconds / SECONDS_IN_DAY;
        int hoursCounter = (playingTimeInSeconds - daysCounter * SECONDS_IN_DAY) / SECONDS_IN_HOUR;
        int minutesCounter = (playingTimeInSeconds - daysCounter * SECONDS_IN_DAY - hoursCounter * SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        int secondsCounter = playingTimeInSeconds % SECONDS_IN_MINUTE;
        return daysCounter + " " + hoursCounter + ":" + minutesCounter + ":" + secondsCounter;
    }
}
