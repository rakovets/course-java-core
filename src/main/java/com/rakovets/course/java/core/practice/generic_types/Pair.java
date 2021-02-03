package com.rakovets.course.java.core.practice.generic_types;

public class Pair <K, V>{
    private K one;
    private V two;

    public Pair(K one, V two) {
        this.one = one;
        this.two = two;
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getTwo(), pair.getOne());
    }

    public Pair<V, K> getSwapped() {
        return new Pair<>(this.getTwo(), this.getOne());
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
