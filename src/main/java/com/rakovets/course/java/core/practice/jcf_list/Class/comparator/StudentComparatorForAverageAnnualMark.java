package com.rakovets.course.java.core.practice.jcf_list.Class.comparator;

import com.rakovets.course.java.core.practice.jcf_list.Class.model.Student;
import java.util.Comparator;

public class StudentComparatorForAverageAnnualMark implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.getAverageAnnualMark() - o2.getAverageAnnualMark());
    }
}
