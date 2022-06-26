package com.rakovets.course.java.core.practice.strings;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class StringUtil {
    /**
     * Task 1.
     * Using the methods of the String class, output the string that is the result of concatenating two strings.
     *
     * @param firstString  first string.
     * @param secondString second string.
     * @return result of concatenating two strings.
     */
    @Contract(pure = true)
    static @NotNull String receiveConcat(@NotNull String firstString, String secondString) {
        return firstString.concat(secondString);
    }

    /**
     * Task 2.
     * Find the index of the character x (x is the character entered by the user) in the string.
     * If there is no such character, then -1.
     *
     * @param firstString string.
     * @param x           user input character.
     * @return the index of a character in a string
     */
    @Contract(pure = true)
    static int receiveIndexOf(@NotNull String firstString, char x) {
        return firstString.indexOf(x);
    }

    /**
     * Task 3.
     * Determine if two strings are the same considering case.
     *
     * @param firstString  first string.
     * @param secondString second string.
     * @return a boolean value of the comparison result.
     */
    @Contract(value = "_, null -> false", pure = true)
    static boolean receiveEquals(@NotNull String firstString, String secondString) {
        return firstString.equals(secondString);
    }

    /**
     * Task 4.
     * Remove spaces at the beginning and end of the string.
     * Make sure that the entire string consists of uppercase letters.
     *
     * @param firstString string.
     * @return a string remove all spaces and converts the entire string to upper case.
     */
    static @NotNull String receiverTrimAndToUpperCase(@NotNull String firstString) {
        return firstString.trim().toUpperCase();
    }

    /**
     * Task 5.
     * Extract a substring from the string starting from the nth character and up to the mth character.
     *
     * @param firstString string.
     * @param nSymbol     n symbol.
     * @param mSymbol     m symbol.
     * @return a substring from a string.
     */
    @Contract(pure = true)
    static @NotNull String receiveSubstring(@NotNull String firstString, int nSymbol, int mSymbol) {
        return firstString.substring(nSymbol, mSymbol);
    }

    /**
     * Task 6.
     * Replace all sad emoji :( in the string with happy ones :).
     *
     * @param firstString string.
     * @param oldString   original string.
     * @param newString   modified line.
     * @return a string with changed characters.
     */
    @Contract(pure = true)
    static @NotNull String receiveReplace(@NotNull String firstString, String oldString, String newString) {
        return firstString.replace(oldString, newString);
    }

    /**
     * Task 7.
     * Write a method that takes 2 parameters text and word, and returns: true if the string starts
     * and ends with this word or false in all others.
     *
     * @param text first parameter.
     * @param word second parameter.
     * @return a boolean comparison value.
     */
    static boolean receiveStartWithAndEndWith(@NotNull String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    /**
     * Task 8.
     * Determine the number of English vowels in a sentence.
     *
     * @param firstString string.
     * @return number of vowels in a sentence.
     */
    static int receiveTheNumberOfEnglishVowels(@NotNull String firstString) {
        int numberOfEnglishVowels = 0;

        firstString = firstString.toLowerCase();

        for (int i = 0; i < firstString.length(); i++) {
            if (firstString.charAt(i) == 'a'
                    || firstString.charAt(i) == 'e'
                    || firstString.charAt(i) == 'i'
                    || firstString.charAt(i) == 'o'
                    || firstString.charAt(i) == 'u'
                    || firstString.charAt(i) == 'y') {
                numberOfEnglishVowels++;
            }
        }
        return numberOfEnglishVowels;
    }

    /**
     * Task 9.
     * Count the total number of punctuation marks (periods, commas, question marks, and exclamation marks) in a string.
     *
     * @param firstString string.
     * @return the number of punctuation marks.
     */
    static int receivePunctuationMarks(@NotNull String firstString) {
        int punctuationMarks = 0;

        for (int i = 0; i < firstString.length(); i++) {
            if (firstString.charAt(i) == '.'
                    || firstString.charAt(i) == '?'
                    || firstString.charAt(i) == '!'
                    || firstString.charAt(i) == ',') {
                punctuationMarks++;
            }
        }
        return punctuationMarks;
    }

    /**
     * Task 10.
     * Check if the input string is a palindrome.
     *
     * @param firstString string.
     * @return a boolean string comparison
     */
    static boolean receivePalindrome(@NotNull String firstString) {
        firstString = firstString.toLowerCase().replaceAll("[.,?!:;\\s]", "");

        return firstString.equals((new StringBuilder(firstString)).reverse().toString());
    }

    /**
     * Task 11.
     * Split the string into equal parts of n characters each and store the individual parts in an array.
     *
     * @param firstString string.
     * @param n           number of characters.
     * @return returns an array of string parts.
     */
    @Contract(pure = true)
    static String @NotNull [] receiveSplit(@NotNull String firstString, int n) {
        return firstString.split("(?<=\\G.{" + n + "})");
    }

    /**
     * Task 12.
     * Count the number of words in the text. Note that words can be separated by multiple spaces.
     *
     * @param firstString string.
     * @return returns the number of words in a string.
     */
    static int receiveTheNumberOfWordsInAText(@NotNull String firstString) {
        String[] arrayOfTheNumberOfWordsInAText = firstString.trim().split(" ");

        int numberWords = 0;

        for (String word : arrayOfTheNumberOfWordsInAText) {
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
     *
     * @param firstString surname and first name.
     * @return returns uppercase initials.
     */
    static @NotNull String receiveInitials(@NotNull String firstString) {
        String[] arrayOfInitials = firstString.toUpperCase().split(" ");

        return arrayOfInitials[0].charAt(0) + arrayOfInitials[1].substring(0, 1);
    }

    /**
     * Task 14.
     * Return a string that contains all the digits in the text.
     *
     * @param firstString string.
     * @return a string with all the numbers from the text.
     */
    @Contract(pure = true)
    static @NotNull String receiveAllNumbersFromText(@NotNull String firstString) {
        return firstString.replaceAll("\\D", "");
    }

    /**
     * Task 15*.
     * Return only those characters of two words that are in only one of them,
     * including duplicates. For example, if the given words are information and motivation,
     * then the answer should be: nfrtv.
     *
     * @param firstString  first string.
     * @param secondString second string.
     * @return different symbols.
     */
    static @NotNull String receiveDifferentSymbols(@NotNull String firstString, @NotNull String secondString) {
        String[] arrayOfFirstStringSymbols = firstString.split("");
        String[] arrayOfSecondStringSymbols = secondString.split("");

        for (int i = 0; i < arrayOfFirstStringSymbols.length; i++) {
            for (int j = 0; j < arrayOfSecondStringSymbols.length; j++) {
                if (arrayOfFirstStringSymbols[i].equals(arrayOfSecondStringSymbols[j])) {
                    arrayOfFirstStringSymbols[i] = "";
                    arrayOfSecondStringSymbols[j] = "";
                    break;
                }
            }
        }

        StringBuilder receiveDifferentSymbols = new StringBuilder();

        for (String word : arrayOfFirstStringSymbols) {
            receiveDifferentSymbols.append(word);
        }

        for (String word : arrayOfSecondStringSymbols) {
            receiveDifferentSymbols.append(word);
        }
        return receiveDifferentSymbols.toString();
    }

    /**
     * Task 16*.
     * Two arrays of strings are given. Determine if the contents of these arrays are identical.
     * The order of the elements does not matter.
     *
     * @param firstArray  first array.
     * @param secondArray second array.
     * @return a boolean value of the results of the comparison
     */
    static boolean receiveArrayEquals(String[] firstArray, String[] secondArray) {
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }

    /**
     * Task 17*.
     * Write two loops that repeatedly add strings, one with the addition operator and String,
     * and the other with a StringBuilder and the append method. Compare the speed of their execution.
     *
     * @param firstString       first string.
     * @param secondString      second string.
     * @param rowSummationCount number of summations.
     * @return rows with the results of the execution in milliseconds.
     */
    static @NotNull String receiveExecutionSpeed(String firstString, String secondString, long rowSummationCount) {
        StringBuilder builder = new StringBuilder();

        long startComparingTheWorkOfTheFirstCycle = System.currentTimeMillis();
        for (int i = 0; i < rowSummationCount; i++) {
            firstString.concat(secondString);
        }
        long endOfComparisonOfTheWorkOfTheFirstCycle = System.currentTimeMillis();

        long startComparingTheWorkOfTheSecondCycle = System.currentTimeMillis();
        for (int i = 0; i < rowSummationCount; i++) {
            builder.append(firstString).append(secondString);
        }
        long endOfComparisonOfTheWorkOfTheSecondCycle = System.currentTimeMillis();

        return (
                (endOfComparisonOfTheWorkOfTheFirstCycle - startComparingTheWorkOfTheFirstCycle)
                        + "\nSpeed String Builder: "
                        + (endOfComparisonOfTheWorkOfTheSecondCycle - startComparingTheWorkOfTheSecondCycle));
    }

    /**
     * Task 18*.
     * Replace several consecutive identical characters in a string with one. For example: aaabbcdeef → abcdef
     *
     * @param firstString string.
     * @return a string without consecutive characters.
     */
    @Contract(pure = true)
    static @NotNull String receiveStringWithoutRepeatingCharacters(@NotNull String firstString) {
        return (firstString.replaceAll("(.)\\1+", "$1"));
    }

    /**
     * Task 19**.
     * <li>Convert a string containing a Roman notation for a number to an Arabic notation for a number.</li>
     * <li>Number limits: from 1 to 3999.</li>
     * <li>Provide for the case when the smaller character comes before the larger one, for example: CM == 900.</li>
     *
     * @param romanNumerals roman notation for a number.
     * @return arabic notation for a number.
     */
    static @NotNull String receiveConversionToArabicNumerals(@NotNull String romanNumerals) {
        int[] array = new int[romanNumerals.trim().length()];

        for (int i = 0; i < array.length; i++) {
            switch (romanNumerals.toUpperCase().charAt(i)) {
                case 'M':
                    array[i] = 1000;
                    break;
                case 'D':
                    array[i] = 500;
                    break;
                case 'C':
                    array[i] = 100;
                    break;
                case 'L':
                    array[i] = 50;
                    break;
                case 'X':
                    array[i] = 10;
                    break;
                case 'V':
                    array[i] = 5;
                    break;
                case 'I':
                    array[i] = 1;
                    break;
            }
        }
        int translationOfArabicNumerals = array[0];

        for (int i = 0; i + 1 < array.length; i++) {
            if (array[i] >= array[i + 1]) {
                translationOfArabicNumerals += array[i + 1];
            } else {
                translationOfArabicNumerals += (array[i + 1] - (array[i] * 2));
            }
        }
        return "" + translationOfArabicNumerals;
    }
}
