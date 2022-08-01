package com.rakovets.course.java.core.practice.jcf_list.schoolclass;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person>  {
    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getAge(), person2.getAge());
    }
}

