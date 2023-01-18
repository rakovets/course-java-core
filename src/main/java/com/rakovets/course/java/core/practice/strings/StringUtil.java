package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String glue(String str1, String str2) {
        String refusal = "";
        return (str1 == null || str2 == null) ? refusal : str1.concat(str2);
    }

    public int finedIndexX(String str, char x) {
        int refusal = -1;
        return (str == null || str.isEmpty()) ? refusal : str.indexOf(x);
    }

    public boolean equivalentTo(String str1, String str2) {
        boolean refusal = false;
        return (str1 == null || str2 == null) ? refusal : str1.equalsIgnoreCase(str2);
    }

    public String trimAndToUpper(String str) {
        String refusal = "";
        return (str == null || str.isEmpty()) ? refusal : str.trim().toUpperCase();
    }

    public String extractSubstringFromNtoM(String str, int n, int m) {
        String refusal = "";
        return (str == null || str.isEmpty()) ? refusal : str.substring(n - 1, m);
    }

    public String dontSadSmile(String str) {
        String refusal = "";
        return (str == null || str.isEmpty()) ? refusal : str.replace(":(", ":)");
    }

    public boolean equalFistLastWords(String text, String word) {
        boolean result;
        if (text == null || text.isEmpty()) {
            result = false;
        } else {
            String wordLowerCase = word.toLowerCase();
            String textLowerCase = text.toLowerCase();
            result = textLowerCase.startsWith(wordLowerCase) == textLowerCase.endsWith(wordLowerCase);
        }
        return result;
    }

    public int countVowels(String str) {
        int result;
        if (str == null || str.isEmpty()) {
            result = 0;
        } else {
            char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
            char[] arrayFromString = str.toLowerCase().toCharArray();
            int counter = 0;
            for (int i : vowels) {
                for (int j : arrayFromString) {
                    if (i == j) {
                        counter++;
                    }
                }
            }
            result = counter;
        }
        return result;
    }

    public int countPunctuationMarks(String str) {
        int result;
        if (str == null || str.isEmpty()) {
            result = 0;
        } else {
            char[] vowels = new char[]{'.', ',', '?', '!'};
            char[] arrayFromString = str.toCharArray();
            int counter = 0;
            for (int i : vowels) {
                for (int j : arrayFromString) {
                    if (i == j) {
                        counter++;
                    }
                }
            }
            result = counter;
        }
        return result;
    }

    public boolean isItPalindrome(String str1) {
        boolean result;
        if (str1 == null || str1.isEmpty()) {
            result = false;
        } else {
            str1 = str1.replace(" ", "");
            StringBuffer buffer = new StringBuffer(str1);
            String str2 = buffer.reverse().toString();
            result = str1.equalsIgnoreCase(str2);
        }
        return result;
    }

    public String[] getSubstrings(String str, int lengthSubstring) {
        String[] result;
        if (str == null || str.isEmpty()) {
            result = new String[]{""};
        } else {
            int numberSubstrings = str.length() / lengthSubstring;
            String[] substrings = new String[numberSubstrings];
            int indexCut = 0;
            for (int i = 0; i < numberSubstrings; i++) {
                substrings[i] = str.substring(indexCut, indexCut + lengthSubstring);
                indexCut += lengthSubstring;
            }
            result = substrings;
        }
        return result;
    }

    public int countWords(String str) {
        int result;
        if (str == null || str.isEmpty()) {
            result = 0;
        } else {
            int counter = 0;
            for (String i : str.trim().split(" ")) {
                counter++;
            }
            result = counter;
        }
        return result;
    }

    public String getInitials(String str) {
        String result;
        if (str == null || str.isEmpty()) {
            result = "";
        } else {
            String[] firstSecondName = str.toUpperCase().trim().split(" ");
            String initials = "";
            for (String i : firstSecondName) {
                initials += i.charAt(0);
            }
            result = initials;
        }
        return result;
    }

    public String getAllNumbers(String str) {
        String result;
        if (str == null || str.isEmpty()) {
            result = "";
        } else {
            char[] number = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
            char[] arrayFromString = str.toCharArray();
            StringBuffer stringBuffer = new StringBuffer();
            for (char i : arrayFromString) {
                for (char j : number) {
                    if (i == j) {
                        stringBuffer.append(i);
                    }
                }
            }
            result = stringBuffer.toString();
        }
        return result;
    }
}
