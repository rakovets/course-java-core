package com.rakovets.course.java.core.practice.generics.project_pair;

public class PairDemo {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Bob", 100);
        System.out.println(pair.getName() + " " + pair.getNum() + " родная пара №1");
        Pair<Integer, String> pair2 = new Pair<>(100, "Bob");
        System.out.println(pair2.getName() + " " + pair2.getNum() + " родная пара перевернутая вручную №2");
        System.out.println((Pair.swap(pair2).getName()) + " " + Pair.swap(pair2).getNum() + " пара №2 перевернутая методом swap");
        Pair <Integer, String> pair4 = pair.getSwapped();
        System.out.println((pair4.getName()) + " " + pair4.getNum() + " родная пара №1 перевернутая методом getSwapped");
    }
}
