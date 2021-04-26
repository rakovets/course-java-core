package com.rakovets.course.java.core.practice.jcf_list.SchoolClass.comparator;

import com.rakovets.course.java.core.practice.jcf_list.SchoolClass.model.Student;

import java.util.Comparator;

    public class compAge implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Double.compare(o1.getAge(), o2.getAge());
        }
    }

