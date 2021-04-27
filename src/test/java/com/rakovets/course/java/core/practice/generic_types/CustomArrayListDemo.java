package com.rakovets.course.java.core.practice.generic_types;

public class CustomArrayListDemo {
    public static void main(String[] args) {
        CustomArrayList <String> list = new CustomArrayList<>(5);
        list.insert(0,"5");
        list.insert(1,"Hello");
        list.insert(0,"24");
        list.printList();
        list.insert(1,"87");
        list.printList();
        list.insert(2,"21");
        list.printList();
        list.insert(3,"12");
        list.printList();
        list.pushFront("33");
        list.printList();
        list.insert(1, "13");
        list.printList();
        list.insert(1, "228");
        list.printList();
        list.removeAt(4);
        list.printList();
        list.pushBack("20");
        list.printList();
        System.out.println(list.getSize());
        list.insert(8, "114");
        list.printList();
        System.out.println(list.lastIndexOf("12"));
        list.trimToSize();
        list.printList();
        System.out.println(list.getSize());
        list.pushFront("10");
        list.printList();
        System.out.println(list.getSize());
        list.insert(2,"200");
        list.printList();
        System.out.println(list.getSize());
        list.popBack();
        list.printList();
        System.out.println(list.getSize());
        list.pushBack("12");
        list.printList();
        System.out.println(list.getSize());
        list.removeAt(7);
        list.printList();
        System.out.println(list.getSize());
        list.removeAt(6);
        list.removeAt(5);
        list.removeAt(4);
        list.printList();
        System.out.println(list.getSize());
        list.shuffle();
        list.printList();
        System.out.println(list.getSize());
    }
}
