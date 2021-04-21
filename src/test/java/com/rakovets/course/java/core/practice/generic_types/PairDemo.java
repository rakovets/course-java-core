package com.rakovets.course.java.core.practice.generic_types;

public class PairDemo {
    public static void main(String[] args) {
        Pair pair = new Pair(20,10);
        System.out.println("Field K = " + pair.getFieldK());
        System.out.println("Field V = " + pair.getFieldV());
        pair.setFieldK(30);
        pair.setFieldV(40);
        System.out.println("New field K = " + pair.getFieldK());
        System.out.println("New field V = " + pair.getFieldV());

        Pair pair1 = Pair.swap(pair);
        System.out.println("Field K after swap: " + pair1.getFieldK());
        System.out.println("Field V after swap: " + pair1.getFieldV());

        Pair pair2 = pair.getSwapped();
        System.out.println("Field K after getSwapped: " + pair2.getFieldK());
        System.out.println("Field V after getSwapped: " + pair2.getFieldV());




    }
}
