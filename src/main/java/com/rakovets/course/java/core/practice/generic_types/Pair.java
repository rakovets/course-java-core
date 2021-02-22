package com.rakovets.course.java.core.practice.generic_types;

public class Pair <K, V>{
    private K key;
    private V value;

    public Pair(K one, V two) {
        this.key = one;
        this.value = two;
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getTwo(), pair.getOne());
    }

    public Pair<V, K> getSwapped() {
        return new Pair<>(this.getTwo(), this.getOne());
    }

    public K getOne() {
        return key;
    }

    public V getTwo() {
        return value;
    }
}
