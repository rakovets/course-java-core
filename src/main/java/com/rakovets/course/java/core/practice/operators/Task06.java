package com.rakovets.course.java.core.practice.operators;

/**
 * Разработать программу для игрового движка.
 *
 * @author Dmitry Rakovets
 */
class Task06 {
    private static final int SECOND_IN_DAY = 24 * 60 * 60;
    private static final int SECOND_IN_HOUR = 60 * 60;
    private static final int SECOND_IN_MINIT = 60;
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
        int playingDays = playingTimeInSeconds / SECOND_IN_DAY;
        int playingHours = (playingTimeInSeconds % SECOND_IN_DAY) / SECOND_IN_HOUR;
        int playingMinints = (playingTimeInSeconds % SECOND_IN_HOUR) / SECOND_IN_MINIT;
        int playingSeconds = playingTimeInSeconds % SECOND_IN_MINIT;
        return playingDays + " " + playingHours + ":" + playingMinints + ":" + playingSeconds;
    }
}
