package com.rakovets.course.java.core.practice.string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    //task11
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

    //task12
    static int getNumberOfWords(String str) {
        String[] words = str.split("\\s*\\W\\s*");
        int count = 0;
        for (String word : words) {
            count++;
        }
        return count;
    }

    //task13
    static String getFl(String str) {
        str = str.toUpperCase();
        String[] words = str.split(" ");
        str = words[0].substring(0, 1) + words[1].substring(0, 1);
        return str;

    }

    //task14
    static String getNumeral(String str) {
        str = str.replaceAll("[^0-9]", "");
        return str;
    }

    //task15
    static String getNoRepeatingChars(String str1, String str2) {
        return str1 + str2;
    }

    //task16
    static boolean isIdentically(String[] str1, String[] str2) {
         String c1 = "";
         String c2 = "";
        for (int i = 0; i < str1.length; i++) {
            for (int j = i; j < str2.length; j++) {
                if (str1[i] == str2[j]) {
                    c1 = str2[i];
                    c2 = str2[j];
                    str2[i] = c2;
                    str2[j] = c1;
                }
            }
        }
        return Arrays.equals(str1, str2);
    }

    //task17
    static long getSpeed(String str1, String str2, int count) {
        long startTime1 = System.currentTimeMillis();
        for (int i = 1; i < count; i++) {
            str1 += str2;
        }
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1);
        StringBuffer strBuffer = new StringBuffer(str1);
        long startTime2 = System.currentTimeMillis();
        for (int i = 1; i < count; i++) {
        strBuffer.append(str2);
        }
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);
        return duration2 - duration1;
    }

    //task18
    static String removeRepeats(String str) {
        return (str.replaceAll("(.)\\1{1,}", "$1"));
    }

    //task19
    static int romanToArabic(String str) {
        int arabicNumbers = 0;
        str += " ";
        char nextChar = 'a';
        for (int i = 0; i < str.length() - 1; i++) {
            nextChar = str.charAt(i + 1);
            if (str.charAt(i) == 'M') {
                arabicNumbers += 1000;
            } else if (str.charAt(i) == 'D') {
                arabicNumbers += 500;
            } else if (str.charAt(i) == 'C') {
                if (nextChar == 'M') {
                    arabicNumbers += 900;
                    i++;
                } else if (nextChar == 'D'){
                    arabicNumbers += 400;
                    i++;
                } else {
                    arabicNumbers += 100;
                }
            } else if (str.charAt(i) == 'L') {
                arabicNumbers += 50;
            } else if (str.charAt(i) == 'X') {
                arabicNumbers += 10;
            } else if (str.charAt(i) == 'V') {
                arabicNumbers += 5;
            } else if (str.charAt(i) == 'V') {
                arabicNumbers += 3;
            } else if (str.charAt(i) == 'I') {
                if (nextChar == 'X') {
                    arabicNumbers += 9;
                    i++;
                } else if (nextChar == 'V') {
                    arabicNumbers += 4;
                    i++;
                } else {
                    arabicNumbers += 1;
                }
            }
        }
        return arabicNumbers;
    }
}
