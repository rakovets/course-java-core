package com.rakovets.course.java.core.practice.strings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Разработать программу для разбора (parsing) банковских отчетов.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task02 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        String bankReport = "Remaining 10$  12$ essentially 13$ unchanged.";

        double[] moneyFromReport = getArrayMoneyFromReport(bankReport);
        System.out.printf("Money from the report: %s\n", Arrays.toString(moneyFromReport));
        double sumMoneyFromReport = getSumMoneyFromReport(bankReport);
        System.out.printf("Sum money from the report: %s\n", sumMoneyFromReport);
    }

    /**
     * Возвращает список сумм, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return список сумм
     */
    static double[] getArrayMoneyFromReport(String report) {
        String[] arraysBankReport = report.split(" +");
        ArrayList<Double> arrayWithMoney = new ArrayList<>();
        for (int i = 0; i < arraysBankReport.length; i++) {
            if (arraysBankReport[i].matches("\\-?\\d+\\.?\\d*\\$")) {
                arrayWithMoney.add(Double.parseDouble(arraysBankReport[i].replace("$", "")));
            }
        }
        double[] bankReport = new double[arrayWithMoney.size()];
        for (int i = 0; i < bankReport.length; i++) {
            bankReport[i] = arrayWithMoney.get(i);
        }
        return bankReport;
    }

    /**
     * Возвращает общую сумму всех денег, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return общую сумму всех денег
     */
    static double getSumMoneyFromReport(String report) {
        double sumMoneyFromReport = 0.0;
        for (int i = 0; i < getArrayMoneyFromReport(report).length; i++) {
            sumMoneyFromReport += getArrayMoneyFromReport(report)[i];
        }
        return sumMoneyFromReport;
    }
}
