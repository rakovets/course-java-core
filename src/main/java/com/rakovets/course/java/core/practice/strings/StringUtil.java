package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String stringsConcatenation(String str1, String str2) {
        return str1.concat(str2);
    }

    public int stringCharAt(int x, String str1) {
        return str1.indexOf(x);
    }

    public boolean stringsEquals(String str1, String str2) {
        return str1.equals(str2);
    }

    public String stringTrim(String str1) {
        return str1.trim();
    }

    public String stringSymbolsExtraction(char n, char m, String str1) {
        return str1.substring(n - 1, m - 1); // возможно ошибка, пользователь задает символ по счёту или по имени?
    }

    public String stringEmojiReplacement(String str1) {
        return str1.replaceAll("\\(", ":)");
    }

    public boolean stringStartWithWord(String text, String word) {
        return text.startsWith(word);
    }

    public int stringVowelsCount(String str1) {
        int vowelsCounter = 0;
        String str1LowerCase = str1.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            char charAtI = str1LowerCase.charAt(i);

            if (charAtI == 'a' || charAtI == 'e' || charAtI == 'i' || charAtI == 'o' || charAtI == 'u'
                    || charAtI == 'y') {
                vowelsCounter++;
            }
        }

        return vowelsCounter;
    }

    public int stringPunctuationMarksCount(String str1) {
        int punctuationMarksCounter = 0;
        String str1LowerCase = str1.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            char charAtI = str1LowerCase.charAt(i);

            if (charAtI == '.' || charAtI == ',' || charAtI == '?' || charAtI == '!') {
                punctuationMarksCounter++;
            }
        }

        return punctuationMarksCounter;
    }

    public boolean stringPalindrome(String str1) {
        String str1Modified = str1.toLowerCase().replaceAll("\\W", "");
        String str1ModifiedReversed = new StringBuilder(str1Modified).reverse().toString();

        return str1Modified.equals(str1ModifiedReversed);
    }
}
