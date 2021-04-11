package com.rakovets.course.java.core.practice.string;

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
        String bankReport = "typetypesetting 100$ -12$remaining the 1960s with -12$ the release -36$ of Letraset Lorem";

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
        String[] numbersInArray = report.replaceAll("[^0-9$]", " ").split(" ");
        StringBuilder numbersInRow = new StringBuilder();

        for (String word : numbersInArray) {
            if (word.endsWith("$")) {
                numbersInRow.append(word);
            }
        }

        String[] numbersInArray2 = numbersInRow.toString().split("[$]");
        double[] doubleNumbers = new double[numbersInArray2.length];
        int index = 0;

        for (String ss : numbersInArray2) {
            doubleNumbers[index] = Double.parseDouble(ss);
            index++;
        }

        return doubleNumbers;
    }

    /**
     * Возвращает общую сумму всех денег, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return общую сумму всех денег
     */
    static double getSumMoneyFromReport(String report) {
        double sum = 0.0;
        double[] doubleNumbers = getArrayMoneyFromReport(report);

        for (double value : doubleNumbers) {
            sum = sum + value;
        }

        return sum;
    }
}
