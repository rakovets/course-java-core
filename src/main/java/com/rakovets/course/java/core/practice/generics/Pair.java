package com.rakovets.course.java.core.practice.generics;

public class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <K, V> Pair<K, V> swap(Pair<K, V> pair) {
        return pair.getSwapped();
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

    public Pair<K, V> getSwapped() {
        K firstNew = (K) getSecond();
        V secondNew = (V) getFirst();
        setFirst(firstNew);
        setSecond(secondNew);
        return this;
    }
}
