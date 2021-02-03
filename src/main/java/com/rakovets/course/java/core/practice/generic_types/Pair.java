package com.rakovets.course.java.core.practice.generic_types;

public class Pair <K, V>{
    private K one;
    private V two;

    public Pair(K one, V two) {
        this.one = one;
        this.two = two;
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        Pair<V, K> newPair = new Pair<>(pair.two, pair.one);
        return newPair;
    }

    public Pair<V, K> getSwapped() {
        Pair<V, K> newPair = new Pair<>(this.two, this.one);
        return newPair;
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
