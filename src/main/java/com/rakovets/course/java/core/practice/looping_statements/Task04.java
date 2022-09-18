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
        int _raidTime = 1; // first playing hour, time can't be less than 1;
        double _сurrentHealthPoints = healthPoints + healthPoints * (regenerationPercentPerHour / 100) - averageDamagePerHour;
        // if after first playing hour HP still exists, start to count time;
        while (_сurrentHealthPoints > 0) {
            _сurrentHealthPoints = _сurrentHealthPoints + _сurrentHealthPoints * (regenerationPercentPerHour / 100) - averageDamagePerHour;
            _raidTime++;
            if (_raidTime > 24) {
                _сurrentHealthPoints = 0;
                _raidTime = -1;
            }
        }
        return _raidTime;
    }
}
