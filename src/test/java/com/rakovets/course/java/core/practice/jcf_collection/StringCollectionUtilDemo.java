package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.List;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();

        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("this");
        names.add("is");
        names.add("lots");
        names.add("of");
        names.add("fu");
        names.add("fo");
        names.add("ever");

        System.out.printf("\nString after correction  - %s - \n", names);
        stringCollectionUtil.resetWordsByLength(names, 4);
        System.out.printf("\nString before correction   - %s - \n", names);
        stringCollectionUtil.removeWordsByLength1(names, 2);
        System.out.printf("\nString before remove   - %s - \n", names);
    }
}
