package com.rakovets.course.java.core.practice.generic_types;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(111, "112");
        Pair pair2 = Pair.swap(new Pair<Integer,String>(12,"20"));
        Pair pair3 = pair1.getSwapped();

        System.out.println(pair1.getKey() + "  " + pair1.getValue());
        System.out.println(pair2.getKey() + "  " + pair2.getValue());
        System.out.println(pair3.getKey() + "  " + pair3.getValue());
    }
}
