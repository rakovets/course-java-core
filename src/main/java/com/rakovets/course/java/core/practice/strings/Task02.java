package com.rakovets.course.java.core.practice.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

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
        final Pattern pattern = Pattern.compile("-?\\d+\\.?\\d+\\$");
        String[] bankReport = report.split(" +");
        double[] tempResult = new double[bankReport.length];
        int j = 0;
        for (String value : bankReport) {
            if (pattern.matcher(value).matches()) {
                tempResult[j] = Double.parseDouble(value.substring(0, value.length() - 1));
                j++;
            }
        }
        double[] result = new double[j];

        System.arraycopy(tempResult, 0, result, 0, j);
        return result;
    }


    /**
     * Возвращает общую сумму всех денег, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return общую сумму всех денег
     */
    static double getSumMoneyFromReport(String report) {
        double sumMoney = 0.0;
        for (int i = 0; i < getArrayMoneyFromReport(report).length; i++) {
            sumMoney += getArrayMoneyFromReport(report)[i];
        }
        return sumMoney;
    }
}
