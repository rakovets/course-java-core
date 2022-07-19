package com.rakovets.course.java.core.practice.generics;

public class PairDemo {
    public static void main(String[] args) {
        Pair <Integer, String> pair = new Pair(10, "Home");
        Pair swapPair = pair.getSwapped();
        Pair newSwapPair = Pair.swap(swapPair);

        System.out.println(pair.getFirstObject());
        System.out.println(pair.getSecondObject());

        System.out.println(swapPair.getFirstObject());
        System.out.println(swapPair.getSecondObject());

        System.out.println(newSwapPair.getFirstObject());
        System.out.println(newSwapPair.getSecondObject());
    }
}
