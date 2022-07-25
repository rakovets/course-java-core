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

    public boolean stringPalindrome(String text) {
        boolean resultCheckPalidrome;
        if (text == null || text.isEmpty()) {
           return false;
        }

        text = text.replace(" ", "");
        if (text.isEmpty()) {
            return false;
        }

        StringBuilder textReverse = new StringBuilder(text);
        textReverse = textReverse.reverse();
        resultCheckPalidrome = text.equalsIgnoreCase(textReverse.toString());

        return resultCheckPalidrome;
    }

    public String[]  splitStringParts(String text, int n) {
        return text.split("(?s)(?<=\\G.{" + n + "})");
    }

    public int numberStringsText(String text) {
        if (text == null || text.isEmpty() || text == " ") {
            return 0;
        }
        while (text.indexOf("  ") >= 0) {
            text = text.replace("  ", " ");
        }
        String[] textDeleteExtraSpace = text.trim().split(" ");
        return textDeleteExtraSpace.length;
    }

    public String initialsFirstLastNames(String text) {
        while (text.indexOf("  ") >= 0) {
            text = text.replace("  ", " ");
        }
        text = text.trim();
        int lastNameIndex = text.indexOf(" ") + 1;
        char initialFirst = text.charAt(0);
        char initialLast = text.charAt(lastNameIndex);
        String textInitialsFirstLastNames = (new String(new char[] {initialFirst, initialLast})).toUpperCase();
        return textInitialsFirstLastNames;
    }

    public String returnDigitsFromString(String text) {
        while (text.indexOf(" ") >= 0) {
            text = text.replace(" ", "");
        }
        String digitsFromString = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
                digitsFromString = digitsFromString + text.charAt(i);
            }
        }
        return digitsFromString;
    }

}
