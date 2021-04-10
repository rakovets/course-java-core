package com.rakovets.course.java.core.practice.string;

import java.util.Locale;
import java.util.regex.Pattern;

public class StringUtil {

    public String glue(String text1, String text2) {
        return text1.concat(text2);
    }

    public int characterIndex(String text, String symbol) {
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

    public String task6(String text, String text1, String text2) {
        return text.replace(text1, text2);
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

    public int task12(String text) {
        String[] array = text.trim().split(" ");
        int count = 0;

        for (String word : array) {
            if (!word.equals("")) {
                count++;
            }
        }

        return count;
    }

    public String task13(String text) {
        String[] array = text.toUpperCase().split(" ");


        return array[0].substring(0, 1) + array[1].substring(0, 1);
    }


    public String task14(String text) {
        return text.replaceAll("[^0-9]", "");
    }

    public String task15(String text, String text2) {
        String[] array = text.split("");
        String[] array2 = text2.split("");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array2.length; j++) {
                if (array[i].equals(array2[j])) {
                    array[i] = "";
                    array2[j] = "";
                    break;
                }
            }
        }

        for (String word : array) {
            result = result.append(word);
        }
        for (String word2 : array2) {
            result = result.append(word2);
        }
        return result.toString();

    }

    public boolean task16(String[] array, String[] array2) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i].equals(array2[j])) {
                    array[i] = "";
                    array2[j] = "";
                    break;
                }
            }
        }
        for (String word : array) {
            result = result.append(word);
        }
        for (String word2 : array2) {
            result = result.append(word2);
        }

        return result.length() == 0;

    }

    public String task18(String text) {
        return text.replaceAll("(.)\\1+", "$1");
    }
}

