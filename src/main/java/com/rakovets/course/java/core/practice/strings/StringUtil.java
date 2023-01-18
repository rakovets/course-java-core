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
        return str1 == null || str2 == null ? false : str1.equals(str2);
    }
    //task 4
    public String removeSpaces(String str) {
        return str == null ? "String is empty" : str.trim();
    }
    //task 5
    //task 6
    //task 7
    //task 8
    //task 9
    //task 10
    //task 11
    //task 12
    //task 13
    //task 14
    //task 15
    //task 16
    //task 17
    //task 18
    //task 19
}
