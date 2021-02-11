package com.rakovets.course.java.core.practice.generic_types;

public class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair(pair.getSecond(), pair.getFirst());
    }

    public Pair<V, K> getSwapped() {
        return new Pair(this.getSecond(), this.getFirst());
    }

}

