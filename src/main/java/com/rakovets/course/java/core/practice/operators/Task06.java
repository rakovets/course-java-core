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
       int daysInGame = playingTimeInSeconds / (3600 * 24);
       int timeWithoutDays = playingTimeInSeconds - daysInGame * 3600 * 24;
       int hoursInGame = timeWithoutDays / 3600;
       int timeWithoutDaysHours = timeWithoutDays - hoursInGame * 3600;
       int minutesInGame = timeWithoutDaysHours / 60;
       int seconds = timeWithoutDaysHours - minutesInGame * 60;

       String playTime = daysInGame + " " + hoursInGame + ":" + minutesInGame + ":" + seconds;

        return playTime;
    }
}
