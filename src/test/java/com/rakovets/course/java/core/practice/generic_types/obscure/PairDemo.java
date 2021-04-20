package com.rakovets.course.java.core.practice.generic_types.obscure;

public class PairDemo {
    public static void main(String[] args) {
        Pair pair = new Pair(10,20);
        System.out.println(pair.getFirstParameter());
        System.out.println(pair.getSecondParameter());
        System.out.println(pair.getSwapped().getSecondParameter());
        System.out.println(Pair.swap(pair).getFirstParameter());
    }
}
