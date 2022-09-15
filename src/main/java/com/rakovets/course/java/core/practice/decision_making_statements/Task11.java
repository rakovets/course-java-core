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
        String symbolType = "undefined";
        int convertCharToInt = (int) symbol;
        final int FIRST_DIGIT_UNICODE = 48;
        final int LAST_DIGIT_UNICODE = 57;
        final int FIRST_UPPER_LATIN_UNICODE = 65;
        final int LAST_UPPER_LATIN_UNICODE = 90;
        final int FIRST_LOWER_LATIN_UNICODE = 97;
        final int LAST_LOWER_LATIN_UNICODE = 122;
        final int FIRST_CYRILLIC_UNICODE = 1040;
        final int LAST_CYRILLIC_UNICODE = 1105;
        /*
            According to the "Unicode" table:
            1) "0" digit is "48" symbol
               "9" digit is "57 symbol
            2) "A" latin letter is "65" symbol
               "Z" latin letter is "90" symbol
            3) "a" latin letter is "97" symbol
               "Z" latin letter is "122" symbol
            4) "A" cyrillic letter is "1040" symbol
               "ё" cyrillic letter is "1105" symbol
        */
        if (convertCharToInt >= FIRST_DIGIT_UNICODE && convertCharToInt <= LAST_DIGIT_UNICODE) {
            symbolType = "digit";
        } else if (convertCharToInt >= FIRST_CYRILLIC_UNICODE && convertCharToInt <= LAST_CYRILLIC_UNICODE) {
            symbolType = "cyrillic";
        } else if ((convertCharToInt >= FIRST_UPPER_LATIN_UNICODE && convertCharToInt <= LAST_UPPER_LATIN_UNICODE)
                || (convertCharToInt >= FIRST_LOWER_LATIN_UNICODE && convertCharToInt <= LAST_LOWER_LATIN_UNICODE)) {
            symbolType = "latin";
        }
        return symbolType;
    }
}
