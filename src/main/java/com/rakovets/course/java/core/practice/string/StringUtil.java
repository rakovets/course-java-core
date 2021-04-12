package com.rakovets.course.java.core.practice.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    //task1
    public String glue(String str1, String str2) {
        return str1.concat(str2);
    }

    //task2
    public int indexSearch(String str, char symbol) {
        return str.indexOf(symbol);
    }

    //task3
    public boolean comparingString(String str1, String str2) {
        return str1.equals(str2);
    }

    //task4
    public String modificationString(String str) {
        return str.trim().toUpperCase();
    }

    //task5
    public String getSubstring(String str, int begin, int end) {
        return str.substring(begin, end);
    }

    //task6
    public String replaceEmoji(String str, String symbol1, String symbol2) {
        return str.replace(symbol1, symbol2);
    }

    //task7
    public boolean startEndWith(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    //task8
    public int countEnglishVowelLetters(String str) {
        int countEnglishVowelLetters = 0;

        Pattern pattern = Pattern.compile("[aAeEiIoOuUyY]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            countEnglishVowelLetters++;
        }
        return countEnglishVowelLetters;
    }

    //task9
    public int countPunctuationMarks(String str) {
        int countPunctuationMarks = 0;

        Pattern pattern = Pattern.compile("[.,!?]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            countPunctuationMarks++;
        }
        return countPunctuationMarks;
    }

    //task10
    public boolean palindromeSearch(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[.,!?;:\\s]","");
        return str.equals((new StringBuilder(str)).reverse().toString());
    }
}
