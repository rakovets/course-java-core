package com.rakovets.course.java.core.practice.jcf_list._class.model;

import java.util.List;

public class SchoolClass {
    private List<Student> students;

    public SchoolClass(List<Student> students) {
        this.students = students;
    }

    public Student getBestStudent(List<Student> students) {
        double bestEverageMark = 0;
        Student bestStudent = students.get(0);
        for (Student student : students) {
            if (bestEverageMark < student.getAverageAnnualMark()) {
                bestEverageMark = student.getAverageAnnualMark();
                bestStudent = student;
            }
        }
        return bestStudent;
    }
}
