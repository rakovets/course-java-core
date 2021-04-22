package com.rakovets.course.java.core.practice.generic_types;

public class PairDemo {
        public static void main(String[] args) {
            Pair<String, String> pair = new Pair("Hello", "Good bye");
            System.out.println(pair.getItem1());
            System.out.println(pair.getItem2());
            System.out.println(Pair.swap(pair).getItem1());
            System.out.println(pair.getSwapped().getItem1());

        }
}
