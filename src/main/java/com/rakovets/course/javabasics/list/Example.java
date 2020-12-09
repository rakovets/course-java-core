package com.rakovets.course.javabasics.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(2);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();
        iterator.hasNext();

    }


}
