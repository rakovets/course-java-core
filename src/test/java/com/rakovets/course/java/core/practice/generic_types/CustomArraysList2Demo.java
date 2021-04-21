package com.rakovets.course.java.core.practice.generic_types;

import java.util.ArrayList;

public class CustomArraysList2Demo {
    public static void main(String[] args) {

        CustomArrayList<Integer> array = new CustomArrayList(10);
        array.pushFront(8);
        array.pushBack(9);
        array.pushBack(10);
        array.pushFront(1);
        array.pushFront(6);
        array.trimToSize();
        array.printCustomArray();
        array.reverse();
        System.out.print("AfterReverse = ");
        array.printCustomArray();
        array.shuffle();
        System.out.print("AfterShuffle = ");
        array.printCustomArray();


    }
}
