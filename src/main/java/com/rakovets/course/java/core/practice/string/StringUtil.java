package com.rakovets.course.java.core.practice.string;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//task 1
public class StringUtil {
    static String glue(String str1, String str2) {
        return str1.concat(str2);
    }
//task 2
    static int symbolIndex(String str1,String str2) {
        return str1.indexOf(str2);
    }
//task 3
    static boolean stringComparison(String str1,String str2) {
        return str1.equals(str2);
    }
//task 4
    static String trimAndUpperCase(String str1) {
        str1 = str1.trim();
        return str1.toUpperCase();
    }
//task 5
    static String stringRetrieval(String str,int startIndex,int endIndex) {
        return str.substring(startIndex,endIndex);
    }
//task 6
    static String replaceSmyles(String str,String letter1,String letter2) {
        return str.replace(letter1,letter2);
    }
//task 7
    static boolean comparisonStartEndLastWords(String text,String word) {
        boolean startWord = text.startsWith(word);
        boolean endWord = text.endsWith(word);
        if (startWord  && endWord ) {
            return true;
        } else {
            return false;
        }

    }
//task 8
    static int numberOfEnglishVowels(String text) {
        int count = 0;
        Pattern pattern = Pattern.compile("[AEIOUYaeiouy]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
//task 9
    static int numberOfPunctuationsMarks(String text) {
        int count = 0;
        Pattern pattern = Pattern.compile("[.,?!]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
//task 10
    static  boolean palindrome(String text) {
        text = text.replaceAll("[ ,.?!-]", "");
        text = text.toLowerCase();
        StringBuffer text1 = new StringBuffer(text);
        return text.contentEquals(text1.reverse());
    }
//task 11
    static String[] splitArray(String text, int n) {
        return text.split("(?<=\\G.{" + n + "})");
    }
//task 12
    static int wordsCount(String text) {
        int count = 0;
        Pattern pattern = Pattern.compile("(\\s*)(\\w+)(\\s*)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
//task 13
    static String initials(String text) {
        text = text.trim();
        String[] array = text.split(" ");
        String text2 = array[0];
        String text3 = array[1];
        text3 = text3.trim();
        char a = text2.charAt(0);
        char b = text3.charAt(0);
        String text4 = "" + a + b;
        return text4.toUpperCase();
    }
//task 14
    static String digitString(String text) {
        String digitString = new String();
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            digitString += matcher.group();
        }
        return digitString;
    }


}


