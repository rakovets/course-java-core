package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    private String stringUtil;
    static String concatTwoStrings(String str1, String str2) {
        return str1.concat(str2);
    }

    static int getIndexOfSymbol(String str1, String  symbol) {
        int position;
        if (str1.contains(symbol)) {
            position = str1.indexOf(symbol);
        } else {
            position = -1;
        }
        return position;
    }

    public String getString() {
        return this.stringUtil;
    }
}
