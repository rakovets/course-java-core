package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    private static final String VOWELS = "aeiouy";
    private static final String SPECIAL_CHARACTERS = ".,?!";

    public static String concatTwoValues(String firstValue, String secondValue) {
        return firstValue.concat(secondValue);
    }

    public static int getCharIndexFromText(String text, char character) {
        return text.indexOf(character);
    }

    public static boolean isTwoStringValuesEqual(String firstValue, String secondValue) {
        return firstValue.equals(secondValue);
    }

    public static String stringValueTrim(String value) {
        return value.trim();
    }

    public static String getSubstringFromStringValue(String value, char n, char m) {
        int firstSymbolIndex = 0;
        int secondSymbolIndex = 0;
        char[] chars = value.toCharArray();
        for (int index = 0; index < chars.length; index++) {
            if (chars[index] == n) {
                firstSymbolIndex = index;
            } else if(chars[index] == m) {
                secondSymbolIndex = index;
            }
        }
        return value.substring(firstSymbolIndex, secondSymbolIndex + 1);
    }

    public static String replaceSadToCarefulEmoji(String stringWithEmoji) {
        return stringWithEmoji.replaceAll(":\\(", ":)");
    }

    public static boolean isWordStartsAndEndsString(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    public static int amountVowelsInString(String text) {
        return getAmountNeedCharactersInString(text, VOWELS);
    }

    public static int amountSpecialCharacterInString(String text) {
        return getAmountNeedCharactersInString(text, SPECIAL_CHARACTERS);
    }

    public static boolean isPalindromeString(String text) {
        String reverseText = new StringBuilder(text).reverse().toString();
        return text.equals(reverseText);
    }

    public static String[] cutStringToEqualParts(String text, int partLength) {
        int numberTextParts = text.length() / partLength;
        String[] textParts = new String[numberTextParts];
        if(text.length() % partLength == 0) {
            int firstIndexPart = 0;
            for (int i = 0; i < numberTextParts; i++) {
                textParts[i] = text.substring(i, i + partLength);
                firstIndexPart += partLength;
            }
        }
        return textParts;
    }

    public static int countWordsInText(String text) {
        String refactorText = text.replaceAll("\\s+", " ").trim();
        return refactorText.split(" ").length;
    }

    public static String getNameInitials(String value) {
        StringBuilder initials = new StringBuilder();
        String[] nameSurname = value.split(" ");
        for (String str : nameSurname) {
            initials.append(String.valueOf(str.charAt(0)).toUpperCase());
        }
        return String.valueOf(initials);
    }

    public static String getAllNumbersFromText(String text) {
        StringBuilder numbers = new StringBuilder();
        String[] numbersArray = text.split("\\D+");
        for (String number : numbersArray) {
            numbers.append(number);
        }
        return String.valueOf(numbers);
    }

    private static int getAmountNeedCharactersInString(String text, String charactersList) {
        String currentChar;
        int vowelsCounter = 0;
        for (Character character : text.toCharArray()) {
            currentChar = character.toString().toLowerCase();
            if (charactersList.contains(currentChar)) {
                vowelsCounter++;
            }
        }
        return vowelsCounter;
    }
}
