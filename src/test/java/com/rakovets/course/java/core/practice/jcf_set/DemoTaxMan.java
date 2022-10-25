package com.rakovets.course.java.core.practice.jcf_set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DemoTaxMan {
    public static void main(String[] args) {
        Set<Taxman> taxmanSet = new HashSet<>();

        Taxman taxman = new Taxman(12, 2, Collections.singleton(TypeOfTax.Hard));
        Taxman taxman1 = new Taxman(2, 2, Collections.singleton(TypeOfTax.Light));
        Taxman taxman2 = new Taxman(23, 27, Collections.singleton(TypeOfTax.Light));
        Taxman taxman3 = new Taxman(8, 8, Collections.singleton(TypeOfTax.Light));
    }
}
