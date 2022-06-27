package com.rakovets.course.java.core.practice.strings;

public class StringUtil {

    public String joinTwoStrings(String string1, String string2) {
        return string1 + string2;
    }

    public int findIndex(String currentString, String userString) {
        return currentString.indexOf(userString);
    }

    public boolean compareTwoStrings(String string1, String string2) {
        return string1.equals(string2);
    }

    public String deleteSpacesAndChangeToLowerCase(String currentString) {
        return (currentString.trim()).toLowerCase();
    }

      public String getCharsFromToExactChar(String currentString, int startExtractingIndex, int endExtractingIndex, int startCounterIndex) {
        char[] result = new char[endExtractingIndex - startExtractingIndex];
        currentString.getChars(startExtractingIndex, endExtractingIndex, result, startCounterIndex);
        String finalString = new String(result);
        return finalString;
    }

    public String replaceSadEmojiWithGladEmoji(String currentString) {
        return currentString.replace(":(", ":)");
    }

    public boolean compareStartAndEndWord(String text, String word) {
        return (text.startsWith(word) && text.endsWith(word));
    }

       public int countNumberOfVowels(String givenString) {
        char[] vowels = new char[]{'a', 'A', 'e', 'E', 'y', 'Y', 'u', 'U', 'i', 'I', 'o', 'O'};
        char[] arrayToCheck = givenString.toCharArray();
        int counter = 0;
        for (char char1 : arrayToCheck) {
            for (char char2 : vowels) {
                if (char1 == char2) {
                    counter++;
                }
            }

        }

        return counter;
    }

    public int countNumberOfPunctuationMarks(String givenString) {
        char[] punctuationMarks = new char[]{'.', ',', '?', '!', ';', ':', '/', '-', '"', '[', ']', '(', ')'};
        char[] arrayToCheckForPunctuation = givenString.toCharArray();
        int counter = 0;
        for (char firstCheck : arrayToCheckForPunctuation) {
            for (char secondCheck : punctuationMarks) {
                if (firstCheck == secondCheck) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public boolean isTheStringPalindrome (String theStringToCheck) {
        StringBuffer reverseVersion = new StringBuffer(theStringToCheck).reverse();
        String reversedTheStringToCheck = reverseVersion.toString();
        return theStringToCheck.equalsIgnoreCase(reversedTheStringToCheck);
    }
}

