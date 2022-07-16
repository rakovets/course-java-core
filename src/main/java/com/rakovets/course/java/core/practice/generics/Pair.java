package com.rakovets.course.java.core.practice.generics;

import java.util.Objects;

public class Pair<K, V> {
    private final K firstParameter;
    private final V secondParameter;

    /**
     * Constructor.
     *
     * @param firstParameter  first generic.
     * @param secondParameter second generic.
     */
    public Pair(K firstParameter, V secondParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    /**
     * Swaps the elements of a pair.
     *
     * @return the current Pair.
     */
    public Pair<V, K> getSwapped() {
        return new Pair<>(this.getSecondParameter(), this.getFirstParameter());
    }

    /**
     * Changes values in a pair.
     *
     * @param pair accepting parameter.
     * @param <K>  the first value of the generic type.
     * @param <V>  the second value of the generic type.
     * @return the current Pair.
     */
    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getSecondParameter(), pair.getFirstParameter());
    }

    public K getFirstParameter() {
        return firstParameter;
    }

    public V getSecondParameter() {
        return secondParameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;

        return firstParameter.equals(pair.firstParameter) && secondParameter.equals(pair.secondParameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstParameter, secondParameter);
    }
}
