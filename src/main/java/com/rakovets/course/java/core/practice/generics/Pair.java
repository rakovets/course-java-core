package com.rakovets.course.java.core.practice.generics;

public class Pair<K, T> {
    private K atHome;
    private T orNotAtHome;

    public Pair(K atHome, T orNotAtHome) {
        this.atHome = atHome;
        this.orNotAtHome = orNotAtHome;
    }

    public <K, T> Pair<T, K> getSwapped() {
        return new Pair<T, K>((T) getOrNotAtHome(), (K) getAtHome());
    }

    static public <K, T> Pair<T, K> swap(Pair<K, T> pair) {
        return new Pair<T, K>(pair.getOrNotAtHome(), pair.getAtHome());
    }

    public K getAtHome() {
        return atHome;
    }

    public T getOrNotAtHome() {
        return orNotAtHome;
    }

    public void setAtHome(K atHome) {
        this.atHome = atHome;
    }

    public void setOrNotAtHome(T orNotAtHome) {
        this.orNotAtHome = orNotAtHome;
    }
}
