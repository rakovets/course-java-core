package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.List;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        StringCollectionUtil stringUtil = new StringCollectionUtil();
        List<String> textList = new ArrayList<>();
        textList.add("this");
        textList.add("is");
        textList.add("lots");
        textList.add("of");
        textList.add("fun");
        textList.add("for");
        textList.add("every");
        textList.add("Java");
        textList.add("programmer");

        outputList(textList);
        stringUtil.resetWordsByLength(textList, 4);
        outputList(textList);
        stringUtil.removeWordsByLength(textList, 2);
        outputList(textList);
    }

    private static void outputList(List<String> textList) {
        System.out.println(textList);
    }
}
