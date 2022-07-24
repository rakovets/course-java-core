package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String concat(String str1, String str2) {
        return str1 +str2;
    }

    public int indexSymbolInString(String str, String symbol) {
        return str.indexOf(symbol);
    }

    public boolean stringComparison(String str1, String str2) {
        return str1.equals(str2);
    }

    public String deleteWhiteSpacesAndMakeUpperCase(String str) {
        return str.toUpperCase().trim();
    }

    public String cutPartString(String str, int indexStart, int indexEnd) {
        return str.substring(indexStart, indexEnd);
    }

    public String replaceEmodjiDance(String str, String emodjiOld, String emodjiNew) {
        return str.replace(emodjiOld, emodjiNew);
    }

    public boolean checkEqualBeginString(String text, String word) {
        return text.startsWith(word);
    }

    public int numberVowelLetter(String text) {
        String textLowerCase = text.toLowerCase();
        int numberVowel = 0;
        for (int i = 0; i < text.length(); i++) {
            switch (textLowerCase.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    numberVowel++;
                    break;
            }
        }
        return numberVowel;
    }

    public int numberPunctuationMark(String text) {
        int numberMark = 0;
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '.':
                case ',':
                case '?':
                case '!':
                    numberMark++;
                    break;
            }
        }
        return numberMark;
    }

    public boolean palindrome(String text) {
        StringBuffer textReverse = new StringBuffer(text);
        return text.equalsIgnoreCase(String.valueOf(textReverse));
    }

}
