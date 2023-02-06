package com.rakovets.course.java.core.practice.jcf_set.tax_service;

import java.util.HashSet;

public class Fines {
    private HashSet<Fine> fines;

    public void addFine(Fine fine) {
        fines.add(fine);
    }
}
