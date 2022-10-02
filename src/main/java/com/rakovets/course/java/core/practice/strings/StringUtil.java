package com.rakovets.course.java.core.practice.strings;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    public String glue(String str1, String str2) {
        return str1 + str2;
    }

    public int indexSearch(String str, String symbol) {
        return str.indexOf(symbol);
    }

    public boolean sameStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public String modifiedString(String str1) {
        return str1.trim().toLowerCase(Locale.ROOT);
    }

    public String subString(String str1, int firstSymbol, int secondSymbol) {
        return str1.substring(firstSymbol, secondSymbol);
    }

    public String getSmile(String str) {
        return str.replace(":(", ":)");
    }

    public boolean getStartEndAboutWord(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    public int getNumberOfVowelsInAWord(String str1) {
        Pattern vocals = Pattern.compile("(?iu)[aeiyouAEIYOU]");
        Matcher m = vocals.matcher(str1);
        int vocalCounter = 0;
        while (m.find()) {
            vocalCounter++;
        }
        return vocalCounter;
    }

    public int getNumberOfPunctuationMarks(String str1) {
        Pattern vocals = Pattern.compile("(?iu)[.,?!]");
        Matcher m = vocals.matcher(str1);
        int punctuationMarksCounter = 0;
        while (m.find()) {
            punctuationMarksCounter++;
        }
        return punctuationMarksCounter;
    }

    public boolean getIsPalindrome(String str1) {
        str1 = str1.toLowerCase().replaceAll(" ", "").replaceAll("\\p{P}", "");
        StringBuilder reversText = new StringBuilder(str1).reverse();
        return str1.contentEquals(reversText);
    }

    public String[] getBreakAString(String str, int n) {
        String[] arrayOfEqualParts = new String[str.length() / n + ((str.length() % n == 0) ? 0 : 1)];
        int startIndex = 0;
        int arrayIndex = 0;
        while (startIndex < str.length()) {
            arrayOfEqualParts[arrayIndex] = str.substring(startIndex, Integer.min(startIndex + n, str.length()));
            arrayIndex++;
            startIndex += n;
        }
        return arrayOfEqualParts;
    }

    public String[] getNumberOfWords(String str1){
        str1 = str1.trim();
        return str1.split("\\s+");
    }

    public String getInitials(String str1){
        String[] b = str1.split(" ");
        return b[0].substring(0, 1).toUpperCase(Locale.ROOT).concat(b[1].substring(0, 1).toUpperCase(Locale.ROOT));
    }

    public String getAllDigit(String str){
        StringBuilder digit = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                digit.append(c);
            }
        }
        return digit.toString();
    }
}
