package com.rakovets.course.java.core.practice.strings;


public class StringUtil {
    String concat(String str1, String str2) {
        return str1 + str2;
    }

    public int getIndexOfCharAt(String str, char c) {
        return str.indexOf(c);
    }

    public boolean getTwoStringSame(String str1, String str2) {
        return str1.equals(str2);
    }

    public String getTrimStringLowerCase(String str) {
        return str.trim().toLowerCase();
    }

    public String getSubString(int a, int b, String str) {
        return str.substring(a - 1, b);
    }

    public String getReplaceEmoji(String str) {
        return str.replace(":(", ":)");
    }

    public boolean getStarAndEndWithWord(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    public int getNumberOfEnglishVowels(String str) {
        int numberVoweels = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (char vowel : vowels) {
            for (char letter : str.toLowerCase().toCharArray()) {
                if (letter == vowel) {
                    numberVoweels++;
                }
            }
        }
        return numberVoweels;
    }

    public int getNumberOfPunctuationMarks(String str) {
        int numberSymbolInStr = str.length();
        int numberAfterReplace = str.replaceAll("[.,?!]", "").length();
        return numberSymbolInStr - numberAfterReplace;
    }

    public boolean getStrIsPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[.,?!; ]", "");
        String strAfterReverse = (new StringBuilder(str)).reverse().toString();
        return str.equals(strAfterReverse);
    }

    public String[] getSplitStr(String str, int n) {
        return str.split("(?<=\\G.{" + n + "})");
    }

    public int getNumberOfWordInText(String str) {
        String[] arrayNumberOfWordInText = str.trim().split(" +");
        int numberWorld = 0;
        for (int i = 0; i < arrayNumberOfWordInText.length; i++) {
            if (arrayNumberOfWordInText[i] != " ") {
                numberWorld++;
            }
        }
        return numberWorld;
    }

    public String getNameLastname(String str) {
        String[] arrayNameLastname = str.toUpperCase().split(" ");
        return arrayNameLastname[0].charAt(0) + arrayNameLastname[1].substring(0, 1);
    }

    public String getDigitalInText(String str) {
        return str.replaceAll("\\D", "");
    }
}
