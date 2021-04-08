package com.rakovets.course.java.core.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Найти модель автомобиля не удовлетворяющая году выпуска.
 */
public class Example4TextBindingNegativeLookAhead {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\b[A-Z]\\w*\\b(?! (2016|2017))");
        Matcher matcher = pattern.matcher("A4 2001 M5 2017 Berlinetta 2010 Escalade 2015");
        while (matcher.find()) {
            System.out.format("'%s': [%d,%d)%n", matcher.group(), matcher.start(), matcher.end());
        }
    }
}
