package com.rakovets.course.java.core.practice.decision_making_statement;

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
        char symbol = 'О';

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

        int symbolCode = symbol;
        String symbolType = "";

        if (symbolCode >= 1040 && symbolCode <= 1103 || symbolCode == 1025 || symbolCode == 1105){
            symbolType = "cyrillic";
        } else if (symbolCode >= 65 && symbolCode<=90 || symbolCode >= 97 && symbolCode <= 122){
            symbolType = "latin";
        }else if (symbolCode >= 48 && symbolCode <=57){
            symbolType = "digit";
        } else{
            symbolType = "undefined";
        }

        return symbolType;
    }
}
