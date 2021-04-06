package com.rakovets.course.java.core.practice.string;

public class StringUtil {
    static String glue(String str1, String str2) {
        return str1.concat(str2) ;
    }

    static  int foundX(String str1) {
        return str1.indexOf('h');
    }
}
