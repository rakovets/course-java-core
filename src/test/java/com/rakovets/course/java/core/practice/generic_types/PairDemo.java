package com.rakovets.course.java.core.practice.generic_types;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, Integer> pair = new Pair<>(50,60);
        System.out.printf("%s %s \n", pair.getK(), pair.getV());

        Pair pair1 = pair.getSwapped();
        System.out.printf("%s %s \n", pair1.getK(), pair1.getV());
    }
}
