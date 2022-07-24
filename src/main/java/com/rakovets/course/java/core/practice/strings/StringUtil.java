package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String concat(String str1, String str2) {
        return str1 +str2;
    }

    public int indexSymbolInString(String str, String symbol) {
        return str.indexOf(symbol);
    }

    public boolean stringComparison(String str1, String str2) {
        return str1.equals(str2);
    }

    public String deleteWhiteSpacesAndMakeUpperCase(String str) {
        return str.toUpperCase().trim();
    }

    public String cutPartString(String str, int indexStart, int indexEnd) {
        return str.substring(indexStart, indexEnd);
    }

    public String replaceEmodjiDance(String str, String emodjiOld, String emodjiNew) {
        return str.replace(emodjiOld, emodjiNew);
    }

}
