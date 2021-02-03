package com.rakovets.course.java.core.practice.generic_types;

public class Pair<K, V> {
    private K var1;
    private V var2;

    public K getVar1() {
        return var1;
    }

    public void setVar1(K var1) {
        this.var1 = var1;
    }

    public V getVar2() {
        return var2;
    }

    public void setVar2(V var2) {
        this.var2 = var2;
    }

    public Pair(K var1, V var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public static <K, V> Pair<V, K> swap(Pair <K, V> pair) {
        return new Pair<>(pair.getVar2(), pair.getVar1());
    }

    public Pair<V, K> getSwapped() {
        return new Pair<>(this.getVar2(), this.getVar1());
    }
}
