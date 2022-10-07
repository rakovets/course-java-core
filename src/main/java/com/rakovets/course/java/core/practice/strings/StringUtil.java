package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String glueStrings(String string1, String string2) {
        return string1 + string2;
    }
    public int getIndexOfSymbolInString(String string, char symbol) {
        return (string == null || string.isEmpty()) ? -1 : string.indexOf(symbol);
        }

    public boolean isStringsTheSame(String string1, String string2) {
        return  (string1  != null && string2 != null) ? string1.equals(string2) : false;
    }
    public String trimStringAndUpperCase(String string) {
        return  string != null ? (string.trim()).toUpperCase() : null;
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
        }  else {
            numberOfEnglishVowels = -1;
        }
        return numberOfEnglishVowels;
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
        } else {
            numberOfPunctuationMarks = -1;
        }
        return numberOfPunctuationMarks;
    }
    public boolean isStringPalindrome(String string) {
        StringBuffer buffer = new StringBuffer(string);
        for (int i = 0; i < buffer.length(); i++) {
            if (buffer.charAt(i) == ' ') {
                buffer.deleteCharAt(i);
                i--;
            }
        }
        String str1 = new String(buffer);
        String str2 = new String(buffer.reverse());
        return str1.equalsIgnoreCase(str2);
    }
    public String[] splitStringForEqualParts(String string, int numberOfSymbols) {
        String[] stringArrayOfWords = new String[string.length() / numberOfSymbols];
        for (int i = 0; i < string.length() / numberOfSymbols; i++) {
            stringArrayOfWords[i] = string.substring(numberOfSymbols * i, numberOfSymbols * (i + 1));
        }
        return stringArrayOfWords;
    }
    public int getNumbersOfWordsInString(String string) {
        String stringTrimmed = string.trim();
        int numbersOfWordsInString = 0;
        if (!stringTrimmed.isEmpty()) {
            numbersOfWordsInString++;
            for (int i = 0; i < (stringTrimmed.length()); i++) {
                if (stringTrimmed.charAt(i) == ' ' && stringTrimmed.charAt(i - 1) != ' ') {
                    numbersOfWordsInString++;
                }
            }
        }
        return numbersOfWordsInString;
    }
    public String getFirstLettersOfNameAndSurname(String string) {
        String stringTrimmed = string.trim();
        StringBuffer firstLettersOfNameAndSurname = new StringBuffer();
        firstLettersOfNameAndSurname.append(stringTrimmed.charAt(0));
        for (int i = 1; i < (stringTrimmed.length()); i++) {
            if ((stringTrimmed.charAt(i - 1) == ' ') && (stringTrimmed.charAt(i) != ' ')) {
                firstLettersOfNameAndSurname.append(stringTrimmed.charAt(i));
                break;
            }
        }
        return firstLettersOfNameAndSurname.toString().toUpperCase();
    }
    public String getOnlyNumberFromString(String string) {
        StringBuffer numbersOnlyFromString = new StringBuffer();
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
                    numbersOnlyFromString.append(string.charAt(i));
            }
        }
        return numbersOnlyFromString.toString();
    }
}
