package com.rakovets.course.java.core.practice.jcf_list.schoolclass;

import java.util.Comparator;

public class PersonFullNameComparator implements Comparator<Person>{
    @Override
    public int compare (Person person1, Person person2) {
        var result = person1.getSurname().compareTo(person2.getSurname());
        if (result == 0) {
            return person1.getName().compareTo(person2.getName());
        } else {
            return result;
        }
    }
}
