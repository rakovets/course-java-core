package com.rakovets.course.java.core.practice.string;

import java.util.Arrays;

public class StringUtil {

    public static String stringConcatenate (String str1, String str2) {
        return str1.concat(str2);
    }

    public static int getIndex (String message, char x) {
        if (x != 0 && message != null) {
            return message.indexOf(x);
        }
        return -1;
    }

    public static boolean stringsEquals (String firstString, String secondString) {
        if (firstString != null && secondString != null) {
            return firstString.equals(secondString);
        }
        return false;
    }

    public static String trimmedUpperCase (String text) {
        if (text != null) {
            return text.trim().toUpperCase();
        }
        return null;
    }

    public static String getSubstring(String text, int firstIndex, int secondIndex) {
        return text.substring(firstIndex, secondIndex);
    }

    public static String replaceSadEmojiToHappyEmoji (String sadEmoji) {
        if (sadEmoji != null) {
            return sadEmoji.replace(":(", ":)");
        }
        return null;
    }

    public static boolean stringIncludeWord (String text, String word) {
        if (text != null && word != null) {
            return (text.startsWith(word) && text.endsWith(word));
        }
        return false;
    }

    public static int englishVowelsCounter (String text) {
        return text.replaceAll("[^aieou]", "").length();
    }

    public static int punctuationMarksCounter (String text) {
        return text.length() - (text.replaceAll("[,.!?]", "").length());
    }

    public static boolean isPalindrome (String text) {
        if (text == null) {
            return false;
        }
        int i = 0, j = text.length() - 1;
        while(i < j) {
            if(text.charAt(i++) != text.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public static String[] splitEqualsParts (String text, int n) {
        if (text != null && n > 0) {
            StringBuilder dividedText = new StringBuilder(text);

            for (int x = n; x < dividedText.length(); ) {
                dividedText.insert(x, "%@#");
                x += n + 3;
            }
            return dividedText.toString().split("%@#");
        }
        return null;
    }

    public static int wordsInTextCounter (String text) {
        int wordsCounter = text.split(" +").length;
        return wordsCounter;
    }

    public static String getInitials (String text) {
        if (text != null) {
            String[] array = text.trim().toUpperCase().split("\\s+");
            char name = array[0].charAt(0);
            char surname = array[1].charAt(0);
            return name + surname + "";
        }
        return null;
    }

    public static String digitsCounter (String text) {
        if (text != null) {
            return text.replaceAll("\\D", "");
        }
        return null;
    }
}
