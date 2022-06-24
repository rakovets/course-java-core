package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String concat(String str1, String str2) {
        return str1 + str2;
    }

    public int indexOf(String str1, char symbol) {
        return str1.indexOf(symbol);
    }

    public boolean equals(String str1, String str2) {
        return str1.equals(str2);
    }

    public String trimSpaceLowerCase(String str1) {
        return (str1.trim()).toLowerCase();
    }

    public String substringSymbol(String str1, char firstSymbol, char secondSymbol) {
        int indexFirstSymbol = indexOf(str1, firstSymbol);
        int indexSecondSymbol = indexOf(str1, secondSymbol);
        return str1.substring(indexFirstSymbol, indexSecondSymbol);
    }

    public String replace(String str1, String oldValue, String newValue) {
        return str1.replace(oldValue, newValue);
    }

    public boolean startAndEndWithWord(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    public int countVowels(String str1) {
        int amount = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        char[] str1ToArray = str1.toLowerCase().toCharArray();
        for (char c : str1ToArray) {
            for (char vowel : vowels) {
                if (c == vowel) {
                    amount++;
                }
            }
        }
        return amount;
    }


    public int punctuationMarks(String str1) {
        int amount = 0;
        char[] punctuationMarks = {',', '.', '!', '?'};
        char[] str1ToArray = str1.toCharArray();
        for (char c : str1ToArray) {
            for (char punctuationMark : punctuationMarks) {
                if (c == punctuationMark) {
                    amount++;
                }
            }
        }
        return amount;
    }
}
