package com.rakovets.course.java.core.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Найти номера аудиторий у которых число заканчивается одним символом.
 */
public class Example3TextBindingLookAhead {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\b\\d+(?=[a-z]{1}\\b)");
        Matcher matcher = pattern.matcher("432 443a 234d d123 33sdf");
        while (matcher.find()) {
            System.out.format("'%s': [%d,%d)%n", matcher.group(), matcher.start(), matcher.end());
        }
    }
}
