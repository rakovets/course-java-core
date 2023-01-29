package com.rakovets.course.java.core.practice.generics;

public class Pair<K, V> {
    private K object;
    private V variable;

    public Pair(K object, V variable) {
        this.object = object;
        this.variable = variable;
    }

    public K getObject() {
        return object;
    }

    public void setObject(K object) {
        this.object = object;
    }

    public V getVariable() {
        return variable;
    }

    public void setVariable(V variable) {
        this.variable = variable;
    }

    public Pair<V, K> getSwapped() {
        return new Pair<>(getVariable(), getObject());
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getVariable(), pair.getObject());
    }
}
