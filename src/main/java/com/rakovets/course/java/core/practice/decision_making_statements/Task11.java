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
        char symbol = 'Г';
        if (Character.isUpperCase(symbol)) {
            symbol = Character.toLowerCase(symbol);
        }
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
        char[] digitArray = new char [] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] cyrillicArray = new char[]
                {'й', 'ц', 'у', 'к', 'е', 'н', 'г', 'ш', 'щ', 'з', 'ф', 'ы', 'в', 'а', 'п', 'р', 'о',
                 'л', 'д', 'ж', 'э', 'я', 'ч', 'с', 'м', 'и', 'т', 'ь', 'б', 'ю', 'ё', 'х', 'ъ'};
        char[] latinArray = new char[]
                {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j',
                        'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        char[] undefinedArray = new char[]
                {'¬', '!', '"', '£', '$', '%', '^', '&', '*', '(', ')', '_', '-', '=', '+', '?', '/',
                        '#', '~', '.', ',', '<', '>', '{', '}', '[', ']', '`', '№', ';', ':', ' '};

        for (int i=0; i<digitArray.length; i++) {

            if (digitArray [i] == symbol)
                return "digit";
        }
        for (int i=0; i<cyrillicArray.length; i++) {
            if (cyrillicArray [i] == symbol)
                return "cyrillic";
        }
        for (int i=0; i<latinArray.length; i++) {
            if (latinArray [i] == symbol)
                return "latin";
        }
        for (int i=0; i<undefinedArray.length; i++) {
            if (undefinedArray [i] == symbol)
                return "undefined";
        }
        return null;
    }
}
