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
        char[] arrayFromString = str.toCharArray();
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

    boolean isItPalindrome(String str1) {
        if (str1 == null || str1.isEmpty()) {
            return false;
        }
        str1 = str1.replace(" ", "");
        StringBuffer buffer = new StringBuffer(str1);
        String str2 = buffer.reverse().toString();
        return str1.equalsIgnoreCase(str2);
    }

    String[] getSubstrings(String str, int lengthSubstring) {
        if (str == null || str.isEmpty()) {
            String[] empty = {""};
            return empty;
        }
        int numberSubstrings = str.length() / lengthSubstring;
        String[] substrings = new String[numberSubstrings];
        int indexCut = 0;
        for (int i = 0; i < numberSubstrings; i++) {
            substrings[i] = str.substring(indexCut, indexCut + lengthSubstring);
            indexCut += lengthSubstring;
        }
        return substrings;
    }

    int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int counter = 0;
        for (String i : str.trim().split(" ")) {
            counter++;
        }
        return counter;
    }

    String getInitials(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String[] firstSecondName = str.toUpperCase().trim().split(" ");
        String initials = "";
        for (String i : firstSecondName) {
            initials += i.charAt(0);
        }
        return initials;
    }

    String getAllNumbers(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        char[] number = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        char[] arrayFromString = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (char i : arrayFromString) {
            for (char j : number) {
                if (i == j) {
                    stringBuffer.append(i);
                }
            }
        }
        return stringBuffer.toString();
    }
}
