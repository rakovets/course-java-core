package com.rakovets.course.java.core.practice.operators;

import com.rakovets.course.java.core.util.constants.LimitValues;
import com.rakovets.course.java.core.util.random_util.RandomUtil;

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
        RandomUtil randomUtil = new RandomUtil();
        int depositAmount = randomUtil.getRandomIntegerNumber(LimitValues.THOUSANDS.getLimitValue());
        int depositYears = randomUtil.getRandomIntegerNumber(LimitValues.UNITS.getLimitValue());
        int depositAnnualPercentage = randomUtil.getRandomIntegerNumber(LimitValues.UNITS.getLimitValue());

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
    static float getTotalDepositAmount(int depositAmount, int depositYears, int depositAnnualPercentage) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода

        return depositAmount / 100f * depositAnnualPercentage * depositYears;
    }
}
