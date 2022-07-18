package com.rakovets.course.java.core.practice.generics.pair;

public class Pair <K, V> {
    public K first;
    public V second;

    public Pair (K first, V second) {
        this.first = first;
        this.second = second;
    }

    public Pair<K, V> getSwapped() {
        K firstSwapped = (K) getSecond();
        V secondSwapped = (V) getFirst();
        setFirst(firstSwapped);
        setSecond(secondSwapped);
        return this;
    }

    public static <K,V> Pair<K,V> swap(Pair <K,V> pair) {
        return  pair.getSwapped();
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
