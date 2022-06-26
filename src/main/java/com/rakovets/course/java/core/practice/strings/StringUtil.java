package com.rakovets.course.java.core.practice.strings;

public class StringUtil {

    //Task 1
    public String concatTwoStrings(String one, String two) {
        return one + two;
    }

    //Task 2
    public int findStringSymbolIndex(String one, char x) {
        int index = 0;
        if (index < one.length()) {
            index = one.indexOf(x);
        } else {
            index = -1;
        }
        return index;
    }

    //Task 3
    public boolean isStringsEquals(String one, String two) {
        return one.equals(two);
    }

    //Task 4
    public String stringTrimAndUpperCase(String one) {
        return one.trim().toUpperCase();
    }

    //Task 5
    public String removeSubstring(String one, int fromIndex, int toIndex) {
        return one.substring(fromIndex, toIndex);
    }

    //Task 6
    public String replaceSadFaceInString(String one) {
        return one.replace(":(", ":)");
    }

    //Task 7
    public boolean isStringStartAndFinishWith(String text, String word) {
        return text.regionMatches(0, word, 0, word.length() - 1) &&
                (text.regionMatches(text.length() - word.length(), word, 0, word.length() - 1));
    }

    //Task 8
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

    //Task 9
    public int specialSymbolsCounterInString(String one) {
        int specialSymbolsCounter = 0;
        for (char c : one.toCharArray()) {
            if (c == '.' || c == ',' || c == '!' || c == '?') {
                specialSymbolsCounter++;
            }
        }
        return specialSymbolsCounter;
    }

    //Task 10
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

    //Task 11
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

    //Task 12
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

    //Task 13
    public String parseInitialsFromNameAndSurname(String one) {
        String[] arrayOfInitials = one.trim().toUpperCase().split(" ");
        return arrayOfInitials[0].charAt(0) + arrayOfInitials[1].substring(0,1);
    }

    //Task 14
    public String parseDigitsFromString(String one) {
        return one.replaceAll("\\D", "");
    }

}
