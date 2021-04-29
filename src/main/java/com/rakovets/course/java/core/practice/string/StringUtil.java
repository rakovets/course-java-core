package com.rakovets.course.java.core.practice.string;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    static String glue(String str1, String str2) {
        return str1.concat(str2) ;
    }

    static int foundX(String str1) {
        return str1.indexOf('h');
    }

    static boolean equalsValue(String str1, String str2) {
        return str1.equals(str2);
    }

    static String trimUpperCaseString (String str1) {
        String strTrim =str1.trim();
        return strTrim.toUpperCase();
    }

    static String SubstrString(String str1, int n, int m) {
        return str1.substring(n,m);
    }

    static String replaceSmile(String str1) {
        return str1.replace(":(",":)");
    }

    static boolean containsTwoWords(String str1, String word) {

        return str1.startsWith(word) == str1.endsWith(word);
    }

    static int existsVowels(String str1) {
        if (str1 == null) {
            return -1;
        }
        Pattern pattern = Pattern.compile("[eyuioaEYUIOA]");
        Matcher matcher = pattern.matcher(str1);
        return (int) matcher.results().count();
    }

    static int quantityPunctuation(String str1) {
        return str1.length() - str1.replaceAll("[,.!?]", "").length();
    }

    static boolean textPoliandrom(String str1) {
        String reverseStr1 = new StringBuilder(str1).reverse().toString();
        reverseStr1 = reverseStr1.replaceAll("[,.!?\\s]", "");
        return str1.replaceAll("[,.!?\\s]", "").equalsIgnoreCase(reverseStr1);
    }

    static  String[] splitString(String str1, int split) {
        String[] currentSplit = new String[(int)Math.ceil((double)str1.length() / split)];
        for (int i = 0; i < currentSplit.length; i++)
            currentSplit[i] = str1.substring(i * split, Math.min(str1.length(), (i + 1) * split));
        return currentSplit;
    }

    static  int countWorld(String str1) {
        return str1.split(" +").length;
    }

    static String abbreviatedName(String str1) {
        String pattern = "(\\S{1})\\S+\\s(\\S{1})\\S+";
        return str1.replaceAll(pattern, "$1$2").toUpperCase();
    }

    static String searchDigital(String str1) {
        String currentDigital = "";
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(str1);
        while (matcher.find()) {
            currentDigital += str1.substring(matcher.start(), matcher.end());
        }
        return currentDigital;
    }
}
