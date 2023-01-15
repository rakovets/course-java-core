package com.rakovets.course.java.core.practice.strings;

public class StringUtil {

    public String glueText(String str1, String str2) {
        String result = null;

        if (str1 != null || str2 != null) {
            result = str1.concat(str2);
        }

        return result;
    }

    public int indexOfChar(char x, String str1) {
        int result = -1;

        if (str1 != null) {
            result = str1.indexOf(x);
        }

        return result;
    }

    public boolean equalsStrings(String str1, String str2) {
        boolean result = false;

        if (str1 != null && str2 != null) {
            result = str1.equals(str2);
        }
        if (str1 == null && str2 == null) {
            result = true;
        }

        return result;
    }

    public String trimSpaces(String str1) {
        String result = null;

        if (str1 != null) {
            result = str1.trim();
        }

        return result;
    }

    public String symbolsExtraction(char n, char m, String str1) {
        return str1.substring(n - 1, m - 1); // возможно ошибка, пользователь задает символ по счёту или по имени?
    }

    public String emojiReplacement(String str1) {
        return str1.replaceAll("\\(", ":)");
    }

    public boolean startsAndEndsWithWord(String text, String word) {
        boolean isTrue = false;
        String str1 = text.toLowerCase();

        if (str1.startsWith(word) && str1.endsWith(word)) {
            isTrue = true;
        }

        return isTrue;
    }

    public int vowelsCount(String str1) {
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

    public int punctuationMarksCount(String str1) {
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

    public boolean IsPalindrome(String str1) {
        String str1Modified = str1.toLowerCase().replaceAll("\\W", "");
        String str1ModifiedReversed = new StringBuilder(str1Modified).reverse().toString();

        return str1Modified.equals(str1ModifiedReversed);
    }

    public String[] nGetArray(int n, String str1) {
        int stringsAmount = str1.length() / n;
        String[] arrayOfStrings = new String[stringsAmount];
        int substringBeginIndex = 0;

        for (int i = 0; i < stringsAmount; i++) {
            String stringTooMassive = str1.substring(substringBeginIndex , n * (i + 1));
            arrayOfStrings[i] = stringTooMassive;
            substringBeginIndex += n;
        }

        return arrayOfStrings;
    }
}
