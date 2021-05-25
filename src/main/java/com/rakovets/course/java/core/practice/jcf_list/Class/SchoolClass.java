package com.rakovets.course.java.core.practice.jcf_list.Class;

import com.rakovets.course.java.core.practice.jcf_list.Class.model.Student;
import java.util.List;

public class SchoolClass {
    public Student getBestStudent(List<Student> students) {
        Student topStudent = students.get(0);
        for (Student i : students) {
            if (topStudent.getAverageAnnualMark() < i.getAverageAnnualMark()) {
                topStudent = i;

            }
        }
        return topStudent;
    }
}
