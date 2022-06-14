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
        final int MINUTE_TIME_IN_SECONDS = 60;
        final int HOUR_TIME_IN_SECONDS = 3600;
        final int DAY_TIME_IN_SECONDS = 86400;
        int dayPlaying;
        int hourPlaying;
        int minutePlaying;
        int secondPlaying;
        dayPlaying = playingTimeInSeconds / DAY_TIME_IN_SECONDS;
        playingTimeInSeconds = playingTimeInSeconds - (dayPlaying * DAY_TIME_IN_SECONDS);
        hourPlaying = playingTimeInSeconds / HOUR_TIME_IN_SECONDS;
        playingTimeInSeconds = playingTimeInSeconds - hourPlaying * HOUR_TIME_IN_SECONDS;
        minutePlaying = playingTimeInSeconds / MINUTE_TIME_IN_SECONDS;
        secondPlaying = playingTimeInSeconds - (minutePlaying * MINUTE_TIME_IN_SECONDS);
        return  (dayPlaying + " " + hourPlaying + ":" + minutePlaying + ":" + secondPlaying);
    }
}
