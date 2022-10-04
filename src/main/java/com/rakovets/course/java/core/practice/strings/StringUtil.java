package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String glueStrings(String string1, String string2) {
        return string1 + string2;
    }
    public int getIndexOfSymbolInString(String string, char symbol) {
        if (string != null) {
            return (string.indexOf(symbol) >= 0) ? string.indexOf(symbol) : -1;
        } else {
            return -1;
        }
    }
    public boolean isStringsTheSame(String string1, String string2) {
        if (string1  != null && string2 != null) {
            return string1.equals(string2);
        }
        else {
            return false;
        }
    }
    public String trimStringAndUpperCase(String string) {
        if (string != null) {
            return (string.trim()).toUpperCase();
        }
        else return null;
    }
    public String extractSubstringFromSymbolToSymbol(String string, char symbolStart, char symbolEnd) {
        return string != null ? string.substring(string.indexOf(symbolStart), string.indexOf(symbolEnd)) : null;
    }
    public String replaceEmojiInString(String string) {
        return string != null ? string.replaceAll(":\\(", ":\\)") : null;
    }
    public boolean isStringStartsWithThisWord(String string, String word) {
        return (string != null && word != null) ? string.startsWith(word) : false;
    }
    public int getNumberOfEnglishVowels(String string) {
        int numberOfEnglishVowels = 0;
        if (string != null) {
            for (int i = 0; i < string.length(); i++) {
                switch (string.charAt(i)) {
                    case 'A': case 'E': case 'I': case 'O': case 'U': case 'Y': case 'a': case 'e': case 'i': case 'o': case 'u': case 'y':
                        numberOfEnglishVowels++;
                }
            }
            return numberOfEnglishVowels;
        }  else {
            return -1;
        }
    }
    public int getNumberOfPunctuationMarks(String string) {
        int numberOfPunctuationMarks = 0;
        if (string != null) {
            for (int i = 0; i < string.length(); i++) {
                switch (string.charAt(i)) {
                    case '.': case ',': case '?': case '!':
                        numberOfPunctuationMarks++;
                };
            }
            return numberOfPunctuationMarks;
        } else {
            return -1;
        }
    }
    public boolean isStringPalindrome(String string) {
        if (string != null) {
            StringBuffer bufferReversed = new StringBuffer(string.length());
            return string.equals(new String(bufferReversed.append(string).reverse()));
        } else {
            return false;
        }
    }

    public String[] splitStringForEqualParts(String string, int numberOfSymbols) {
        if (string != null || string.length() >= numberOfSymbols) {
            String[] stringArray = new String[string.length() / numberOfSymbols];
            for (int i = 0; i < string.length() / numberOfSymbols; i++) {
                stringArray[i] = string.substring(numberOfSymbols * i, numberOfSymbols * (i + 1));
            }
            return stringArray;
        } else {
            return null;
        }
    }
    public int getNumbersOfWordsInString(String string) {
        if (string != null) {
            String stringTrimmed = string.trim();
            int numbersOfWordsInString = 0;
            if (!stringTrimmed.isEmpty()) {
                numbersOfWordsInString++;
                for (int i = 1; i < (stringTrimmed.length() - 1); i++) {
                    if (stringTrimmed.charAt(i) == ' ' && stringTrimmed.charAt(i - 1) != ' ') {
                        numbersOfWordsInString++;
                    }
                }
            }
            return numbersOfWordsInString;
        } else {
            return -1;
        }
    }
    public String getFirstLettersOfNameAndSurname(String string) {
        if (string != null) {
            final int NUMBER_OF_WORDS_IN_FULL_NAME = 2;
            String stringTrimmed = string.trim();
            StringBuffer firstLetters = new StringBuffer();
            if (!stringTrimmed.isEmpty()) {
                int indexOfFirstLetterInWord = 0;
                firstLetters.append(stringTrimmed.charAt(indexOfFirstLetterInWord));
                for (int i = 1; i < NUMBER_OF_WORDS_IN_FULL_NAME; i++) {
                    for (int j = indexOfFirstLetterInWord +1; j < (stringTrimmed.length() - 1); j++) {
                        if ((stringTrimmed.charAt(j) == ' ') && (stringTrimmed.charAt(j + 1) != ' ')) {
                            indexOfFirstLetterInWord = j + 1;
                            firstLetters.append(stringTrimmed.charAt(indexOfFirstLetterInWord));
                            break;
                        }
                    }
                }
            }
            return firstLetters.toString().toUpperCase();
        } else {
            return null;
        }
    }
    public String getOnlyNumberFromString(String string) {
        if (string != null) {
            StringBuffer numbersOnly = new StringBuffer();
            if (!string.isEmpty()) {
                for (int i = 0; i < string.length(); i++) {
                    switch (string.charAt(i)) {
                        case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
                            numbersOnly.append(string.charAt(i));
                    }
                }
            }
            return numbersOnly.toString();
        } else {
            return null;
        }
    }
}
