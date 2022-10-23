package com.rakovets.course.java.core.practice.jcf_list.comparatot_for_class;

import com.rakovets.course.java.core.practice.jcf_list.life_of_class.Person;
import java.util.Comparator;

public class SurNameAndNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int firstLetterOfSurname = o1.getSurname().compareTo(o2.getSurname());
        if (firstLetterOfSurname == 0) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return firstLetterOfSurname;
        }
    }
}
