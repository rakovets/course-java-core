package com.rakovets.course.java.core.practice.string;

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
    static String[][] informationAboutPeople(String informationAboutStuff){
        String[] info = informationAboutStuff.trim().replaceAll("( )\\1+", "$1").split(";");
        String[][] infoAfterSeparation = new String[info.length][3];
        for (int i = 0; i < info.length; i++) {
            infoAfterSeparation[i] = info[i].split(" ");
        }
        return infoAfterSeparation;
    }

    static String[] parseToArrayName(String informationAboutStuff) {
        String [][]info = informationAboutPeople(informationAboutStuff);
        String[] names = new String[info.length];

        for (int j = 0; j < info.length; j++) {
            names[j] = info[j][0];
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

        String [][]info = informationAboutPeople(informationAboutStuff);
        String[] surnames = new String[info.length];

        for (int j = 0; j < info.length; j++) {
            surnames[j] = info[j][1];
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
        String [][]info = informationAboutPeople(informationAboutStuff);
        int[] salaries = new int[info.length];

        for (int j = 0; j < info.length; j++) {
            salaries[j] = Integer.parseInt(info[j][2]);
        }

        return salaries;
    }
}
