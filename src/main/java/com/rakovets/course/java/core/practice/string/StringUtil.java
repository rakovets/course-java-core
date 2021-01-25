package com.rakovets.course.java.core.practice.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    // Specification of task 1
    static String concat(String str1, String str2) {
        return str1.concat(str2);
    }

    // Specification of task 2
    static int getIndex(String str, char s) {
        return str.indexOf(s);
    }

    // Specification of task 3
    static boolean isEquals(String str1, String str2) {
        return str1.equals(str2);
    }

    // Specification of task 4
    static String getLowerCaseAndTrim(String str) {
        return str.trim().toLowerCase();
    }

    // Specification of task 5
    static String getSubstring(String str) {
        if (str.length() < 11) {
            return "Inputted less 11 characters";
        } else if (str.length() < 33) {
            return str.substring(10);
        }
        return str.substring(10, 34);
    }

    // Specification of task 6
    static String changeSmiles(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == ':' && chars[i+1] == '(') {
                chars[i+1] = ')';
            }
        }
        return new String(chars);
    }

    // Specification of task 7
    static boolean isStringContentsWord(String word, String string) {
        return string.startsWith(word) && string.endsWith(word);
    }

    // Specification of task 8
    static int countVowelInSentence(String sentence) {
        char[] chars = sentence.toCharArray();
        int count = 0;
        for (char x: chars) {
            if ((x == 'o' || x == 'O' || x == 'a' || x == 'A' || x == 'e' || x == 'E') ||
                (x == 'y' || x == 'Y' || x == 'u' || x == 'U' || x == 'i' || x == 'I')) {
                count++;
            }
        }
        return count;
    }

    // Specification of task 9
    static int countSpecialSymbol(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (char x: chars) {
            if (x == '.' || x == ',' || x == '!') {
                count++;
            }
        }
        return count;
    }

    // Specification of task 10
    static boolean isPolindrom(String str) {
        String strReplace = str.replaceAll("\\W", "");
        StringBuffer strBuff = new StringBuffer(strReplace);
        return strReplace.equalsIgnoreCase(strBuff.reverse().toString());
    }

    // Specification of task 11
    static String[] spliteString(String str, int n) {
        if (str != null && n > 0) {
            StringBuilder strToParts = new StringBuilder(str);
            for (int i = n; i < strToParts.length();) {
                strToParts.insert(i, "∰");
                i += n + 1;
            }
            return strToParts.toString().split("∰");
        }
        return null;
    }

    // Specification of task 12
    static int getNumberWords(String str) {
        Pattern pat = Pattern.compile("[A-z']+");
        Matcher match = pat.matcher(str);
        int count = 0;
        while (match.find()) {
            count++;
        }
        return count;
    }

    // Specification of task 13
    static String getInitials(String str) {
        String[] arr = str.split(" ");
        StringBuilder fio = new StringBuilder();
        for (String x: arr) {
            fio.append(x.substring(0, 1).toUpperCase());
        }
        return fio.toString();
    }

    // Specification of task 14
    static String getAllDigit(String str) {
        char[] charDigit = str.toCharArray();
        StringBuilder strDigit = new StringBuilder();
        for (char x: charDigit) {
            if (x >= '0' && x <= '9') {
                strDigit.append(x);
            }
        }
        return strDigit.toString();
    }
}
