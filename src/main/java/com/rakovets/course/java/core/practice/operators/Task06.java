package com.rakovets.course.java.core.practice.operators;

/**
 * Разработать программу для игрового движка.
 *
 * @author Dmitry Rakovets
 */
class Task06 {
    private final static int HOURS_IN_DAY = 24;
    private final static int MIN_IN_HOUR = 60;
    private final static int SEC_IN_MIN = 60;
    private final  static int SEC_IN_DAY = HOURS_IN_DAY * MIN_IN_HOUR * SEC_IN_MIN;
    private final static int SEC_N_HOUR = MIN_IN_HOUR * SEC_IN_MIN;
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
        int d = playingTimeInSeconds / (SEC_IN_DAY);
        int h = playingTimeInSeconds % (SEC_IN_DAY) / (SEC_N_HOUR);
        int m = (playingTimeInSeconds % (SEC_IN_DAY) % (SEC_N_HOUR)) / MIN_IN_HOUR;
        int s = (playingTimeInSeconds % (SEC_IN_DAY) % (SEC_N_HOUR)) % MIN_IN_HOUR;
        return d + " " + h + ":" + m + ":" + s;
    }
}
