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
        int healthPoints = 1000;
        double regenerationPercentFromCurrentHealth = 10.0;
        int averageDamagePerHour = 200;

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
        int raidTime = 0;
        double currentHealthPoints = healthPoints;
        double currentHealthPointsRegeneration;

        while (currentHealthPoints > 0 && raidTime <= 24) {
            currentHealthPointsRegeneration = currentHealthPoints * regenerationPercentPerHour / 100;
            currentHealthPoints = currentHealthPoints - averageDamagePerHour + currentHealthPointsRegeneration;
            raidTime++;
        }
        if (raidTime > 24) {
            raidTime = -1;
        }

        return raidTime;
    }
}
