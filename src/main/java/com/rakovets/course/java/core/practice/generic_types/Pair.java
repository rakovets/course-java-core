package com.rakovets.course.java.core.practice.generic_types;

public class Pair<K, V> {
    private K field1;
    private V field2;

    public Pair(K field1, V field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public K getField1() {
        return field1;
    }

    public void setField1(K field1) {
        this.field1 = field1;
    }

    public V getField2() {
        return field2;
    }

    public void setField2(V field2) {
        this.field2 = field2;
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair(pair.getField2(), pair.getField1());
    }

    public <K, V> Pair<V, K> getSwapped() {
        return new Pair(getField2(), getField1());
    }
}
