package com.rakovets.course.java.core.practice.generic_types;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, Integer> pair = new Pair<>(14, 19);
        System.out.println(pair);
        pair = pair.getSwapped();
        System.out.println(pair);

    }
}
