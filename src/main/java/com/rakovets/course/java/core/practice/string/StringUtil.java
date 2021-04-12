package com.rakovets.course.java.core.practice.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    public String pasteTogether(String str1, String str2) {
        return str1.concat(str2);
    }


    public int findSymbol(String x, String findX) {
        return x.indexOf(findX);
    }

    public boolean equalStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public String trimString(String str) {
        return  str.trim().toLowerCase();
    }


    public String returnNecessaryString(String necessaryString, int startNumber, int endNumber) {
        return necessaryString.substring(startNumber, endNumber);
    }

    public String replaceTheSymbol(String str1234, String replaceSymbol, String insertSymbol) {
        return str1234.replace(replaceSymbol, insertSymbol);
    }

    public boolean startEndAnyway(String text, String word){
        return text.startsWith(word) && text.endsWith(word);
    }

    public int vowelsAmount(String text) {
        Pattern pattern = Pattern.compile("[AaUuEeOoYyIi]");
        Matcher matcher = pattern.matcher(text);
        return (int) matcher.results().count();
    }

    public int punctSymbolAmount(String text) {
        Pattern pattern = Pattern.compile("[ .,?!]");
        Matcher matcher = pattern.matcher(text);
        return (int) matcher.results().count();
    }

    public boolean palindromeText(String text) {
        String delete = text.replaceAll("\\s", "");
        StringBuilder stringBuilder = new StringBuilder(text.replaceAll("\\s", ""));
        stringBuilder.reverse();
        return delete.equalsIgnoreCase(String.valueOf(stringBuilder));
    }

    public int numberOfWords(String str12345) {
        int words = 0;
        Pattern pattern = Pattern.compile("(\\s*)(\\w+)(\\s*)");
        Matcher matcher = pattern.matcher(str12345);
        while (matcher.find()) {
            words++;
        }
        return words;
    }

    public int digitInText(String str16) {
        int digitCount = 0;
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(str16);
        while (matcher.find()) {
            digitCount++;
        }
        return digitCount;
    }
}
