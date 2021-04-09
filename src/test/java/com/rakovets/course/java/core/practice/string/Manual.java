package com.rakovets.course.java.core.practice.string;

import com.rakovets.course.java.core.example.string.Example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manual {
    public static void main(String[] args) {
        String text = "Привет 1 п в 4 а 4 и2 м 6";
        String currentDigital = "";
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            currentDigital += text.substring(matcher.start(), matcher.end());
        }
        System.out.println(currentDigital);
    }}


     //   int result = StringUtil.existsVowels("Meet my family");
     //   System.out.println(result);

