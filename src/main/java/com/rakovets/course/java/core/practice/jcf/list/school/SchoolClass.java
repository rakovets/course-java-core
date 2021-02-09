package com.rakovets.course.java.core.practice.jcf.list.school;

import java.util.List;

public class SchoolClass {
    List<Student> students;

    public SchoolClass(List<Student> students) {
        this.students = students;
    }

    public Student getBestStudent(List<Student> students) {
        students.sort(Student::compareTo);
        return students.get(students.size() - 1);
    }
}
