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
        char symbol = 'A';

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
        String symbolType = "undefined";
        final int START_CYRILLIC_SYMBOLS = 1024;
        final int FINISH_CYRILLIC_SYMBOLS = 1123;
        final int START_UPPER_LATIN_SYMBOLS = 65;
        final int FINISH_UPPER_LATIN_SYMBOLS = 90;
        final int START_LOWER_LATIN_SYMBOLS = 97;
        final int FINISH_LOWER_LATIN_SYMBOLS = 122;
        final int START_DIGIT_SYMBOLS = 48;
        final int FINISH_DIGIT_SYMBOLS = 57;

        if (symbol >= START_CYRILLIC_SYMBOLS && symbol <= FINISH_CYRILLIC_SYMBOLS) {
            symbolType = "cyrillic";
        } else if (symbol >= START_UPPER_LATIN_SYMBOLS && symbol <= FINISH_UPPER_LATIN_SYMBOLS || symbol >= START_LOWER_LATIN_SYMBOLS && symbol <= FINISH_LOWER_LATIN_SYMBOLS)  {
            symbolType = "latin";
        } else if (symbol >= START_DIGIT_SYMBOLS && symbol <= FINISH_DIGIT_SYMBOLS) {
            symbolType = "digit";
        }
        return symbolType;
    }
}
