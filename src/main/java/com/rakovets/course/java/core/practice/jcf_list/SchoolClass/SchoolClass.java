package com.rakovets.course.java.core.practice.jcf_list.SchoolClass;

import com.rakovets.course.java.core.practice.jcf_list.SchoolClass.comparator.compAve;
import com.rakovets.course.java.core.practice.jcf_list.SchoolClass.model.Student;

import java.util.List;

public class SchoolClass {

    List<Student> students;

    public SchoolClass(List<Student> students) {
        this.students = students;
    }


    public Student getBestStudent(List<Student> students) {
        students.sort(new compAve());
        return students.get(0);

    }
}
