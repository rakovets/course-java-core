package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.List;

public class StringCollectiongUtillDemo {
    public static void main(String[] args) {
        StringCollectiongUtil stringCollectiongUtil = new StringCollectiongUtil();
        List<String> book = new ArrayList<>();
        book.add("Solomon");
        book.add("Grundy");
        book.add("born");
        book.add("on");
        book.add("a");
        book.add("Monday");
        book.add("Christened");
        book.add("on");
        book.add("Tuesday");
        book.add("Married");
        book.add("on");
        book.add("Wednesday");
        book.add("Took");
        book.add("ill");
        book.add("on");
        book.add("Thursday");
        book.add("Grew");
        book.add("worse");
        book.add("on");
        book.add("Friday");
        book.add("Died");
        book.add("on");
        book.add("Saturday");
        book.add("Buried");
        book.add("on");
        book.add("Sunday");
        book.add("That");
        book.add("was");
        book.add("the");
        book.add("end");
        book.add("of");
        book.add("Solomon");
        book.add("Grundy");

        outputList(book);
        stringCollectiongUtil.resetWordsByLength(book, 4);
        outputList(book);
        stringCollectiongUtil.removeWordsByLength(book, 2);
        outputList(book);
    }

    private static void outputList(List<String> textList) {
        System.out.println(textList);
    }
}
