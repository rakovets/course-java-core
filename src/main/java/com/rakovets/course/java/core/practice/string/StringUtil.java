package com.rakovets.course.java.core.practice.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    public static String glue(String firstText, String secondText) {
        return firstText.concat(secondText);
    }

    public static int symbolIndex(String x, String text) {
        return text.indexOf(x);
    }

    public static boolean stringEquals(String firstText, String secondText) {
        return firstText.equals(secondText);
    }

    public static String stringTrim(String text) {
        return text.trim().toLowerCase();
    }

    public static String subString(String text, int beginIndex, int endIndex) {
        return text.substring(beginIndex, endIndex);
    }

    public static String replaceSymbol(String text, String oldSymbol, String newSymbol) {
        return text.replace(oldSymbol, newSymbol);
    }

    public static boolean startEndWord(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    public static int vowel(String text) {
        int amountVowels = 0;

        Pattern pattern = Pattern.compile("[AaEeIiOoUu]");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            amountVowels++;
        }
        return amountVowels;
    }

    public static int punctuationMark(String text) {
        int amountPunctuationMarks = 0;

        Pattern pattern = Pattern.compile("[,.!?]");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            amountPunctuationMarks++;
        }
        return amountPunctuationMarks;
    }

    public static boolean palindrome(String text) {
        String deleteSpaces = text.replaceAll("\\s", "");
        StringBuilder sb = new StringBuilder(text.replaceAll("\\s", ""));
        sb.reverse();

        return deleteSpaces.equalsIgnoreCase(String.valueOf(sb));
    }

    public static String[] substringArray(String text, int n) {
        return text.split("(?<=\\G.{" + n + "})");
    }

    public static int amountWords(String text) {
        String[] words = text.split("\\s+");

        if (text.equals("")) {
            return 0;
        } else {
            return words.length;
        }
    }

    public static String initials(String text) {
        StringBuilder initials = new StringBuilder();
        String[] substringText = text.split("\\s+");

        for (String s : substringText) {
            initials.append(s.substring(0, 1).toUpperCase());
        }
        return initials.toString();
    }

    public static String getAllDigits(String text) {
        return text.replaceAll("[^\\d]", "");
    }

    public static boolean equalArrays (String[] array1, String[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

    public static String deleteExcessSymbols(String text) {
        return text.replaceAll("(.)(?=(.*))(?<=(?=\\1.*?\\1\\2$).+)", "");
    }
}
