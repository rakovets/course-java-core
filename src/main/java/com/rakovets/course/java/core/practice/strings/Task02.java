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
        String[] reportArray = report.split("\\s+");
        double[] result;
        int counter = 0;

        for (String s : reportArray) {
            if (s.matches("-?\\d+\\.?\\d*\\$")) {
                counter++;
            }
        }
        result = new double[counter];
        counter = 0;
        for (String money: reportArray) {
            if (money.matches("-?\\d+\\.?\\d*\\$")) {
                result[counter] = Double.parseDouble(money.replace("$", ""));
                counter++;
            }
        }

        return result;
    }

    /**
     * Возвращает общую сумму всех денег, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return общую сумму всех денег
     */
    static double getSumMoneyFromReport(String report) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        return 0.0;
    }
}
