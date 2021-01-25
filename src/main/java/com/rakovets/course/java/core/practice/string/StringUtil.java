package com.rakovets.course.java.core.practice.string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    //task01
    static String getOneStringOfTwo(String str1, String str2) {
        return str1.concat(str2);
    }

    //task03
    static int getIndexOfChar(char c, String str) {
        return str.indexOf(c);
    }

    //task03
    static boolean isEqualsTwoStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    //task04
    static String getTrimAndLowerCase(String str) {
        return str.trim().toUpperCase();
    }

    //task05
    static String getPartOfString(String str, int start) {
        if (str.length() - start >= 23) {
            return str.substring(start, start + 23);
        }
            return str.substring(start);
    }

    //task06
    static String replaceSmiles(String str) {//06
        return str.replace(":(", ":)");
    }

    //task07
    static  boolean startAndEndWord(String str1, String word) {
        if (str1.startsWith(word) && str1.endsWith(word)) {
            return true;
        }
        return false;
    }

    //task08
    static int getVowels(String str) {
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

    //task09
    static int getSumOfSymbols(String str) {
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

    //task10
    static boolean isPalindrome(String str) {
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
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    str2 = str2.substring(0, j) + str2.substring(j + 1);
                    str1 = str1.substring(0, i) + str1.substring(i + 1);
                    i = 0;
                }
            }
        }
        return str1 + str2;
    }

    //task16
    static boolean isIdentically(String[] str1, String[] str2) {
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    //task17
    static String getSpeedOfString(int count) {
        String forTesting1 = "Hello, my friend! The weather is good today, isn't it?";
        String forTesting2 = "Java";
        long startTime1 = System.currentTimeMillis();
        for (int i = 1; i < count; i++) {
           forTesting1 += forTesting2;
        }
        long endTime1 = System.currentTimeMillis();
        StringBuffer strBuffer = new StringBuffer(forTesting1);
        long startTime2 = System.currentTimeMillis();
        for (int i = 1; i < count; i++) {
            strBuffer.append(forTesting2);
        }
        long endTime2 = System.currentTimeMillis();
        return (endTime1 - startTime1) + " - " + (endTime2 - startTime2);
    }

    //task18
    static String removeRepeats(String str) {
        return (str.replaceAll("(.)\\1{1,}", "$1"));
    }

    //task19
    static int romanToArabic(String str) {
        int[] arabicArray = {1000, 500, 100, 50, 10, 5, 1};
        String roman = "MDCLXVI ";
        int arabicNumbers = 0;
        str += " ";
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            index1 = roman.indexOf(str.charAt(i));
            index2 = roman.indexOf(str.charAt(i + 1));
            if (index1 <= index2) {
                arabicNumbers += arabicArray[index1];
            } else {
                arabicNumbers += arabicArray[index2] - arabicArray[index1];
                i++;
            }
        }
        return arabicNumbers;
    }
}
