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
        String stringTrimmed = fullName.trim();
        StringBuffer name = new StringBuffer();
        int currentIndexOfLetterInName = 0;
        while (currentIndexOfLetterInName < stringTrimmed.length() && stringTrimmed.charAt(currentIndexOfLetterInName) != ' ') {
            name.append(stringTrimmed.charAt(currentIndexOfLetterInName));
            currentIndexOfLetterInName++;
        }
        return name.toString();
    }

    /**
     * Возвращает фамилию сотрудника.
     *
     * @param fullName полное имя сотрудника согласно паттерну '${name} ${surname}'
     * @return фамилия сотрудника
     */
    static String getSurname(String fullName) {
        String stringTrimmed = fullName.trim();
        StringBuffer surname = new StringBuffer();
        int currentIndexOfLetterInName = 0;
        while (currentIndexOfLetterInName < stringTrimmed.length() && stringTrimmed.charAt(currentIndexOfLetterInName) != ' ') {
            currentIndexOfLetterInName++;
        }
        while (currentIndexOfLetterInName < stringTrimmed.length() && stringTrimmed.charAt(currentIndexOfLetterInName) == ' ') {
            currentIndexOfLetterInName++;
        }
        while (currentIndexOfLetterInName < stringTrimmed.length() && stringTrimmed.charAt(currentIndexOfLetterInName) != ' ') {
            surname.append(stringTrimmed.charAt(currentIndexOfLetterInName));
            currentIndexOfLetterInName++;
        }
        return surname.toString();
    }

    /**
     * Возвращает полное имя сотрудника в обратном формате.
     *
     * @param fullName полное имя сотрудника согласно паттерну '${name} ${surname}'
     * @return полное имя сотрудника в обратном формате, т.е. '${surname} ${name}'
     */
    static String reverseFullName(String fullName) {
        String stringTrimmed = fullName.trim();
        StringBuffer name = new StringBuffer();
        int currentIndexOfLetterInName = 0;
        while (currentIndexOfLetterInName < stringTrimmed.length() && stringTrimmed.charAt(currentIndexOfLetterInName) != ' ') {
            name.append(stringTrimmed.charAt(currentIndexOfLetterInName));
            currentIndexOfLetterInName++;
        }
        StringBuffer surname = new StringBuffer();
        while (currentIndexOfLetterInName < stringTrimmed.length() && stringTrimmed.charAt(currentIndexOfLetterInName) == ' ') {
            currentIndexOfLetterInName++;
        }
        while (currentIndexOfLetterInName < stringTrimmed.length() && stringTrimmed.charAt(currentIndexOfLetterInName) != ' ') {
            surname.append(stringTrimmed.charAt(currentIndexOfLetterInName));
            currentIndexOfLetterInName++;
        }
        return surname.toString() + " " + name.toString();
    }
}
