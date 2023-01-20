package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String concatTwoValues(String firstValue, String secondValue) {
        return firstValue.concat(secondValue);
    }

    public int getCharIndexFromText(String text, char character) {
        return text.indexOf(character);
    }

    public boolean isTwoStringValuesEqual(String firstValue, String secondValue) {
        return firstValue.equals(secondValue);
    }

    public String stringValueTrim(String value) {
        return value.trim();
    }

    public String getSubstringFromStringValue(String text, char startChar, char finishChar) {
        int firstSymbolIndex = 0;
        int secondSymbolIndex = 0;
        char[] chars = text.toCharArray();
        for (int index = 0; index < chars.length; index++) {
            if (chars[index] == startChar) {
                firstSymbolIndex = index;
            } else if(chars[index] == finishChar) {
                secondSymbolIndex = index;
            }
        }
        return text.substring(firstSymbolIndex, secondSymbolIndex + 1);
    }

    public String replaceSadToCarefulEmoji(String stringWithEmoji) {
        return stringWithEmoji.replaceAll(":\\(", ":)");
    }

    public boolean isWordStartsAndEndsString(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    public int amountVowelsInString(String text) {
        return getAmountNeedCharactersInString(text, "aeiouy");
    }

    public int amountSpecialCharacterInString(String text) {
        return getAmountNeedCharactersInString(text, ".,?!");
    }

    public boolean isPalindromeString(String text) {
        String actualText = getTextWithoutSpaces(text).toLowerCase();
        String reverseText = new StringBuilder(getTextWithoutSpaces(text)).reverse().toString().toLowerCase();
        return actualText.equals(reverseText);
    }

    public String[] cutStringToEqualParts(String text, int partLength) {
        int numberTextParts = text.length() / partLength;
        String[] textParts = new String[numberTextParts];
        if(text.length() % partLength == 0) {
            int firstIndexPart = 0;
            for (int i = 0; i < numberTextParts; i++) {
                textParts[i] = text.substring(firstIndexPart, firstIndexPart + partLength);
                firstIndexPart += partLength;
            }
        }
        return textParts;
    }

    public int countWordsInText(String text) {
        String refactorText = text.replaceAll("\\s+", " ").trim();
        return refactorText.split(" ").length;
    }

    public String getNameInitials(String value) {
        StringBuilder initials = new StringBuilder();
        String[] nameSurname = value.split(" ");
        for (String str : nameSurname) {
            initials.append(String.valueOf(str.charAt(0)).toUpperCase());
        }
        return String.valueOf(initials);
    }

    public String getAllNumbersFromText(String text) {
        StringBuilder numbers = new StringBuilder();
        String[] numbersArray = text.split("\\D+");
        for (String number : numbersArray) {
            numbers.append(number);
        }
        return String.valueOf(numbers);
    }

    private int getAmountNeedCharactersInString(String text, String charactersList) {
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

    private String getTextWithoutSpaces(String text) {
        return text.replaceAll("\\s", "");
    }
}
