package com.rakovets.course.java.core.practice.jcf_list.class_project;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person s1, Person s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}
