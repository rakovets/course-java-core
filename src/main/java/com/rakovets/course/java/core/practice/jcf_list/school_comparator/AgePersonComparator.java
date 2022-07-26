package com.rakovets.course.java.core.practice.jcf_list.school_comparator;

import com.rakovets.course.java.core.practice.jcf_list.Person;

import java.util.Comparator;

public class AgePersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
