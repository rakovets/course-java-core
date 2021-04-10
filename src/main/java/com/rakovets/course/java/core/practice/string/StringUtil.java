package com.rakovets.course.java.core.practice.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    public String union(String str1, String str2) {
        return str1.concat(str2);
    }

    public int indexSearch(String str1, char symbol) {
        return str1.indexOf(symbol);
    }

    public boolean compareTwoString(String str1, String str2) {
        return str1.equals(str2);
    }

    public String changeString(String str1) {
        str1 = str1.trim();
        return str1.toUpperCase();
    }

    public String retrievalNewString(String str1, int n, int m) {
        return str1.substring(n - 1, m);
    }

    public String replaceEmoji(String str1) {
        return str1.replace(":(",":)");
    }

    public boolean startAndFinishWithWord(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    public int findingNumberOfEnglishVowels(String  str1) {
        int numberOfMatches = 0;
        Pattern pattern = Pattern.compile("[AaEeIiOoUuYy]");
        Matcher matcher = pattern.matcher(str1);
        while (matcher.find()) {
            numberOfMatches++;
        }
        return numberOfMatches;
    }

    public int numberOfPunctuationMarks (String str1) {
        int numberOfMarks = 0;
        Pattern pattern = Pattern.compile("[.,!?]");
        Matcher matcher = pattern.matcher(str1);
        while (matcher.find()) {
            numberOfMarks++;
        }
        return numberOfMarks;
    }

    public boolean toCheckPalindrome(String str1) {
        str1 = str1.toLowerCase();
        str1= str1.replaceAll("[ .,!?]", "");
        StringBuilder str1Builder = new StringBuilder(str1);
        str1Builder.reverse();
        String str2 = new String(str1Builder);
        str1.intern();
        str2.intern();
        return str1.equals(str2);
    }

    public String[] stringInArray(String str1, int n) {
        int numberOfParts = str1.length() / n;
        String[] array = new String[numberOfParts];
        for (int i = 0; i < numberOfParts ; i++) {
            array[i] = str1.substring(i * n,(i + 1) * n);
        }
        return array;
    }

}
