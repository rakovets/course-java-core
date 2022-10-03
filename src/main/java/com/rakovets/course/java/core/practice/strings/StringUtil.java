package com.rakovets.course.java.core.practice.strings;

import java.util.Arrays;
import java.util.Objects;


public class StringUtil {
    public String glue(String str1, String str2) {
        return str1.concat(str2);
    }

    public int getIndexOfChar(String str, char c) {
        return str.indexOf(c);
    }

    public boolean caseSensitiveCompare(String str1, String str2) {
        return str1.equals(str2);
    }

    public String trimToLowerCase(String str) {
        return str.trim().toLowerCase();
    }

    public String getExtractSubstring_N_M(int n, int m, String str) {
        return str.substring(n - 1, m);
    }

    public String getReplaceSmile(String str) {
        return str.replace(":(", ":)");
    }

    public boolean getStartEndTextWorld(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    public int getNumberOfEnglishVowels(String str) {
        return str.replaceAll("[^aeyuioAEYUIO]", "").length();
    }

    public int getTotalNumberOfPunctuationMarks(String str) {
        return str.replaceAll("[^,.!?]", "").length();
    }

    public boolean getCheckStringPalindrome(String str) {
        String strReverse = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            strReverse = ch + strReverse;
        }
        return str.equals(strReverse);
    }

    public String[] getSplitStringEqualParts(String text, int n) {
        return text.split("(?<=\\G.{" + Integer.toString(n) + "})");
    }

    public long getWordCount(String text) {
        return Arrays.stream(text.split(" +")).count();
    }

    public String getNameSurname(String str) {
        String[] words = str.split(" ");
        return words[0].toUpperCase().charAt(0) + "" + words[1].toUpperCase().charAt(0);
    }

    public String getAllDigitsText(String text) {
        return text.replaceAll("[^0-9]", "");
    }

    public String getUncrossedSymbols(String word1, String word2) {
        String result = "";
        char symbolsUncrossed;
        for (int i = 0; i < word1.length(); i++) {
            symbolsUncrossed = word1.charAt(i);
            if (!word2.contains(symbolsUncrossed + "")) {
                result += symbolsUncrossed;
            }
        }
        for (int i = 0; i < word2.length(); i++) {
            symbolsUncrossed = word2.charAt(i);
            if (!word1.contains(symbolsUncrossed + "")) {
                result += symbolsUncrossed;
            }
        }
        return result;
    }

    public Boolean getTwoArraysIdentical(String[] word1, String[] word2) {
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }


    public String getReplaceIdenticalCharacters(String text) {
        return text.replaceAll("([a-z])\\1+", "$1");
    }

    public boolean getMultipleAdditionOfStrings(String string1, String string2) {
        long startTime1 = System.currentTimeMillis();
        String str1 = "";
        for (int i = 0; i < 100; i++) {
            str1 = string1 + string2;
        }
        long endTime1 = System.currentTimeMillis();
        long startTime2 = System.currentTimeMillis();
        StringBuilder str2 = new StringBuilder();
        str2 = new StringBuilder(string1 + string2);
        str2.append(String.valueOf(str2).repeat(100));
        long endTime2 = System.currentTimeMillis();
        return ((endTime1 - startTime1) > (endTime2 - startTime2));
    }
}

