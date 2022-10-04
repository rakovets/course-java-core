package com.rakovets.course.java.core.practice.strings;

import java.util.Locale;

public class StringUtil {
    String concat(String str1, String str2) {
        return str1 + str2;
    }

    public int getIndexOfCharAt(String str, char c) {
        return str.indexOf(c);
    }

    public boolean getTwoStringSame(String str1, String str2) {
        return str1.equals(str2);
    }

    public String getTrimStringLowerCase(String str) {
        return str.trim().toLowerCase();
    }

    public String getSubString(int a, int b, String str) {
        return str.substring(a - 1, b);
    }

    public String getReplaceEmoji(String str) {
        return str.replace(":(", ":)");
    }

    public boolean getStarAndEndWithWord(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    public int getNumberOfEnglishVowels(String str) {
        int numberVoweels = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (char vowel : vowels) {
            for (char letter : str.toLowerCase().toCharArray()) {
                if (letter == vowel) {
                    numberVoweels++;
                }
            }
        }
        return numberVoweels;
    }

    public int getNumberOfPunctuationMarks(String str) {
        int numberSymbolInStr = str.length();
        int numberAfterReplace = str.replaceAll("[.,?!]", "").length();
        return numberSymbolInStr - numberAfterReplace;
    }

    public boolean getStrIsPalindrome(String str){
        str = str.toLowerCase().replaceAll("[.,?!; ]", "");
        String strAfterReverse = (new StringBuilder(str)).reverse().toString();
        return str.equals(strAfterReverse);
    }


}
