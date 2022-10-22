package com.rakovets.course.java.core.practice.jcf_list.comparators_for_students;

import com.rakovets.course.java.core.practice.jcf_list.project_class.Person;
import java.util.Comparator;

public class StudentFullNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        var result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            return o1.getSurname().compareTo(o2.getSurname());
        } else {
            return result;
        }
    }
}
