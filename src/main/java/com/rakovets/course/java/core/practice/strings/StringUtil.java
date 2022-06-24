package com.rakovets.course.java.core.practice.strings;

public class StringUtil {

    public String joinTwoStrings (String string1, String string2) {
        return string1 + string2;
    }

    public int findIndex (String currentString, String userString){
        return currentString.indexOf(userString);
    }
}
