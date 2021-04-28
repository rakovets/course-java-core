package com.rakovets.course.java.core.practice.jcf_set.operations;

import java.util.Comparator;

public class OperationsComparator implements Comparator<Operation> {


    @Override
    public int compare(Operation o1, Operation o2) {
        return o1.getPriority().compareTo(o2.getPriority());
    }
}
