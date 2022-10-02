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
        StringBuilder names = new StringBuilder();
        String[] arrayOfStringsWithoutPunctuation = informationAboutStuff.split(";");
        for (String name : arrayOfStringsWithoutPunctuation) {
            informationAboutStuff = name.trim();
            String[] arrayInformationAboutStuff = informationAboutStuff.split(" ");
            for (int i = 0; i < 1; i++) {
                names.append(arrayInformationAboutStuff[i]);
            }
            names.append(" ");
        }
        informationAboutStuff = names.toString();
        return informationAboutStuff.split(" ");
    }

    /**
     * Возвращает массив фамилий персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив фамилий персонала, где каждый элемент является фамилией одного сотрудника
     */
    static String[] parseToArraySurname(String informationAboutStuff) {
        StringBuilder surnames = new StringBuilder();
        String[] arrayOfStringsWithoutPunctuation = informationAboutStuff.split(";");
        for (String name : arrayOfStringsWithoutPunctuation) {
            informationAboutStuff = name.trim().replaceAll("\\s", "");
            System.out.println(informationAboutStuff);
            String[] arrayInformationAboutStuff = informationAboutStuff.split("(?=[A-Z0-9])");
            for (int i = 1; i < 2; i++) {
                surnames.append(arrayInformationAboutStuff[i]);
            }
            surnames.append(" ");
        }
        informationAboutStuff = surnames.toString();
        return informationAboutStuff.split(" ");
    }

    /**
     * Возвращает массив зарплат персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив зарплат персонала, где каждый элемент является зарплатой одного сотрудника
     */
    static int[] parseToArraySalary(String informationAboutStuff) {
        StringBuilder workaholicWages = new StringBuilder();
        String[] arrayOfStringsWithoutPunctuation = informationAboutStuff.split(";");
        for (String name : arrayOfStringsWithoutPunctuation) {
            informationAboutStuff = name.trim().replaceAll("\\s", "");
            System.out.println(informationAboutStuff);
            String[] arrayInformationAboutStuff = informationAboutStuff.split("(?=[A-Z0-9])");
            for (int i = 2; i < arrayInformationAboutStuff.length; i++) {
                workaholicWages.append(arrayInformationAboutStuff[i]);
            }
            workaholicWages.append(" ");
        }
        informationAboutStuff = workaholicWages.toString();
        String[] names = informationAboutStuff.split(" ");
        int[] salaries = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            salaries[i] = Integer.parseInt(names[i]);
        }
        return salaries;
    }
}
