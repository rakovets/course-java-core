package com.rakovets.course.java.core.practice.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    //task1
    static String concatString(String str1, String str2) {
        return str1.concat(str2);
    }

    //task2
    static int findSymbol(String str1, char ch1) {
        return str1.indexOf(ch1);
    }

    //task3
    static boolean isStringsEqual(String str1, String str2) {
        return str1.equals(str2);
    }

    //task4
    static String trimToUpperCase(String str1) {
        str1 = str1.trim();
        return str1.toUpperCase();
    }

    //task5
    static String getSubstringFromSymbol10(String str1) {
        StringBuilder stringBuilder = new StringBuilder(str1);
        if (stringBuilder.length() - 1 < 9) {
            return "String is not long enough";
        } else if (stringBuilder.length() - 1 < 32) {
            return stringBuilder.substring(9, stringBuilder.length());
        } else {
            return stringBuilder.substring(9, 32);
        }
    }

    //task6
    static String letSmile(String str1) {
        Pattern pattern = Pattern.compile(":\\(");
        Matcher matcher = pattern.matcher(str1);
        return matcher.replaceAll(":)");
    }

    //task7
    static Boolean isSurroundedWord(String str, String word) {
        if (word.length() != 0 && str.length() != 0) {
            Pattern pattern = Pattern.compile("^" + word);
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                Pattern pattern1 = Pattern.compile(word + "$");
                Matcher matcher1 = pattern1.matcher(str);
                return matcher1.find();
            }
        } else {
            return word.length() == str.length();
        }
        return false;
    }

    //task8
    static int getVowelsQuantity(String str) {
        int quantity = 0;
        Pattern pattern = Pattern.compile("[aeiouyAEIOUY]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            quantity++;
        }
        return quantity;
    }

    //task9
    static int getMarksQuantity(String str) {
        int quantity = 0;
        Pattern pattern = Pattern.compile("[.!,]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            quantity++;
        }
        return quantity;
    }

    //task10
    static boolean isPalindrom(String str1) {
        Pattern pattern = Pattern.compile("[\\s.,!?'():\\-\"]");
        Matcher matcher = pattern.matcher(str1);
        String str2 = matcher.replaceAll("");
        str2 = str2.toLowerCase();
        StringBuilder strBuilder1 = new StringBuilder(str2);
        String str3 = strBuilder1.reverse().toString();
        return str2.equals(str3);
    }

    //task11
    static String getCharArray(String str1, int n) {
        String[] result = new String[(int) Math.ceil((double) str1.length() / (double) n)];
        for (int i = 0; i < result.length; i++)
            result[i] = str1.substring(i * n, Math.min(str1.length(), (i + 1) * n));
        return Arrays.toString(result);
    }

    //task12
    static int getWordsQuantity(String str1) {
        int quantity = 0;
        if (str1.length() != 0) {
            str1 = str1.trim();
            Pattern pattern = Pattern.compile("\\s\\b");
            Matcher matcher = pattern.matcher(str1);
            while (matcher.find()) {
                quantity++;
            }
            return quantity + 1;
        } else {
            return quantity;
        }
    }

    //task13
    static String getFullName(String LastName, String FirstName, String Patronymic) {
        if (LastName.length() > 0 && FirstName.length() > 0 && Patronymic.length() > 0) {
            char lastname = LastName.charAt(0);
            char name = FirstName.charAt(0);
            char patronymic = Patronymic.charAt(0);
            String fullName = lastname + "." + name + "." + patronymic;
            return fullName.toUpperCase();
        } else {
            return "String is empty";
        }
    }

    //task 14
    static String getAllDigits(String str) {
        Pattern pattern = Pattern.compile("\\D");
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("");
    }
}
