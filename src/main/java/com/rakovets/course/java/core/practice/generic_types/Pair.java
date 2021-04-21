package com.rakovets.course.java.core.practice.generic_types;

public class Pair<K,V> {
    private K firstParametr;
    private V secondParametr;

    public Pair(K firstParametr,V secondParametr){
        this.firstParametr = firstParametr;
        this.secondParametr = secondParametr;
    }

    public K getFirstParametr() {
        return firstParametr;
    }

    public V getSecondParametr() {
        return secondParametr;
    }

    public static <K,V> Pair<K,V> swap(Pair<K,V> swap){
        return new Pair(swap.getSecondParametr(),swap.getFirstParametr());
    }

    public String getSwapped(){
        return getFirstParametr().toString() +" "+getSecondParametr().toString();
    }

}

