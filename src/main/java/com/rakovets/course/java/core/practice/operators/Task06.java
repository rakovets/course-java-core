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
        final int SEC_IN_DAYS = 86400;
        final int SEC_IN_HOUR = 3600;
        final int SEC_IN_MINUTE = 60;

        int days = playingTimeInSeconds / SEC_IN_DAYS;
        int hours = playingTimeInSeconds % SEC_IN_DAYS / SEC_IN_HOUR;
        int minutes = playingTimeInSeconds % SEC_IN_HOUR / SEC_IN_MINUTE;
        int seconds = playingTimeInSeconds % SEC_IN_MINUTE;
        String playtingTime = String.format("%d %d:%d:%d", days, hours, minutes, seconds);
        return playtingTime;
    }
}
