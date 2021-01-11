package com.rakovets.course.java.core.practice.string;

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
     * @param fullName полное имя сотрудника в формате '${name} ${surname}'
     * @return имя сотрудника
     */
    static String getName(String fullName) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        return null;
    }

    /**
     * Возвращает фамилию сотрудника.
     *
     * @param fullName полное имя сотрудника в формате '${name} ${surname}'
     * @return фамилия сотрудника
     */
    static String getSurname(String fullName) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        return null;
    }

    /**
     * Возвращает полное имя сотрудника в обратном формате.
     *
     * @param fullName полное имя сотрудника в формате '${name} ${surname}'
     * @return полное имя сотрудника в обратном формате
     */
    static String reverseFullName(String fullName) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        return null;
    }
}
