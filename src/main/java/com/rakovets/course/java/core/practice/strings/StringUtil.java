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
        char[] checkForPunctuation = givenString.toCharArray();
        int counter = 0;
        for (char firstCheck : checkForPunctuation) {
            for (char secondCheck : punctuationMarks) {
                if (firstCheck == secondCheck) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public boolean isTheStringPalindrome(String stringToCheck) {
        StringBuffer reverseVersion = new StringBuffer(stringToCheck).reverse();
        String reversedTheStringToCheck = reverseVersion.toString();
        return stringToCheck.equalsIgnoreCase(reversedTheStringToCheck);
    }

    public static String[] divideIntoEqualParts(String givenString, int index) {
        return givenString.split("(?<=\\G.{" + index + "})");
    }

    public int countNumberWords(String givenString) {
        String whitespace = " ";
        int counter = 0;
        String[] array = givenString.split(whitespace);
        for (String word : array) {
            if (!word.equals("")) {
                counter++;
            }
        }
        return counter;
    }

    public String getInitialsReturnUpperCase (String fullName) {
        String initials = "";
        String whitespace = " ";
        String [] arrayToCheck = (fullName.toUpperCase()).split(whitespace);
        for (String word : arrayToCheck) {
            if (!word.equals("")){
                initials += word.charAt(0);
            }
        }
        return initials;
    }

    public String getAllNumbers (String currentString) {
        return currentString.replaceAll("[^0-9]", "");
    }
}
