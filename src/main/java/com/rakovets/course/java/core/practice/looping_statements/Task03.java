package com.rakovets.course.java.core.practice.looping_statements;

/**
 * Разработать программу для игрового движка.
 * Спрогнозировать какое количество HP будет у RaidBoss (RB), который имеет неограниченное количество HP и регенерацию,
 * которая пропорционально зависит от его текущего количества HP.
 *
 * @author Dmitry Rakovets
 */
class Task03 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int healthPoints = 100;
        double regenerationPercentFromCurrentHealth = -4.0;
        int hoursAfterRespawn = 6;

        int featureHealthPoint = calculateHealthPointsByTime(healthPoints, regenerationPercentFromCurrentHealth, hoursAfterRespawn);
        System.out.printf("Result: %d", featureHealthPoint);
    }

    /**
     * Высчитывает количество HP у RaidBoss после возрождения.
     *
     * @param healthPoints                         количество HP Raid Boss после появления (respawn)
     * @param regenerationPercentFromCurrentHealth регенерация здоровья (процент / час)
     * @param hoursAfterRespawn                    время прошедшее после появления Raid Boss
     * @return количество HP
     */
    static int calculateHealthPointsByTime(int healthPoints, double regenerationPercentFromCurrentHealth, int hoursAfterRespawn) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        double newHealthPoint = healthPoints;
        if (healthPoints < 0 || hoursAfterRespawn < 0) {
            throw new Error();
        } else {
            for (int i = 0; i < hoursAfterRespawn; i++) {
                double regenHealth = newHealthPoint * (regenerationPercentFromCurrentHealth / 100);
                newHealthPoint += regenHealth;
            }
        }
        return (int) newHealthPoint;
    }
}
