package com.rakovets.course.java.core.practice.generics;

import java.util.Objects;

public class Pair<K, V> {
    private K left;
    private V right;

    public Pair(K left, V right) {
        this.left = left;
        this.right = right;
    }

    public <K, V> Pair<V, K> getSwapped() {
        return new Pair<>((V) right, (K) left);
    }

    public static <K, V> Pair<K, V> swap(Pair<K, V> reverse) {
        return reverse.getSwapped();
    }

    public K getLeft() {
        return left;
    }

    public void setLeft(K left) {
        this.left = left;
    }

    public V getRight() {
        return right;
    }

    public void setRight(V right) {
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return left.equals(pair.left) && right.equals(pair.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
}
