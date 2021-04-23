package com.rakovets.course.java.core.example.jcf_set.model;

public class ComparableDog implements Comparable<ComparableDog> {
    private final String name;

    public ComparableDog(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(ComparableDog o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "ComparableDog{" +
                "name='" + name + '\'' +
                '}';
    }
}
