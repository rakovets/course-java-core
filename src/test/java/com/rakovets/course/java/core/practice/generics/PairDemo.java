package com.rakovets.course.java.core.practice.generics;

public class PairDemo {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("First", 2);
        Pair swappedPair = pair.getSwapped();
        Pair newSwappedPair = Pair.swap(swappedPair);


        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        System.out.println(swappedPair.getFirst());
        System.out.println(swappedPair.getSecond());

        System.out.println(newSwappedPair.getFirst());
        System.out.println(newSwappedPair.getSecond());
    }
}
