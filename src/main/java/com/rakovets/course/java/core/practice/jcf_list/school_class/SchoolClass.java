package com.rakovets.course.java.core.practice.jcf_list.school_class;

import java.util.List;

public class SchoolClass {
    private List<Person> students;

    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    public String getBestStudent(List<Person> students) {
        int indexSupremeAverageMark = 0;
        for (int i = 1; i < students.size(); i++) {
            indexSupremeAverageMark = (students.get(indexSupremeAverageMark).getAverageAnnualMark()
            - students.get(i).getAverageAnnualMark()) < 0
                    ? i
                    : indexSupremeAverageMark;
        }
        return "Best " + students.get(indexSupremeAverageMark).toString();
    }
}
