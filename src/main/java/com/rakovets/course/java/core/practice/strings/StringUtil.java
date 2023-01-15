package com.rakovets.course.java.core.practice.strings;

public class StringUtil {

    public static String stringsConcatenation(String str1, String str2) {
        return str1.concat(str2);
    }

    public static int stringCharAt(int x, String str1) {
        return str1.indexOf(x);
    }

    public static boolean stringsEquals(String str1, String str2) {
        return str1.equals(str2);
    }

    public static String stringTrim(String str1) {
        return str1.trim();
    }

    public static String stringSymbolsExtraction(char n, char m, String str1) {
        return str1.substring(n - 1, m - 1); // возможно ошибка, пользователь задает символ по счёту или по имени?
    }

    public static String stringEmojiReplacement(String str1) {
        return str1.replaceAll("\\(", ":)");
    }

    public static boolean stringStartsAndEndsWithWord(String text, String word) {
        boolean isTrue = false;
        if (text.startsWith(word) && text.endsWith(word)) {
            isTrue = true;
        }
        return isTrue;
    }

    public static int stringVowelsCount(String str1) {
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

    public static int stringPunctuationMarksCount(String str1) {
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

    public static boolean stringPalindrome(String str1) {
        String str1Modified = str1.toLowerCase().replaceAll("\\W", "");
        String str1ModifiedReversed = new StringBuilder(str1Modified).reverse().toString();

        return str1Modified.equals(str1ModifiedReversed);
    }

    public static String[] stringsNGetArray(int n, String str1) {
        int stringsAmount = str1.length() / n;
        String[] arrayOfStrings = new String[stringsAmount];
        int substringBeginIndex = 0;

        for (int i = 1; i < stringsAmount; i++) {
            String stringTooMassive = str1.substring(substringBeginIndex , n * i);
            arrayOfStrings[i] = stringTooMassive;
            substringBeginIndex += n;
        }

        return arrayOfStrings;
    }
}
