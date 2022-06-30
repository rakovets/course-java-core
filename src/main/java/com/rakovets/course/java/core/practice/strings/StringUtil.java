package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String concat(String str1, String str2) {
        return str1 + str2;
    }

    public int getIndexOf(String str, char ch) {
        return  str.indexOf(ch);
    }

    public boolean isEqual(String str1, String str2) {
        return  str1.equals(str2);
    }

    public String trimAndToUpperCase(String str) {
        return str.trim().toUpperCase();
    }

    public String getSubstring(String str, int beginIndex, int endIndex) {
        return str.substring(beginIndex, endIndex);
    }

    public String replaceSadEmoji(String str) {
        return str.replace(":(", ":)");
    }

    public boolean isStartAndEndWord(String str, String word) {
        return str.startsWith(word) && str.endsWith(word);
    }

    public int countEnglishVowels(String str) {
        int numberOfEnglishVowels = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    numberOfEnglishVowels ++;
                    break;
            }
        }
        return numberOfEnglishVowels;
    }

    public int countPunctuationMarks(String str) {
        int numberOfPunctuationMarks = 0;
        for (char ch : str.toCharArray()) {
            switch (ch) {
                case '.':
                case ',':
                case '?':
                case '!':
                    numberOfPunctuationMarks ++;
                    break;
            }
        }
        return numberOfPunctuationMarks;
    }

    public boolean isPalindrome(String str) {
        String onlyLetters = str.replaceAll("['.,?!:;\\s]", "");
        return onlyLetters.equalsIgnoreCase(new StringBuilder(onlyLetters).reverse().toString());
    }

    public String[] splitEqualParts(String str, int n) {
        return str.split("(?<=\\G.{" + n + "})");
    }

    public int countWords(String str) {
        return (str.trim().equals("")) ? 0 : str.trim().split("\\s{1,}").length;
    }

    public String getInitials(String str) {
        String[] name = str.trim().toUpperCase().split("\\s{1,}");
        return name[0].substring(0, 1) + name[1].substring(0, 1);
    }

    public String getAllNumbers(String str) {
        return str.replaceAll("[^\\d]", "");
    }
}
