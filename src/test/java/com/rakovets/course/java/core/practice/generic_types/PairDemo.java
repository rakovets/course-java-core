package com.rakovets.course.java.core.practice.generic_types;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(12,"Hello");
        System.out.println("First value = " + pair.getField1() + ", second value = " + pair.getField2());

        Pair pair1 = Pair.swap(pair);
        System.out.println("First value = " + pair1.getField1() + ", second value = " + pair1.getField2());

        Pair pair2 = pair.getSwapped();
        System.out.println("First value = " + pair2.getField1() + ", second value = " + pair2.getField2());
    }
}
