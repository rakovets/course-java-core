package com.rakovets.course.java.core.practice.jcf_collection.list.myclas;

import java.util.Comparator;

public class SortAnnualMarkComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Double.compare(o1.getAverageAnnualMark(), o2.getAverageAnnualMark());
    }
}
