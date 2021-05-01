package com.rakovets.course.java.core.practice.generic_types;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, Integer> pair = new Pair<>(15,124);
        System.out.println(pair.getParametriseObjectV());
        System.out.println(pair.getParametriseObjectK());
        System.out.println(Pair.swap(pair));
        System.out.println(pair.getSwapped());
    }
}
