package com.rakovets.course.java.core.practice.strings;

import java.util.Arrays;
import java.util.Objects;

public class StringUtil {

    static String connectTwoStrings(String str1, String str2) {
        return str1 + str2;
    }

    static int findIndex(String str, char ch) {
        return str.indexOf(ch);
    }

    static boolean isEqual(String str1, String str2) {
        return str1.equals(str2);
    }

    static String deleteSpaseAroundTurnInUpperCase(String str) {
        return str.toUpperCase().trim();
    }

    static String getSubstring(String str, int n, int m) {
        return str.substring(n, m);
    }

    static String replaceEmoji(String str) {
        return str.replaceAll("\\(", ")");
    }

    static boolean correctBegin(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    static int findNumberOfVowels(String str) {
        String vowels = "aAeEyYuUiIoO";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }
        return count;
    }

    static int getPunctuation(String str) {
        int count = 0;
        String punctuation = ".,?!;:-()\"";
        for (int i = 0; i < str.length(); i++) {
            if (punctuation.contains(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }
        return count;
    }

    static boolean isPalindrome(String str) {
        str = str.replaceAll(" ", "").toLowerCase();
        str = str.replaceAll("[.,!?;:'\"]", "");
        char[] arr = str.toCharArray();
        boolean isPol = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPol = false;
                break;
            }
        }
        return isPol;
    }

    static String[] splitString(String str, int n) {
        String[] splitText;
        int j = 0;
        if (str.length() % n != 0) {
            splitText = new String[str.length() / n + 1];
        } else {
            splitText = new String[str.length() / n];
        }

        for (int i = 0; i < str.length(); i += n) {
            if (str.length() - i < n) {
                splitText[j] = str.substring(i);
            } else {
                splitText[j] = str.substring(i, i + n);
            }
            j++;
        }

        return splitText;
    }

    static int countWords(String str) {
        str = str.trim().replaceAll(" +", " ");
        str = str.replaceAll("-", "");
        if (str.equals("")) {
            return 0;
        } else {
            String[] strArr = str.split(" ");
            return strArr.length;
        }
    }

    static String getInitials(String str) {
        str = str.trim().toUpperCase().replaceAll("-", " ");
        String initials = "";
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            initials += strArr[i].charAt(0);
        }
        return initials;
    }

    static String allDigits(String str) {
        String digits = "";
        char[] strArray = str.toCharArray();
        for (char ch : strArray) {
            if (Character.isDigit(ch)) {
                digits += ch + " ";
            }
        }
        return digits.trim();
    }

    static String nonMatchingChars(String str1, String str2) {
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            if (!str2.contains(String.valueOf(str1.charAt(i)))) {
                result += str1.charAt(i);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (!str1.contains(String.valueOf(str2.charAt(i)))) {
                result += str2.charAt(i);
            }
        }
        return result;
    }

    static boolean isIdentical(String[] arr1, String[] arr2) {
        for (int i = 1; i < arr1.length; i++) {
            for (int j = 1; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    arr1[i] = "";
                    arr2[j] = "";
                }
            }
        }
        return Arrays.toString(arr1).equals(Arrays.toString(arr2));
    }

    static String replaceSameSymbols(String str) {
        String result = str;
        result = result.replaceAll("([a-z])\\1+", "$1");
        return result;
    }
}
