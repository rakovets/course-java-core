package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String glue(String str1, String str2) {
        return str1.concat(str2);
    }

    public int index(String str) {
        return str.indexOf("x");
    }

    public boolean equal(String str1, String str2) {
        return str1.equals(str2);
    }

    public String upperCase(String str) {
        return str.trim().toUpperCase();
    }

    public String subString(String str) {
        return str.substring(int n, int m);
    }

    public String replace(String str) {
        return str.replace(":(", ":)");
    }

    public boolean startEnd(String str) {
        return str.startsWith("text") && str.endsWith("word");
    }

    public int englishVowels(String str) {
        char[] vowels = new char[]{"a", "e", "i", "o", "u", "y"};
        char[] arrayStr = str.toLowerCase().toCharArray();
        int counter = 0;
        for (int i : vowels) {
            for (int j : arrayStr) {
                if (i == j) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public int punctuationMarks(String str) {
        char[] marks = new char[]{".", ",", "?", "!"};
        char[] arrayStr = str.toLowerCase().toCharArray();
        int counter = 0;
        for (int i : marks) {
            for (int j : arrayStr) {
                if (i == j) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public String palindrome(String str1) {
        StringBuffer buffer = new StringBuffer(str1);
        String str2 = buffer.reverse().toString();
        return str1.equalsIgnoreCase(str2) ? "It is palindrome!" : "It is not palindrome!";
    }

    public String[] stringSplitting(String str, int substringLength) {
        int numberSubstrings = str.length() / substringLength;
        String[] substrings = new String[numberSubstrings];
        int indexSplit = 0;
        for (int i = 0; i < numberSubstrings; i++) {
            substrings[i] = str.substring(indexSplit, indexSplit + substringLength);
            indexSplit += substringLength;
        }
        return substrings;
    }

    public int wordCount(String str) {
        int counter = str.trim().split("[\\s]+").length
        return counter;
    }

    public String initials (String str) {
        String initials = "";
        String[] firstSecondName = str.toUpperCase().trim().split(" ");
        for (String i : firstSecondName) {
            initials += i.charAt(0);
        }
        return  initials;
    }

    public String numbers(String str) {
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
        return stringBuffer.toString();
    }
}








