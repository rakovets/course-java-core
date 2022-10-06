package com.rakovets.course.java.core.practice.strings;

import java.util.Arrays;

public class StringUtil {
    public String stringGluing(String str1, String str2) {
        return str1.concat(str2);
    }

    public int findingIndex(String str, char symbol) {
        return str.indexOf(symbol);
    }

    public boolean stringComparison(String str1, String str2) {
        return str1.equals(str2);
    }

    public String removeSpaceAndUpperСase(String str) {
        return str.trim().toUpperCase();
    }

    public String removeSubstring(String str, char n, char m) {
        int removeWith = str.indexOf(n);
        int removeBefore = str.indexOf(m);
        return str.substring(removeWith, removeBefore);
    }

    public String replaceSmile(String str) {
        return str.replace(":(", ":)");
    }

    public boolean searchWordInText(String text, String word) {
        return text.toLowerCase().indexOf(word.toLowerCase()) == 0
                && text.toLowerCase().lastIndexOf(word.toLowerCase())
                == text.length() - word.length() ? true : false;
    }

    public int countNumberEnglishVowels(String str) {
        char[] vowels = {'e', 'y', 'u', 'i', 'o', 'a'};
        int countNumberEngVowels = 0;
        for (char vowel : vowels) {
            for (char litter : str.toLowerCase().toCharArray()) {
                if (litter == vowel) {
                    countNumberEngVowels++;
                } else {
                    continue;
                }
            }
        }
        return countNumberEngVowels;
    }

    public int symbolCounter(String str) {
        int counterSymbol = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == '?' || str.charAt(i) == '!') {
                counterSymbol++;
            } else {
                continue;
            }
        }
        return counterSymbol;
    }

    public boolean checkPalindrome(String str) {
        String revers = "";
        String preparedLine = str.toLowerCase().replaceAll("\\s", "");
        for (int i = 0; i < preparedLine.length(); i++) {
            revers = preparedLine.charAt(i) + revers;
        }
        return preparedLine.equals(revers);
    }

    public String[] splitStringApartOnNumberCharacters(String str, int n) {
        return str.split("(?<=\\G.{" + n + "})");
    }

    public int wordCount(String str) {
        int count = 0;
        String[] words = str.trim().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (words[i] != " ") {
                count++;
            }
        }
        return count;
    }

    public String writeInitials(String str) {
        String[] nameAndLastname = str.toUpperCase().split("\\s");
        return nameAndLastname[0].charAt(0) + "" + nameAndLastname[1].charAt(0);
    }

    public String returnNumber(String str) {
        String allNumber = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                allNumber += str.charAt(i);
            }
        }
        return allNumber;
    }
}
