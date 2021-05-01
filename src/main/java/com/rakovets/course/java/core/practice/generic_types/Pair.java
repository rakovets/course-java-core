package com.rakovets.course.java.core.practice.generic_types;

public class Pair<K, V> {
    private K parametriseObjectK;
    private V parametriseObjectV;

    public Pair(K parametriseObjectK, V parametriseObjectV) {
        this.parametriseObjectK = parametriseObjectK;
        this.parametriseObjectV = parametriseObjectV;
    }

    public K getParametriseObjectK() {
        return parametriseObjectK;
    }

    public V getParametriseObjectV() {
        return parametriseObjectV;
    }

    public void setParametriseObjectK(K parametriseObjectK) {
        this.parametriseObjectK = parametriseObjectK;
    }

    public void setParametriseObjectV(V parametriseObjectV) {
        this.parametriseObjectV = parametriseObjectV;
    }

    public static <SV, SK> Pair<SV, SK> swap(Pair<SK, SV> pair) {
        return new Pair<>(pair.parametriseObjectV, pair.parametriseObjectK);
    }

    public Pair<V, K> getSwapped() {
        return new Pair<V, K>(parametriseObjectV, parametriseObjectK);
    }

    @Override
    public String toString() {
        return "Pair { " +
                "key = " + parametriseObjectK +
                ", value = " + parametriseObjectV +
                " }";
    }
}
