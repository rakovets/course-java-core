package com.rakovets.course.java.core.practice.jcf_list.projectclass;

import java.util.List;

public class SchoolClass {
    private List<Person> person;

    public SchoolClass(List<Person> person) {
        this.person = person;
    }

    public static Person getBestStudent(List<Person> person) {
        double maxMark = 0.0;
        int bestStudentIndex = 0;
        for (Person p : person) {
            if (p.getAverageAnnualMark() > maxMark) {
                maxMark = p.getAverageAnnualMark();
                bestStudentIndex = person.indexOf(p);
            }
        }
        return person.get(bestStudentIndex);
    }
}
