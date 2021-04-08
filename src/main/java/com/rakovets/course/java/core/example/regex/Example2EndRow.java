package com.rakovets.course.java.core.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2EndRow {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^ball", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher("ball bill ball\nball bell");
        while (matcher.find()) {
            System.out.format("'%s': [%d,%d)%n", matcher.group(), matcher.start(), matcher.end());
        }

        Pattern pattern2 = Pattern.compile("(?m)^ball");
        Matcher matcher2 = pattern2.matcher("ball bill ball\nball bell");
        while (matcher2.find()) {
            System.out.format("'%s': [%d,%d)%n", matcher2.group(), matcher2.start(), matcher2.end());
        }
    }
}
