package com.rakovets.course.java.core.practice.jcf_list.Class.Comparators;

import com.rakovets.course.java.core.practice.jcf_list.Class.Models.Person;

import java.util.Comparator;

public class FullNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person student1, Person student2) {
        var result = student1.getName().compareTo(student2.getName());
        return result == 0 ? student1.getSurname().compareTo(student2.getSurname()) : result;
    }
}
