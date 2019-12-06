package com.rakovets.course.util.stringlist;

import java.util.ArrayList;
import java.util.List;

public class StringList {

    public static List<String> markWordsWithLength(List<String> list, int sizeOfWord) {
        List<String> str2 = new ArrayList<>();
        for (String value : list) {
            if (value.length() == sizeOfWord) {
                str2.add("*");
                str2.add(value);
            } else {
                str2.add(value);
            }
        }
        return str2;
    }

    public static List<String> removeWordsWithLength(List<String> list, int sizeOfWord) {
        List<String> str2 = new ArrayList<>();
        for (String value : list) {
            if (value.length() != sizeOfWord) {
                str2.add(value);
            }
        }
        return str2;
    }

    public static void printList(List<String> list) {
        for (String value : list) {
            System.out.println(value);
        }
    }
}
