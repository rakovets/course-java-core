package com.rakovets.course.java.core.practice.strings;

import java.lang.String;

public class StringUtil {
    public String glue(String str1, String str2) {
        if (str1 == null) {
            str1 = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return str1.concat(str2);
    }

    public int serchSymbalBy(String str, char symbal) {
        return str.indexOf(symbal);
    }

    public boolean equalsObject(String str1, String str2) {
        return str1.equals(str2);
    }

    public String deleteSpaceAndUpperCase(String str) {
        return str.trim().toUpperCase();
    }

    public String subString(String str, int startSymbal, int endSymbal) {
        return str.substring(str.indexOf(startSymbal), str.indexOf(endSymbal));
    }

    public String switchSymbal(String str) {
        return str.replace(":(", ":)");
    }

    public boolean startAndEndWord(String str, String startAndEndWord) {
        return str.startsWith(startAndEndWord) && str.endsWith(startAndEndWord);
    }

    public int numberOfVowels(String str) {
        int countVowels = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y' };
        for (char vowel : vowels)
            for (char letter : str.toLowerCase().toCharArray())
                if (letter == vowel) countVowels++;
        return countVowels;
    }

    public int punctuationMarks(String str) {
        int countMarks = str.length();
        int countAfterDelete = str.replaceAll("[.?!,]", "").length();
        countAfterDelete = countMarks - countAfterDelete;
        return countAfterDelete;
    }

    public boolean palindrom(String str) {
        str = str.toLowerCase().replaceAll("[.?!,]", "");
        String strReverse = (new StringBuilder(str)).reverse().toString();
        return str.equals(strReverse);
    }
}
