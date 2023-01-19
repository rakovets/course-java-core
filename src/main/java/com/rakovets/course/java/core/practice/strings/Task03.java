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
    private static final int NAME_POSITION = 0;
    private static final int SURNAME_POSITION = 1;
    private static final int SALARY_POSITION = 2;
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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String[] personalInformation = informationAboutStuff.split(";");
        String[] personalNames = new String[personalInformation.length];
        for (int i = 0; i < personalInformation.length; i++) {
            personalNames[i] = personalInformation[i].split("\\s+")[NAME_POSITION];
        }
        return personalNames;
    }

    /**
     * Возвращает массив фамилий персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив фамилий персонала, где каждый элемент является фамилией одного сотрудника
     */
    static String[] parseToArraySurname(String informationAboutStuff) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String[] personalInformation = informationAboutStuff.split(";");
        String[] personalSurnames = new String[personalInformation.length];
        for (int i = 0; i < personalInformation.length; i++) {
            personalSurnames[i] = personalInformation[i].split("\\s+")[SURNAME_POSITION];
        }
        return personalSurnames;
    }

    /**
     * Возвращает массив зарплат персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив зарплат персонала, где каждый элемент является зарплатой одного сотрудника
     */
    static int[] parseToArraySalary(String informationAboutStuff) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String[] personalInformation = informationAboutStuff.split(";");
        int[] personalSalary = new int[personalInformation.length];
        for (int i = 0; i < personalInformation.length; i++) {
            personalSalary[i] = Integer.parseInt(personalInformation[i].split("\\s+")[SALARY_POSITION]);
        }
        return personalSalary;
    }
}
