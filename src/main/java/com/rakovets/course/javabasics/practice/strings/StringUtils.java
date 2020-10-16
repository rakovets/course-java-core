package com.rakovets.course.javabasics.practice.strings;


import java.util.Locale;

public class StringUtils {

    String getConcatStrings(String str1, String str2) {
        return String.join(" ", str1, str2);
    }

    public int getStringIndex(String input, String charToCheck) {
        return input.indexOf(charToCheck.toUpperCase());

    }

    public boolean getStringEqual(String str1, String str2){
        return str1.equals(str2);
    }

    public String getStringUpperAndTrim(String str1){
        return str1.trim().toUpperCase();

    }

}
