package com.rakovets.course.java.core.practice.string;

import java.lang.reflect.Array;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Locale;

public class StringUtil {
    static String glue(String str1, String str2) {
        return str1.concat(str2);
    }

    static String indexSymbol(String str1) {
        char c = str1.charAt(2);
        return String.valueOf(c);
    }

    static String identicalStrings(String str1, String str2) {
        return String.valueOf(str1.equals(str2));
    }

    static String removeSpacesAroundCastLowerCase(String str1) {
        return str1.trim().toLowerCase();
    }

    static String extractionSubstring(String str1) {
        return str1.substring(str1.indexOf('l'), str1.lastIndexOf('o'));
    }

    static String happyEmoji(String str1) {
        return str1.replace('(', ')');
    }

    static String line(String text, String word) {
        if (text.startsWith("Hi") && text.endsWith("!") && word.startsWith("J") && word.endsWith("a")) {
            return "true";
        } else {
            return "false";
        }
    }

    static String vowels(String str1) {
        Pattern pattern = Pattern.compile("[aeyuio]");
        Matcher matcher = pattern.matcher(str1);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return String.valueOf(count);
    }

    static String punctuations(String str1) {
        Pattern pattern = Pattern.compile("[.,?!]");
        Matcher matcher = pattern.matcher(str1);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return String.valueOf(count);
    }

    static String palindrome(String str1) {
        String reversedString = new StringBuilder(str1).reverse().toString();
        if (str1.equals(reversedString)) {
            return "true";
        } else {
            return "false";
        }
    }

    static String[] samePartsString(String str1, int i) {
        return str1.split("(?<=\\G.{" + i + "})");
    }

    static String wordCount(String str1) {
        int count = 0;
        String[] words = str1.split("\\s*(\\s|,|\\.|!|\\?)\\s*");
        for (String word : words) {
            count++;
        }
        return String.valueOf(count);
    }

    static String initialsFullName(String str1) {
        String[] str2 = str1.split("\\s*(\\s|,|\\.|!|\\?)\\s*");
        return str2[0].toUpperCase().charAt(0) + str2[1].toUpperCase().substring(0, 1);
    }

    static String allNumbers(String str1) {
        Pattern pattern = Pattern.compile("\\d?");
        Matcher matcher = pattern.matcher(str1);
        StringBuilder str2 = new StringBuilder();
        while (matcher.find()) {
            str2.append(matcher.group());;
        }
        return str2.toString();
    }
}
