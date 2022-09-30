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
        informationAboutStuff = informationAboutStuff.trim().replaceAll(" +", " ");
        String[] divideInfo = informationAboutStuff.split(";");
        String names = "";
        for (int i = 0; i < divideInfo.length; i ++) {
            String[] person = divideInfo[i].split(" ");
            names += person[0] + " ";
        }
        names = names.trim();
        String[] nameArray = names.split(" ");
        return nameArray;
    }

    /**
     * Возвращает массив фамилий персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив фамилий персонала, где каждый элемент является фамилией одного сотрудника
     */
    static String[] parseToArraySurname(String informationAboutStuff) {
        informationAboutStuff = informationAboutStuff.trim().replaceAll(" +", " ");
        String[] divideInfo = informationAboutStuff.split(";");
        String surnames = "";
        for (int i = 0; i < divideInfo.length; i++) {
            String[] person = divideInfo[i].split(" ");
            surnames += person[1] + " ";
        }
        surnames = surnames.trim();
        String[] surnameArray = surnames.split(" ");
        return surnameArray;
    }

    /**
     * Возвращает массив зарплат персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив зарплат персонала, где каждый элемент является зарплатой одного сотрудника
     */
    static int[] parseToArraySalary(String informationAboutStuff) {
        informationAboutStuff = informationAboutStuff.trim().replaceAll(" +", " ");
        String[] divideInfo = informationAboutStuff.split(";");
        String salary = "";
        for (int i = 0; i < divideInfo.length; i ++) {
            String[] person = divideInfo[i].split(" ");
            salary += person[2] + " ";
        }
        salary = salary.trim();
        String[] salaryArray = salary.split(" ");
        int[] parsedSalaryArray = new int[salaryArray.length];
        for (int i = 0; i < parsedSalaryArray.length; i++) {
            parsedSalaryArray[i] = Integer.parseInt(salaryArray[i]);
        }
        return parsedSalaryArray;
    }
}
