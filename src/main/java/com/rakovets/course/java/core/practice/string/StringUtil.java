package com.rakovets.course.java.core.practice.string;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    static String glue(String str1, String str2) {
        return str1.concat(str2);
    }

    static int indexSymbol(String str1, char symbol) {
        return str1.indexOf(symbol);
    }

    static boolean identicalStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    static String removeSpacesAroundCastUpperCase(String str1) {
        return str1.trim().toUpperCase();
    }

    static String extractionSubstring(String str1, int nSymbol, int mSymbol) {
        return str1.substring(nSymbol, mSymbol);
    }

    static String happyEmoji(String str1, String previousSymbol, String modernSymbol) {
        return str1.replace(previousSymbol, modernSymbol);
    }

    static boolean startEndWith(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    static int vowels(String str1) {
        Pattern pattern = Pattern.compile("[aAeEyYuUiIoO]");
        Matcher matcher = pattern.matcher(str1);
        int countVowels = 0;
        while (matcher.find()) {
            countVowels++;
        }
        return countVowels;
    }

    static int punctuations(String str1) {
        Pattern pattern = Pattern.compile("[.,?!]");
        Matcher matcher = pattern.matcher(str1);
        int countPunctuations = 0;
        while (matcher.find()) {
            countPunctuations++;
        }
        return countPunctuations;
    }

    static boolean palindrome(String str1) {
        str1.replaceAll("[.,!?;'\":\\s]", "");
        str1.toLowerCase();
        return str1.equals(new StringBuilder(str1).reverse().toString());
    }

    static String[] samePartsString(String str1, int i) {
        return str1.split("(?<=\\G.{" + i + "})");
    }

    static int wordCount(String str1) {
        String[] wordCount = str1.split("\\s*(\\s|,|\\.|!|\\?)\\s*");
        return wordCount.length;
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
