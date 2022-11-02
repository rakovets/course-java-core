package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    String concat(String string1, String string2) {
        return string1 + string2;
    }

    public int getIndexOfCharAt(String string, char c) {
        return string.indexOf(c);
    }

    public boolean getTwoStringSame(String string1, String string2) {
        return string1.equals(string2);
    }

    public String getTrimStringLowerCase(String string) {
        return string.trim().toLowerCase();
    }

    public String getSubString(int a, int b, String string) {
        return string.substring(a - 1, b);
    }

    public String getReplaceEmoji(String string) {
        return string.replace(":(", ":)");
    }

    public boolean getStarAndEndWithWord(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    public int getNumberOfEnglishVowels(String string) {
        int numberVoweels = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (char vowel : vowels) {
            for (char letter : string.toLowerCase().toCharArray()) {
                if (letter == vowel) {
                    numberVoweels++;
                }
            }
        }
        return numberVoweels;
    }

    public int getNumberOfPunctuationMarks(String string) {
        int numberSymbolInStr = string.length();
        int numberAfterReplace = string.replaceAll("[.,?!]", "").length();
        return numberSymbolInStr - numberAfterReplace;
    }

    public boolean getStrIsPalindrome(String string) {
        string = string.toLowerCase().replaceAll("[.,?!; ]", "");
        String strAfterReverse = (new StringBuilder(string)).reverse().toString();
        return string.equals(strAfterReverse);
    }

    public String[] getSplitStr(String string, int n) {
        return string.split("(?<=\\G.{" + n + "})");
    }

    public int getNumberOfWordInText(String string) {
        String[] arrayNumberOfWordInText = string.trim().split(" +");
        int numberWorld = 0;
        for (int i = 0; i < arrayNumberOfWordInText.length; i++) {
            if (arrayNumberOfWordInText[i] != " ") {
                numberWorld++;
            }
        }
        return numberWorld;
    }

    public String getNameLastname(String string) {
        String[] arrayNameLastname = string.toUpperCase().split(" ");
        return arrayNameLastname[0].charAt(0) + arrayNameLastname[1].substring(0, 1);
    }

    public String getDigitalInText(String string) {
        return string.replaceAll("\\D", "");
    }
}
