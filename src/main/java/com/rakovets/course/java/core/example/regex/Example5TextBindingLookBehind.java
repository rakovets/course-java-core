package com.rakovets.course.java.core.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Найти все вхождения букв номеров аудиторий, у которых номер состоит из одной буквы из двух чисел.
 */
public class Example5TextBindingLookBehind {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?<=\\d{2})[a-z]{1}\\b");
        Matcher matcher = pattern.matcher("443s 44df 23d 1d 13h");
        while (matcher.find()) {
            System.out.format("'%s': [%d,%d)%n", matcher.group(), matcher.start(), matcher.end());
        }
    }
}
