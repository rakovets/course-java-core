package com.rakovets.course.java.core.practice.generics;

public class PairDemo {
    public static void main(String[] args) {
        Pair pair = new Pair("First", 2);
        Pair newSwappedPair = Pair.swap(pair);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        System.out.println(newSwappedPair.getFirst());
        System.out.println(newSwappedPair.getSecond());

        Pair swappedPair = pair.getSwapped();

        System.out.println("pair is swappedPair: " + pair.equals(swappedPair));

        System.out.println(swappedPair.getFirst());
        System.out.println(swappedPair.getSecond());
    }
}
