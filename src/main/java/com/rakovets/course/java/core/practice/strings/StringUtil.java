package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String glue(String str1, String str2) {
        String refusal = "";
        return (str1 == null || str2 == null) ? refusal : str1.concat(str2);
    }

    public int finedIndexX(String str, char x) {
        int refusal = -1;
        return (str == null || str.isEmpty()) ? refusal : str.indexOf(x);
    }

    public boolean equivalentTo(String str1, String str2) {
        boolean refusal = false;
        return (str1 == null || str2 == null) ? refusal : str1.equalsIgnoreCase(str2);
    }

    public String trimAndToUpper(String str) {
        String refusal = "";
        return (str == null || str.isEmpty()) ? refusal : str.trim().toUpperCase();
    }

    public String extractSubstringFromNtoM(String str, int n, int m) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        return str.substring(n - 1, m);
    }

    public String dontSadSmile(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        return str.replace(":(", ":)");
    }

    public boolean finedFistWordInString(String str, String start) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.startsWith(start);
    }

    public int countVowels(String str) {
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

    public int countPunctuationMarks(String str) {
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

    public boolean isItPalindrome(String str1) {
        if (str1 == null || str1.isEmpty()) {
            return false;
        }
        str1 = str1.replace(" ", "");
        StringBuffer buffer = new StringBuffer(str1);
        String str2 = buffer.reverse().toString();
        return str1.equalsIgnoreCase(str2);
    }

    public String[] getSubstrings(String str, int lengthSubstring) {
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

    public int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int counter = 0;
        for (String i : str.trim().split(" ")) {
            counter++;
        }
        return counter;
    }

    public String getInitials(String str) {
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

    public String getAllNumbers(String str) {
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
