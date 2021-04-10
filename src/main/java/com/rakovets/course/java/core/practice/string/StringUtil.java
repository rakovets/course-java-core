package com.rakovets.course.java.core.practice.string;

import java.util.regex.Pattern;

public class StringUtil {

    public String glue(String text1, String text2) {
        return text1.concat(text2);
    }

    public int characterIndex(String symbol) {
        String text = "abcdefghijklmnopqrstuvwxyz";
        return text.indexOf(symbol);
    }

    public int compare(String text1, String text2) {
        return text1.compareTo(text2);
    }

    public String removeSpace(String text1) {
        return text1.trim().toUpperCase();
    }

    public String task5(String text1, int indexOne, int indexTwo) {
        return text1.substring(indexOne, indexTwo);
    }

    public String task6(String text1) {
        return text1.replace(":(", ":)");
    }

    public boolean task7(String text1, String word) {
        return text1.startsWith(word) && text1.endsWith(word);
    }

    public int task8(String text) {
        String[] vowel = new String[]{"a", "e", "i", "o", "y", "u"};
        int count = 0;
        String[] arrayFromText = text.toLowerCase().split("");

        for (String letter : vowel) {
            for (String letterFromText : arrayFromText) {
                if (letterFromText.equals(letter)) {
                    count++;
                }
            }
        }
        return count;
    }

    public int task9(String text) {
        int count = 0;
        String[] arrayFromText = text.split("");

        for (String letterFromText : arrayFromText) {
            if (Pattern.matches("[,.?!]", letterFromText)) {
                count++;
            }
        }

        return count;
    }

    public boolean task10(String text) {
        String textAfterReplace = text.replaceAll("[.!,?\\s]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(textAfterReplace).reverse();

        return stringBuilder.toString().equals(textAfterReplace);
    }


    public String[] task11(String text, int length) {
        String[] array;

        if (text.length() % length == 0) {
            array = new String[text.length() / length];
        } else {
            array = new String[(text.length() / length) + 1];
        }

        int j = 0;
        while (text.length() > 0) {
            if (text.length() < length) {
                array[j] = text.substring(0, text.length());
                break;
            }
            array[j] = text.substring(0, length);
            text = text.substring(length, text.length());
            j++;
        }

        return array;
}
}
