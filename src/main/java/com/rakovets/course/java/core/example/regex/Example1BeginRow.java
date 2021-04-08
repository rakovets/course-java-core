package com.rakovets.course.java.core.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1BeginRow {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^ball");
        Matcher matcher = pattern.matcher("ball bill ball\nball bell");
        while (matcher.find()) {
            System.out.format("'%s': [%d,%d)%n", matcher.group(), matcher.start(), matcher.end());
        }
    }
}
