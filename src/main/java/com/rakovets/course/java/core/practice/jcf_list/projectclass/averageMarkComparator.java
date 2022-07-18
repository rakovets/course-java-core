package com.rakovets.course.java.core.practice.jcf_list.projectclass;

import java.util.Comparator;

public class averageMarkComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getAverageAnnualMark() == p2.getAverageAnnualMark())
            return 0;
        else if (p1.getAverageAnnualMark() > p2.getAverageAnnualMark())
            return 1;
        else
            return -1;
    }
}
