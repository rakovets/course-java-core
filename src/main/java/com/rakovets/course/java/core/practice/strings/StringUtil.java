package com.rakovets.course.java.core.practice.strings;

public class StringUtil {

    public String glueText(String str1, String str2) {
        String result = null;

        if (str2 != null) {
            assert str1 != null;
            result = str1.concat(str2);
        }

        return result;
    }

    public int indexOfChar(char x, String str1) {
        int result = -1;

        if (str1 != null) {
            result = str1.indexOf(x);
        }

        return result;
    }

    public boolean equalsStrings(String str1, String str2) {
        boolean result = false;

        if (str1 != null && str2 != null) {
            result = str1.equals(str2);
        }
        if (str1 == null && str2 == null) {
            result = true;
        }

        return result;
    }

    public String trimSpaces(String str1) {
        String result = null;

        if (str1 != null) {
            result = str1.trim();
        }

        return result;
    }

    public String symbolsExtraction(char n, char m, String str1) {
        int beginOfExtraction = str1.indexOf(n);
        int endOfExtraction = str1.indexOf(m) + 1;

        return str1.substring(beginOfExtraction, endOfExtraction);
    }

    public String emojiReplacement(String str1) {
        return str1.replaceAll(":\\(", ":)");
    }

    public boolean startsAndEndsWithWord(String text, String word) {
        boolean isTrue = false;
        String str1 = text.toLowerCase();
        String str2 = word.toLowerCase();

        if (str1.startsWith(str2) && str1.endsWith(str2)) {
            isTrue = true;
        }

        return isTrue;
    }

    public int vowelsCount(String str1) {
        int vowelsCounter = 0;
        String str1LowerCase = str1.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            char charAtI = str1LowerCase.charAt(i);

            if (charAtI == 'a' || charAtI == 'e' || charAtI == 'i' || charAtI == 'o' || charAtI == 'u'
                    || charAtI == 'y') {
                vowelsCounter++;
            }
        }

        return vowelsCounter;
    }

    public int punctuationMarksCount(String str1) {
        int punctuationMarksCounter = 0;
        String str1LowerCase = str1.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            char charAtI = str1LowerCase.charAt(i);

            if (charAtI == '.' || charAtI == ',' || charAtI == '?' || charAtI == '!') {
                punctuationMarksCounter++;
            }
        }

        return punctuationMarksCounter;
    }

    public boolean IsPalindrome(String str1) {
        String str1Modified = str1.toLowerCase().replaceAll("\\W", "");
        String str1ModifiedReversed = new StringBuilder(str1Modified).reverse().toString();

        return str1Modified.equals(str1ModifiedReversed);
    }

    public String[] getArray(int n, String str1) {
        int stringsAmount = str1.length() / n;
        String[] arrayOfStrings = new String[stringsAmount];
        int substringBeginIndex = 0;

        for (int i = 0; i < stringsAmount; i++) {
            String stringTooMassive = str1.substring(substringBeginIndex , n * (i + 1));
            arrayOfStrings[i] = stringTooMassive;
            substringBeginIndex += n;
        }

        return arrayOfStrings;
    }

    public int howManyWords(String str1) {
        int result;

        String[] words = str1.split("\\b");
        result = words.length / 2;

        return result;
    }

    public String initialD(String str1) {
        String result = "";
        String[] textToArray = str1.toUpperCase().split("\\s");

        String nameInitial = String.valueOf(textToArray[0].charAt(0));
        String surnameInitial = String.valueOf(textToArray[1].charAt(0));
        result += nameInitial + surnameInitial;

        return result;
    }

    public String showDigits(String str1) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == '0' || str1.charAt(i) == '1' || str1.charAt(i) == '2' || str1.charAt(i) == '3'
                    || str1.charAt(i) == '4' || str1.charAt(i) == '5' || str1.charAt(i) == '6' || str1.charAt(i) == '7'
                    || str1.charAt(i) == '8' || str1.charAt(i) == '9') {
                result.append(str1.charAt(i));
            }
        }

        return result.toString();
    }

    public String sameSymbols(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        char[] str1SymbolsArray = str1.toCharArray();
        char[] str2SymbolsArray = str2.toCharArray();

        for (int i = 0; i < str1SymbolsArray.length; i++) {
            for (int j = 0; j < str2SymbolsArray.length; j++) {
                if (str1SymbolsArray[i] == str2SymbolsArray[j]) {
                    str1SymbolsArray[i] = 0;
                    str2SymbolsArray[j] = 0;
                }
            }
        }
        for (char c : str1SymbolsArray) {
            if (c != 0) {
                result.append(c);
            }
        }
        for (char c : str2SymbolsArray) {
            if (c != 0) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
