package com.rakovets.course.java.core.practice.strings;

/**
 * Разработать программу для разбора (parsing) полного имени сотрудника компании.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task01 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        String fullName = "Nappie Lopez-gomez";

        String name = getName(fullName);
        System.out.printf("Name: %s\n", name);
        String surname = getSurname(fullName);
        System.out.printf("Surname: %s\n", surname);
        String reverseFullName = reverseFullName(fullName);
        System.out.printf("Reversed full name: %s\n", reverseFullName);
    }

    /**
     * Возвращает имя сотрудника.
     *
     * @param fullName полное имя сотрудника согласно паттерну '${name} ${surname}'
     * @return имя сотрудника
     */
    static String getName(String fullName) {
        return fullName.substring(0,fullName.indexOf(" "));
    }

    /**
     * Возвращает фамилию сотрудника.
     *
     * @param fullName полное имя сотрудника согласно паттерну '${name} ${surname}'
     * @return фамилия сотрудника
     */
    static String getSurname(String fullName) {
        return fullName.substring(fullName.indexOf(" "),fullName.length()).trim();
    }

    /**
     * Возвращает полное имя сотрудника в обратном формате.
     *
     * @param fullName полное имя сотрудника согласно паттерну '${name} ${surname}'
     * @return полное имя сотрудника в обратном формате, т.е. '${surname} ${name}'
     */
    static String reverseFullName(String fullName) {
        return Task01.getSurname(fullName) + " " + Task01.getName(fullName);
    }
}
