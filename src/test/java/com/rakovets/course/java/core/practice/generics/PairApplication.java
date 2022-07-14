package com.rakovets.course.java.core.practice.generics;

public class PairApplication {
    public static void main(String[] args) {
        Pair p = new Pair<>(1, "test");

        p.getSwapped();
        System.out.println(p.getFirstMember());
        System.out.println(p.getSecondMember());

        Pair.swap(p);
        System.out.println(p.getFirstMember());
        System.out.println(p.getSecondMember());

        Pair<String, Integer> pair = new Pair<> ("First", 2);
        pair.getSwapped();
        pair.getFirstMember();
        pair.getSecondMember();
    }
}
