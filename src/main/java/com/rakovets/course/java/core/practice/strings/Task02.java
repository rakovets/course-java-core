package com.rakovets.course.java.core.practice.strings;

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
        String[] reportArr = report.split(" +");
        ArrayList<Double> numList = new ArrayList<>();
        for (String str : reportArr) {
            if (str.matches("\\-?\\d+\\.?\\d*\\$")) {
                numList.add(Double.parseDouble(str.replace("$", "")));
            }
        }
        double[] money = new double[numList.size()];
        for (int i = 0; i < money.length; i++) {
            money[i] = numList.get(i);
        }
        return money;
    }

    /**
     * Возвращает общую сумму всех денег, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return общую сумму всех денег
     */
    static double getSumMoneyFromReport(String report) {
        double[] moneyFromReport = getArrayMoneyFromReport(report);
        double sum = 0.0;
        for (Double money : moneyFromReport) {
            sum += money;
        }
        return sum;
    }
}
