package com.rakovets.course.java.core.practice.jcf_list.Class;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Double.compare(o1.getAge(),o2.getAge());
    }
}
