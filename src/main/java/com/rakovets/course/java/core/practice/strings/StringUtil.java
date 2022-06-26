package com.rakovets.course.java.core.practice.strings;

import java.util.Locale;

public class StringUtil {
    //Task 1
    static String concatTwoStrings(String str1, String str2) {
        return str1.concat(str2);
    }

    //Task 2
    static int getIndexOfSymbol(String str1, String symbol) {
        int position;
        if (str1.contains(symbol)) {
            position = str1.indexOf(symbol);
        } else {
            position = -1;
        }
        return position;
    }

    //Task 3
    static boolean compareStringCaseSensitive(String str1, String str2) {
        return str1.equals(str2);
    }

    //Task4
    static String removeSpaceAndUppercase(String str) {
        return str.trim().toUpperCase();
    }

    //Task 5
    static String extractSubstring(String str, int indexOfBeginning, int indexOfEnding) {
        return str.substring(indexOfBeginning, indexOfEnding);
    }

    //Task 6
    static String replaceEmoji(String str, String sadEmoji, String happyEmoji) {
        return str.replace(sadEmoji, happyEmoji);
    }

    //Task 7
    static  boolean receiveIfEndAndBeginningIsWord(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    //Task 8
    static int getNumberOfVowels(String sourceText) {
        int numberOfVowels = 0;
        char[] text = sourceText.toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (char letterOfText : text) {
            for (char letterOfVowels : vowels) {
                if (letterOfText == letterOfVowels) {
                numberOfVowels++;
                }
            }
        }
        return numberOfVowels;
    }

    //Task 9
    static int getNumberOfPunctuationMarks(String sourceText) {
        int numberOfPunctuationMarks = 0;
        char[] text = sourceText.toCharArray();
        char[] punctuationMarks = {'.', ',', ';', ':', '!', '?', '-'};
        for (char symbolOfText : text) {
            for (char symbolOfPunctuationMark : punctuationMarks) {
                if (symbolOfText == symbolOfPunctuationMark) {
                    numberOfPunctuationMarks++;
                }
            }
        }
        return numberOfPunctuationMarks;
    }

    //Task 10
    static boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("[!?.,-;: ]", "");
        return text.equals(new StringBuilder(text).reverse().toString());
    }

    //Task 11
    static String[] splitToEqualParts(String text, int symbolsInSubstring) {
        int arrayLength = 0;
        if (text.length() % symbolsInSubstring == 0) {
            arrayLength += text.length() / symbolsInSubstring;
        } else {
            arrayLength += text.length() / symbolsInSubstring + 1;
        }
        String[] array = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            if (i == arrayLength - 1) {
                array[i] = text.substring(i * symbolsInSubstring);
            } else {
                array[i] = text.substring(i * symbolsInSubstring, i * symbolsInSubstring + symbolsInSubstring);
            }
        }
        return array;
    }

    //Task 12
    static int countWordsNumber(String text) {
        String[] arrayOfWords = text.trim().split(" ");
        int numberWords = 0;
        for (String word: arrayOfWords) {
            if (!word.equals("")) {
                numberWords++;
            }
        }
        return numberWords;
    }

    //Task 13
    static String getInitials(String userName) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : userName.toUpperCase().split(" +")) {
            stringBuilder.append(word.charAt(0));
        }
        return stringBuilder.toString();
    }

    //Task 14
    public static String getNumbers(String str) {
        char [] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        char [] array = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char symbol : array) {
            for (char number : numbers) {
                if (symbol == number) {
                    stringBuilder.append(symbol);
                }
            }
        }
        return stringBuilder.toString();
    }
}
