package com.rakovets.course.java.core.practice.jcf_list.Class.Models;

import com.rakovets.course.java.core.practice.jcf_list.Class.Comparators.MarksComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SchoolClass {
    List<Person> students;

    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    public Person getBestStudent(List<Person> students) {
        Person bestOne = students.get(0);
        for (Person person: students) {
            if (person.getAverageAnnualMark() > bestOne.getAverageAnnualMark())
                bestOne = person;
        }
        return bestOne;
    }
}
