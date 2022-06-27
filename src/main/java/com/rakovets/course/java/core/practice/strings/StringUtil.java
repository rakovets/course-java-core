package com.rakovets.course.java.core.practice.strings;

import java.util.Arrays;

public class StringUtil {

    //Task 1
    public String concat(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return null;
        } else if (str1 == null) {
            return str2;
        } else if (str2 == null) {
            return str1;
        } else {
            return str1.concat(str2);
        }
    }

    //Task 2
    public int getIndexOfSymbol(String str, char symbol) {
        return str != null ? str.indexOf(symbol) : -1;
    }

    //Task 3
    public boolean isEqual(String str1, String str2) {
        if (str1 == null) {
            return str2 == null;
        } else {
            return str1.equals(str2);
        }
    }

    //Task 4
    public String getTrimSpaceToLowerCase(String str) {
        return str == null ? null : str.trim().toLowerCase();
    }

    //Task 5
    // excluding second symbol
    public String getSubstring(String str, char firstSymbol, char secondSymbol) {
        int indexFirstSymbol = getIndexOfSymbol(str, firstSymbol);
        int indexSecondSymbol = getIndexOfSymbol(str, secondSymbol);
        return indexFirstSymbol < 0 || indexSecondSymbol < 0 ? "" : str.substring(indexFirstSymbol, indexSecondSymbol);
    }

    //Task 6
    public String replace(String str, String oldValue, String newValue) {
        if (str == null) {
            return null;
        } else if (oldValue == null) {
            return str;
        } else if (newValue == null) {
            newValue = "";
        }
        return str.replace(oldValue, newValue);
    }

    //Task 7
    public boolean isStartAndEndWithWord(String text, String word) {
        return text != null && word != null && text.startsWith(word) && text.endsWith(word);
    }

    //Task 8
    public int countVowels(String str) {
        int amountVowels = 0;
        if (str == null) {
            return amountVowels;
        }
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        char[] strArray = str.toLowerCase().toCharArray();
        for (char c : strArray) {
            for (char vowel : vowels) {
                if (c == vowel) {
                    amountVowels++;
                }
            }
        }
        return amountVowels;
    }

    //Task 9
    public int countPunctuationMarks(String str) {
        int amountPunctuationMarks = 0;
        if (str == null) {
            return amountPunctuationMarks;
        }
        char[] punctuationMarks = {',', '.', '!', '?'};
        char[] strArray = str.toCharArray();
        for (char c : strArray) {
            for (char punctuationMark : punctuationMarks) {
                if (c == punctuationMark) {
                    amountPunctuationMarks++;
                }
            }
        }
        return amountPunctuationMarks;
    }

    //Task 10
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String modified = str.toLowerCase().replaceAll("\\W", "");
        StringBuilder stringBuilder = new StringBuilder(modified);
        String inverted = stringBuilder.reverse().toString();
        return isEqual(modified, inverted);
    }

    //Task 11
    public String[] splitToArray(String str, int numberSymbols) {
        if (str == null) {
            return null;
        }
        int length = 0;
        if (str.length() % numberSymbols == 0) {
            length += str.length() / numberSymbols;
        } else {
            length += str.length() / numberSymbols + 1;
        }
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                array[i] = str.substring(i * numberSymbols);
            } else {
                array[i] = str.substring(i * numberSymbols, i * numberSymbols + numberSymbols);
            }
        }
        return array;
    }

    //Task 12
    public int countNumberWords(String str) {
        return str == null ? 0 : str.trim().replaceAll("[\\pP\\s]", " ").split(" +").length;
    }

    //Task 13
    public String getFirstCharacters(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : str.toUpperCase().split(" +")) {
            stringBuilder.append(word.charAt(0));
        }
        return stringBuilder.toString();
    }

    //Task 14
    public String getNumbers(String str) {
        if (str == null) {
            return "";
        }
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] array = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char symbol : array) {
            for (char number : numbers) {
                if (symbol == number) {
                    stringBuilder.append(symbol);
                }
            }
        }
        return stringBuilder.toString();
    }

    //Task 15
    public String getUniqueSymbols(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return null;
        } else if (str1 == null) {
            return str2;
        } else if (str2 == null) {
            return str1;
        }
        String input1 = str1.toLowerCase();
        String input2 = str2.toLowerCase();
        return findUniqueCharsofString(input1, input2).concat(findUniqueCharsofString(input2, input1));
    }

    private String findUniqueCharsofString(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            boolean similar = false;
            char current = str1.charAt(i);
            for (int j = 0; j < str2.length(); j++) {
                if (current == str2.charAt(j)) {
                    similar = true;
                    break;
                }
            }
            if (!similar && !result.toString().contains(String.valueOf(current))) {
                result.append(current);
            }
        }
        return result.toString();
    }

    //Task 16
    public boolean isArraySimilar(String[] array1, String[] array2) {
        String str1 = Arrays.toString(array1);
        String str2 = Arrays.toString(array2);
        return findUniqueCharsofString(str1, str2).concat(findUniqueCharsofString(str2, str1)).equals("");
    }

    //Task 17
    public String getSpeedOfAddition(String str, int amountOfEditions) {
        StringBuilder stringBuilder = new StringBuilder(str);
        long startFirstCycle = System.currentTimeMillis();
        for (int i = 0; i < amountOfEditions; i++) {
            str += str;
        }
        long endFirstCycle = System.currentTimeMillis();
        long startSecondCycle = System.currentTimeMillis();
        for (int i = 0; i < amountOfEditions; i++) {
            stringBuilder.append(str);
        }
        long endSecondCycle = System.currentTimeMillis();
        return "Speed (Addition operator):" + (endFirstCycle - startFirstCycle) + "\nSpeed (StringBuilder):"
                + (endSecondCycle - startSecondCycle);
    }

    //Task 18
    public String removeDuplicateLetters(String str) {
        if (str == null) {
            return "";
        }
        char[] strArray = str.toLowerCase().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strArray.length; i++) {
            int j;
            if (i == strArray.length - 1) {
                stringBuilder.append(strArray[i]);
                break;
            }
            j = i + 1;
            if (strArray[i] != strArray[j]) {
                stringBuilder.append(strArray[i]);
            }
        }
        return stringBuilder.toString();
    }
}
