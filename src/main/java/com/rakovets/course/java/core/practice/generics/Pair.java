package com.rakovets.course.java.core.practice.generics;

public class Pair<K, V> {
    private K filedTypeK;
    private V filedTypeV;

    public Pair(K kTypeFiled, V vTypeFiled) {
        this.filedTypeK = kTypeFiled;
        this.filedTypeV = vTypeFiled;
    }

    public <K, V> Pair<V, K> getSwapped() {
        return new Pair<V, K>((V) getFiledTypeV(), (K) getFiledTypeK());
    }

    static public <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<V, K>(pair.getFiledTypeV(), pair.getFiledTypeK());
    }

    public K getFiledTypeK() {
        return filedTypeK;
    }

    public void setFiledTypeK(K filedTypeK) {
        this.filedTypeK = filedTypeK;
    }

    public V getFiledTypeV() {
        return filedTypeV;
    }

    public void setFiledTypeV(V filedTypeV) {
        this.filedTypeV = filedTypeV;
    }
}
