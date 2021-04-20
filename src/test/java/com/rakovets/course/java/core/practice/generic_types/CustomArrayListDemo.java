package com.rakovets.course.java.core.practice.generic_types;

public class CustomArrayListDemo {
    public static void main(String[] args) {
        CustomArrayList <String> list = new CustomArrayList<>(6);
        list.insert(0,"5");
        list.insert(1,"12");
        list.insert(2,"24");
        list.insert(3,"87");
        list.insert(4,"13");
        list.insert(5,"17");
        System.out.println(list.toString());
        list.pushBack("12");
        System.out.println(list.toString());
        list.popFront();
        System.out.println(list.toString());
        list.pushFront("13");
        System.out.println(list.toString());
        list.removeAt(3);
        System.out.println(list.toString());
        list.remove("13");
        System.out.println(list.toString());
        list.removeAll("12");
        System.out.println(list.toString());
        list.insert(5,"17");
        System.out.println(list.toString());
        list.popBack();
        System.out.println(list.toString());
        list.clear();
        System.out.println(list.toString());
        System.out.println(list.isEmpty());
        list.insert(0,"5");
        list.insert(1,"12");
        list.insert(2,"24");
        list.insert(3,"87");
        System.out.println(list.toString());
        list.trimToSize();
        System.out.println(list.toString());
        System.out.println(list.indexOf("24"));
        System.out.println(list.lastIndexOf("12"));
        list.reverse();
        System.out.println(list.toString());
        System.out.println(list.equals(list.clone()));
        System.out.println(list.getElementAt(2));
        System.out.println(list.getCapacity());
        System.out.println(list.getSize());
    }
}
