package com.rakovets.course.java.core.practice.string;

import java.util.Arrays;

public class StringUtil {

    // TASK 1
    public static String getConcat(String str1, String str2) {
        return str1.concat(str2);
    }

    // TASK 2
    public static int getIndex(String str, char x) {
        return str.indexOf(x);
    }

    // TASK 3
    public static boolean getEquals(String str1, String str2) {
        return str1.equals(str2);
    }

    // TASK 4
    public static String getTrimAndUpperCase(String str) {
        return str.trim().toUpperCase();
    }

    // TASK 5
    public static String getSubstring(String str) {
        if (str.length() >= 33)
            return str.substring(10, 33);
        else
            return str.substring(10);
    }

    // TASK 6
    public static String getReplace(String str) {
        return str.replace(":(", ":)");
    }

    // TASK 7
    public static boolean getStartsAndEndsWith(String str, String word) {
        str = str.toLowerCase();
        return str.startsWith(word) && str.endsWith(word);
    }

    // TASK 8
    public static int getVowels(String str) {
        int vowels = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y')
                vowels++;
        }
        return vowels;
    }

    // TASK 9
    public static int getPeriodsCommasExclamationMarks(String str) {
        int periodsCommasExclamationMarks = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == '!')
                periodsCommasExclamationMarks++;
        }
        return periodsCommasExclamationMarks;
    }

    // TASK 10
    public static boolean getPalindrome(String str) {
        str = str.toLowerCase();
        int forward = 0;
        int backward = str.length() - 1;
        while (backward > forward) {
            char forwardChar = str.charAt(forward++);
            char backwardChar = str.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    // TASK 11
    public static String getArray(String str, int n) {
        int whereToSplit;
        if (str.length() % n == 0)
            whereToSplit = str.length() / n;
        else
            whereToSplit = (str.length() + 1) / n;
        return Arrays.toString(str.split("(?<=\\G.{" + whereToSplit + "})"));
    }

    // TASK 12
    public static int getNumberOfWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }

    // TASK 13
    public static String getInitials(String surname, String name, String patronymic) {
        surname = surname.toUpperCase();
        name = name.toUpperCase();
        patronymic = patronymic.toUpperCase();
        char surnameInitial = surname.charAt(0);
        char nameInitial = name.charAt(0);
        char patronymicInitial = patronymic.charAt(0);
        return surnameInitial + "." + nameInitial + "." + patronymicInitial + ".";
    }

    // TASK 14
    public static String getAllNumbers(String str) {
        return str.replaceAll("[^0-9]", "");
    }

    // TASK 15
    public static String getDifferentLetters(String str1, String str2) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (!(str2.contains("" + str1.charAt(i))))
                str.append(str1.charAt(i)).append(" ");
        }
        for (int i = 0; i < str2.length(); i++) {
            if (!(str1.contains("" + str2.charAt(i))))
                str.append(str2.charAt(i)).append(" ");
        }
        return str.toString().trim();
    }

    // TASK 16
    public static boolean getAreArraysIdentical(String[] arr1, String[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    // TASK 17
    public static boolean getExecutionTime(int numberOfAdditions) {
        String str = "";
        long stringExecutionTime = System.nanoTime();
        for (int i = 0; i < numberOfAdditions; i++) {
        }
        stringExecutionTime = System.nanoTime() - stringExecutionTime;
        StringBuilder stringBuilder = new StringBuilder(str);
        long stringBuilderExecutionTime = System.nanoTime();
        stringBuilder.append(str.repeat(numberOfAdditions));
        stringBuilderExecutionTime = System.nanoTime() - stringBuilderExecutionTime;
        return (stringExecutionTime < stringBuilderExecutionTime);
    }

    // TASK 18
    public static String getReplacedIdenticalCharacters(String str) {
        return str.replaceAll("(.)\\1+", "$1");
    }

    // TASK 19
    public static int getConversionFromRomanToArabic(String str) {
        int length = str.length();
        str = str + " ";
        int arabicNumber = 0;
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            char nextChar = str.charAt(i + 1);
            if (ch == 'M') {
                arabicNumber += 1000;
            } else if (ch == 'C') {
                if (nextChar == 'M') {
                    arabicNumber += 900;
                    i++;
                } else if (nextChar == 'D') {
                    arabicNumber += 400;
                    i++;
                } else {
                    arabicNumber += 100;
                }
            } else if (ch == 'D') {
                arabicNumber += 500;
            } else if (ch == 'X') {
                if (nextChar == 'C') {
                    arabicNumber += 90;
                    i++;
                } else if (nextChar == 'L') {
                    arabicNumber += 40;
                    i++;
                } else {
                    arabicNumber += 10;
                }
            } else if (ch == 'L') {
                arabicNumber += 50;
            } else if (ch == 'I') {
                if (nextChar == 'X') {
                    arabicNumber += 9;
                    i++;
                } else if (nextChar == 'V') {
                    arabicNumber += 4;
                    i++;
                } else {
                    arabicNumber++;
                }
            } else {
                arabicNumber += 5;
            }
        }
        return arabicNumber;
    }
}


