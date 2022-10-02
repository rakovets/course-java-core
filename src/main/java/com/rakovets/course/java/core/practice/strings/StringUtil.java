package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String glue(String str1, String str2) {
        return str1 + str2;
    }

    public int getIndexOfChar(String str, char c) {
        return str.indexOf(c);
    }
    public boolean isIdentical(String str1, String str2) {
     return str1.equals(str2);
    }

    public String onlyLetters(String str) {
        return str.trim().toLowerCase();
    }

    public String getPartOfString(String str, int n, int m) {
        return str.substring(n-1, m);
    }

    public String changeEmogi(String str) {
        return str.replace(":(", ":)");
    }

    public boolean isStartsAndEndWith(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    public int getAmountOfEnglishVowels(String str) {
        return str.replaceAll("[^aeyuioAEYUIO]", "").length();
    }

    public int getAmountOfPunctuationMarks(String str) {
        return str.replaceAll("[^.,?!]", "").length();
    }

    public boolean isPalindrom(String str) {
        str = str.replaceAll(" ", "").replaceAll("[.,!?;:'\"]", "").toLowerCase();
        String str2 = new StringBuilder(str).reverse().toString();
        return str.equals(str2);
    }

    public String[] getArrayOfPartsOfString(String str, int n) {
        String[] partsOfString;
        if (str.length() % n == 0) {
            partsOfString = new String[str.length() / n];
        } else {
            partsOfString = new String[str.length() / n + 1];
        }
        int j = 0;
        for (int i = 0; i < str.length(); i += n) {
            if (str.length() - i < n) {
                partsOfString[j] = str.substring(i);
            } else {
                partsOfString[j] = str.substring(i, i + n);
            }
            j++;
            }
        return partsOfString;
    }

    public int getWordsCount(String str) {
        if (str == null) {
            return 0;
        } else {
            int wordsCount = 0;
            String[] words = str.split(" +");
            wordsCount = words.length;
            return wordsCount;
        }
    }

    public String getInitials(String str) {
        String[] words = str.split(" ");
        return words[0].toUpperCase().charAt(0) + "" + words[1].toUpperCase().charAt(0);
    }

    public String getDigitsFromText(String text) {
        return text.replaceAll("[^0-9]", "");
    }

}
