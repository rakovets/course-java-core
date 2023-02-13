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
        double regenerationPercentFromCurrentHealth = 5.0;
        int hoursAfterRespawn = 10;

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
        /*
        int a = 0;
        double b = healthPoints;
        while (a < hoursAfterRespawn) {
            b+= (b / 100) * regenerationPercentFromCurrentHealth;
            a++;
        }*/
        for (int i = 0; i < hoursAfterRespawn; i++) {
            System.out.println(healthPoints);
            healthPoints+= (double) (healthPoints / 100) * regenerationPercentFromCurrentHealth;
            System.out.println(healthPoints);
        }
        return healthPoints;
    }
}
