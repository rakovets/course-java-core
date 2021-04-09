package com.rakovets.course.java.core.practice.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    public String glue(String str1, String str2) {
        return str1.concat(str2);
    }

    public int symbolIndex(String x, String text) {
        return text.indexOf(x);
    }

    public boolean stringEquals(String str1, String str2) {
        return str1.equals(str2);
    }

    public String stringTrim(String str) {
        return str.trim();
    }

    public String subString(String str, int beginIndex, int endIndex) {
        return str.substring(beginIndex, endIndex);
    }

    public String replaceSymbol(String str, String oldSymbol, String newSymbol) {
        return str.replace(oldSymbol, newSymbol);
    }

    public boolean startEndWord(String str, String word) {
        boolean startWord = str.startsWith(word);
        boolean endWord = str.endsWith(word);

        return startWord && endWord;
    }

    public int vowel(String str) {
        String vowels = "[AaEeIiOoUu]+";
        int amountVowels = 0;

        Pattern pattern = Pattern.compile(vowels, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            amountVowels++;
        }
        return amountVowels;
    }

    public int punctuationMark(String str) {
        String punctuationMarks = "[,.!?]+";
        int amountPunctuationMarks = 0;

        Pattern pattern = Pattern.compile(punctuationMarks, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            amountPunctuationMarks++;
        }
        return amountPunctuationMarks;
    }

    public boolean palindrome(String str) {
        String deleteSpaces = str.replaceAll("\\s", "");
        StringBuilder sb = new StringBuilder(str.replaceAll("\\s", ""));
        sb.reverse();
        return deleteSpaces.equalsIgnoreCase(String.valueOf(sb));
    }

}
