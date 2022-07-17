package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;

public class StringCollectionUtilApplication {
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add(" go ");
        listOne.add("Monday");
        listOne.add("Back");
        listOne.add("1234");
        listOne.add("12345");
        listOne.add("    ");

        ArrayList<String> listTwo = new ArrayList<>();
        listTwo.add(" go ");
        listTwo.add("Monday");
        listTwo.add("Back");
        listTwo.add("1234");
        listTwo.add("12345");
        listTwo.add("    ");

        System.out.println(StringCollectionUtil.resetWordsByLength(listOne, 4));
        System.out.println(StringCollectionUtil.removeWordsByLength(listTwo, 4));
    }
}
