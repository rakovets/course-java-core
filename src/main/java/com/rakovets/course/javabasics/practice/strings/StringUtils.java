package com.rakovets.course.javabasics.practice.strings;


import java.util.Locale;

public class StringUtils {

    String getConcatStrings(String str1, String str2) {
        return String.join(" ", str1, str2);
    }

    public int getStringIndex(String input, String charToCheck) {
        return input.indexOf(charToCheck.toUpperCase());

    }

    public boolean getStringEqual(String str1, String str2) {
        return str1.equals(str2);
    }

    public String getStringUpperAndTrim(String str) {
        return str.trim().toUpperCase();
    }

    public String getStringSubstring(String str) {
        if (str.length() < 10) {
            return "<10";
        }
        String str2 = str.substring(10);
        if (str2.length() > 23) {
            String str3 = str2.substring(0, 23);
            return str3;
        }
        return str2;
    }

    public String getStringReplace(String str) {
        return str.replace(":(", ":)");
    }


}
