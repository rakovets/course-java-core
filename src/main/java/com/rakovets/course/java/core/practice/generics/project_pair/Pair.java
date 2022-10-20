package com.rakovets.course.java.core.practice.generics.project_pair;

public class Pair <K, V> {
    private K name;
    private V num;

    public Pair(K name, V num) {
        this.name = name;
        this.num = num;
    }

    public Pair<V, K> getSwapped() {
        return new Pair<>(this.getNum(), this.getName());
    }

    public static <V, K> Pair<V, K> swap(Pair <K, V> ob) {
        return new Pair <>(ob.getNum(), ob.getName());
    }

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public V getNum() {
        return num;
    }

    public void setNum(V num) {
        this.num = num;
    }
}
