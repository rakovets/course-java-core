package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    String glue(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return "";
        }
        return str1.concat(str2);
    }

    int finedIndexX(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        return str.indexOf('x');
    }

    boolean equivalentTo(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        return str1.equalsIgnoreCase(str2);
    }

    String trimAndToUpper(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        str = str.trim();
        return str.toUpperCase();
    }

    String extractSubstringFromNtoM(String str, int n, int m) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        return str.substring(n - 1,m);

    }



}
