package com.rakovets.course.java.core.practice.generic_types;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(12,"Hello");
        System.out.println("First value = " + pair.getK() + ", second value = " + pair.getV());

        Pair pair1 = Pair.swap(pair);
        System.out.println("First value = " + pair1.getK() + ", second value = " + pair1.getV());

        Pair pair2 = pair.getSwapped();
        System.out.println("First value = " + pair2.getK() + ", second value = " + pair2.getV());
    }
}
