package com.rakovets.course.java.core.practice.generics;

public class Pair<K, V> {
    private K firstMember;
    private V secondMember;

    public Pair(K firstMember, V secondMember) {
        this.firstMember = firstMember;
        this.secondMember = secondMember;
    }

    public Pair <K, V> getSwapped() {
        K tempFirstMember = getFirstMember();
        V tempSecondMember = getSecondMember();
        setFirstMember((K) tempSecondMember);
        setSecondMember((V) tempFirstMember);
        return this;
    }

    public static <K, V> Pair<K, V> swap(Pair<K, V> pair) {
        return pair.getSwapped();
    }

    public K getFirstMember() {
        return this.firstMember;
    }

    public void setFirstMember(K firstMember) {
        this.firstMember = firstMember;
    }

    public V getSecondMember() {
        return this.secondMember;
    }

    public void setSecondMember(V secondMember) {
        this.secondMember = secondMember;
    }
}
