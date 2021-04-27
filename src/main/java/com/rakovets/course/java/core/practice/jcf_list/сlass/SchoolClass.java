package com.rakovets.course.java.core.practice.jcf_list.сlass;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.сlass.comporators.StudentAverageAnnualMarkComporator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SchoolClass {
    public List<Student> students;

    public SchoolClass(List<Student> students) {
        this.students = students;
    }

    public Student getBestStudent(List<Student> students) {
        Comparator<Student> studentAverageAnnualMarkComporator = new StudentAverageAnnualMarkComporator();
        students.sort(studentAverageAnnualMarkComporator);
        return students.get(students.size() - 1);
    }
}
