package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String concat(String str1, String str2) {
        return str1 + str2;
    }

    public int indexOf(String str1, char x) {
        return str1.indexOf(x);
    }

    public boolean equals(String str1, String str2) {
        return str1.equals(str2);
    }

    public String trimSpaceLowerCase(String str1) {
        return (str1.trim()).toLowerCase();
    }

    public String substringSymbol(String str1, char n, char m) {
        int i = str1.indexOf(n);
        int j = str1.indexOf(m) + 1;
        return str1.substring(i, j);
    }
}
