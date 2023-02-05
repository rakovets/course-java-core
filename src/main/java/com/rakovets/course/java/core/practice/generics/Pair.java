package com.rakovets.course.java.core.practice.generics;

public class Pair<K, V> {
    private K kVariable;
    private V vVariable;

    public Pair(K kVariable, V vVariable) {
        this.kVariable = kVariable;
        this.vVariable = vVariable;
    }

    public Pair<V, K> getSwapped() {
        return new Pair<>(getvVariable(), getkVariable());
    }

    public static <V, K> Pair<V, K> swap(Pair<K, V> pair) {
        return pair.getSwapped();
    }

    public K getkVariable() {
        return kVariable;
    }

    public void setkVariable(K kVariable) {
        this.kVariable = kVariable;
    }

    public V getvVariable() {
        return vVariable;
    }

    public void setvVariable(V vVariable) {
        this.vVariable = vVariable;
    }
}
