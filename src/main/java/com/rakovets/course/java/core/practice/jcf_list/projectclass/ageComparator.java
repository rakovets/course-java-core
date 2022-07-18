package com.rakovets.course.java.core.practice.jcf_list.projectclass;

import com.rakovets.course.java.core.practice.jcf_list.projectstudio.Actor;

import java.util.Comparator;

public class ageComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getAge() == p2.getAge())
            return 0;
        else if (p1.getAge() > p2.getAge())
            return 1;
        else
            return -1;
    }
}
