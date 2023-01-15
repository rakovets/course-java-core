package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    String glue(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return "";
        }
        return str1.concat(str2);
    }

    int finedIndexX(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        return str.indexOf('x');
    }

    boolean equivalentTo(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        return str1.equalsIgnoreCase(str2);
    }

    String trimAndToUpper(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        str = str.trim();
        return str.toUpperCase();
    }

    String extractSubstringFromNtoM(String str, int n, int m) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        return str.substring(n - 1, m);
    }

    String dontSadSmile(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        return str.replace(":(", ":)");
    }

    boolean finedFistWordInString(String str, String start) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.startsWith(start);
    }

    int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
        char[] arrayFromString = str.toLowerCase().toCharArray();
        int counter = 0;
        for (int i : vowels) {
            for (int j : arrayFromString) {
                if (i == j) {
                    counter++;
                }
            }
        }
        return counter;
    }
    int countPunctuationMarks(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        char[] vowels = new char[]{'.', ',', '?', '!'};
        char[] arrayFromString = str.toLowerCase().toCharArray();
        int counter = 0;
        for (int i : vowels) {
            for (int j : arrayFromString) {
                if (i == j) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
