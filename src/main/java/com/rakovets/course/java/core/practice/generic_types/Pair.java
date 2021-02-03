package com.rakovets.course.java.core.practice.generic_types;

public class Pair<V, K> {
    private V v1;
    private K k2;

    public Pair(V v1, K k2) {
        this.v1 = v1;
        this.k2 = k2;
    }

    public V getV1() {
        return v1;
    }

    public K getK2() {
        return k2;
    }

    public void setV1(V v1) {
        this.v1 = v1;
    }

    public void setK2(K k2) {
        this.k2 = k2;
    }

    public static <K, V> Pair<V, K> swap(Pair<V, K> pair) {
        return new Pair<>(pair.getV1(), pair.getK2());
    }

    public Pair<V, K> getSwapped() {
        return new Pair<>(this.getV1(), this.getK2());
    }
}




