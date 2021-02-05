package com.rakovets.course.java.core.practice.jcf.list;

import java.util.List;

public class SchoolClass {
    List<Student> students;

    public SchoolClass(List<Student> students) {
        this.students = students;
    }

    public static Student getBestStudent(SchoolClass studentsInClass) {
        double maxMark = 0;
        int index = 0;
        for (int i = 0; i < studentsInClass.students.size(); i++) {
            if (studentsInClass.students.get(i).getAverageAnnualMark() > maxMark) {
                maxMark = studentsInClass.students.get(i).getAverageAnnualMark();
                index = i;
            }
        }
        return studentsInClass.students.get(index);
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "students=" + students +
                '}';
    }
}
