package com.rakovets.course.java.core.practice.operators;

/**
 * Разработать программу для банка.
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
        float depositAmount = 1500f;
        float depositYears = 5f;
        float depositAnnualPercentage = 3f;

        float totalDepositAmount = getTotalDepositAmount(depositAmount, depositYears, depositAnnualPercentage);
        System.out.printf("Result: %f", totalDepositAmount);
    }

    /**
     * Высчитывает конечную сумма на депозитном счете, при условии:
     * <ul>
     *     <li>процент простой, т.е. всегда считается от первоначальной суммы вклада</li>
     *     <li>вклад без возможности досрочного снятия</li>
     * </ul>
     *
     * @param depositAmount           первоначальная сумма на счете
     * @param depositYears            время вклада в годах
     * @param depositAnnualPercentage ежегодный простой процент
     */
    static float getTotalDepositAmount(float depositAmount, float depositYears, float depositAnnualPercentage) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        return depositAmount + depositAmount * depositYears * depositAnnualPercentage / 100;
    }
}
