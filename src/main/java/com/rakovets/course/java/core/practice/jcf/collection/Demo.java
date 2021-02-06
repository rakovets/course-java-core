package com.rakovets.course.java.core.practice.jcf.collection;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("qwer");
        mylist.add("qwerf");
        mylist.add("qwerf");
        mylist.add("qwerg");
        mylist.add("qwerhs");
        mylist.add("qweraa");
        System.out.println(StringCollectionUtil.removeWordsByLength(mylist, 4));


    }
}
