package com.rakovets.course.java.core.practice.decision_making_statements;

/**
 * Разработать программу для desktop приложения.
 * <p>
 * Help: Unicode (decimal)
 * <p>
 * Необходимо определить, какие символы вводит пользователь:
 * <ul>
 *  <li>латиница</li>
 *  <li>кириллица</li>
 *  <li>цифра</li>
 *  <li>спец. символ</li>
 * </ul>
 * <p>
 * Так же программа не должна зависеть от регистра.
 */
class Task11 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        char symbol = 'а';

        String monthName = getSymbolType(symbol);
        System.out.printf("Result: %s", monthName);
    }

    /**
     * Определяет к какому типу относится данный символ.
     *
     * @param symbol символ
     * @return <code>latin</code>/<code>cyrillic</code>/<code>digit</code>/<code>undefined</code>
     */
    static String getSymbolType(char symbol) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int numberUnicode = symbol;
        String nameTypeOfSymbol = "";
        final int DIGIT_0 = 48;
        final int DIGIT_9 = 57;
        final int LATIN_A = 65;
        final int LATIN_Z = 90;
        final int LATIN_a = 97;
        final int LATIN_z = 122;
        final int CYRILLIC_A = 1040;
        final int CYRILLIC_я = 1103;
        final int CYRILLIC_Ё = 1025;
        final int CYRILLIC_ё = 1105;
        if (numberUnicode >= DIGIT_0 && numberUnicode <= DIGIT_9) {
            nameTypeOfSymbol = "digit";
        } else if (numberUnicode >= LATIN_A && numberUnicode <= LATIN_Z || numberUnicode >= LATIN_a && numberUnicode <= LATIN_z) {
            nameTypeOfSymbol = "latin";
        } else if (numberUnicode >= CYRILLIC_A && numberUnicode <= CYRILLIC_я || numberUnicode == CYRILLIC_Ё || numberUnicode == CYRILLIC_ё) {
            nameTypeOfSymbol = "cyrillic";
        } else {
            nameTypeOfSymbol = "undefined";
        }
        return nameTypeOfSymbol;
    }
}
