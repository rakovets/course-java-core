package com.rakovets.course.java.core.practice.generic_types;

public class PairDemo {
    public static void main(String[] args) {
        Pair pair = new Pair(20,10);
        System.out.println(Pair.swap(pair).getSwapped());
    }
}
