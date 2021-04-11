package com.rakovets.course.java.core.practice.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    public String glue(String firstText, String secondText) {
        return firstText.concat(secondText);
    }

    public int symbolIndex(String x, String text) {
        return text.indexOf(x);
    }

    public boolean stringEquals(String firstText, String secondText) {
        return firstText.equals(secondText);
    }

    public String stringTrim(String text) {
        return text.trim().toLowerCase();
    }

    public String subString(String text, int beginIndex, int endIndex) {
        return text.substring(beginIndex, endIndex);
    }

    public String replaceSymbol(String text, String oldSymbol, String newSymbol) {
        return text.replace(oldSymbol, newSymbol);
    }

    public boolean startEndWord(String text, String word) {
        boolean startWord = text.startsWith(word);
        boolean endWord = text.endsWith(word);

        return startWord && endWord;
    }

    public int vowel(String text) {
        int amountVowels = 0;

        Pattern pattern = Pattern.compile("[AaEeIiOoUu]");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            amountVowels++;
        }
        return amountVowels;
    }

    public int punctuationMark(String text) {
        int amountPunctuationMarks = 0;

        Pattern pattern = Pattern.compile("[,.!?]");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            amountPunctuationMarks++;
        }
        return amountPunctuationMarks;
    }

    public boolean palindrome(String text) {
        String deleteSpaces = text.replaceAll("\\s", "");
        StringBuilder sb = new StringBuilder(text.replaceAll("\\s", ""));
        sb.reverse();

        return deleteSpaces.equalsIgnoreCase(String.valueOf(sb));
    }

    public String[] substringArray(String text, int n) {
        return text.split("(?<=\\G.{" + n + "})");
    }

    public int amountWords(String text) {
        String[] words = text.split("\\s+");

        if (text.equals("")) {
            return 0;
        }
        return words.length;
    }

    public String initials(String text) {
        StringBuilder initials = new StringBuilder();
        String[] substringText = text.split("\\s");

        for (String s : substringText) {
            initials.append(s.substring(0, 1).toUpperCase());
        }
        return initials.toString();
    }

    public int amountDigits(String text) {
        int amountDigits = 0;

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            amountDigits++;
        }
        return amountDigits;
    }

    public boolean equalArrays (String[] array1, String[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

    public String deleteExcessSymbols(String text) {
        return text.replaceAll("(.)(?=(.*))(?<=(?=\\1.*?\\1\\2$).+)", "");
    }
}
