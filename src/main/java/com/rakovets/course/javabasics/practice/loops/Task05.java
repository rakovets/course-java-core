package com.rakovets.course.javabasics.practice.loops;

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
        double regenerationPercentFromCurrentHealth = 0;
        int averageDamagePerHour = 1000;

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
        int counter=1;
        double currentHP= healthPoints;
        for (int raidTime =1; raidTime<=50; raidTime++){
            currentHP=currentHP+(currentHP*regenerationPercentPerHour/100)-averageDamagePerHour;

            if (currentHP<=0)  {
                counter=raidTime;
                break;
            }
            if (raidTime>=24){
                counter=-1;
                break;
            }
        }
        return counter;
    }
}
// if ((currentHP<=0) | (raidTime==24)) {
  //       break;
