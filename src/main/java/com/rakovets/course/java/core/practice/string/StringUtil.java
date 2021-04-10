package com.rakovets.course.java.core.practice.string;

import java.util.Locale;

public class StringUtil {
    public String union(String str1, String str2){
        return str1.concat(str2);
    }

    public int indexSearch (String str1, char symbol) {
        return str1.indexOf(symbol);
    }

    public boolean compareTwoString (String str1, String str2) {
        return str1.equals(str2);
    }

    public String changeString (String str1) {
        str1 = str1.trim();
        return str1.toUpperCase();
    }

    public


}
