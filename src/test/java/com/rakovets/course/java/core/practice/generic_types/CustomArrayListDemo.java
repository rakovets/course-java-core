package com.rakovets.course.java.core.practice.generic_types;

import com.rakovets.course.java.core.practice.generic_types.custom_array_list.CustomArrayList;

public class CustomArrayListDemo {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.pushBack(2);
        }
        for (int i = 0; i < 6; i++) {
            list.pushFront(5);
        }

        list.popBack();
        list.popFront();
        System.out.println(list.getSize());

        try {
            list.insert(3, 15);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        list.remove(5);
        list.removeAll(2);

        try {
            list.removeAt(7);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        list.removeAt(1);
        System.out.println(list);

        list.clear();
        System.out.println(list.toString());

        list.pushBack(3);
        list.pushBack(5);
        list.pushBack(7);
        System.out.println(list.toString());
        list.reverse();
        System.out.println(list.toString());

        list.pushBack(12);
        list.pushBack(15);
        System.out.println(list.toString());
        list.shuffle();
        System.out.println(list.toString());

        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
        customArrayList.pushBack(3);
        //customArrayList.pushBack(5);
        customArrayList.pushBack(15);
        customArrayList.pushBack(7);
        customArrayList.pushBack(12);
        System.out.println(list.equals(customArrayList));
        System.out.println(customArrayList.getElementAt(3));

        try {
            System.out.println(list.getElementAt(7));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            CustomArrayList<Integer> customArrayList1 = (CustomArrayList<Integer>) customArrayList.clone();
            System.out.println(customArrayList1);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(customArrayList);
    }
}
