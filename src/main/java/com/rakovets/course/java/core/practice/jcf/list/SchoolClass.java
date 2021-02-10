package com.rakovets.course.java.core.practice.jcf.list;

import java.util.List;

public class SchoolClass {
    List<Student> students;

    public SchoolClass(List<Student> students) {
        this.students = students;
    }

    public Student getBestStudent(List<Student> studentsInClass) {
        double maxMark = 0;
        int index = 0;
        for (int i = 0; i < studentsInClass.size(); i++) {
            if (studentsInClass.get(i).getAverageAnnualMark() > maxMark) {
                maxMark = studentsInClass.get(i).getAverageAnnualMark();
                index = i;
            }
        }
        return studentsInClass.get(index);
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "students=" + students +
                '}';
    }
}
