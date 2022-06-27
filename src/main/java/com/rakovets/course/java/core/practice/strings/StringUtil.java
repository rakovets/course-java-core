package com.rakovets.course.java.core.practice.strings;

import java.util.Arrays;
public class StringUtil {
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

    public int getIndexOfSymbol(String str, char symbol) {
        return str != null ? str.indexOf(symbol) : -1;
    }

    public boolean isEqual(String str1, String str2) {
        if (str1 == null) {
            return str2 == null;
        } else {
            return str1.equals(str2);
        }
    }

    public String getTrimSpaceToLowerCase(String str) {
        return str == null ? null : str.trim().toLowerCase();
    }

    public String getSubstring(String str, char firstSymbol, char secondSymbol) {
        int indexFirstSymbol = getIndexOfSymbol(str, firstSymbol);
        int indexSecondSymbol = getIndexOfSymbol(str, secondSymbol);
        return indexFirstSymbol < 0 || indexSecondSymbol < 0 ? "" : str.substring(indexFirstSymbol, indexSecondSymbol);
    }

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

    public boolean isStartAndEndWithWord(String text, String word) {
        return text != null && word != null && text.startsWith(word) && text.endsWith(word);
    }

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

    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String modified = str.toLowerCase().replaceAll("\\W", "");
        StringBuilder stringBuilder = new StringBuilder(modified);
        String inverted = stringBuilder.reverse().toString();
        return isEqual(modified, inverted);
    }

    public String[] splitToArray(String str, int numberSymbols) {
        if (str == null) {
            return null;
        }
        int length = (str.length() % numberSymbols == 0) ? (str.length() / numberSymbols) : (str.length() / numberSymbols + 1);
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                array[i] = str.substring(i * numberSymbols);
            } else {
                array[i] = str.substring(i * numberSymbols, numberSymbols*(i+1));
            }
        }
        return array;
    }

    public int countNumberWords(String str) {
        return str == null ? 0 : str.trim().replaceAll("[\\pP\\s]", " ").split(" +").length;
    }

    public String getFirstCharactersInUpperCase(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : str.toUpperCase().split(" +")) {
            stringBuilder.append(word.charAt(0));
        }
        return stringBuilder.toString();
    }

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
        return findUniqueCharsString(input1, input2).concat(findUniqueCharsString(input2, input1));
    }

    private String findUniqueCharsString(String str1, String str2) {
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

    public boolean isArraySimilar(String[] array1, String[] array2) {
        String str1 = Arrays.toString(array1);
        String str2 = Arrays.toString(array2);
        return findUniqueCharsString(str1, str2).concat(findUniqueCharsString(str2, str1)).equals("");
    }

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
