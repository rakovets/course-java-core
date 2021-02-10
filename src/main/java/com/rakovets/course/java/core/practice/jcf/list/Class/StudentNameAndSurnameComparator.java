package com.rakovets.course.java.core.practice.jcf.list.Class;

import java.util.Comparator;

public class StudentNameAndSurnameComparator implements Comparator<Person> {

    @Override
    public int compare(Person s1, Person s2) {
        var result = s1.getName().compareTo(s2.getName());
        if (result == 0)
            return s1.getSurname().compareTo(s2.getSurname());
        else
            return result;
    }
}
