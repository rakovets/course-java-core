package com.rakovets.course.java.core.practice.string;

import java.util.Locale;

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
        int quantityOfVowels = 0;
        for (int i = 0; i<str1.length();i++)
        {
            char currentLetter = str1.charAt(i);
            if (currentLetter == 'a' || currentLetter == 'e' || currentLetter == 'i' || currentLetter == 'o' || currentLetter == 'u'
                    || currentLetter == 'A'|| currentLetter == 'E' || currentLetter == 'I' || currentLetter == 'O' || currentLetter == 'U')
            {
                quantityOfVowels++;
            }
            }
       return  quantityOfVowels;
    }
}
