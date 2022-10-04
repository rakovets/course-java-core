package com.rakovets.course.java.core.practice.strings;

public class StringUtil {

    public String glueStrings(String firstString, String secondString) {
        return firstString.concat(secondString);
    }

    public int getIndexOfChar(String str, char c) {
        int index;
        if (str.contains(String.valueOf(c))) {
            index = str.indexOf(c);
        } else {
            index = -1;
        }
        return index;
    }

    public boolean compareStringCaseSensitive(String firstString, String secondString) {
        return firstString.equals(secondString);
    }

    public String removeStartEndSpacesConvertToUpperCase(String str) {
        return str.strip().toUpperCase();
    }

    public String extractSubstringBetweenIndexes(String str, int firstIndex, int lastIndex) {
        return str.substring(firstIndex, lastIndex);
    }

    public String changeSmileSadToHappy(String str) {
        final String SAD_SMILE = ":(";
        final String HAPPY_SMILE = ":)";

        return str.replace(SAD_SMILE, HAPPY_SMILE);
    }

    public boolean checkStringStartEndWithWord(String text, String word) {
        boolean actualResult = text.startsWith(word) || text.endsWith(word);
        return actualResult;
    }

    public int countNumberOfVowels(String str) {
        int count = 0;
        String conversionToLowerCase = str.toLowerCase();

        for (int i = 0; i < conversionToLowerCase.length(); i++) {
            if (conversionToLowerCase.charAt(i) == 'a' || conversionToLowerCase.charAt(i) == 'e'
                    || conversionToLowerCase.charAt(i) == 'i'
                    || conversionToLowerCase.charAt(i) == 'o'
                    || conversionToLowerCase.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public int countPunctuationMarks(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == ','
                    || str.charAt(i) == '?'
                    || str.charAt(i) == '!') {
                count++;
            }
        }
        return count;
    }

    public boolean checkPalindrome(String str) {
        boolean resultCheckPalindrome = false;
        StringBuilder reverseStrB = new StringBuilder();
        String reverseWord = String.valueOf(reverseStrB.append(str).reverse());

        if (str.equals(reverseWord)) {
            resultCheckPalindrome = true;
        }
        return resultCheckPalindrome;
    }

    public String[] splitStringByDefinedNumberElements(String str, int chunkSize) {
        String[] chunks = str.split("(?<=\\G.{" + chunkSize + "})");
        return chunks;
    }

    public int countWordsUsingSplit(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }

    public String extractFirstLettersNameSurnameToUpperCase(String nameSurname) {
        String firstLettersNameSurname = nameSurname.replaceAll("^\\s*([a-zA-Z]).*\\s+([a-zA-Z])\\S+$", "$1$2").toUpperCase();
        return firstLettersNameSurname;
    }

    public String extractDigitsFromString(String str) {
        String digits = str.replaceAll("[^0-9]", "");
        return digits;
    }
}
