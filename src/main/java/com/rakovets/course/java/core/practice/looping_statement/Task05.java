package com.rakovets.course.java.core.practice.looping_statement;

/**
 * Разработать программу для игрового движка:
 * Спрогнозировать через какое время party(team) игроков убьет RaidBoss и получит вознаграждение.
 *
 * @author Dmitry Rakovets
 */
class Task05 {
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
        double regenerationPercentFromCurrentHealth = 5;
        int averageDamagePerHour = 500;

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

        int hour = 0;
        double fractionalHealthPoints = healthPoints;
        double percentRegenerationHealth = regenerationPercentPerHour / 100;

        while (fractionalHealthPoints > 0) {
            fractionalHealthPoints = (fractionalHealthPoints  + fractionalHealthPoints * percentRegenerationHealth) - averageDamagePerHour;
            hour += 1;
            if (hour > 24) {
                return -1;
            }
        }
        return hour;
    }
}
