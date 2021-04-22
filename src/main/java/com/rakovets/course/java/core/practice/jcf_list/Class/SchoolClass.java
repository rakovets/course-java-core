package com.rakovets.course.java.core.practice.jcf_list.Class;

import com.rakovets.course.java.core.practice.jcf_list.Class.model.Student;
import java.util.List;

public class SchoolClass {

    public Student getBestStudent(List<Student> students) {
        double maxFee = 0;
        for (Student i : students) {
            if (maxFee < i.getAverageAnnualMark()) {
                maxFee = i.getAverageAnnualMark();
            }
        }
        for (Student i : students) {
            if (maxFee == i.getAverageAnnualMark()) {
               return students.get(students.indexOf(i));
            }
        }
        return null;
    }
}
