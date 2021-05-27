package com.rakovets.course.java.core.practice.string;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    public String concatforstring(String str1, String str2) {
        return str1.concat(str2);
    }

    public int findIndexOf(String symbol, String text) {
        return text.indexOf(symbol);
    }

    public boolean SimularStrings(String first, String second) {
        return first.equals(second);
    }

    public String lowerCaseAndNoEmptySpaces(String nospaces) {
        return nospaces.toLowerCase(Locale.ROOT).trim();
    }

    public String substring(String placeForRetrieving, int start, int end) {
        return placeForRetrieving.substring(start, end);
    }

    public String replaces(String placeforchanging, String first, String second) {
        return placeforchanging.replace(first, second);
    }

    public boolean checkForWord(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    public int amountOfLetters(String text) {
        int letters = 0;
        Pattern pattern = Pattern.compile("[EeUuIiOoAa]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            letters++;
        }
        return letters;
    }

    public int amountOfSymbols(String text) {
        int symbols = 0;
        Pattern pattern = Pattern.compile("[,.?!]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            symbols++;
        }
        return symbols;
    }

    public boolean checkForInversion(String text) {
        String nospaces = text.replaceAll("\\s+", "");
        StringBuilder test = new StringBuilder(text.replaceAll("\\s+", ""));
        test.reverse();
        return nospaces.equalsIgnoreCase(String.valueOf(test));
    }

    public String[] partsofwords(String text, int amountofparts) {
        return text.split("(?<=\\G.{" + amountofparts + "})");
    }

    public int amountOfWords(String text) {
        int words = 1;
        Pattern pattern = Pattern.compile("\\s+[\\w]");
        Matcher matcher = pattern.matcher(text);
        if (text.equals("") || (text.equals(" ")))
            return 0;
        while (matcher.find()) {
            words++;
        }
        return words;
    }

    public String FL(String text) {
        StringBuilder FirstLetter = new StringBuilder();
        String[] neededtosave = text.split("\\s");
        for (String need : neededtosave) {
            FirstLetter.append(need.substring(0, 1).toUpperCase());
        }
        return FirstLetter.toString();
    }

    public int amountOfDigit(String text) {
        int digit = 0;
        Pattern pattern = Pattern.compile("[\\d]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            digit++;
        }
        return digit;
    }
}
