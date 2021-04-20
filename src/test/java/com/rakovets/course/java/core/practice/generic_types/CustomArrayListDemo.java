package com.rakovets.course.java.core.practice.generic_types;

public class CustomArrayListDemo {
    public static void main(String[] args) {
        CustomArrayList <String> list = new CustomArrayList<>(10);
        list.insert(0,"5");
        list.insert(1,"12");
        list.insert(2,"24");
        list.insert(3,"87");
        list.insert(4,"21");
        list.insert(5,"12");
        System.out.println(list.toString());
        System.out.println(list.lastIndexOf("12"));
        list.trimToSize();
        System.out.println(list.toString());
        System.out.println(list.getSize());
        list.pushFront("10");
        System.out.println(list.toString());
        System.out.println(list.getSize());
        list.insert(2,"200");
        System.out.println(list.toString());
        System.out.println(list.getSize());
        list.popBack();
        System.out.println(list.toString());
        System.out.println(list.getSize());
        list.pushBack("12");
        System.out.println(list.toString());
        System.out.println(list.getSize());
        list.removeAt(7);
        System.out.println(list.toString());
        System.out.println(list.getSize());
        list.removeAt(6);
        list.removeAt(5);
        list.removeAt(4);
        System.out.println(list.toString());
        System.out.println(list.getSize());
    }
}
