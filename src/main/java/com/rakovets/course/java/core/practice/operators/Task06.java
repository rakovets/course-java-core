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
        int secondInDay = 86400;
        int secondInHour = 3600;
        int secondInMinute = 60;
        int daysInGame = playingTimeInSeconds / secondInDay;
        int hoursInGame = playingTimeInSeconds % secondInDay / secondInHour;
        int minutesInGame = playingTimeInSeconds % secondInDay % secondInHour / secondInMinute;
        int secondsInGame = playingTimeInSeconds % secondInDay % secondInHour % secondInMinute;
        return daysInGame + " " + hoursInGame + ":" + minutesInGame + ":" + secondsInGame;
    }
}
