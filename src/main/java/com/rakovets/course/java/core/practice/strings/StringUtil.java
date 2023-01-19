package com.rakovets.course.java.core.practice.strings;

public class StringUtil {

    //task 1
    public String glue(String str1, String str2) {
        return str1 == null || str2 == null ? "" : str1.concat(str2);
    }

    //task 2
    public int findSymbolIndex(String str, char x) {
        return str == null ? -1 : str.indexOf(x);
    }

    //task 3
    public boolean checkEqual(String str1, String str2) {
        return (str1 != null || str2 != null) ? str1.equals(str2) : false;
    }

    //task 4
    public String removeSpaces(String str) {
        return str == null ? "String is empty" : str.trim();
    }

    //task 5
    public String extractSubstring(String str, int startCountInString, int endCountInString) {
        if (str == null || str.length() == 0) {
            return "String is empty";
        } else if (startCountInString >= endCountInString || endCountInString > str.length()) {
            return "Invalid character number";
        } else {
            int startIndex = startCountInString - 1;
            int endIndex = endCountInString - 1;
            char[] dst = new char[endIndex - startIndex];
            str.getChars(startIndex, endIndex, dst, 0);
            return new String(dst);
        }
    }

    //task 6
    public String returnWithReplacement(String str, char withdraw, char insert) {
        return str == null || str.length() == 0 ? "String is empty" : str.replace(withdraw, insert);
    }

    //task 7
    public boolean checkWordMatchesWithStartEnd(String str, String word) {
        return (str != null && word != null) && (str.startsWith(word) && str.endsWith(word)) ? true : false;
    }

    //task 8
    public int countNumberOfVowels(String str) {
        int totalNumberOfVowels;
        if (str == null || str.isEmpty()) {
            totalNumberOfVowels = 0;
        } else {
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
            totalNumberOfVowels = counter;
        }
        return totalNumberOfVowels;
    }

    //task 9
    public int countTotalNumberPunctuationMarks(String str) {
        int TotalNumberPunctuationMarks;
        if (str == null || str.isEmpty()) {
            TotalNumberPunctuationMarks = 0;
        } else {
            char[] PunctuationMarks = new char[]{'.', ',', '?', '!'};
            char[] arrayFromString = str.toCharArray();
            int counter = 0;
            for (int i : PunctuationMarks) {
                for (int j : arrayFromString) {
                    if (i == j) {
                        counter++;
                    }
                }
            }
            TotalNumberPunctuationMarks = counter;
        }
        return TotalNumberPunctuationMarks;
    }
    //task 10
    //task 11
    //task 12
    //task 13
    //task 14
    //task 15
    //task 16
    //task 17
    //task 18
    //task 19
}
