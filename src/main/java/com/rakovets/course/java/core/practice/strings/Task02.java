package com.rakovets.course.java.core.practice.strings;

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
        String bankReport = "since the 1500s when  of type11$ and remaining 10$  12$ essentially 13$ unchanged. the 1960s with  Lorem";

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
        String[] reportArray = report.split(" ");
        StringBuilder digitFromReport = new StringBuilder();
        int arrayLengthNumberOfDouble = 0;

        for (String s : reportArray) {
            if (s.contains("$") && s.endsWith("$") && !s.startsWith("t") && !s.startsWith("o")) {
                char[] reportCharArray = s.toCharArray();
                for (char c : reportCharArray) {
                    if (Character.isDigit(c) || Character.isDefined('-')) {
                        digitFromReport.append(String.valueOf(reportCharArray).replace("$", "")).append(" ");
                        arrayLengthNumberOfDouble++;
                    }
                    break;
                }
            }
        }
        String[] finalArrayDigitFromReport = digitFromReport.toString().split(" ");
        double[] moneyFromReport = new double[arrayLengthNumberOfDouble];
        for (int i = 0; i < moneyFromReport.length; i++) {
            moneyFromReport[i] = Double.parseDouble(finalArrayDigitFromReport[i]);
        }
        return moneyFromReport;
    }

    /**
     * Возвращает общую сумму всех денег, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return общую сумму всех денег
     */
    static double getSumMoneyFromReport(String report) {
        double[] moneyFromReport = getArrayMoneyFromReport(report);
        double sumMoneyFromReport = 0.0;
        for (double v : moneyFromReport) {
            sumMoneyFromReport += v;
        }
        return sumMoneyFromReport;
    }
}
