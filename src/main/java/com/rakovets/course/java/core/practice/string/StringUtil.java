package com.rakovets.course.java.core.practice.string;

import java.util.ArrayList;
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
        return text.trim();
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
        String vowels = "[AaEeIiOoUu]+";
        int amountVowels = 0;

        Pattern pattern = Pattern.compile(vowels, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            amountVowels++;
        }
        return amountVowels;
    }

    public int punctuationMark(String text) {
        String punctuationMarks = "[,.!?]+";
        int amountPunctuationMarks = 0;

        Pattern pattern = Pattern.compile(punctuationMarks, Pattern.MULTILINE);
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
        return text.split("(?<=\\G.{" + Integer.toString(n) + "})");
    }

    public int amountWords(String text) {
        String[] words = text.split("\\s\\w+");
        if (text.equals("")) {
            return 0;
        }
        return words.length;
    }

    /*public String initials(String text) {
    }*/
}
