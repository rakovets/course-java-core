package com.rakovets.course.java.core.practice.strings;

import java.util.Arrays;

import java.awt.desktop.AboutEvent;

public class StringUtil {
    private final String SPACE = " ";

    public String union(String firstString, String secondString) {
        return firstString.concat(secondString);
    }

    public int findIndexOfSymbol(String string, char symbol) {
        return string.indexOf(symbol);
    }

    public boolean compare(String firstString, String secondString) {
        return firstString.equals(secondString);
    }

    public String makeToUppercase(String string) {
        String result = string.trim();
        return result.toUpperCase();
    }

    public String makeNewString(String string, int beginIndex, int endIndex) {
        return string.substring(beginIndex, endIndex);
    }

    public String makeFunnyEmoji(String string) {
        return string.replace(":(", ":)");
    }

    public boolean isEndAndStartWithWord(String string, String word) {
        return (string.startsWith(word) && string.endsWith(word));
    }

    public boolean checkEnglishLetters(String string) {
        char[] chars = string.toCharArray();
        for (char c : chars) {
            if (c >= 'A' && c <= 'z') {
                return true;
            }
        }
        return false;
    }

    public int getCountPunctuationMarks(String string) {
        int count = 0;
        char[] chars = string.toCharArray();
        for (char c : chars) {
            if (c == '!' || c == '.' || c == ',' || c == '?') {
                count++;
            }
        }
        return count;
    }

    public boolean isPalindrome(String string) {
        boolean result = false;
        StringBuilder clearString = new StringBuilder(string.length());
        for (int i = 0; i < string.length(); i++) {
            char symb = string.charAt(i);
            if (Character.isAlphabetic(symb) || Character.isDigit(symb)) {
                clearString.append(symb);
            }
        }
        char[] chars = clearString.toString().toLowerCase().toCharArray();
        int count = chars.length - 1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == chars[count]) {
                result = true;
            } else {
                return false;
            }
            count--;
        }
        return result;
    }

    public String[] splitStringIntoParts(String string, int countSymbolsInParts) {
        return string.split("(?<=\\G.{" + countSymbolsInParts + "})");
    }

    public int getCountOfWord(String string) {
        int count = 0;
        String[] array = string.split(SPACE);
        for (String word : array) {
            if (!word.equals("")) {
                count++;
            }
        }
        return count;
    }

    public String getInitials(String string) {
        String result = "";
        String[] array = string.split(SPACE);
        for (String word : array) {
            if (!word.equals("")) {
                result += word.toUpperCase().charAt(0);
            }
        }
        return result;
    }

    public String getStringWithAllDigits(String string) {
        char[] chars = string.toCharArray();
        int digit = 48;
        boolean agreem = true;
        while (agreem) {
            for (char symb : chars) {
                if (symb == digit) {
                    digit++;
                }
            }
            if (digit == 58) {
                break;
            }
        }
        return string;
    }

    public String getDifferentLetters(String firstString, String secondString) {
        char[] charsFirst = firstString.toCharArray();
        char[] charsSecond = secondString.toCharArray();
        String result = "";
        for (int i = 0; i < firstString.length(); i++) {
            for (int j = i + 1; j < firstString.length(); j++) {
                if (charsFirst[i] == charsFirst[j]) {
                    result += charsFirst[j];
                    break;
                }
            }
            for (int j = i + 1; j < secondString.length(); j++) {
                if (charsSecond[i] == charsSecond[j]) {
                    result += charsSecond[j];
                    break;
                }
            }
        }
        for (int j = 0; j < secondString.length(); j++) {
            if (firstString.indexOf(charsSecond[j]) == -1) {
                result += charsSecond[j];
            }
        }
        for (int j = 0; j < firstString.length(); j++) {
            if (secondString.indexOf(charsFirst[j]) == -1) {
                result += charsFirst[j];
            }
        }
        char[] charsResult = result.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(result);
        for (int i = 0; i < result.length(); i++) {
            for (int j = i + 1; j < result.length(); j++) {
                if (charsResult[i] == charsResult[j]) {
                    stringBuffer.deleteCharAt(stringBuffer.toString().indexOf(charsResult[j]));
                    stringBuffer.deleteCharAt(stringBuffer.toString().indexOf(charsResult[i]));
                }
            }
        }
        return stringBuffer.toString();
    }

    public boolean isElemetsSame(String[] firstArray, String[] secondArray) {
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray, secondArray);
    }

    public String makeShorter(String string) {
        char[] chars = string.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1) {
                result += chars[i];
                break;
            }
            if (chars[i] != chars[i + 1]) {
                result += chars[i];
            }
        }
        return result;
    }

    public String calculateLatinDates(String string) {
        char[] chars = string.trim().toUpperCase().toCharArray();
        int[] latinDigits = new int[string.trim().length()];
        String result = "";
        int intResult = 0;
        for (int i = 0; i < latinDigits.length; i++) {
            switch (chars[i]) {
                case 'M':
                    latinDigits[i] = 1000;
                    break;
                case 'D':
                    latinDigits[i] = 500;
                    break;
                case 'C':
                    latinDigits[i] = 100;
                    break;
                case 'L':
                    latinDigits[i] = 50;
                    break;
                case 'X':
                    latinDigits[i] = 10;
                    break;
                case 'V':
                    latinDigits[i] = 5;
                    break;
                case 'I':
                    latinDigits[i] = 1;
                    break;
            }
        }
        for (int i = 0; i + 1 < latinDigits.length; i++) {
            if (latinDigits[i] >= latinDigits[i + 1]) {
                intResult += latinDigits[i];
            } else {
                intResult += latinDigits[i + 1] - latinDigits[i];
            }
        }
        return result + intResult;
    }
}
