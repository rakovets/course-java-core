package com.rakovets.course.java.core.practice.generics;

public class Pair<K, V> {
    private K firstMember;
    private V secondMember;

    public Pair(K firstMember, V secondMember) {
        this.firstMember = firstMember;
        this.secondMember = secondMember;
    }

    public void getSwapped() {
        K tempK = getFirstMember();
        V tempV = getSecondMember();
        setFirstMember((K) tempV);
        setSecondMember((V) tempK);
        //return new Pair(tempK, tempV);
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
