package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    /**
     * Task 1.
     * Using the methods of the String class, output the string that is the result of concatenating two strings.
     */
    public String concat(String str1, String str2) {
        return str1 + str2;
    }

    /**
     * Task 2.
     * Find the index of the character x (x is the character entered by the user) in the string.
     */
    static int receiveIndexOf(String firstString, char simbol) {
        return firstString.indexOf(simbol);
    }

    /**
     * Task 3.
     * Determine if two strings are the same considering case
     */
    public boolean equalsString(String str1, String str2) {
        return str1.equals(str2);
    }

    /**
     * Task 4.
     * Remove spaces at the beginning and end of the string.
     * Make sure that the entire string consists of uppercase letters.
     */
    public String trimAndLowerCase(String str) {
        return str.trim().toLowerCase();
    }

    /**
     * Task 5.
     * Extract a substring from the string starting from the nth character and up to the mth character.
     */
    public String substringBetweenIndices(String str, int indices1, int indices2) {
        return str.substring(indices1, indices2);
    }

    /**
     * Task 6.
     * Replace all sad emoji :( in the string with happy ones :).
     */
    public String replace(String str1, String oldChar, String newChar) {
        return str1.replace(oldChar, newChar);
    }

    /**
     * Task 7.
     * Write a method that takes 2 parameters text and word, and returns: true if the string starts
     * and ends with this word or false in all others.
     */
    static boolean startAndEndString(String text, String word) {
        return text.startsWith(word) & text.endsWith(word);
    }

    /**
     * Task 8.
     * Determine the number of English vowels in a sentence.
     */
    static int searchForEnglishVowels(String userString) {
        int englishVowelsNumbers = 0;

        userString = userString.toLowerCase();
        for (int i = 0; i < userString.length(); i++) {
            if (userString.charAt(i) == 'a' || userString.charAt(i) == 'e' || userString.charAt(i) == 'i' || userString.charAt(i) == 'o' || userString.charAt(i) == 'u' || userString.charAt(i) == 'y') {
                englishVowelsNumbers++;
            }
        }
        return englishVowelsNumbers;
    }

    /**
     * Task 9.
     * Count the total number of punctuation marks (periods, commas, question marks, and exclamation marks) in a string.
     */
    static int searchPunctuationMarks(String userString) {
        int marksPunctuation = 0;

        for (int i = 0; i < userString.length(); i++) {
            if (userString.charAt(i) == '.' || userString.charAt(i) == ',' || userString.charAt(i) == '!' || userString.charAt(i) == '?') {
                marksPunctuation++;
            }
        }
        return marksPunctuation;
    }

    /**
     * Task 10.
     * Check if the input string is a palindrome.
     */
    static boolean stringIsPalindrome(String userString) {
        userString = userString.trim().toLowerCase().replaceAll("[.,?!:;\\s]", "");
        return userString.equals((new StringBuilder(userString)).reverse().toString());
    }

    /**
     * Task 11.
     * Split the string into equal parts of n characters each and store the individual parts in an array.
     */
    static String[] splitNewParts(String userString, int n) {
        return userString.split("(?<=\\G.{" + n + "})");
    }

    /**
     * Task 12.
     * Count the number of words in the text. Note that words can be separated by multiple spaces.
     */
    static int splitNewWordsInAText(String userString) {
        int numberWords = 0;

        String[] splitWordsText = userString.trim().replaceAll("\\s{2,}", " ").split(" ");
        for (String word : splitWordsText) {
            if (!word.equals("")) {
                numberWords++;
            }
        }
        return numberWords;
    }

    /**
     * Task 13.
     * Last name and first name are given as one line. Return initials according to the FL pattern,
     * for example: DmitRY RakOVets → DR. Please note that the input parameters can be in any case,
     * and the resulting string must be in the upper case.
     */
    static String initials(String userString) {
        String[] initials = userString.trim().replaceAll("\\s{2,}", " ").toUpperCase().split(" ");
        return initials[0].substring(0, 1) + initials[1].substring(0, 1);
    }

    /**
     * Task 14.
     * Return a string that contains all the digits in the text.
     */
    static String receiveNumbersText(String userString) {
        return userString.replaceAll("\\D", "");
    }
}
