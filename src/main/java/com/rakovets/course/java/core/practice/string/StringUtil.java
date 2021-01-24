package com.rakovets.course.java.core.practice.string;

import java.util.Locale;

public class StringUtil {//01
    static String getOneStringOfTwo(String str1, String str2) {
        return str1.concat(str2);
    }

    static int getIndexOfChar(char c, String str) {//02
        return str.indexOf(c);
    }

    static boolean isEqualsTwoStrings(String str1, String str2) {//03
        return str1.equals(str2);
    }

    static String getTrimAndLowerCase(String str) {//04
        return str.trim().toUpperCase();
    }

    static String getPartOfString(String str, int start) {//05
        if (str.length() - start >= 23) {
            return str.substring(start, start + 23);
        }
            return str.substring(start);

    }

    static String replaceSmiles(String str) {//06
        return str.replace(":(", ":)");
    }

    static  boolean startAndEndWord(String str1, String word) {//07
        if (str1.startsWith(word) && str1.endsWith(word)) {
            return true;
        }
        return false;
    }

    static int getVowels(String str) {//08
        int count = 0;
        str = str.toLowerCase();
        char[] strInChars=new char[str.length()];
        str.getChars(0, str.length(), strInChars, 0);
        for (char c : strInChars) {
            if (c == 'а' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                count++;
            }
        }
        return count;
    }

    static int getSumOfSymbols(String str) {//09
        char[] symbolsOfString = new char[str.length()];
        str.getChars(0, symbolsOfString.length, symbolsOfString, 0);
        int sumOfSymbols = 0;
        for (int i = 0; i <= (symbolsOfString.length - 1); i++) {
            if (symbolsOfString[i] == '.' || symbolsOfString[i] == ',' || symbolsOfString[i] == '!') {
                sumOfSymbols++;
            }
        }
        return sumOfSymbols;
    }

    static boolean isPalindrome(String str) {//10
        str = str.replaceAll("\\W", "").toLowerCase();
        char[] palindrome = new char[str.length()];
        str.getChars(0, palindrome.length, palindrome, 0);
        for (int i = 0; i <= (palindrome.length - 1) / 2; i++) {
            if (palindrome[i] != palindrome[palindrome.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    static String[] getPartsOfString(String str, int parts) {
        int startIndex = 0;
        double quantityParts = Math.ceil(str.length() * 1.0 / parts);
        String[] partsOfString = new String[(int)quantityParts];
        for (int i = 1; i < quantityParts; i++) {
            partsOfString[i - 1] = str.substring(startIndex, startIndex + parts);
            startIndex += parts;
        }
        partsOfString[(int)quantityParts - 1] = str.substring(startIndex);
        return partsOfString;
    }
}
