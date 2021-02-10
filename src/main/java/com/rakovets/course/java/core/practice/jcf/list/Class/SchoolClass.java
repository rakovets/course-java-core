package com.rakovets.course.java.core.practice.jcf.list.Class;

import java.util.ArrayList;

public class SchoolClass {
    private ArrayList<Person> students;

    public SchoolClass(ArrayList<Person> students) {
        this.students = students;
    }

    public Person getBestStudent(ArrayList<Person> students) {
        Person bestStudent = students.get(0);
        for (Person person : students) {
            if (person.getAverageAnnualMark() > bestStudent.getAverageAnnualMark())
                bestStudent = person;
        }
        return bestStudent;
    }
}
