package com.rakovets.course.java.core.practice.generics;

public class Pair<K, V> {
    private K firstParametr;
    private V secondParametr;

    public Pair(K firstParametr, V secondParametr) {
        this.firstParametr = firstParametr;
        this.secondParametr = secondParametr;
    }

    public Pair<V, K> getSwapped() {
        return new Pair<>(secondParametr, firstParametr);
    }

    public static Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getSecondParametr(), pair.getFirstParametr());
    }

    public K getFirstParametr() {
        return firstParametr;
    }

    public V getSecondParametr() {
        return secondParametr;
    }

    public void setFirstParametr(K firstParametr) {
        this.firstParametr = firstParametr;
    }

    public void setSecondParametr(V secondParametr) {
        this.secondParametr = secondParametr;
    }
}
