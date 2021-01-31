package com.rakovets.course.java.core.practice.generic_types;

public class Pair<K, V>{
    private K one;
    private V two;

    public Pair(K one, V two) {
        this.one = one;
        this.two = two;
    }

    public static String swap(Pair pair) {
        return pair.getTwo().toString() + pair.getOne().toString();
    }

    public String getSwap() {
        return two.toString() + one.toString();
    }

    public K getOne() {
        return one;
    }

    public void setOne(K one) {
        this.one = one;
    }

    public V getTwo() {
        return two;
    }

    public void setTwo(V two) {
        this.two = two;
    }
}
