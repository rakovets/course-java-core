package com.rakovets.course.java.core.example.regex;

/**
 * Заменить все вхождения \n на <br>. Вместо ([^>])\\n.
 */
public class Example6TextBindingNegativeLookBehind {
    public static void main(String[] args) {
        String sourceString = "Cool! \n 'div' is the best \n\n <tag>\n";
        String targetString = sourceString.replaceAll("(?<!>)\\n", "<br>");
        System.out.println(targetString);
    }
}
