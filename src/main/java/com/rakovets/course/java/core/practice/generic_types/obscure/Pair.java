package com.rakovets.course.java.core.practice.generic_types.obscure;

public class Pair<K, V> {
    private K firstParameter;
    private V secondParameter;

    public Pair(K firstParameter, V secondParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    public K getFirstParameter() {
        return firstParameter;
    }

    public V getSecondParameter() {
        return secondParameter;
    }

    public void setFirstParameter(K firstParameter) {
        this.firstParameter = firstParameter;
    }

    public void setSecondParameter(V secondParameter) {
        this.secondParameter = secondParameter;
    }

    public static <K,V> Pair<K,V> swap(Pair<K, V> pair) {
        return new Pair(pair.getSecondParameter(),pair.getFirstParameter());
    }

    public Pair<K, V> getSwapped() {
        return new Pair(getSecondParameter(),getFirstParameter());
    }
}
