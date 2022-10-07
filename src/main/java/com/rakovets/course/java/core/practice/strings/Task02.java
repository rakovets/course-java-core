package com.rakovets.course.java.core.practice.strings;

import java.util.Arrays;

import static java.lang.Double.valueOf;

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
        StringBuffer bufferReport = new StringBuffer(report.length());
        bufferReport.append(' ').insert(0, ' ');
        for (int i = 1; i < report.length(); ) {
            if ((report.charAt(i) >= '0' && report.charAt(i) <= '9' || report.charAt(i) =='-') && report.charAt(i - 1) == ' ') {
                while (report.charAt(i) != ' ') {
                    bufferReport.append(report.charAt(i));
                    i++;
                }
                bufferReport.append(' ');
            } else {
                i++;
            }
        }
        bufferReport.reverse();
        StringBuffer bufferReportFinal = new StringBuffer();
        for (int i = 1; i < bufferReport.length(); ) {
            if (bufferReport.charAt(i) == '$' && bufferReport.charAt(i - 1) == ' ') {
                while (bufferReport.charAt(i) != ' ') {
                    bufferReportFinal.append(bufferReport.charAt(i));
                    i++;
                }
                bufferReportFinal.append(' ');
            } else {
                i++;
            }
        }
        bufferReportFinal.reverse();
        for (int i = 0; i < bufferReportFinal.length(); i++) {
            if(bufferReportFinal.charAt(i) == '$') {
                bufferReportFinal.deleteCharAt(i);
            }
        }
        String reportFinal = new String(bufferReportFinal).trim();
        double[] arrayMoneyFromReportDouble;
        if (reportFinal.length() > 0) {
            String[] arrayStringDouble = reportFinal.split(" ");
            arrayMoneyFromReportDouble = new double[arrayStringDouble.length];
            for (int i = 0; i < arrayStringDouble.length; i++) {
                arrayStringDouble[i].trim();
                arrayMoneyFromReportDouble[i] = Double.parseDouble(arrayStringDouble[i]);
            }
        } else arrayMoneyFromReportDouble = new double[] {};
        return arrayMoneyFromReportDouble;
    }

    /**
     * Возвращает общую сумму всех денег, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return общую сумму всех денег
     */
    static double getSumMoneyFromReport(String report) {
        double[] arrayDouble = getArrayMoneyFromReport(report);
        double sumMoneyFromReport = 0;
        for (int i = 0; i < arrayDouble.length; i++) {
            sumMoneyFromReport += arrayDouble[i];
        }
        return sumMoneyFromReport;
    }
}
