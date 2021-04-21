package com.rakovets.course.java.core.practice.generic_types;

public class CustomArrayListDemo {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{3, 2, 1, 8, 6, 6, 7, 3, 8};
        CustomArrayList<Integer> arr = new CustomArrayList(array);
        System.out.println(arr.toString());

        arr.pushBack(4);
        System.out.println(arr.toString());

        arr.popFront();
        System.out.println(arr.toString());

        arr.pushFront(7);
        System.out.println(arr.toString());

        arr.insert(3,3);
        System.out.println(arr.toString());

        arr.removeAt(2);
        System.out.println(arr.toString());

        arr.remove(7);
        System.out.println(arr.toString());

        arr.removeAll(8);
        System.out.println(arr.toString());

        arr.popBack();
        System.out.println(arr.toString());

        System.out.println(arr.indexOf(6));

        System.out.println(arr.lastIndexOf(6));

        arr.revers();
        System.out.println(arr.toString());

        System.out.println(arr.getElementAt(1));

        System.out.println(arr.getSize());

        arr.trimToSize();
        System.out.println(arr.toString());

        arr.clear();
        System.out.println(arr.toString());

        System.out.println(arr.isEmpty());






    }
}
