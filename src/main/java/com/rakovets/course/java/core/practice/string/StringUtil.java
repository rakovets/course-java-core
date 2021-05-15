package com.rakovets.course.java.core.practice.string;

import java.util.regex.Pattern;

public class StringUtil {

    public String glue(String firstText, String secondText) {
        return firstText.concat(secondText);
    }

    public int characterIndex(String text, String symbol) {
        return text.indexOf(symbol);
    }

    public boolean stringСomparison(String firstText, String secondText) {
        return firstText.equals(secondText);
    }

    public String removeSpace(String text) {
        return text.trim().toUpperCase();
    }

    public String cut(String text, int indexOne, int indexTwo) {
        return text.substring(indexOne, indexTwo);
    }

    public String replaceSmile(String text, String replaceable, String substitute) {
        return text.replace(replaceable, substitute);
    }

    public boolean startsEndsWith(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    public int vowelsCounter(String text) {
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

    public int getPunctuationCount(String text) {
        int count = 0;
        String[] arrayFromText = text.split("");

        for (String letterFromText : arrayFromText) {
            if (Pattern.matches("[,.?!]", letterFromText)) {
                count++;
            }
        }

        return count;
    }

    public boolean isPalindrome(String text) {
        String textAfterReplace = text.replaceAll("[.!,?\\s]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(textAfterReplace).reverse();

        return stringBuilder.toString().equals(textAfterReplace);
    }


    public String[] lineSeparator(String text, int length) {
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

    public int wordCounter(String text) {
        String[] array = text.trim().split(" ");
        int count = 0;

        for (String word : array) {
            if (!word.equals("")) {
                count++;
            }
        }

        return count;
    }

    public String initialsOfTheName(String text) {
        String[] array = text.toUpperCase().split(" ");
        return array[0].substring(0, 1) + array[1].substring(0, 1);
    }

    public String getAllDigits(String text) {
        return text.replaceAll("[^0-9]", "");
    }

    public String getIndividualSymbol(String firstText, String secondText) {
        String[] array = firstText.split("");
        String[] arrayTwo = secondText.split("");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (array[i].equals(arrayTwo[j])) {
                    array[i] = "";
                    arrayTwo[j] = "";
                    break;
                }
            }
        }

        for (String word : array) {
            result = result.append(word);
        }
        for (String word : arrayTwo2) {
            result = result.append(word);
        }
        return result.toString();

    }

    public boolean arrayComparator(String[] firstArray, String[] secondArray) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i].equals(secondArray[j])) {
                    firstArray[i] = "";
                    secondArray[j] = "";
                    break;
                }
            }
        }
        for (String word : firstArray) {
            result = result.append(word);
        }
        for (String word2 : secondArray) {
            result = result.append(word2);
        }

        return result.length() == 0;
    }

    public boolean speedComparator(String[] array) {
        String result = "";
        long timeBefore = System.currentTimeMillis();

        for (int i = 0; i < 5000; i++) {
            for (String word : array) {
                result = result + word;
            }
        }

        long timeAfter = System.currentTimeMillis();

        StringBuilder stringBuilderResult = new StringBuilder();
        long timeBeforeSB = System.currentTimeMillis();

        for (int j = 0; j < 5000; j++) {
            for (String word : array) {
                stringBuilderResult.append(word);
            }
        }

        long timeAfterSB = System.currentTimeMillis();

        return (timeAfter - timeBefore) > (timeAfterSB - timeBeforeSB);
    }


    public String repeatRemover(String text) {
        return text.replaceAll("(.)\\1+", "$1");
    }

    public int fromRomeNumberInArabic(String Number) {
        if (Number == null) {
            return -1;
        }

        int[] array = new int[Number.length()];
        int result = 0;

        for (int i = 0; i < Number.length(); i++) {
            switch (Number.charAt(i)) {
                case 'M':
                    array[i] = 1000;
                    break;
                case 'D':
                    array[i] = 500;
                    break;
                case 'C':
                    array[i] = 100;
                    break;
                case 'L':
                    array[i] = 50;
                    break;
                case 'X':
                    array[i] = 10;
                    break;
                case 'V':
                    array[i] = 5;
                    break;
                case 'I':
                    array[i] = 1;
                    break;
                default:
                    return -1;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                result += array[i];
            } else if (array[i] < array[i + 1]) {
                result = result + (array[i + 1] - array[i]);
                i += 1;
            } else result += array[i];
        }
        return result;
    }
}
