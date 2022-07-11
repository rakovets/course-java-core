package com.rakovets.course.java.core.practice.generics;

public class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public Pair<K, V> getSwapped() {
        K firstNew = (K) getSecond();
        V secondNew = (V) getFirst();
        setFirst(firstNew);
        setSecond(secondNew);
        return this;
    }

    public static Pair swap(Pair pair) {
        return new Pair(pair.second, pair.first);
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
