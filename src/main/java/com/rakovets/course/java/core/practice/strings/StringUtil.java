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
        int index = str.indexOf('x');
        return index;
    }



}
