package com.rakovets.course.java.core.practice.looping_statement;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
        double depositAmount = 10000.0;
        double annualDepositPercent = 18.0;
        int depositTerm = 5;

        double totalDepositAmount = getTotalDepositAmount(depositAmount, annualDepositPercent, depositTerm);
        System.out.printf("Result: %f", totalDepositAmount);
    }

    /**
     * Рассчитывает прибыль, которую получит клиент по вкладу с ежегодным перерасчетом (сложный процент).
     *
     * @param depositAmount        сумма вклада
     * @param annualDepositPercent ежегодный процент вклада
     * @param depositTerm          продолжительность вклада (в годах)
     * @return прибыль (с точностью до 2 знаков после десятичного разделителя)
     */
    static double getTotalDepositAmount(double depositAmount, double annualDepositPercent, int depositTerm) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        double totalAmount = depositAmount;
        for (int i = 1; i <= depositTerm; i++){
            totalAmount += totalAmount * (annualDepositPercent/100);
        }
        totalAmount = BigDecimal.valueOf(totalAmount).setScale(2, RoundingMode.HALF_UP).doubleValue();
        return totalAmount;
    }
}
