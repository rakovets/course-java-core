package com.rakovets.course.java.core.practice.strings;

public class StringUtil {

    public String concatTwoStrings(String one, String two) {
        return one + two;
    }

    public int findStringSymbolIndex(String one, char x) {
        return one.indexOf(x);
    }

    public boolean isStringsEquals(String one, String two) {
        return one.equals(two);
    }

    public String stringTrimAndUpperCase(String one) {
        return one.trim().toUpperCase();
    }

    public String removeSubstring(String one, int fromIndex, int toIndex) {
        return one.substring(fromIndex, toIndex);
    }

    public String replaceSadFaceInString(String one) {
        return one.replace(":(", ":)");
    }

    public boolean isStringStartAndFinishWith(String text, String word) {
        return text.regionMatches(0, word, 0, word.length() - 1) &&
                (text.regionMatches(text.length() - word.length(), word, 0, word.length() - 1));
    }

    public int vowelsCounterInString(String one) {
        int vowelsCounter = 0;
        for (char c : one.toCharArray()) {
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                vowelsCounter++;
            }
        }
        return vowelsCounter;
    }

    public int specialSymbolsCounterInString(String one) {
        int specialSymbolsCounter = 0;
        for (char c : one.toCharArray()) {
            if (c == '.' || c == ',' || c == '!' || c == '?') {
                specialSymbolsCounter++;
            }
        }
        return specialSymbolsCounter;
    }

    public boolean isStringPalindrome(String one) {
        boolean result;
        if (one.length() > 0) {
            String lowerCase = one.toLowerCase();
            StringBuilder stringBuffer = new StringBuilder(lowerCase);
            stringBuffer.reverse();
            result = lowerCase.equals(stringBuffer.toString());
        } else result = false;
        return result;
    }

    public String[] stringSplitToArrays(String one, int symbolsPerString) {
        int arrayLength = 0;
        if (one.length() % symbolsPerString == 0) {
            arrayLength += one.length() / symbolsPerString;
        } else {
            arrayLength += one.length() / symbolsPerString + 1;
        }
        String[] array = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            if (i == arrayLength - 1) {
                array[i] = one.substring(i * symbolsPerString);
            } else {
                array[i] = one.substring(i * symbolsPerString, i * symbolsPerString + symbolsPerString);
            }
        }
        return array;
    }

    public int wordsInStringCounter(String one) {
        String[] arrayOfWords = one.trim().split(" ");
        int wordsCounter = 0;
        for (String s: arrayOfWords) {
            if (!s.equals("")) {
                wordsCounter++;
            }
        }
        return wordsCounter;
    }

    public String parseInitialsFromNameAndSurname(String one) {
        String[] arrayOfInitials = one.trim().toUpperCase().split(" ");
        return arrayOfInitials[0].charAt(0) + arrayOfInitials[1].substring(0,1);
    }

    public String parseDigitsFromString(String one) {
        return one.replaceAll("\\D", "");
    }

}
