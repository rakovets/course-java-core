package com.rakovets.course.challenge.generics.pair;

public class Program {
    public static void main(String[] args) {
        Pair<String, String> object = new Pair("Jack", "Sam");
        System.out.printf("First is %s, second is %s \n", object.getFirst(), object.getSecond());
        PairUtil.swap(object);
        System.out.printf("First is %s, second is %s \n", object.getFirst(), object.getSecond());
    }
}
