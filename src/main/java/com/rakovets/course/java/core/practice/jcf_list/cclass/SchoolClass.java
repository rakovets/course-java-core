package com.rakovets.course.java.core.practice.jcf_list.cclass;

import java.util.List;

public class SchoolClass {
    private List<Student> students;

    public SchoolClass(List<Student> students) {
        this.students = students;
    }

    public Student getBestStudent(List<Student> students) {
        double tmp;
        int index = 0;
        double max = students.get(0).getAverageAnnualMark();
        for (int i = 1; i < students.size(); i++) {
            tmp = students.get(i).getAverageAnnualMark();
            if (tmp > max) {
                max = tmp;
                index = i;
            }
        }
        return students.get(index);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "students=" + students +
                '}';
    }
}
