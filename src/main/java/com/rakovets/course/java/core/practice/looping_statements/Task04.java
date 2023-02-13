package com.rakovets.course.java.core.practice.looping_statements;

/**
 * Разработать программу для игрового движка:
 * Спрогнозировать через какое время party(team) игроков убьет RaidBoss и получит вознаграждение.
 *
 * @author Dmitry Rakovets
 */
class Task04 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int healthPoints = 10000;
        double regenerationPercentFromCurrentHealth = 5.0;
        int averageDamagePerHour = 917;

        double raidTime = calculateRaidTime(healthPoints, regenerationPercentFromCurrentHealth, averageDamagePerHour);
        System.out.printf("Result: %f", raidTime);
    }

    /**
     * Высчитывает через какое время команда игроков убьет RaidBoss.
     *
     * @param healthPoints               количество HP RaidBoss
     * @param regenerationPercentPerHour регенерация HP RaidBoss (%/hour)
     * @param averageDamagePerHour       средний урон команды игроков по Raid Boss (HP/hour)
     * @return время для убийства RaidBoss (когда party не справляется за 24 часа, то вывести -1)
     */
    static int calculateRaidTime(int healthPoints, double regenerationPercentPerHour, int averageDamagePerHour) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
//        int hour = 0;
        double hp = healthPoints;
//        while (true) {
//            double regenerationPoints = hp /100 * regenerationPercentPerHour;
//            hp +=regenerationPoints;
//            if (hour > 24) {
//                hour = -1;
//                break;
//            }
//            hp -= averageDamagePerHour;
//            hour++;
//            if (!(hp > 0)) {
//                break;
//            }
//        }
//        return hour;


        for (int hour = 1; hour <= 24; hour ++) {
            double regenerationPoints = hp /100 * regenerationPercentPerHour;
            hp +=regenerationPoints;
            hp -= averageDamagePerHour;
            if (hp < 0) {
                return  hour;
            }
        }
        return -1;
    }
}
