package com.rakovets.course.java.core.practice.strings;

public class StringUtil {

    //task 1
    public String glue(String str1, String str2) {
        return str1 == null || str2 == null ? "" : str1.concat(str2);
    }

    //task 2
    public int findSymbolIndex(String str, char x) {
        return str == null ? -1 : str.indexOf(x);
    }

    //task 3
    public boolean checkEqual(String str1, String str2) {
        return ((str1 == null || str2 == null) || (str1.isEmpty() || str2.isEmpty())) ? false : str1.equals(str2);
    }

    //task 4
    public String removeSpaces(String str) {
        return str == null ? "String is empty" : str.trim();
    }

    //task 5
    public String extractSubstring(String str, int startCountInString, int endCountInString) {
        if (str == null || str.length() == 0) {
            return "String is empty";
        } else if (startCountInString >= endCountInString || endCountInString > str.length()) {
            return "Invalid character number";
        } else {
            int startIndex = startCountInString - 1;
            int endIndex = endCountInString - 1;
            char[] dst = new char[endIndex - startIndex];
            str.getChars(startIndex, endIndex, dst, 0);
            return new String(dst);
        }
    }

    //task 6
    public String returnWithReplacement(String str, char withdraw, char insert) {
        return str == null || str.length() == 0 ? "String is empty" : str.replace(withdraw, insert);
    }

    //task 7
    public boolean checkWordMatchesWithStartEnd(String str, String word) {
        return (str != null && word != null) && (str.startsWith(word) && str.endsWith(word)) ? true : false;
    }

    //task 8
    public int countNumberOfVowels(String str) {
        int totalNumberOfVowels;
        if (str == null || str.isEmpty()) {
            totalNumberOfVowels = 0;
        } else {
            char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
            char[] arrayFromString = str.toLowerCase().toCharArray();
            int counter = 0;
            for (int i : vowels) {
                for (int j : arrayFromString) {
                    if (i == j) {
                        counter++;
                    }
                }
            }
            totalNumberOfVowels = counter;
        }
        return totalNumberOfVowels;
    }

    //task 9
    public int countTotalNumberPunctuationMarks(String str) {
        int TotalNumberPunctuationMarks;
        if (str == null || str.isEmpty()) {
            TotalNumberPunctuationMarks = 0;
        } else {
            char[] PunctuationMarks = new char[]{'.', ',', '?', '!'};
            char[] arrayFromString = str.toCharArray();
            int counter = 0;
            for (int i : PunctuationMarks) {
                for (int j : arrayFromString) {
                    if (i == j) {
                        counter++;
                    }
                }
            }
            TotalNumberPunctuationMarks = counter;
        }
        return TotalNumberPunctuationMarks;
    }

    //task 10
    public boolean checkPalindrome(String str) {
        boolean result;
        if (str == null || str.isEmpty()) {
            result = false;
        } else {
            str = str.replace(" ","");
            StringBuffer strBuffer = new StringBuffer(str);
            String str2 = strBuffer.reverse().toString();
            result = str.equalsIgnoreCase(str2);
        }
        return result;
    }

    //task 11
    public String[] divideIntoEqualParts(String str, int step) {
        String[] result;
        if (str == null || str.isEmpty() || step == 0 || step > str.length()) {
            result = new String[]{"not correct"};
        } else {
            int totalParts = str.length() / step;
            String[] substrings = new String[totalParts];
            int indexCut = 0;
            for (int i = 0; i < totalParts; i++) {
                substrings[i] = str.substring(indexCut, indexCut + step);
                indexCut += step;
            }
            result = substrings;
        }
        return result;
    }

    //task 12
    public int sumWords(String str) {
        int result = 0;
        if (str == null || str.isEmpty()) {
            result = 0;
        } else if(str.length() == 1) {
            result = str.charAt(0) != ' ' ? 1 : 0;
        } else {
            for (int i = 1; i < str.length(); i++) {
                if ((str.charAt(i) == ' ' && str.charAt(i - 1) != ' ') || (str.charAt(i) != ' ' && (i + 1) == str.length())) {
                    result++;
                }
            }
        }
        return result;
    }

    //task 12(another version1)
    public int sumWordsVersion1(String str) {
        int sum;
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            sum = 0;
        } else {
            str = str.trim().replaceAll(" +", " ");
            String[] array = str.split(" ");
            sum = array.length;
        }
        return sum;
    }

    //task 13
    public String getInitials(String str) {
        String result;
        if (str == null || str.trim().isEmpty()) {
            result = "String is empty";
        } else {
            str = str.trim().toUpperCase().replaceAll(" +", " ");
            String[] array = str.split(" ");
            String initials = "";
            for (String i : array) {
                initials += i.charAt(0);
            }
            result = initials;
           }
        return result;
    }

    //task 14
    public String getTotalDigits(String str) {
        String totalDigits;
        if (str == null || str.trim().isEmpty()) {
            totalDigits = "String is empty";
        } else {
            char[] arrayStr = str.toCharArray();
            StringBuffer stringBuffer = new StringBuffer();
                for (char i : arrayStr) {
                    if (Character.isDigit(i)) {
                        stringBuffer.append(i);
                    }
                }
            totalDigits = stringBuffer.toString();
            }
        return totalDigits;
    }

    //task 15
    //task 16
    //task 17
    //task 18
    //task 19
}
