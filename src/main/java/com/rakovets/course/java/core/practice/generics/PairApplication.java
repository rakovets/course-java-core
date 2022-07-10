package com.rakovets.course.java.core.practice.generics;

public class PairApplication {
    public static void main(String[] args) {
        Pair p = new Pair<>(1, 2);

        p.getSwapped();
        System.out.println(p.getFirstMember());
        System.out.println(p.getSecondMember());
    }
}
