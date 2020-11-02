package com.rakovets.course.javabasics.example.generics.model;
import java.util.ArrayList;

public class StringCollectionUtil {
    public static ArrayList<String> resetWordsByLength(ArrayList<String> list, int length) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == length) {
                list.set(i, "*");
            }
        }
        return list;
    }

    public static ArrayList<String> removeWordsByLength(ArrayList<String> list, int length) {
        for(int i = 0; i< list.size(); i++) {
            if (list.get(i).length() == length) {
                list.remove(i);
            }
        }
        return list;
    }
}


