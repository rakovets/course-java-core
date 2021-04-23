package com.rakovets.course.java.core.example.jcf_set;

import com.rakovets.course.java.core.example.jcf_set.model.ComparableDog;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample5WithCustomComparableObject {
    public static void main(String[] args) {
        Set<ComparableDog> comparableDogs = new TreeSet<>();
        comparableDogs.add(new ComparableDog("Rex"));
        comparableDogs.add(new ComparableDog("John"));
        comparableDogs.add(new ComparableDog("Show"));

        for (ComparableDog comparableDog : comparableDogs) {
            System.out.println(comparableDog);
        }
    }
}

