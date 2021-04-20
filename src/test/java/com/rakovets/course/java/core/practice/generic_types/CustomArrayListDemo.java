package com.rakovets.course.java.core.practice.generic_types;

public class CustomArrayListDemo {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList(30);
        list.setRandomValuesForArray();
        System.out.println(list.toString());
        list.popFront();
        list.popBack();
        System.out.println(list.toString());
        list.trimToSize();
        System.out.println(list.toString());
        System.out.println(list.clone());
    }
}
