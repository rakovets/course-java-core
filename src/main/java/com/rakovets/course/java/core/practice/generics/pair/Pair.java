package com.rakovets.course.java.core.practice.generics.pair;

public class Pair <K, V> {
    public K first;
    public V second;

    public Pair (K first, V second) {
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
}
