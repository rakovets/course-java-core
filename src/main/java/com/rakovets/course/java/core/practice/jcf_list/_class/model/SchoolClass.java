package com.rakovets.course.java.core.practice.jcf_list._class.model;

import java.util.List;

public class SchoolClass {
    private List<Student> students;

    public SchoolClass(List<Student> students) {
        this.students = students;
    }

    public Student getBestStudent(List<Student> students) {
        double bestEverageMark = 0;
        int tempIndex = 0;
        for (int i = 0; i < students.size(); i++) {
            if (bestEverageMark < students.get(i).getAverageAnnualMark()) {
                bestEverageMark = students.get(i).getAverageAnnualMark();
                tempIndex = i;
            }
        }
        return students.get(tempIndex);
    }
}
