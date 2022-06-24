package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    //Task 1
    public String concat(String str1, String str2) {
        return str1 + str2;
    }

    //Task 2
    public int indexOf(String str1, char symbol) {
        return str1.indexOf(symbol);
    }

    //Task 3
    public boolean equals(String str1, String str2) {
        return str1.equals(str2);
    }

    //Task 4
    public String trimSpaceLowerCase(String str1) {
        return (str1.trim()).toLowerCase();
    }

    //Task 5
    public String substringSymbol(String str1, char firstSymbol, char secondSymbol) {
        int indexFirstSymbol = indexOf(str1, firstSymbol);
        int indexSecondSymbol = indexOf(str1, secondSymbol);
        return str1.substring(indexFirstSymbol, indexSecondSymbol);
    }

    //Task 6
    public String replace(String str1, String oldValue, String newValue) {
        return str1.replace(oldValue, newValue);
    }

    //Task 7
    public boolean startAndEndWithWord(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    //Task 8
    public int countVowels(String str1) {
        int amount = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        char[] str1ToArray = str1.toLowerCase().toCharArray();
        for (char c : str1ToArray) {
            for (char vowel : vowels) {
                if (c == vowel) {
                    amount++;
                }
            }
        }
        return amount;
    }

    //Task 9
    public int punctuationMarks(String str1) {
        int amount = 0;
        char[] punctuationMarks = {',', '.', '!', '?'};
        char[] str1ToArray = str1.toCharArray();
        for (char c : str1ToArray) {
            for (char punctuationMark : punctuationMarks) {
                if (c == punctuationMark) {
                    amount++;
                }
            }
        }
        return amount;
    }

    //Task 10
    public boolean ifPalindrome(String str1) {
        String improved = str1.toLowerCase().replaceAll("\\W", "");
        StringBuffer stringBuffer = new StringBuffer(improved);
        String inverted = stringBuffer.reverse().toString();
        return equals(improved, inverted);
    }

    //    Task 11
    public String[] splitToArray(String str1, int numberSymbolsInEveryNewArray) {
        StringBuilder stringBuilder = new StringBuilder(str1);
        int length = 0;
        if (stringBuilder.length() % numberSymbolsInEveryNewArray == 0) {
            length += stringBuilder.length() / numberSymbolsInEveryNewArray;
        } else {
            length += stringBuilder.length() / numberSymbolsInEveryNewArray + 1;
        }
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                array[i] = stringBuilder.toString();
                break;
            }
            array[i] = stringBuilder.substring(0, numberSymbolsInEveryNewArray);
            stringBuilder.delete(0, numberSymbolsInEveryNewArray);
        }
        return array;
    }

    //Task 12
    public int countNumberWords(String str1) {
        return str1.trim().replaceAll("\\pP", " ").split(" +").length;
    }

//Task 13

    public String getFirstCharacters(String str1) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : str1.toUpperCase().split(" +")) {
            stringBuilder.append(word.charAt(0));
        }
        return stringBuilder.toString();
    }


}
