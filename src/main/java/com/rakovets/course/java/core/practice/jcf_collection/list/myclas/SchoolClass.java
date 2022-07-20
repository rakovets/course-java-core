package com.rakovets.course.java.core.practice.jcf_collection.list.myclas;

import java.util.List;

public class SchoolClass {
    private List<Person> students;

    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    public Person getBestStudent(List<Person> student) {
        double maxMark = 0;
        int index = 0;
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getAverageAnnualMark() > maxMark) {
                maxMark = student.get(i).getAverageAnnualMark();
                index = i;
            }
        }
        return student.get(index);
    }
}
