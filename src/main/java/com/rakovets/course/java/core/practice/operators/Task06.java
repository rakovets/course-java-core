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
        int Days = 0, Hours = 0, Min = 0, Sec = 0;

        Days = playingTimeInSeconds / 86400;
        Hours = playingTimeInSeconds % 86400;
        Min = Hours % 3600;
        Hours /= 3600;
        Sec = Min % 60;
        Min /= 60;

        /**boolean Agreem = true;
        while(Agreem) {
            if(playingTimeInSeconds >= 60) {
                playingTimeInSeconds -= 60;
                Min++;
            }
            else {
                Sec = playingTimeInSeconds;
                Agreem = false;
            }
            if(Min == 60) {
                Hours++;
                Min = 0;
            }
            if(Hours == 24) {
                Days++;
                Hours = 0;
            }
        }**/

        String Time = Days + " " + Hours + ":" + Min + ":" + Sec;
        return Time;
    }
}
