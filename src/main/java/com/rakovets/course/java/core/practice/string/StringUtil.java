package com.rakovets.course.java.core.practice.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
//01
    static String gluingTwoStrings(String string1, String string2) {
        return string1.concat(string2);
    }
//02
    static int  searchIndexCharacter(char character, String string) {
        return string.indexOf(character);
    }
//03
    static boolean caseSensitiveStringComparison(String string1, String string2) {
        return string1.equals(string2);
    }
//04
    static String removeSpacesStringAndUppercaseLetters(String string) {
        return string.trim().toUpperCase();
    }
//05
    static String extractSubstringFromString(String string, int beginCharacter, int endCharacter) {
        return string.substring(beginCharacter, endCharacter);
    }
//06
    static String replaceSadEmojisWithFunnyOnes(String string, String sadEmoji, String funnyEmoji) {
        return string.replace(sadEmoji, funnyEmoji);
    }
//07
    static boolean textStartsAndEndsWithWord(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }
//08
    static int numberEnglishVowels(String string) {
        int numberEnglishVowels = 0;

        Pattern pattern = Pattern.compile("[aeiouyAEIOUY]");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            numberEnglishVowels++;
        }
        return numberEnglishVowels;
    }
//09
    static int numberPunctuationMarks(String str) {
        int numberPunctuationMarks = 0;

        Pattern pattern = Pattern.compile("[.,?!]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            numberPunctuationMarks++;
        }
        return numberPunctuationMarks;
    }
//10
    static boolean checkEnteredPalindrome(String string) {
        string = string.toLowerCase();
        string = string.replaceAll("[.,?!:;\\s]", "");
        return string.equals((new StringBuilder(string)).reverse().toString());
    }
//11
    static String splitTextEqualPartsStoreArray(String text, int n) {
                  return Arrays.toString(text.split("(?<=\\G.{" + n + "})"));
        }
//12
    static int countNumberWords(String text) {
        String[] countNumberWords = text.split("\\s+");
        return countNumberWords.length;
    }
//13
    static String returnInitialsFromText(String text) {
        text = text.toUpperCase();
        String[] arrayText = text.split("\\s+");
        for (int i = 0; i < arrayText.length; i++) {
            arrayText[i] = arrayText[i].substring(0, 1);
        }
        return (arrayText[0] + arrayText[1]);
    }
//14
    public static String returnsAllDigits(String text) {
        String returnsAllDigits = "";
        Pattern pattern = Pattern.compile("[\\d]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            returnsAllDigits += matcher.group();
        }
        return returnsAllDigits;
    }
}
