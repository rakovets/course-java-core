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
     * @param fullName полное имя сотрудника согласно паттерну '${name} ${surname}'
     * @return имя сотрудника
     */
    static String getName(String fullName) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
         return fullName.split("\\s")[0];
    }

    /**
     * Возвращает фамилию сотрудника.
     *
     * @param fullName полное имя сотрудника согласно паттерну '${name} ${surname}'
     * @return фамилия сотрудника
     */
    static String getSurname(String fullName) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int index1 = fullName.indexOf(" ");
        String surname = fullName.substring(index1+1,fullName.length());
        return surname;
    }

    /**
     * Возвращает полное имя сотрудника в обратном формате.
     *
     * @param fullName полное имя сотрудника согласно паттерну '${name} ${surname}'
     * @return полное имя сотрудника в обратном формате
     */
    static String reverseFullName(String fullName) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String[] separateWords = fullName.split(" ");
        String tmp = separateWords[0];
        separateWords[0] = separateWords[separateWords.length-1];
        separateWords[separateWords.length-1] = tmp;
        String reverseFullName = fullName;
        //System.out.println("SEPARATE "+ separateWords[0]);
        //System.out.println("tmp "+ tmp);
        return reverseFullName;
    }
}
