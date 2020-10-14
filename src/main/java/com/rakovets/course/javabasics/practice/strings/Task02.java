package com.rakovets.course.javabasics.practice.strings;

import com.rakovets.course.javabasics.util.StandardInputTask;

import java.util.Arrays;

/**
 * Разработать программу для анализа банковских отчетов.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task02 extends StandardInputTask {
    /**
     * Запрашивает ввод данных от пользователя и вызывает все методы класса для этих данных.
     */
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        System.out.println("Enter report with money format: ' count$ '");
        String text = INPUT_SCANNER.nextLine();

        // Вызов методов
        System.out.println(Arrays.toString(getArrayMoneyFromReport(text)));
        System.out.println(getSumMoneyFromReport(text));
    }

    /**
     * Возвращает список сумм, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return список сумм
     */
    static double[] getArrayMoneyFromReport(String report) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        return null;
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
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        return 0.0;
    }
}