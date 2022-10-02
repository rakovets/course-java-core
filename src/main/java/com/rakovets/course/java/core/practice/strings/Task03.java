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
        String[] allInformationAboutStaff = informationAboutStuff.split(";");
        String[] informationAboutOnePerson;
        String[] names = new String[allInformationAboutStaff.length];
        for (int i = 0; i < allInformationAboutStaff.length; i++) {
            informationAboutOnePerson = allInformationAboutStaff[i].split(" ");
            names[i] = informationAboutOnePerson[0];
        }
        return names;
    }

    /**
     * Возвращает массив фамилий персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив фамилий персонала, где каждый элемент является фамилией одного сотрудника
     */
    static String[] parseToArraySurname(String informationAboutStuff) {
        String[] allInformationAboutStaff = informationAboutStuff.split(";");
        String oneLineFromInformation;
        String[] surnames = new String[allInformationAboutStaff.length];
        String[] informationAboutOnePerson;
        for (int i = 0; i < allInformationAboutStaff.length; i++) {
            oneLineFromInformation = allInformationAboutStaff[i].replaceAll(" +", " ");
            informationAboutOnePerson = oneLineFromInformation.split(" ");
            surnames[i] = informationAboutOnePerson[1];
        }
        return surnames;
    }

    /**
     * Возвращает массив зарплат персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив зарплат персонала, где каждый элемент является зарплатой одного сотрудника
     */
    static int[] parseToArraySalary(String informationAboutStuff) {
        String[] allInformationAboutStaff = informationAboutStuff.split(";");
        String oneLineFromInformation;
        int[] surnames = new int[allInformationAboutStaff.length];
        String[] informationAboutOnePerson;
        for (int i = 0; i < allInformationAboutStaff.length; i++) {
            oneLineFromInformation = allInformationAboutStaff[i].replaceAll(" +", " ");
            informationAboutOnePerson = oneLineFromInformation.split(" ");
            surnames[i] = Integer.parseInt(informationAboutOnePerson[2]);
        }
        return surnames;
    }
}
