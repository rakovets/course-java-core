package com.rakovets.course.java.core.practice.generics;

public class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public Pair getSwapped() {
        return new Pair(this.second, this.first);
    }

    public static Pair swap(Pair pair) {
        return pair.getSwapped();
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}
