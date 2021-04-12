package com.rakovets.course.java.core.practice.string;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    // task 1
    public static String getStringConcat(String str1, String str2) {
        return str1.concat(str2);
    }

    // task 2
    public static int getIndexOf(String str, char symbol) {
        if (str != null && symbol != str.indexOf(symbol)) {
            return str.indexOf(symbol);
        } else {
            return -1;
        }
    }

    // task 3
    public static boolean isEquals(String str1, String str2) {
        if (str1 != null && str2 != null) {
            return str1.equals(str2);
        } else {
            return false;
        }
    }

    // task 4
    public static String getTrimAndUpperCase(String str) {
        if (str != null) {
            str = str.trim();
            return str.toUpperCase();
        } else {
            return null;
        }
    }

    // task 5
    public static String getSubstring(String str, int start, int end) {
        if (str != null && start >= 0 && start < end && end <= str.length()) {
            return str.substring(start, end);
        } else {
            return null;
        }
    }

    // task 6
    public static String getReplace(String str, char oldChar, char newChar) {
        if (str != null) {
            return str.replace(oldChar, newChar);
        } else {
            return null;
        }
    }

    // task 7
    public static boolean isStartEndLastWorld(String str, String testWorld) {
        if (str != null && testWorld == "text" || str != null && testWorld == "world") {
            if (testWorld == "text") {
                return (str.startsWith(testWorld) && str.endsWith(testWorld));
            } else if (testWorld == "world") {
                return (str.startsWith(testWorld) && str.endsWith(testWorld));
            }
        }
        return false;
    }

    // task 8
    public static int getVowelEnglishLetters(String str) {
        if (str != null) {
            str = str.toLowerCase();
            int sumVowelEnglishLetters = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y') {
                    sumVowelEnglishLetters++;
                }
            }
            return sumVowelEnglishLetters;
        }
        return 0;
    }

    // task 9
    public static int getPunctuasionMarks(String str) {
        if (str != null) {
            int sumPunctuasionMarks = 0;
            Pattern pattern = Pattern.compile("[,:!?.;]");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                sumPunctuasionMarks++;
            }
            return sumPunctuasionMarks;
        }
        return 0;
    }

    // task 10
    public static boolean isPalindrom(String str) {
        if (str != null) {
            str = str.toLowerCase();
            str = str.replaceAll("[!?.,:;\\s]", "");
            return str.equals(new StringBuilder(str).reverse().toString());
        }
        return false;
    }

    // task 11
    public static String getSplitString(String str, int numberSimbols) {
        if (str == null || numberSimbols <= 0) {
            return null;
        }
        return Arrays.toString(str.split("(?<=\\G.{" + numberSimbols + "})"));
    }

    // task 12
    public static int getNumberWordsInText(String str) {
        if (str == null) {
            return 0;
        }
        String[] numberWords = str.split("\\s+");
        return numberWords.length;
    }

    // task 13
    public static String getInitials(String str) {
        if (str == null) {
            return null;
        }
        str = str.toUpperCase();
        String[] arrayWords = str.split("\\s+");
        for (int i = 0; i < arrayWords.length; i++) {
            arrayWords[i] = arrayWords[i].substring(0, 1);
        }
        return (arrayWords[0] + arrayWords[1]);
    }

    // task 14
    public static String getAllDigitsInString(String str) {
        if (str == null) {
            return null;
        }
        String digitals = "";
        Pattern pattern = Pattern.compile("[\\d]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            digitals += matcher.group();
        }
        return digitals;
    }

    // task 15
    public static String getDifferentLettersInWords(String firstWord, String secondWord) {
        if (firstWord == null || secondWord == null) {
            return null;
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < firstWord.length(); i++) {
            if (!(secondWord.contains("" + firstWord.charAt(i))))
                str.append(firstWord.charAt(i)).append(" ");
        }
        for (int i = 0; i < secondWord.length(); i++) {
            if (!(firstWord.contains("" + secondWord.charAt(i))))
                str.append(secondWord.charAt(i)).append(" ");
        }
        return (str.toString().replaceAll(" ", ""));
        }

    // task 16
    public static boolean isEqualsArrays(String[] arr1, String[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    // task 18
    public static String getReplaceIdenticalSymbolsInString(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("([\\w\\W])(\\1+)", "$1");
    }
}
