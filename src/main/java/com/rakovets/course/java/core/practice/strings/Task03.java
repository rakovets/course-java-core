package com.rakovets.course.java.core.practice.strings;

import com.rakovets.course.java.core.util.StandardInputTask;

import java.util.Arrays;

/**
 * Разработать программу для разбора (parsing) информации о персонале компании.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task03 extends StandardInputTask {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        String informationAboutStuff = INPUT_SCANNER.nextLine();

        String[] names = parseToArrayName(informationAboutStuff);
        System.out.printf("Names: %s\n", Arrays.toString(names));
        String[] surnames = parseToArraySurname(informationAboutStuff);
        System.out.printf("Surnames: %s\n", Arrays.toString(surnames));
        int[] salaries = parseToArraySalary(informationAboutStuff);
        System.out.printf("Salaries: %s\n", Arrays.toString(salaries));
    }

    /**
     * Возвращает массив имен персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив имен персонала, где каждый элемент является именем одного сотрудника
     */
    static String[] parseToArrayName(String informationAboutStuff) {
        return parseToArrayResult(informationAboutStuff, 1);
    }

    /**
     * Возвращает массив фамилий персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив фамилий персонала, где каждый элемент является фамилией одного сотрудника
     */
    static String[] parseToArraySurname(String informationAboutStuff) {
        return parseToArrayResult(informationAboutStuff, 2);
    }

    /**
     * Возвращает массив зарплат персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив зарплат персонала, где каждый элемент является зарплатой одного сотрудника
     */
    static int[] parseToArraySalary(String informationAboutStuff) {
        return convertToIntegerArraySalary(parseToArrayResult(informationAboutStuff, 3));
    }

    static int[] convertToIntegerArraySalary(String[] str) {
        int[] toArraySalary = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            toArraySalary[i] = Integer.parseInt(str[i]);
        }
        return toArraySalary;
    }

    static String[] parseToArrayResult(String informationAboutStuff, int positionOfRequiredArray) {
        final int NUMBER_OF_WORDS_FOR_ONE_PERSON = 3;
        StringBuffer informationWithSplits = new StringBuffer(informationAboutStuff);
        for (int i = 0; i < informationWithSplits.length(); i++) {
            if (informationWithSplits.charAt(i) == ';') {
                informationWithSplits.setCharAt(i, ' ');
            }
            if (informationWithSplits.charAt(i) == ' ' && informationWithSplits.charAt(i - 1) == ' ') {
                informationWithSplits.deleteCharAt(i);
                i--;
            }
        }
        String informationAboutStuffWithSplits = new String(informationWithSplits);
        String[] arrayInformationOneWord = informationAboutStuffWithSplits.split(" ");
        StringBuffer resultOnly = new StringBuffer();
        for (int i = 0; i < arrayInformationOneWord.length; i++) {
            if ((i + NUMBER_OF_WORDS_FOR_ONE_PERSON - positionOfRequiredArray + 1) % NUMBER_OF_WORDS_FOR_ONE_PERSON == 0) {
                resultOnly.append(arrayInformationOneWord[i]);
                resultOnly.append(' ');
            }
        }
        String result = new String(resultOnly);
        String[] toArrayResult = result.split(" ");
        return toArrayResult;
    }
}
