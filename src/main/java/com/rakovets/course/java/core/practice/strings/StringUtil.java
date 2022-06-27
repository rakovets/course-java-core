package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    /**
     * Task 1.
     * Using the methods of the String class, output the string that is the result of concatenating two strings.
     */
    public String concatenationOfTwoStrings(String stringOne, String stringTwo) {
        return stringTwo.concat(stringOne);
    }

    /**
     * Task 2.
     * Find the index of the character x (x is the character entered by the user) in the string.
     */
    public int receivingIndexOfEnteringSymbol(String string, char symbol) {
        return string.indexOf(symbol);
    }

    /**
     * Task 3.
     * Determine if two strings are the same considering case
     */
    public boolean equivalenceOfTwoStringsCaseInsensitive(String stringOne, String stringTwo) {
        return stringOne.equals(stringTwo);
    }

    /**
     * Task 4.
     * Remove spaces at the beginning and end of the string.
     * Make sure that the entire string consists of uppercase letters.
     */
    public String makeTrimAndUpperCaseInString(String string) {
        return string.trim().toUpperCase();
    }

    /**
     * Task 5.
     * Extract a substring from the string starting from the nth symbol and up to the mth symbol.
     */
    public String extractingSubstringFromNToMsymbols(String string, char symbolN, char symbolM) {
        int indexN = string.indexOf(symbolN);
        int indexM = string.indexOf(symbolM) + 1;
        return string.substring(indexN,indexM);
    }

    /**
     * Task 6.
     * Replace all sad emoji :( in the string with happy ones :).
     */
    public String replacingOldValueOfStringToNewValue(String string, String oldValue, String newValue) {
        return string.replace(oldValue, newValue);
    }

    /**
     * Task 7.
     * Write a method that takes 2 parameters text and word, and returns: true if the string starts
     * and ends with this word or false in all others.
     */
    public boolean checkingIfStringStartingAndEndingAtWordParametr(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    /**
     * Task 8.
     * Determine the number of English vowels in a sentence.
     */
    public int nubmerOfEnglishVowelsInASentence(String string) {
        int countOfEnglishVowels = 0;

        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == ('e') || string.charAt(i) == ('i')
                    || string.charAt(i) == ('o') || string.charAt(i) == ('u') || string.charAt(i) == ('y')) {
                countOfEnglishVowels++;
            }
        }
        return countOfEnglishVowels;
    }

    /**
     * Task 9.
     * Count the total number of punctuation marks (periods, commas, question marks, and exclamation marks) in a string.
     */
    public int nubmerOfPunctuationMarksInAString(String string) {
        int countOfPunctuationMarks = 0;

        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '.' || string.charAt(i) == (',') || string.charAt(i) == ('!')
                    || string.charAt(i) == ('?')) {
                countOfPunctuationMarks++;
            }
        }
        return countOfPunctuationMarks;
    }

    /**
     * Task 10.
     * Check if the entered string is a palindrome.
     */
    public boolean checkingForStringIsAPalindrome(String string) {
        string = string.trim().toLowerCase();

        return string.equals((new StringBuilder(string)).reverse().toString());
    }

    /**
     * Task 11.
     * Split the string into equal parts of n characters each and store the individual parts in an array.
     */
    public static String[] splitTheStringIntoEqualPartsOfN(String string, int n) {
        return string.split("(?<=\\G.{" + n + "})");
    }

    /**
     * Task 12.
     * Number of words in the text. Note that words can be separated by multiple spaces.
     */
    public int receivingTheNumberOfWordsInAText(String string) {
        String[] arrayOfTheNumberOfWordsInAText = string.trim().split(" ");

        int numberOfWords = 0;

        for (String word : arrayOfTheNumberOfWordsInAText) {
            if (!word.equals("")) {
                numberOfWords++;
            }
        }
        return numberOfWords;
    }

    /**
     * Task 13.
     * Last name and first name are given as one line. Return initials according to the FL pattern,
     * for example: DmitRY RakOVets → DR. Please note that the input parameters can be in any case,
     * and the resulting string must be in the upper case.
     */
    public static String receivingInitials(String string) {
        String[] arrayOfInitials = string.toUpperCase().split(" ");

        return arrayOfInitials[0].charAt(0) + arrayOfInitials[1].substring(0, 1);
    }

    /**
     * Task 14.
     * Return a string that contains all the digits in the text.
     */
    public String numberOfDigitsInTheText(String string) {
        return string.replaceAll("\\D", "");
    }
}
