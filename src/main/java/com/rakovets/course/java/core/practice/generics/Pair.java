package com.rakovets.course.java.core.practice.generics;

public class Pair<K, V> {
    private K firstField;
    private V secondField;

    public Pair(K firstField, V secondField) {
        this.firstField = firstField;
        this.secondField = secondField;
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getSecondField(), pair.getFirstField());
    }

    public Pair<K, V> getSwapped() {
        K firstNew = (K) getSecondField();
        V secondNew = (V) getFirstField();
        setFirstField(firstNew);
        setSecondField(secondNew);
        return this;
    }

    public K getFirstField() {
        return firstField;
    }

    public V getSecondField() {
        return secondField;
    }

    public void setFirstField(K firstField) {
        this.firstField = firstField;
    }

    public void setSecondField(V secondField) {
        this.secondField = secondField;
    }
}
