package com.rakovets.course.java.core.practice.jcf_list.school_class;

import java.util.List;

public class SchoolClass {
    private final List<Person> students;

    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    public Person getBestStudent(List<Person> students) {
        Person teachersPet = students.get(0);
        for (Person person : students) {
            if (person.getAverageAnnualMark() > teachersPet.getAverageAnnualMark())
                teachersPet = person;
        }
        return teachersPet;
    }

    public List<Person> getStudents() {
        return students;
    }
}
