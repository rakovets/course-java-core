package com.rakovets.course.java.core.practice.generics;

public class Pair<K, T> {
    private K atHome;
    private T orNotAtHome;

    public Pair(K atHome, T orNotAtHome) {
        this.atHome = atHome;
        this.orNotAtHome = orNotAtHome;
    }

    public Pair getSwapped() {
        return new Pair<>(this.orNotAtHome, this.atHome);
    }

    public static Pair swap(Pair pair) {
        return pair.getSwapped();
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
