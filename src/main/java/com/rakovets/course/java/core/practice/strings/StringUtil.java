package com.rakovets.course.java.core.practice.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringUtil {
    public String stringGlue(String str1, String str2) {
        String result = "";

        if (str1 != null && str2 != null) {
            result = str1.concat(str2);
        }
        return result;
    }

    public int indexOfChar(String str, char x) {
        if (str == null) {
            return -1;
        }
        return str.indexOf(x);
    }

    public boolean stringEquals(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return true;
        } else if (str1 == null || str2 == null) {
            return false;
        }
        return str1.equals(str2);
    }

    public String stringTrim(String str1) {
        if (str1 == null) {
            return "It's empty string";
        }
        return str1.trim().toLowerCase();
    }

    public String stringSubstring(String str1, int startIndex, int finishIndex) {
        if (str1 == null) {
            return "It's empty string";
        } else if (str1.length() < finishIndex || startIndex < 0 || finishIndex < 0) {
            return "You out of the boundary";
        }
        return str1.substring(startIndex,finishIndex);
    }

    public String stringReplace(String str1) {
        if (str1 == null) {
            return "It's empty string";
        }
        return str1.replace(":(",":)");
    }

    public boolean stringMatches(String text, String word) {
        return text.startsWith(text) && text.endsWith(word);
    }

    public int countChar(String str) {
        int count = 0;
        if (str == null) {
            return 0;
        }
        String stringToLower = str.toLowerCase();
        for (char item : stringToLower.toCharArray()) {
            if (item == 'a' || item == 'e' || item == 'o' || item == 'u' || item == 'y') {
                count++;
            }
        }
        return count;
    }

    public int countPunctuation(String str) {
        int count = 0;
        if (str == null) {
            return 0;
        }
        for (char item : str.toCharArray()) {
            if (item == '.' || item == ',' || item == '?' || item == '!') {
                count++;
            }
        }
        return count;
    }

    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        str = str.replace(" ", "");
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }

    public String getArray(String str,int n) {
        if (str == null) {
            return "It's empty String";
        }
        str = str.replace(" ", "");
        String[] string = str.split("(?<=\\G.{" + n + "})");
        return Arrays.toString(string);
    }

    public int getCountWords(String str) {
        if (str == null) {
            return 0;
        }
        return str.trim().split("[\\s]+").length;
    }

    public String getInitials(String str) {
        if (str == null) {
            return "It's empty String";
        }
        String[] strings = str.toUpperCase().split(" +");
        String initials = strings[0].substring(0, 1) + strings[1].substring(0,1);
        return initials;
    }

    public String getNumbers(String str) {
        if (str == null) {
            return "Empty string";
        }
        String numbers = str.replaceAll("[^0-9\\+]", "");
        return numbers;
    }
}
