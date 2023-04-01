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

    private static final String TYPE_LATIN = "latin";
    private static final String TYPE_CYRILLIC = "cyrillic";
    private static final String TYPE_DIGIT = "digit";
    private static final String TYPE_UNDEFINED = "undefined";
    private static final char LOW_BORDER_LATIN_HIGH_REGISTR = '\u0041';
    private static final char HIGH_BORDER_LATIN_HIGH_REGISTR = '\u005A';
    private static final char LOW_BORDER_LATIN_LOW_REGISTR = '\u0061';
    private static final char HIGH_BORDER_LATIN_LOW_REGISTR = '\u007A';
    private static final char LOW_BORDER_CYRILLIC = '\u0400';
    private static final char HIGH_BORDER_CYRILLIC = '\u04FF';
    private static final char LOW_BORDER_DIGIT = '\u0030';
    private static final char HIGH_BORDER_DIGIT = '\u0039';
    private static final char LOW_BORDER_UNDEFINED = '\uFFF0';
    private static final char HIGH_BORDER_UNDEFINED = '\uFFFF';
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

        String symbolType = TYPE_UNDEFINED;


        if (symbol >= LOW_BORDER_LATIN_HIGH_REGISTR && symbol <= HIGH_BORDER_LATIN_HIGH_REGISTR) {
            symbolType = TYPE_LATIN;
        } else if (symbol >= LOW_BORDER_LATIN_LOW_REGISTR && symbol <= HIGH_BORDER_LATIN_LOW_REGISTR) {
            symbolType = TYPE_LATIN;
        } else if (symbol >= LOW_BORDER_CYRILLIC  && symbol <= HIGH_BORDER_CYRILLIC) {
            symbolType = TYPE_CYRILLIC;
        } else if (symbol >= LOW_BORDER_DIGIT && symbol <= HIGH_BORDER_DIGIT) {
            symbolType = TYPE_DIGIT;
        } else if (symbol >= LOW_BORDER_UNDEFINED && symbol <= HIGH_BORDER_UNDEFINED) {
            symbolType = TYPE_UNDEFINED;
        }
        return symbolType;
    }
}
