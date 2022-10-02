package com.rakovets.course.java.core.practice.strings;


import java.util.Arrays;

public class StringUtil {
    public static void main(String[] args) {

    }
    public String glue(String str1, String str2) {
        return str1 + str2;
    }

    public int getIndexOfChar(String str, char a) {
        if (str == null) {
            return -1;
        }
        return str.indexOf(a);
    }

    public boolean getStringComparison(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return true;
        } else if (str1 == null || str2 == null) {
            return false;
        }
        return str1.equals(str2);
    }

    public String getStringUppercaseAndTrim(String str) {
        if (str == null) {
            return "It's null bro";
        }
        return str.trim().toUpperCase();
    }

    public String getSubstring(String str, int beginIndex, int endIndex) {
        if (str == null) {
            return "It's null bro";
        } else if (str.length() < endIndex || beginIndex < 0 || endIndex < 0) {
            return "You went out of bounds";
        }
        return str.substring(beginIndex, endIndex);
    }

    public String getReplaceEmoji(String str) {
        if (str == null) {
            return "It's null bro";
        }
        return str.replace(":(", ":)");
    }

    public boolean getRegionMatches(String text, String word) {
        boolean regionMatches;
        if (text == null || word == null) {
            return false;
        }
        boolean beginOfText = text.regionMatches(0, word, 0, word.length());
        boolean endOfText = text.regionMatches(text.length() - word.length(), word, 0, word.length());
        if (beginOfText == endOfText) {
            regionMatches = true;
        } else {
            regionMatches = false;
        }
        return regionMatches;
    }

    public int getNumberOfEnglishVowels(String str) {
        if (str == null) {
            return 0;
        }
        int numberOfEnglishVowels = 0;
        String stringUpper = str.toUpperCase();
        for (char item: stringUpper.toCharArray()) {
            if (item == 'A' || item == 'E' || item == 'I' || item == 'O' || item == 'U' || item == 'Y') {
                numberOfEnglishVowels++;
            }
        }
        return numberOfEnglishVowels;
    }

    public int getNumberOfPunctuation(String str) {
        if (str == null) {
            return 0;
        }
        int numberOfPunctuation = 0;
        for (char item: str.toCharArray()) {
            if (item == '.' || item == ',' || item == '!' || item == '?') {
                numberOfPunctuation++;
            }
        }
        return numberOfPunctuation;
    }

    public boolean getPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String stringReverse = new StringBuffer(str).reverse().toString()
                .replaceAll("(?U)[\\pP\\s]", "");
        String string = str.replaceAll("(?U)[\\pP\\s]", "");
        if (string.equalsIgnoreCase(stringReverse)) {
            return true;
        } else {
            return false;
        }
    }

    public String[] getArrayOfEqualParts(String str, int divider) {
        if (str == null) {
            return new String[]{"It's null bro"};
        }
        String[] strings = str.split("(?<=\\G.{" + Integer.toString(divider) + "})");
        return strings;
    }

    public int getWordCount(String str) {
        if (str == null) {
            return 0;
        }
        int wordCount = 0;
        String[] words = str.split(" +");
        wordCount = words.length;
        return wordCount;
    }

    public String getNameInitials(String str) {
        if (str == null) {
            return "It's null bro";
        }
        String[] word = str.toUpperCase().split(" +");
        String nameInitials = word[0].substring(0, 1) + word[1].substring(0,1);;
        return nameInitials;
    }

    public String getAllNumbersInString(String str) {
        if (str == null) {
            return "It's null bro";
        }
        String allNumbersInString = str.replaceAll("[^0-9]+","");
        return allNumbersInString;
    }
}
