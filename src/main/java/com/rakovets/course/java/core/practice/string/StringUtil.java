package com.rakovets.course.java.core.practice.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    static String gluingTwoStrings(String string1, String string2) {
        return string1.concat(string2);
    }

    static int  searchIndexCharacter(char character, String string) {
        return string.indexOf(character);
    }

    static boolean caseSensitiveStringComparison(String string1, String string2) {
        return string1.equals(string2);
    }

    static String removeSpacesStringAndUppercaseLetters(String string) {
        return string.trim().toUpperCase();
    }

    static String extractSubstringFromString(String string, int beginCharacter, int endCharacter) {
        return string.substring(beginCharacter, endCharacter);
    }

    static String replaceSadEmojisWithFunnyOnes(String string, String sadEmoji, String funnyEmoji) {
        return string.replace(sadEmoji, funnyEmoji);
    }

    static boolean textStartsAndEndsWithWord(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    static int numberEnglishVowels(String string) {
        int numberEnglishVowels = 0;

        Pattern pattern = Pattern.compile("[aeiouyAEIOUY]");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            numberEnglishVowels++;
        }
        return numberEnglishVowels;
    }

    static int numberPunctuationMarks(String str) {
        int numberPunctuationMarks = 0;

        Pattern pattern = Pattern.compile("[.,?!]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            numberPunctuationMarks++;
        }
        return numberPunctuationMarks;
    }

    static boolean checkEnteredPalindrome(String string) {
        string = string.toLowerCase();
        string = string.replaceAll("[.,?!:;\\s]", "");
        return string.equals((new StringBuilder(string)).reverse().toString());
    }

    static String splitTextEqualPartsStoreArray(String text, int n) {
                  return Arrays.toString(text.split("(?<=\\G.{" + n + "})"));
        }

    static int countNumberWords(String text) {
        String[] countNumberWords = text.split("\\s+");
        return countNumberWords.length;
    }


}
