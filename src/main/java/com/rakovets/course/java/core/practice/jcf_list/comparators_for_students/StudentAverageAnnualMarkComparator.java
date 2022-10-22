package com.rakovets.course.java.core.practice.jcf_list.comparators_for_students;

import com.rakovets.course.java.core.practice.jcf_list.project_class.Person;
import java.util.Comparator;

public class StudentAverageAnnualMarkComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Double.compare(o1.getAverageAnnualMark(), o2.getAverageAnnualMark());
    }
}
