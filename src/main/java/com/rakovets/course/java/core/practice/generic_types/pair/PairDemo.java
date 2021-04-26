package com.rakovets.course.java.core.practice.generic_types.pair;

public class PairDemo {
    public static void main(String[] args) {
        Pair pair = new Pair(55, 11);
        System.out.println("K = " + pair.getTapeFieldK());
        System.out.println("V = " + pair.getTapeFieldV());
        pair.setTapeFieldK(10.10);
        pair.setTapeFieldV(0.25);
        System.out.println("New K = " + pair.getTapeFieldK());
        System.out.println("New V = " + pair.getTapeFieldV());

        Pair pair1 = Pair.swap(pair);
        System.out.println("K after swap: " + pair1.getTapeFieldK());
        System.out.println("V after swap: " + pair1.getTapeFieldV());

        Pair pair2 = pair.getSwapped();
        System.out.println("K after getSwapped: " + pair2.getTapeFieldK());
        System.out.println("V after getSwapped: " + pair2.getTapeFieldV());
    }

}
