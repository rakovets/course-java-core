package com.rakovets.course.java.core.practice.jcf.list.project_class;

import com.rakovets.course.java.core.practice.jcf.list.project_class.comparator.StudentComparatorByAnnualMark;

import java.util.Comparator;
import java.util.List;

public class SchoolClass  {
    private final List<Student> students;

    public SchoolClass(List<Student> students) {
        this.students = students;
    }

    public Student getBestStudent() {
        Comparator<Student>studentComparator = new StudentComparatorByAnnualMark();
        this.students.sort(studentComparator);
        return this.students.get(0);
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "students=" + students +
                '}';
    }
}
