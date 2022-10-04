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
        final int FIRST_INDEX_OF_ARRAY = 0;
        String names = "";
        informationAboutStuff = informationAboutStuff.trim().replaceAll(" +", " ");
        String[] dataAfterExtraction = informationAboutStuff.split(";");

        for (int i = 0; i < dataAfterExtraction.length; i++) {
            String[] person = dataAfterExtraction[i].split(" ");
            names += person[FIRST_INDEX_OF_ARRAY] + " ";
        }

        names = names.trim();
        String[] arrayName = names.split(" ");
        return arrayName;
    }

    /**
     * Возвращает массив фамилий персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив фамилий персонала, где каждый элемент является фамилией одного сотрудника
     */
    static String[] parseToArraySurname(String informationAboutStuff) {
        final int SECOND_INDEX_OF_ARRAY = 1;
        String surnames = "";
        informationAboutStuff = informationAboutStuff.trim().replaceAll(" +", " ");
        String[] dataAfterExtraction = informationAboutStuff.split(";");

        for (int i = 0; i < dataAfterExtraction.length; i++) {
            String[] person = dataAfterExtraction[i].split(" ");
            surnames += person[SECOND_INDEX_OF_ARRAY] + " ";
        }

        surnames = surnames.trim();
        String[] arraySurname = surnames.split(" ");
        return arraySurname;
    }

    /**
     * Возвращает массив зарплат персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив зарплат персонала, где каждый элемент является зарплатой одного сотрудника
     */
    static int[] parseToArraySalary(String informationAboutStuff) {
        final int THIRD_INDEX_OF_ARRAY = 2;
        String salary = "";
        informationAboutStuff = informationAboutStuff.trim().replaceAll(" +", " ");
        String[] dataAfterExtraction = informationAboutStuff.split(";");

        for (int i = 0; i < dataAfterExtraction.length; i++) {
            String[] person = dataAfterExtraction[i].split(" ");
            salary += person[THIRD_INDEX_OF_ARRAY] + " ";
        }

        salary = salary.trim();
        String[] salaryArray = salary.split(" ");
        int[] processedSalaryArray = new int[salaryArray.length];

        for (int i = 0; i < processedSalaryArray.length; i++) {
            processedSalaryArray[i] = Integer.parseInt(salaryArray[i]);
        }

        return processedSalaryArray;
    }
}
