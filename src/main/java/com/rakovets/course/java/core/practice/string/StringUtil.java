package com.rakovets.course.java.core.practice.string;

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
}
